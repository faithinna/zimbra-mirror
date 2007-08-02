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

/*
 * Created on Nov 9, 2004
 */
package com.zimbra.cs.session;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Provisioning.AccountBy;
import com.zimbra.cs.im.IMNotification;
import com.zimbra.cs.index.ZimbraQueryResults;
import com.zimbra.cs.mailbox.*;
import com.zimbra.cs.mailbox.Mailbox.OperationContext;
import com.zimbra.cs.service.mail.GetFolder;
import com.zimbra.cs.service.mail.ToXML;
import com.zimbra.cs.service.mail.GetFolder.FolderNode;
import com.zimbra.cs.service.util.ItemIdFormatter;
import com.zimbra.cs.session.PendingModifications.Change;
import com.zimbra.common.service.ServiceException;
import com.zimbra.common.util.Constants;
import com.zimbra.common.util.ZimbraLog;
import com.zimbra.common.soap.AdminConstants;
import com.zimbra.common.soap.ZimbraNamespace;
import com.zimbra.common.soap.HeaderConstants;
import com.zimbra.common.soap.Element;
import com.zimbra.soap.DocumentHandler;
import com.zimbra.soap.ZimbraSoapContext;


/**
 * @author tim
 * 
 * Add your own get/set methods here for session data.
 */
public class SoapSession extends Session {

    // Read/write access to all these members requires synchronizing on "this".
    private String mQueryStr = "";
    private String mGroupBy  = "";
    private String mSortBy   = "";
    private ZimbraQueryResults mQueryResults;

    private boolean mNotify = true;

    private int  mRecentMessages;
    private long mPreviousAccess = -1;
    private long mLastWrite      = -1;

    private List<PendingModifications> mSentChanges = new LinkedList<PendingModifications>();
    private PendingModifications mChanges = new PendingModifications(1);

    private PushChannel mPushChannel = null;

    private static final long SOAP_SESSION_TIMEOUT_MSEC = 10 * Constants.MILLIS_PER_MINUTE;


    /** Creates a <tt>SoapSession</tt> owned by the given account and
     *  listening on its {@link Mailbox}.
     * @see Session#register() */
    public SoapSession(String authenticatedId) {
        super(authenticatedId, Session.Type.SOAP);
    }

    /** Creates a <tt>SoapSession</tt> owned by one account and potentially
     *  listening on another user's {@link Mailbox}.
     * @see Session#register() */
    public SoapSession(String authenticatedId, String requestedId) {
        super(authenticatedId, requestedId, Session.Type.SOAP);
    }

    @Override
    public Session register() throws ServiceException {
        super.register();
        mRecentMessages = mMailbox.getRecentMessageCount();
        mPreviousAccess = mMailbox.getLastSoapAccessTime();
        return this;
    }

    @Override
    public Session unregister() {
        // when the session goes away, record the timestamp of the last write op to the database
        if (mLastWrite != -1 && mMailbox != null) {
            try {
                mMailbox.recordLastSoapAccessTime(mLastWrite);
            } catch (Throwable t) {
                ZimbraLog.session.warn("exception recording unloaded session's last access time", t);
            }
        }

        // note that Session.unregister() unsets mMailbox...
        return super.unregister();
    }

    @Override
    protected boolean isMailboxListener() {
        return true;
    }

    @Override
    protected boolean isRegisteredInCache() {
        return true;
    }
    

    @Override
    protected long getSessionIdleLifetime() {
        return SOAP_SESSION_TIMEOUT_MSEC;
    }

    /** Returns the number of messages added to the Mailbox since the time
     *  returned by {@link #getPreviousSessionTime()}.  Note that this means
     *  that messages added to the Mailbox during this session are included
     *  in the count. */
    public int getRecentMessageCount() {
        return mRecentMessages;
    }

    /** Returns the time (in milliseconds) of last write op from any SOAP
     *  session <u>before</u> this session was initiated.  This value remains
     *  constant for the duration of this session. */
    public long getPreviousSessionTime() { 
        return mPreviousAccess;
    }

