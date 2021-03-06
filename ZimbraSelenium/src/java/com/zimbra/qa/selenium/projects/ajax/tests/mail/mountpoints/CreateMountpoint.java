/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011, 2013 Zimbra Software, LLC.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.4 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.qa.selenium.projects.ajax.tests.mail.mountpoints;


import java.util.List;

import org.testng.annotations.Test;

import com.zimbra.qa.selenium.framework.items.FolderItem;
import com.zimbra.qa.selenium.framework.ui.*;
import com.zimbra.qa.selenium.framework.util.*;
import com.zimbra.qa.selenium.projects.ajax.core.PrefGroupMailByMessageTest;
import com.zimbra.qa.selenium.projects.ajax.ui.DialogShareAccept;
import com.zimbra.qa.selenium.projects.ajax.ui.mail.DisplayMail;


public class CreateMountpoint extends PrefGroupMailByMessageTest {

	
	
	public CreateMountpoint() {
		logger.info("New "+ CreateMountpoint.class.getCanonicalName());
		
		
	}
	
	@Test(	description = "Receive an invitation to a shared folder, accept it.",
			groups = { "smoke" })
	public void CreateMountpoint_01() throws HarnessException {
		
		ZimbraAccount Owner = (new ZimbraAccount()).provision().authenticate();

		// Owner creates a folder, shares it with current user, and sends invitation
		String ownerFoldername = "ownerfolder"+ ZimbraSeleniumProperties.getUniqueString();
		
		FolderItem ownerInbox = FolderItem.importFromSOAP(Owner, FolderItem.SystemFolder.Inbox);
		ZAssert.assertNotNull(ownerInbox, "Verify the new owner folder exists");

		Owner.soapSend(
					"<CreateFolderRequest xmlns='urn:zimbraMail'>"
				+		"<folder name='" + ownerFoldername +"' l='" + ownerInbox.getId() +"'/>"
				+	"</CreateFolderRequest>");
		
		FolderItem ownerFolder = FolderItem.importFromSOAP(Owner, ownerFoldername);
		ZAssert.assertNotNull(ownerFolder, "Verify the new owner folder exists");
		
		Owner.soapSend(
					"<FolderActionRequest xmlns='urn:zimbraMail'>"
				+		"<action id='"+ ownerFolder.getId() +"' op='grant'>"
				+			"<grant d='" + app.zGetActiveAccount().EmailAddress + "' gt='usr' perm='r'/>"
				+		"</action>"
				+	"</FolderActionRequest>");
		

		String shareMessageSubject = "shared"+ ZimbraSeleniumProperties.getUniqueString();
		String shareElement = String.format(
					"<share xmlns='urn:zimbraShare' version='0.1' action='new' >"
				+		"<grantee id='%s' email='%s' name='%s' />"
				+		"<grantor id='%s' email='%s' name='%s' />"
				+		"<link id='%s' name='%s' view='message' perm='r' />"
				+		"<notes/>"
				+	"</share>",
					app.zGetActiveAccount().ZimbraId, app.zGetActiveAccount().EmailAddress, app.zGetActiveAccount().EmailAddress,
					Owner.ZimbraId, Owner.EmailAddress, Owner.EmailAddress,
					ownerFolder.getId(), ownerFolder.getName());
					
		Owner.soapSend(
					"<SendMsgRequest xmlns='urn:zimbraMail'>"
				+		"<m>"
				+			"<e t='t' a='"+ app.zGetActiveAccount().EmailAddress +"'/>"
				+			"<su>"+ shareMessageSubject +"</su>"
				+			"<mp ct='multipart/alternative'>"
				+				"<mp ct='text/plain'>"
				+					"<content>shared</content>"
				+				"</mp>"
				+				"<mp ct='xml/x-zimbra-share'>"
				+					"<content>"+ XmlStringUtil.escapeXml(shareElement) +"</content>"
				+				"</mp>"
				+			"</mp>"
				+		"</m>"
				+	"</SendMsgRequest>");



		FolderItem inbox = FolderItem.importFromSOAP(app.zGetActiveAccount(), FolderItem.SystemFolder.Inbox);

		// Click Get Mail button
		app.zPageMail.zToolbarPressButton(Button.B_GETMAIL);
		
		// Click the inbox
		app.zTreeMail.zTreeItem(Action.A_LEFTCLICK, inbox);
				
		// Select the item
		DisplayMail display = (DisplayMail) app.zPageMail.zListItem(Action.A_LEFTCLICK, shareMessageSubject);
		
		// Verify that the A/D buttons are displayed
		ZAssert.assertTrue(display.zHasShareADButtons(), "Verify that the Accept/Decline share buttons are present");
		
		// Accept the share, which opens a dialog
		DialogShareAccept dialog = (DialogShareAccept)display.zPressButton(Button.B_ACCEPT_SHARE);
		ZAssert.assertNotNull(dialog, "Verify that the accept share dialog opens");
		
		// Click OK on the dialog
		dialog.zClickButton(Button.B_YES);
		
		FolderItem found = null;
		
		// Verify that the new mountpoint is present
		logger.info("Looking for mountpoint containing text: "+ ownerFoldername);

		List<FolderItem> folders = app.zTreeMail.zListGetFolders();
		for (FolderItem f : folders) {
			if ( f.getName().contains(ownerFoldername) ) {
				logger.info("Found folder item: "+ f.getName());
				found = f;
				break;
			}
		}
		
		ZAssert.assertNotNull(found, "Verify the mountpoint is in the folder list");
		
	}

	
	

	

}
