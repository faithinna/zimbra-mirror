/*
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 * 
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 ("License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.zimbra.com/license
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 * 
 * The Original Code is: Zimbra Collaboration Suite Server.
 * 
 * The Initial Developer of the Original Code is Zimbra, Inc.
 * Portions created by Zimbra are Copyright (C) 2004, 2005, 2006 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s): 
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.imap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.util.ZimbraLog;
import com.zimbra.cs.account.Account;
import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Server;
import com.zimbra.cs.mailclient.MailConfig;
import com.zimbra.cs.mailclient.MailInputStream;
import com.zimbra.cs.mailclient.auth.Authenticator;
import com.zimbra.cs.mailclient.auth.AuthenticatorFactory;
import com.zimbra.cs.mailclient.imap.ImapConfig;
import com.zimbra.cs.mailclient.imap.ImapConnection;
import com.zimbra.cs.security.sasl.ZimbraAuthenticator;
import com.zimbra.cs.service.ZimbraAuthProvider;

class ImapProxy {
    private static final AuthenticatorFactory sAuthenticatorFactory = new AuthenticatorFactory();
        static {
            sAuthenticatorFactory.register(ZimbraAuthenticator.MECHANISM, ZimbraClientAuthenticator.class);
        }

    private final ImapHandler mHandler;
    private final ImapPath mPath;
    private ImapConnection mConnection;

    ImapProxy(ImapHandler handler, ImapPath path) throws ServiceException {
        mHandler = handler;
        mPath = path;

        Account acct = handler.getCredentials().getAccount();
        Server server = Provisioning.getInstance().getServer(path.getOwnerAccount());
        String host = server.getAttr(Provisioning.A_zimbraServiceHostname);
        if (acct == null)
            throw ImapServiceException.PROXY_ERROR(new Exception("no such authenticated user"), path.asImapPath());

        ImapConfig config = new ImapConfig();
        config.setAuthenticationId(acct.getName());
        config.setMechanism(ZimbraAuthenticator.MECHANISM);
        config.setAuthenticatorFactory(sAuthenticatorFactory);
        config.setSynchronousMode(true);
        config.setHost(host);
        if (server.getBooleanAttr(Provisioning.A_zimbraImapServerEnabled, true)) {
            config.setPort(server.getIntAttr(Provisioning.A_zimbraImapBindPort, ImapConfig.DEFAULT_PORT));
        } else if (server.getBooleanAttr(Provisioning.A_zimbraImapSSLServerEnabled, true)) {
            config.setPort(server.getIntAttr(Provisioning.A_zimbraImapSSLBindPort, ImapConfig.DEFAULT_SSL_PORT));
            config.setSslEnabled(true);
        } else {
            throw ImapServiceException.PROXY_ERROR(new Exception("no open IMAP port for server " + host), path.asImapPath());
        }

        ZimbraLog.imap.info("opening proxy connection (user=" + acct.getName() + ", host=" + host + ", path=" + path.getReferent().asImapPath() + ')');

        ImapConnection conn = mConnection = new ImapConnection(config);
        try {
            conn.connect();
            conn.authenticate(ZimbraAuthProvider.getAuthToken(acct).getEncoded());
        } catch (Exception e) {
            dropConnection();
            throw ServiceException.PROXY_ERROR(e, null);
        }
    }

    ImapPath getPath() {
        return mPath;
    }

    void dropConnection() {
        ImapConnection conn = mConnection;
        if (conn == null)
            return;

        ZimbraLog.imap.info("closing proxy connection");
        // FIXME: should close cleanly (i.e. with tagged LOGOUT)
        conn.close();
        mConnection = null;
    }


    /** Performs a <tt>SELECT</tt> on the remote folder passed into the
     *  constructor.  Writes all tagged and untagged responses back to the
     *  handler's output stream.
     * @return whether the SELECT was successful (i.e. it returned a tagged
     *         <tt>OK</tt> response)
     * @see #ImapProxy(ImapHandler, ImapPath) */
    boolean select(String tag, byte params, ImapHandler.QResyncInfo qri) throws IOException, ServiceException {
        // FIXME: need to send an ENABLE before the SELECT

        StringBuilder select = new StringBuilder(100).append(tag).append(' ');
        select.append((params & ImapFolder.SELECT_READONLY) == 0 ? "SELECT" : "EXAMINE").append(' ');
        select.append(mPath.getReferent().asImapPath());
        if ((params & ImapFolder.SELECT_CONDSTORE) != 0) {
            select.append(" (");
            if (qri == null) {
                select.append("CONDSTORE");
            } else {
                select.append("QRESYNC (").append(qri.uvv).append(' ').append(qri.modseq);
                if (qri.knownUIDs != null)
                    select.append(' ').append(qri.knownUIDs);
                if (qri.seqMilestones != null)
                    select.append(" (").append(qri.seqMilestones).append(' ').append(qri.uidMilestones).append(')');
                select.append(')');
            }
            select.append(')');
        }

        return proxyCommand(tag, select.append("\r\n").toString().getBytes(), true);
    }

    /** Proxies the request to the remote server and writes all tagged and
     *  untagged responses back to the handler's output stream.
     * @return <tt>true</tt> in all cases. */
    boolean proxy(ImapRequest req) throws IOException {
        proxyCommand(req.getTag(), req.toByteArray(), true);
        return true;
    }

    boolean proxy(String tag, String command) throws IOException {
        proxyCommand(tag, (tag + ' ' + command + "\r\n").getBytes(), true);
        return true;
    }

    /** Retrieves the set of notifications pending on the remote server. */
    void fetchNotifications() throws IOException {
        String tag = mConnection == null ? "1" : mConnection.newTag();
        proxyCommand(tag, (tag + " NOOP\r\n").getBytes(), false);
    }

    private static final HashSet<String> UNSTRUCTURED_CODES = new HashSet<String>(Arrays.asList(
            "OK", "NO", "BAD", "PREAUTH", "BYE"
    ));

    private boolean proxyCommand(String tag, byte[] payload, boolean includeTaggedResponse) throws IOException {
//        System.out.write(payload);  System.out.flush();
        ImapConnection conn = mConnection;
        if (conn == null)
            throw new IOException("proxy connection already closed");

        // proxy the request over to the remote server
        OutputStream remote = conn.getOutputStream();
        if (remote == null) {
            dropConnection();
            throw new IOException("proxy connection already closed");
        }
        remote.write(payload);  remote.flush();

        MailInputStream min = conn.getInputStream();
        OutputStream out = mHandler.mOutputStream;
        if (out == null) {
            dropConnection();
            throw new IOException("proxy connection already closed");
        }

        // copy the response back to the handler's output (i.e. the original client)
        boolean success = false;
        int first;
        while ((first = min.peek()) != -1) {
            // XXX: may want to check that the "tagged" response's tag actually matches the request's tag...
            boolean tagged = first != '*' && first != '+';
            boolean structured = first == '*';
            boolean proxy = first != '+' && (!tagged || includeTaggedResponse);

            ByteArrayOutputStream line = proxy ? new ByteArrayOutputStream() : null;
            StringBuilder debug = proxy && ZimbraLog.imap.isDebugEnabled() ? new StringBuilder("  S: ") : null;
            StringBuilder condition = new StringBuilder(10);

            boolean quoted = false, escaped = false, space1 = false, space2 = false;
            int c, literal = -1;
            while ((c = min.read()) != -1) {
                // check for success and also determine whether we should be paying attention to structure
                if (!space2) {
                    if (c == ' ' && !space1) {
                        space1 = true;
                    } else if (c == ' ') {
                        space2 = true;
                        String code = condition.toString().toUpperCase();
                        if (tagged)
                            success = code.equals("OK");
                        structured &= !UNSTRUCTURED_CODES.contains(code);
                    } else if (space1) {
                        condition.append((char) c);
                    }
                }

                // if it's a structured response, pay attention to quoting, literals, etc.
                if (structured) {
                    if (escaped)
                        escaped = false;
                    else if (quoted && c == '\\')
                        escaped = true;
                    else if (c == '"')
                        quoted = !quoted;
                    else if (!quoted && c == '{')
                        literal = 0;
                    else if (literal != -1 && c >= '0' && c <= '9')
                        literal = literal * 10 + (c - '0');
                }

                if (!quoted && c == '\r' && min.peek() == '\n') {
                    // skip the terminal LF
                    min.read();
                    // write the line back to the client
                    if (proxy) {
                        out.write(line.toByteArray());  out.write(ImapHandler.LINE_SEPARATOR_BYTES);
                        line.reset();
                    }
                    // if it's end of line (i.e. no literal), we're done
                    if (literal == -1)
                        break;
                    // if there's a literal, copy it and then handle the following line
                    byte buffer[] = literal == 0 ? null : new byte[Math.min(literal, 8196)];
                    while (literal > 0) {
                        int read = min.read(buffer);
                        if (read == -1)
                            break;
                        if (proxy)
                            out.write(buffer, 0, read);
                        literal -= read;
                    }
                    literal = -1;
                } else if (proxy) {
                    line.write(c);
                    if (debug != null)
                        debug.append((char) c);
                }
            }

            if (debug != null)
                ZimbraLog.imap.debug(debug.toString());

            if (tagged)
                break;
        }

        out.flush();
        return success;
    }


    public static final class ZimbraClientAuthenticator extends Authenticator {
        private String username, authtoken;
        private boolean complete;

        @Override public void init(MailConfig config, String password) {
            username = config.getAuthenticationId();  authtoken = password;
        }

        @Override public boolean isComplete()  { return complete; }

        @Override public boolean hasInitialResponse()  { return true; }
        @Override public byte[] getInitialResponse()   { return evaluateChallenge(null); }

        @Override public byte[] evaluateChallenge(byte[] challenge) {
            complete = true;
            String response = '\0' + username + '\0' + authtoken;
            try {
                return response.getBytes("utf-8");
            } catch (UnsupportedEncodingException uee) {
                return response.getBytes();
            }
        }
    }
}