    /** Returns the time (in milliseconds) of the last write operation
     *  initiated by this session.  If the session has not done any write ops
     *  yet, returns {@link #getPreviousSessionTime()}. */
    public long getLastWriteAccessTime() {
        return mLastWrite == -1 ? mPreviousAccess : mLastWrite;
    }

    @Override
    public void doEncodeState(Element parent) {
        parent.addAttribute(AdminConstants.A_NOTIFY, mNotify);
        if (mPushChannel != null) {
            parent.addAttribute("push", true);
        }
    }

    /** Clears all cached notifications and stops recording future notifications
     *  for this session. */
    public void haltNotifications() {
        synchronized (this) {
            mChanges.clear();
            mNotify = false;
        }
    }

    /** Resumes caching notifications for this session. */
    public void resumeNotifications() {
        synchronized (this) {
            mNotify = true;
        }
    }

    @Override
    public void notifyIM(IMNotification imn) {
        if (!mNotify)
            return;

        PendingModifications pms = new PendingModifications();
        pms.addIMNotification(imn);
        notifyPendingChanges(pms, -1, null);
    }

    @Override
    protected boolean isIMListener() {
        return true;
//        try {
//            return Provisioning.getInstance().get(AccountBy.id, this.getTargetAccountId()).getBooleanAttr(Provisioning.A_zimbraPrefIMAutoLogin, false);
//        } catch (ServiceException e) {
//            ZimbraLog.session.info("Caught exception fetching account preference A_zimbraPrefIMAutoLogin", e);
//            return false;
//        }
    }

    /**
     * A callback interface which is listening on this session and waiting for new notifications
     */
    public static interface PushChannel {
        public void close();
        public int getLastKnownSeqNo();
        public ZimbraSoapContext getSoapContext();
        public void notificationsReady() throws ServiceException; 
    }
    
    public static enum RegisterNotificationResult {
        NO_NOTIFY,  // notifications not available for this session
        DATA_READY,     // notifications already here
        BLOCKING;  // none here yet, wait
    }
    
    /**
     * A push channel has come online
     *
     * @return TRUE if the PushChannel is waiting (no data  and notifications turned on),
     * or FALSE if the channel is not waiting
     * 
     * @param push channel 
     * @throws ServiceException 
     */
    public RegisterNotificationResult registerNotificationConnection(PushChannel sc) throws ServiceException {
        // must lock the Mailbox before locking the Session to avoid deadlock
        //   because ToXML functions can now call back into the Mailbox
        synchronized (mMailbox) {
            synchronized (this) {
                if (mPushChannel != null) {
                    mPushChannel.close();
                    mPushChannel = null;
                }
                
                if (!mNotify || mMailbox == null) {
                    sc.close();
                    return RegisterNotificationResult.NO_NOTIFY;
                }

                // are there any notifications already pending given the passed-in seqno?
                boolean notifying = mChanges.hasNotifications();
                int lastSeqNo = sc.getLastKnownSeqNo();
                boolean isEmpty = mSentChanges.isEmpty();
                if (notifying || (mChanges.getSequence() > lastSeqNo + 1 && !isEmpty)) {
                    sc.notificationsReady();  
                    return RegisterNotificationResult.DATA_READY;
                } else {
                    mPushChannel = sc;
                    return RegisterNotificationResult.BLOCKING;
                }
            }
        }
    }
    

