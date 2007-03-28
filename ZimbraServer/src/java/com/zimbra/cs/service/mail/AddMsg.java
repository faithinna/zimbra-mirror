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
 * Created on Sep 29, 2004
 */
package com.zimbra.cs.service.mail;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

import javax.mail.internet.MimeMessage;

import com.zimbra.common.util.Log;
import com.zimbra.common.util.LogFactory;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.MailConstants;
import com.zimbra.common.soap.Element;
import com.zimbra.cs.mailbox.Flag;
import com.zimbra.cs.mailbox.Folder;
import com.zimbra.cs.mailbox.Mailbox;
import com.zimbra.cs.mailbox.Message;
import com.zimbra.cs.mailbox.Mailbox.OperationContext;
import com.zimbra.cs.mime.ParsedMessage;
import com.zimbra.cs.service.FileUploadServlet;
import com.zimbra.cs.service.util.ItemId;
import com.zimbra.cs.service.util.ItemIdFormatter;
import com.zimbra.cs.session.Session;
import com.zimbra.soap.ZimbraSoapContext;

public class AddMsg extends MailDocumentHandler {
    private static Log mLog = LogFactory.getLog(AddMsg.class);
    private static Pattern sNumeric = Pattern.compile("\\d+");

    private static final String[] TARGET_FOLDER_PATH = new String[] { MailConstants.E_MSG, MailConstants.A_FOLDER };
    protected String[] getProxiedIdPath(Element request) {
        String folder = getXPath(request, TARGET_FOLDER_PATH);
        return folder != null && (folder.indexOf(':') > 0 || sNumeric.matcher(folder).matches()) ? TARGET_FOLDER_PATH : null;
    }
    protected boolean checkMountpointProxy(Element request)  { return true; }

    /* (non-Javadoc)
     * @see com.zimbra.soap.DocumentHandler#handle(org.dom4j.Element, java.util.Map)
     */
    public Element handle(Element request, Map<String, Object> context) throws ServiceException {
        ZimbraSoapContext zsc = getZimbraSoapContext(context);
        Mailbox mbox = getRequestedMailbox(zsc);
        OperationContext octxt = zsc.getOperationContext();
        ItemIdFormatter ifmt = new ItemIdFormatter(zsc);
        Session session = getSession(context);

        Element msgElem = request.getElement(MailConstants.E_MSG);
        
        String flagsStr = msgElem.getAttribute(MailConstants.A_FLAGS, null);
        String tagsStr = msgElem.getAttribute(MailConstants.A_TAGS, null);
        String folderStr = msgElem.getAttribute(MailConstants.A_FOLDER);
        boolean noICal = msgElem.getAttributeBool(MailConstants.A_NO_ICAL, false);
        long date = msgElem.getAttributeLong(MailConstants.A_DATE, System.currentTimeMillis());
        
        if (mLog.isDebugEnabled()) {
            StringBuffer toPrint = new StringBuffer("<AddMsg ");
            if (tagsStr != null)
                toPrint.append(" tags=\"").append(tagsStr).append("\"");
            if (folderStr != null)
                toPrint.append(" folder=\"").append(folderStr).append("\"");
            toPrint.append(">");
            mLog.debug(toPrint);
        }

        // sanity-check the supplied tag list
        if (tagsStr != null) {
            String[] splitTags = tagsStr.split("\\s*,\\s*");
            if (splitTags.length > 0)
                for (int i = 0; i < splitTags.length; i++) {
                    try {
                        int tagId = Integer.parseInt(splitTags[i]);
                        if (mbox.getTagById(octxt, tagId) == null)
                            throw ServiceException.INVALID_REQUEST("Unknown tag: \"" + tagId + "\"", null);
                    } catch (NumberFormatException e) {};
                }
        }

        int folderId = -1;
        Folder folder = null;
        try {
            folderId = new ItemId(folderStr, zsc).getId();
        } catch (ServiceException e) { }
        if (folderId > 0) {
            folder = mbox.getFolderById(octxt, folderId);
        } else {
            folder = mbox.getFolderByPath(octxt, folderStr);
            folderId = folder.getId();
        }
        if (mLog.isDebugEnabled())
            mLog.debug("folder = " + folder.getName());
        
        // check to see whether the entire message has been uploaded under separate cover
        String attachment = msgElem.getAttribute(MailConstants.A_ATTACHMENT_ID, null);
        
        ParseMimeMessage.MimeMessageData mimeData = new ParseMimeMessage.MimeMessageData();
        MimeMessage mm;
        if (attachment != null)
            mm = SendMsg.parseUploadedMessage(zsc, attachment, mimeData);
        else
            mm = ParseMimeMessage.importMsgSoap(msgElem);
        
        Message msg;
        try {
            ParsedMessage pm = new ParsedMessage(mm, date, mbox.attachmentsIndexingEnabled());
            msg = mbox.addMessage(octxt, pm, folderId, noICal, Flag.flagsToBitmask(flagsStr), tagsStr);
        } catch(IOException ioe) {
            throw ServiceException.FAILURE("Error While Delivering Message", ioe);
        }
        
        // we can now purge the uploaded attachments
        if (mimeData.uploads != null)
            FileUploadServlet.deleteUploads(mimeData.uploads);
        
        Element response = zsc.createElement(MailConstants.ADD_MSG_RESPONSE);
        if (msg != null)
            ToXML.encodeMessageSummary(response, ifmt, octxt, msg, null, GetMsgMetadata.SUMMARY_FIELDS);
        
        return response;
    }
}
