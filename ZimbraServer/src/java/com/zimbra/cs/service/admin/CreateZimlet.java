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
 * Portions created by Zimbra are Copyright (C) 2006 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s): 
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.service.admin;

import java.util.Map;

import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Zimlet;
import com.zimbra.cs.service.ServiceException;
import com.zimbra.common.util.ZimbraLog;
import com.zimbra.soap.Element;
import com.zimbra.soap.ZimbraSoapContext;

public class CreateZimlet extends AdminDocumentHandler {

	public Element handle(Element request, Map<String, Object> context) throws ServiceException {
	    
        ZimbraSoapContext lc = getZimbraSoapContext(context);
	    Provisioning prov = Provisioning.getInstance();
	    
	    String name = request.getAttribute(AdminService.E_NAME).toLowerCase();
	    Map<String, Object> attrs = AdminService.getAttrs(request, true);

	    Zimlet zimlet = prov.createZimlet(name, attrs);

        ZimbraLog.security.info(ZimbraLog.encodeAttrs(
                new String[] {"cmd", "CreateZimlet","name", name}, attrs));

	    Element response = lc.createElement(AdminService.CREATE_ZIMLET_RESPONSE);
	    GetZimlet.doZimlet(response, zimlet);

	    return response;
	}
}