    /** Handles the set of changes from a single Mailbox transaction.
     *  <p>
     *  Takes a set of new mailbox changes and caches it locally.  This is
     *  currently initiated from inside the Mailbox transaction commit, but we
     *  still shouldn't assume that execution of this method is synchronized
     *  on the Mailbox.
     *  <p>
     *  *All* changes are currently cached, regardless of the client's state/views.
     * @param changeId  The sync-token change id of the change.
     * @param pms       A set of new change notifications from our Mailbox. */
    @Override
    public void notifyPendingChanges(PendingModifications pms, int changeId, Session source) {
        if (!pms.hasNotifications() || !mNotify || mMailbox == null)
            return;

        if (source == this && mAuthenticatedAccountId.equalsIgnoreCase(mTargetAccountId)) {
            // on the session's first write op, record the timestamp to the database
            boolean firstWrite = mLastWrite == -1;
            mLastWrite = System.currentTimeMillis();
            if (firstWrite) {
                try {
                    mMailbox.recordLastSoapAccessTime(mLastWrite);
                } catch (ServiceException e) {
                    ZimbraLog.session.warn("ServiceException in notifyPendingChanges ", e);
                }
            }
        } else {
            // keep track of "recent" message count: all present before the session started, plus all received during the session
            if (pms.created != null) {
                for (MailItem item : pms.created.values())
                    if (item instanceof Message && (item.getFlagBitmask() & Mailbox.NON_DELIVERY_FLAGS) == 0)
                        mRecentMessages++;
            }
        }

        try {
            // must lock the Mailbox before locking the Session to avoid deadlock
            //   because ToXML functions can now call back into the Mailbox
            synchronized (mMailbox) {
                synchronized (this) {
                    // XXX: should constrain to folders, tags, and stuff relevant to the current query??
                    mChanges.add(pms);
                    
                    if (mPushChannel != null) {
                        mPushChannel.notificationsReady();
                        mPushChannel = null;
                    }
                }
            }
            
        	clearCachedQueryResults();
        } catch (ServiceException e) {
            ZimbraLog.session.warn("ServiceException in notifyPendingChanges ", e);
        }
    }

    private static final String A_ID = "id";

    /** Serializes basic folder/tag structure to a SOAP response header.
     *  <p>
     *  Adds a &lt;refresh> block to the existing &lt;context> element.
     *  This &lt;refresh> block contains the basic folder, tag, and mailbox
     *  size information needed to display and update the web UI's overview
     *  pane.  The &lt;refresh> block is sent when a new session is created.
     *  
     *  This API implicitly clears all cached notifications and therefore 
     *  should only been used during session creation.
     * @param ctxt  An existing SOAP header <context> element 
     * @param zsc   The SOAP request's encapsulated context */
    public void putRefresh(Element ctxt, ZimbraSoapContext zsc) throws ServiceException {
        synchronized (this) {
            if (!mNotify || mMailbox == null)
                return;
            mSentChanges.clear();
        }

        Element eRefresh = ctxt.addUniqueElement(ZimbraNamespace.E_REFRESH);

        OperationContext octxt = DocumentHandler.getOperationContext(zsc, this);
        ItemIdFormatter ifmt = new ItemIdFormatter(zsc);

        // Lock the mailbox but not the "this" object, to avoid deadlock
        // with another thread that calls a Session method from within a
        // synchronized Mailbox method.
        synchronized (mMailbox) {
            // dump current mailbox status (currently just size)
            ToXML.encodeMailbox(eRefresh, mMailbox);

            // dump all tags under a single <tags> parent
            List<Tag> tags = mMailbox.getTagList(octxt);
            if (tags != null && tags.size() > 0) {
                Element eTags = eRefresh.addUniqueElement(ZimbraNamespace.E_TAGS);
                for (Tag tag : tags)
                    if (tag != null && !(tag instanceof Flag))
                        ToXML.encodeTag(eTags, ifmt, tag);
            }

            // dump recursive folder hierarchy starting at USER_ROOT (i.e. folders visible to the user)
            try {
            	// use the operation here just so we can re-use the logic...
                FolderNode root = GetFolder.getFolderTree(octxt, mMailbox, null, true);
                GetFolder.encodeFolderNode(ifmt, octxt, eRefresh, root);
            } catch (ServiceException e) {
                if (e.getCode() != ServiceException.PERM_DENIED)
                    throw e;
            }
        }
    }
    
    /**
     * TEMP HACK FIXME: TODO -- only until the client understands notification sequencing
     * @return
     */
    public int getCurrentNotificationSeqNo() {
        return mChanges.getSequence();
    }
    
