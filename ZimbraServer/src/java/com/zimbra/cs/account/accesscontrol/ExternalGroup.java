/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.account.accesscontrol;

import java.util.List;

import com.zimbra.common.account.Key.DomainBy;
import com.zimbra.common.localconfig.LC;
import com.zimbra.common.service.ServiceException;
import com.zimbra.common.util.Constants;
import com.zimbra.cs.account.Account;
import com.zimbra.cs.account.AccountServiceException;
import com.zimbra.cs.account.AuthToken;
import com.zimbra.cs.account.Domain;
import com.zimbra.cs.account.EntryCacheDataKey;
import com.zimbra.cs.account.NamedEntry;
import com.zimbra.cs.account.NamedEntryCache;
import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Provisioning.GroupMembership;
import com.zimbra.cs.account.Provisioning.MemberOf;
import com.zimbra.cs.account.accesscontrol.ZimbraACE.ExternalGroupInfo;
import com.zimbra.cs.account.ldap.LdapProv;
import com.zimbra.cs.gal.ADGalGroupHandler;
import com.zimbra.cs.gal.GalGroupHandler;
import com.zimbra.cs.ldap.LdapClient;
import com.zimbra.cs.ldap.LdapConstants;
import com.zimbra.cs.ldap.LdapException;
import com.zimbra.cs.ldap.LdapUsage;
import com.zimbra.cs.ldap.LdapUtilCommon;
import com.zimbra.cs.ldap.ZAttributes;
import com.zimbra.cs.ldap.ZLdapContext;
import com.zimbra.cs.ldap.ZSearchResultEntry;
import com.zimbra.cs.ldap.LdapServerConfig.ExternalLdapConfig;

public class ExternalGroup extends NamedEntry {
    
    private static final NamedEntryCache<ExternalGroup> CACHE =
        new NamedEntryCache<ExternalGroup>(
                LC.ldap_cache_group_maxsize.intValue(),
                LC.ldap_cache_group_maxage.intValue() * Constants.MILLIS_PER_MINUTE);
    
    private String dn;
    private GalGroupHandler groupHandler;
    
    /*
     * id:   {zimbra domain id}:{external group name}
     * name: {zimbra domain name}:{external group name}
     */
    ExternalGroup(String dn, String id, String name, ZAttributes attrs,
            GalGroupHandler groupHandler, Provisioning prov) 
    throws LdapException {
        super(name, id, attrs.getAttrs(), null, prov);
        this.dn = dn;
        this.groupHandler = groupHandler;
    }
    
    public String getDN() {
        return dn;
    }
    
    boolean inGroup(Account acct) throws ServiceException {
        return groupHandler.inDelegatedAdminGroup(this, acct);
    }
    
    private static ExternalGroup makeExternalGroup(Domain domain, 
            String extGroupName, String dn, ZAttributes attrs) throws ServiceException {
        String id = ExternalGroupInfo.encode(domain.getId(), extGroupName);
        String name = ExternalGroupInfo.encode(domain.getName(), extGroupName);
        
        // load group handler
        String className = domain.getExternalGroupHandlerClass();
        GalGroupHandler groupHandler = GalGroupHandler.getHandler(className);
        
        ExternalGroup extGroup = new ExternalGroup(
                dn, id, name, attrs, groupHandler, LdapProv.getInst());
        return extGroup;
    }
    
    /*
     * TODO: check:
     *   - authToken must indicate AD auth
     *   - domain of the authed account must be the same as the domain in the extGroupGrantee
     *   
     * domainBy: id when extGroupGrantee is obtained in fron persisted ZimbraACE   
     *           name when extGroupGrantee is provided to zmprov or SOAP. 
     *         
     */
    static ExternalGroup get(/* AuthToken authToken, */ DomainBy domainBy, 
            String extGroupGrantee) throws ServiceException {
        ExternalGroup group = null;
        
        if (DomainBy.name == domainBy) {
            group = CACHE.getByName(extGroupGrantee);
        } else {
            group = CACHE.getById(extGroupGrantee);
        }
        
        if (group != null) {
            return group;
        }
        
        group = searchGroup(domainBy, extGroupGrantee);
        
        if (group != null) {
            CACHE.put(group);
        }
        
        return group;
    }
    
    private static ExternalGroup searchGroup(DomainBy domainBy, String extGroupGrantee) 
    throws ServiceException {
        LdapProv prov = LdapProv.getInst();
        
        ExternalGroupInfo extGrpInfp = ExternalGroupInfo.parse(extGroupGrantee);
        String zimbraDomain = extGrpInfp.getZimbraDmain();
        String extGroupName = extGrpInfp.getExternalGroupName();
        
        Domain domain = prov.get(domainBy, zimbraDomain);
        if (domain == null) {
            throw AccountServiceException.NO_SUCH_DOMAIN(zimbraDomain);
        }
        
        String searchBase = domain.getExternalGroupLdapSearchBase();
        String filterTemplate = domain.getExternalGroupLdapSearchFilter();
        
        if (searchBase == null) {
            searchBase = LdapConstants.DN_ROOT_DSE;
        }
        String searchFilter = LdapUtilCommon.computeAuthDn(extGroupName, filterTemplate);
        
        ZLdapContext zlc = null;
        try {
            zlc = ADGalGroupHandler.getExternalDelegatedAdminGroupsLdapContext(domain);
            
            ZSearchResultEntry entry = prov.getHelper().searchForEntry(
                    searchBase, searchFilter, zlc, new String[]{"mail"});
            
            if (entry != null) {
                return makeExternalGroup(domain, extGroupName, entry.getDN(), 
                        entry.getAttributes());
            } else {
                return null;
            }
        } finally {
            LdapClient.closeContext(zlc);
        }

    }

}
