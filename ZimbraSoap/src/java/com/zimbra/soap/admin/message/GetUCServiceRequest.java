/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2012, 2013 Zimbra Software, LLC.
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

package com.zimbra.soap.admin.message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.zimbra.common.soap.AdminConstants;
import com.zimbra.soap.admin.type.UCServiceSelector;
import com.zimbra.soap.type.AttributeSelectorImpl;

/**
 * @zm-api-command-auth-required true
 * @zm-api-command-admin-auth-required true
 * @zm-api-command-description Get UC Service
 */
@XmlRootElement(name=AdminConstants.E_GET_UC_SERVICE_REQUEST)
public class GetUCServiceRequest extends AttributeSelectorImpl {

    /**
     * @zm-api-field-description UC Service
     */
    @XmlElement(name=AdminConstants.E_UC_SERVICE)
    private UCServiceSelector ucService;

    public GetUCServiceRequest() {
        this(null);
    }

    public GetUCServiceRequest(UCServiceSelector ucService) {
        setUCService(ucService);
    }

    public void setUCService(UCServiceSelector ucService) {
        this.ucService = ucService;
    }

    public UCServiceSelector getUCService() { return ucService; }
}