    /** Serializes cached notifications to a SOAP response header.
     *  <p>
     *  Adds a <code>&lt;notify></code> block to an existing <code>&lt;context></code>
     *  element, creating an enclosing <code>&lt;context></code> element if none
     *  is passed in.  This <code>&lt;notify></code> block contains information
     *  about all items deleted, created, or modified in the {@link Mailbox} since
     *  the last client interaction, without regard to the client's state/views.
     *  <p>
     *  For deleted items, only the item IDs are returned.  For created items, the
     *  entire item is serialized.  For modified items, only the modified attributes
     *  are included in the response.
     *  <p>
     *  Example:
     *  <pre>
     *     &lt;notify>
     *       &lt;deleted id="665,66,452,883"/>
     *       &lt;created>
     *         &lt;tag id="66" name="phlox" u="8"/>
     *         &lt;folder id="4353" name="a&p" u="2" l="1"/>
     *       &lt;/created>
     *       &lt;modified>
     *         &lt;tag id="65" u="0"/>
     *         &lt;m id="553" f="ua"/>
     *         &lt;note id="774" color="4">
     *           This is the new content.
     *         &lt;/note>
     *       &lt;/modified>
     *     &lt;/notify>
     *  </pre>
     *  Also adds a "last server change" changestamp to the <context> block.
     *  <p>
     * @param ctxt  An existing SOAP header &lt;context> element
     * @param zsc    The SOAP request context from the client's request
     * @param lastSequence  The highest notification-sequence-number that the client has
     *         received (0 means none)
     * @return The passed-in <code>&lt;context></code> element */
    public Element putNotifications(Element ctxt, ZimbraSoapContext zsc, int lastSequence) {
        if (ctxt == null || mMailbox == null)
            return null;

        String explicitAcct = getAuthenticatedAccountId().equals(zsc.getAuthtokenAccountId()) ? null : getAuthenticatedAccountId();

        // must lock the Mailbox before locking the Session to avoid deadlock
        //   because ToXML functions can now call back into the Mailbox
        synchronized (mMailbox) {
            synchronized (this) {
                // send the <change> block
                // <change token="555" [acct="4f778920-1a84-11da-b804-6b188d2a20c4"]/>
                ctxt.addUniqueElement(HeaderConstants.E_CHANGE)
                    .addAttribute(HeaderConstants.A_CHANGE_ID, mMailbox.getLastChangeID())
                    .addAttribute(HeaderConstants.A_ACCOUNT_ID, explicitAcct);
                
                if (mSentChanges.size() > 100) {
                    // cover ourselves in case a client is doing something really stupid...
                    ZimbraLog.session.warn("Notification Change List abnormally long, misbehaving client.");
                    mSentChanges.clear();
                }
                
                if (lastSequence <= 0) {
                    // if the client didn't send a valid "last sequence number", *don't* keep old changes around
                    mSentChanges.clear();
                } else {
                    // clear any PM's we now know the client has received
                    for (Iterator<PendingModifications> iter = mSentChanges.iterator(); iter.hasNext(); ) {
                        PendingModifications pms = iter.next();
                        if (pms.getSequence() <= lastSequence)
                            iter.remove();
                        // assert(pm.getSeqNo() > lastKnownSeqno);
                    }
                }
                
                if (mNotify) {
                    if (mChanges.hasNotifications()) {
                        assert(mChanges.getSequence() >= 1);
                        int newSeqNo = mChanges.getSequence() + 1;
                        mSentChanges.add(mChanges);
                        mChanges = new PendingModifications(newSeqNo); 
                    }

                    // drop out if notify is off or if there is nothing to send
                    if (mSentChanges.isEmpty())
                        return ctxt;
                
                    // mChanges must be empty at this point (everything moved into the mSentChanges list)
                    assert(!mChanges.hasNotifications());
                
                    // send all the old changes
                    for (PendingModifications pms : mSentChanges)
                        putPendingModifications(pms, ctxt, zsc, mMailbox, explicitAcct);
                }
            }
        }
        return ctxt;
    }
    
    /**
     * Write a single instance of the PendingModifications structure into the 
     * passed-in <notify> block 
     * @param pms
     * @param parent
     * @param zsc
     * @param mbox
     * @param explicitAcct
     */
    private void putPendingModifications(PendingModifications pms, Element parent, ZimbraSoapContext zsc, Mailbox mbox, String explicitAcct) {
        assert(pms.getSequence() > 0);
        
        // <notify [acct="4f778920-1a84-11da-b804-6b188d2a20c4"]/>
        Element eNotify = parent.addElement(ZimbraNamespace.E_NOTIFY)
                                .addAttribute(HeaderConstants.A_ACCOUNT_ID, explicitAcct)
                                .addAttribute(HeaderConstants.A_SEQNO, pms.getSequence());


        OperationContext octxt = null;
        try {
            octxt = DocumentHandler.getOperationContext(zsc, this);
        } catch (ServiceException e) {
            ZimbraLog.session.warn("error fetching operation context for: " + zsc.getAuthtokenAccountId(), e);
            return;
        }
        ItemIdFormatter ifmt = new ItemIdFormatter(zsc);

        if (pms.deleted != null && pms.deleted.size() > 0) { 
            StringBuilder ids = new StringBuilder ();
            for (Object obj : pms.deleted.values()) {
                if (ids.length() != 0)
                    ids.append(',');
                if (obj instanceof MailItem)
                    ids.append(((MailItem) obj).getId());
                else if (obj instanceof Integer)
                    ids.append(obj);
            }
            Element eDeleted = eNotify.addUniqueElement(ZimbraNamespace.E_DELETED);
            eDeleted.addAttribute(A_ID, ids.toString());
        }

        if (pms.created != null && pms.created.size() > 0) {
            Element eCreated = eNotify.addUniqueElement(ZimbraNamespace.E_CREATED);
            for (MailItem item : pms.created.values()) {
                try {
                    ToXML.encodeItem(eCreated, ifmt, octxt, item, ToXML.NOTIFY_FIELDS);
                } catch (ServiceException e) {
                    ZimbraLog.session.warn("error encoding item " + item.getId(), e);
                    return;
                }
            }
        }

        if (pms.modified != null && pms.modified.size() > 0) {
            Element eModified = eNotify.addUniqueElement(ZimbraNamespace.E_MODIFIED);
            for (Change chg : pms.modified.values()) {
                if (chg.why != 0 && chg.what instanceof MailItem) {
                    MailItem item = (MailItem) chg.what;
                    try {
                        ToXML.encodeItem(eModified, ifmt, octxt, item, chg.why);
                    } catch (ServiceException e) {
                        ZimbraLog.session.warn("error encoding item " + item.getId(), e);
                        return;
                    }
                } else if (chg.why != 0 && chg.what instanceof Mailbox) {
                    ToXML.encodeMailbox(eModified, (Mailbox) chg.what, chg.why);
                }
            }
        }
        
        if (pms.imNotifications != null && pms.imNotifications.size() > 0) {
            Element eIM = eNotify.addUniqueElement("im");
            for (IMNotification imn : pms.imNotifications) {
                try {
                    imn.toXml(eIM);
                } catch (ServiceException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void clearCachedQueryResults() throws ServiceException {
        synchronized (this) {
            try {
                if (mQueryResults != null)
                    mQueryResults.doneWithSearchResults();
            } finally {
                mQueryStr = "";
                mGroupBy  = "";
                mSortBy   = "";
                mQueryResults = null;
            }
        }
    }
    
    public void putQueryResults(String queryStr, String groupBy, String sortBy, ZimbraQueryResults res)
    throws ServiceException {
        synchronized (this) {
            clearCachedQueryResults();
            mQueryStr = queryStr;
            mGroupBy = groupBy;
            mSortBy = sortBy;
            mQueryResults = res;
        }
    }
    
    public ZimbraQueryResults getQueryResults(String queryStr, String groupBy, String sortBy) {
        synchronized (this) {
            if (mQueryStr.equals(queryStr) && mGroupBy.equals(groupBy) && mSortBy.equals(sortBy))
                return mQueryResults;
            else
                return null;
        }
    }
    
    public void cleanup() {
        try {
            clearCachedQueryResults();
        } catch (ServiceException e) {
        	ZimbraLog.session.warn("ServiceException while cleaning up Session", e);
        }
    }
}
