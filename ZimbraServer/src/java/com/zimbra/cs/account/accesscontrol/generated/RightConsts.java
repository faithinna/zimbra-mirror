/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2009 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.account.accesscontrol.generated;

//
// DO NOT MODIFY - generated by RightManager
// 
// To generate, under ZimbraServer, run: 
//     ant generate-rights
//

public class RightConsts {
    ///// BEGIN-AUTO-GEN-REPLACE

    /* build: 6.0.0 pshao 20090612-1607 */


    /*
    ============
    user rights:
    ============
    */


    /**
     * automatically add meeting invites from grantee to the target&#039;s
     * calendar
     */
    public static final String RT_invite = "invite";

    /**
     * login as
     */
    public static final String RT_loginAs = "loginAs";

    /**
     * send as
     */
    public static final String RT_sendAs = "sendAs";

    /**
     * view free/busy
     */
    public static final String RT_viewFreeBusy = "viewFreeBusy";


    /*
    =============
    admin rights:
    =============
    */


    /**
     * cross mailbox search tasks management rights
     */
    public static final String RT_XMbxSearchRights = "XMbxSearchRights";

    /**
     * abort a running cross mailbox search task on a server
     */
    public static final String RT_abortXMbxSearch = "abortXMbxSearch";

    /**
     * access GAL by doing AutoCompleteGal/SearchGal/SyncGal requests
     */
    public static final String RT_accessGAL = "accessGAL";

    /**
     * add account alias
     */
    public static final String RT_addAccountAlias = "addAccountAlias";

    /**
     * add calendar resource alias
     */
    public static final String RT_addCalendarResourceAlias = "addCalendarResourceAlias";

    /**
     * add distribution list alias
     */
    public static final String RT_addDistributionListAlias = "addDistributionListAlias";

    /**
     * add member to distribution list
     */
    public static final String RT_addDistributionListMember = "addDistributionListMember";

    /**
     * login as the user as an admin. This is different from the loginAs user
     * right as follows: - loginAs is effective only when logged in as an
     * user - adminLoginAs is effective only when logged in as an admin That
     * is: If you are an admin and has the adminLoginAs right on user1, the
     * adminLoginAs is effective only when you login as an admin. It is not
     * effective if you login as a regular user. Likewise if another user
     * granted you the loginAs right, the right is effective when you logged
     * in as a regular user, it is not effective when you logged in as an
     * admin.
     */
    public static final String RT_adminLoginAs = "adminLoginAs";

    /**
     * assign the cos (to domains or accounts)
     */
    public static final String RT_assignCos = "assignCos";

    /**
     * backup accounts on a server
     */
    public static final String RT_backupAccount = "backupAccount";

    /**
     * check and create directory on file system
     */
    public static final String RT_checkDirectoryOnFileSystem = "checkDirectoryOnFileSystem";

    /**
     * check doamin MX record
     */
    public static final String RT_checkDomainMXRecord = "checkDomainMXRecord";

    /**
     * check exchange auth config
     */
    public static final String RT_checkExchangeAuthConfig = "checkExchangeAuthConfig";

    /**
     * check auth config for external auth
     */
    public static final String RT_checkExternalAuthConfig = "checkExternalAuthConfig";

    /**
     * check external GAL config
     */
    public static final String RT_checkExternalGALConfig = "checkExternalGALConfig";

    /**
     * check server health
     */
    public static final String RT_checkHealth = "checkHealth";

    /**
     * check if the group has any effective rights
     */
    public static final String RT_checkRightGrp = "checkRightGrp";

    /**
     * check if the account has a specific or any effective rights
     */
    public static final String RT_checkRightUsr = "checkRightUsr";

    /**
     * configure admin UI components
     */
    public static final String RT_configureAdminUI = "configureAdminUI";

    /**
     * configure cos constraint
     */
    public static final String RT_configureCosConstraint = "configureCosConstraint";

    /**
     * configure attributes for external auth
     */
    public static final String RT_configureExternalAuth = "configureExternalAuth";

    /**
     * configure attributes for external GAL
     */
    public static final String RT_configureExternalGAL = "configureExternalGAL";

    /**
     * configure global config constraint
     */
    public static final String RT_configureGlobalConfigConstraint = "configureGlobalConfigConstraint";

    /**
     * configure password strength
     */
    public static final String RT_configurePasswordStrength = "configurePasswordStrength";

    /**
     * configure quota
     */
    public static final String RT_configureQuota = "configureQuota";

    /**
     * configure attributes for wiki account
     */
    public static final String RT_configureWikiAccount = "configureWikiAccount";

    /**
     * count accounts in a domain
     */
    public static final String RT_countAccount = "countAccount";

    /**
     * create account in the domain
     */
    public static final String RT_createAccount = "createAccount";

    /**
     * create alias in this domain
     */
    public static final String RT_createAlias = "createAlias";

    /**
     * create calendar resource in the domain
     */
    public static final String RT_createCalendarResource = "createCalendarResource";

    /**
     * create cos
     */
    public static final String RT_createCos = "createCos";

    /**
     * create distribution list in the domain
     */
    public static final String RT_createDistributionList = "createDistributionList";

    /**
     * create server
     */
    public static final String RT_createServer = "createServer";

    /**
     * create sub domain
     */
    public static final String RT_createSubDomain = "createSubDomain";

    /**
     * create a top-level domain
     */
    public static final String RT_createTopDomain = "createTopDomain";

    /**
     * create XMPP component
     */
    public static final String RT_createXMPPComponent = "createXMPPComponent";

    /**
     * create a cross mailbox search task on a server
     */
    public static final String RT_createXMbxSearch = "createXMbxSearch";

    /**
     * create zimlet
     */
    public static final String RT_createZimlet = "createZimlet";

    /**
     * cross domain admin right
     */
    public static final String RT_crossDomainAdmin = "crossDomainAdmin";

    /**
     * delete account
     */
    public static final String RT_deleteAccount = "deleteAccount";

    /**
     * delete alias in this domain
     */
    public static final String RT_deleteAlias = "deleteAlias";

    /**
     * delete calendar resource
     */
    public static final String RT_deleteCalendarResource = "deleteCalendarResource";

    /**
     * delete cos
     */
    public static final String RT_deleteCos = "deleteCos";

    /**
     * delete distribution list
     */
    public static final String RT_deleteDistributionList = "deleteDistributionList";

    /**
     * delete domain
     */
    public static final String RT_deleteDomain = "deleteDomain";

    /**
     * delete server
     */
    public static final String RT_deleteServer = "deleteServer";

    /**
     * delete XMPP component
     */
    public static final String RT_deleteXMPPComponent = "deleteXMPPComponent";

    /**
     * delete a cross mailbox search task on a server
     */
    public static final String RT_deleteXMbxSearch = "deleteXMbxSearch";

    /**
     * delete zimlet
     */
    public static final String RT_deleteZimlet = "deleteZimlet";

    /**
     * deploy and undeploy zimlets on a server
     */
    public static final String RT_deployZimlet = "deployZimlet";

    /**
     * domain admin account right
     */
    public static final String RT_domainAdminAccountRights = "domainAdminAccountRights";

    /**
     * domain admin calresource right
     */
    public static final String RT_domainAdminCalendarResourceRights = "domainAdminCalendarResourceRights";

    /**
     * domain admin cos right
     */
    public static final String RT_domainAdminCosRights = "domainAdminCosRights";

    /**
     * domain admin dl right
     */
    public static final String RT_domainAdminDistributionListRights = "domainAdminDistributionListRights";

    /**
     * domain admin domain right
     */
    public static final String RT_domainAdminDomainRights = "domainAdminDomainRights";

    /**
     * domain admin rights
     */
    public static final String RT_domainAdminRights = "domainAdminRights";

    /**
     * domain admin server right
     */
    public static final String RT_domainAdminServerRights = "domainAdminServerRights";

    /**
     * domain admin zimlet right
     */
    public static final String RT_domainAdminZimletRights = "domainAdminZimletRights";

    /**
     * flush LDAP, skin, local caches on server
     */
    public static final String RT_flushCache = "flushCache";

    /**
     * get all account attributes
     */
    public static final String RT_getAccount = "getAccount";

    /**
     * get account id, home server, cos id and name, and access URL
     */
    public static final String RT_getAccountInfo = "getAccountInfo";

    /**
     * get all groups the account is a member of
     */
    public static final String RT_getAccountMembership = "getAccountMembership";

    /**
     * get share info on account
     */
    public static final String RT_getAccountShareInfo = "getAccountShareInfo";

    /**
     * get all calendar resource attributes
     */
    public static final String RT_getCalendarResource = "getCalendarResource";

    /**
     * get share info on calendar resource
     */
    public static final String RT_getCalendarResourceShareInfo = "getCalendarResourceShareInfo";

    /**
     * get all cos attributes
     */
    public static final String RT_getCos = "getCos";

    /**
     * get all distribution list attributes
     */
    public static final String RT_getDistributionList = "getDistributionList";

    /**
     * get all groups the distribution list is a member of
     */
    public static final String RT_getDistributionListMembership = "getDistributionListMembership";

    /**
     * get share info on distribution list
     */
    public static final String RT_getDistributionListShareInfo = "getDistributionListShareInfo";

    /**
     * get all domain attributes
     */
    public static final String RT_getDomain = "getDomain";

    /**
     * get domain quota usage
     */
    public static final String RT_getDomainQuotaUsage = "getDomainQuotaUsage";

    /**
     * get all global config attributes
     */
    public static final String RT_getGlobalConfig = "getGlobalConfig";

    /**
     * get mailbox id and size(quota) of an account
     */
    public static final String RT_getMailboxInfo = "getMailboxInfo";

    /**
     * get mailbox stats homed on the server
     */
    public static final String RT_getMailboxStats = "getMailboxStats";

    /**
     * get all server attributes
     */
    public static final String RT_getServer = "getServer";

    /**
     * dump/get sessions
     */
    public static final String RT_getSessions = "getSessions";

    /**
     * get all XMPP component attributes
     */
    public static final String RT_getXMPPComponent = "getXMPPComponent";

    /**
     * get all zimlet attributes
     */
    public static final String RT_getZimlet = "getZimlet";

    /**
     * see account in GetAllAccounts/SearchDirectoryResponse
     */
    public static final String RT_listAccount = "listAccount";

    /**
     * see calendar resource in
     * GetAllCalendarResources/SearchDirectoryResponse
     */
    public static final String RT_listCalendarResource = "listCalendarResource";

    /**
     * see cos in GetAllCos/SearchDirectoryResponse
     */
    public static final String RT_listCos = "listCos";

    /**
     * see distribution list in GetAllCos/SearchDirectoryResponse
     */
    public static final String RT_listDistributionList = "listDistributionList";

    /**
     * see domain in GetAllCos/SearchDirectoryResponse
     */
    public static final String RT_listDomain = "listDomain";

    /**
     * see server in GetAllCos/SearchDirectoryResponse
     */
    public static final String RT_listServer = "listServer";

    /**
     * see XMPP component in GetAllXMPPComponents
     */
    public static final String RT_listXMPPComponent = "listXMPPComponent";

    /**
     * retrieves details of all search tasks running or cashed on a server
     */
    public static final String RT_listXMbxSearch = "listXMbxSearch";

    /**
     * see zimlet in GetAllZimlets
     */
    public static final String RT_listZimlet = "listZimlet";

    /**
     * add/remove account loggers
     */
    public static final String RT_manageAccountLogger = "manageAccountLogger";

    /**
     * view and take actions on mail queues
     */
    public static final String RT_manageMailQueue = "manageMailQueue";

    /**
     * create, volumes
     */
    public static final String RT_manageVolume = "manageVolume";

    /**
     * create, destroy, wait, query wait sets
     */
    public static final String RT_manageWaitSet = "manageWaitSet";

    /**
     * activate/deactivate zimlets on a cos
     */
    public static final String RT_manageZimlet = "manageZimlet";

    /**
     * modify all account attributes
     */
    public static final String RT_modifyAccount = "modifyAccount";

    /**
     * modify all calendar resource attributes
     */
    public static final String RT_modifyCalendarResource = "modifyCalendarResource";

    /**
     * set all cos attributes
     */
    public static final String RT_modifyCos = "modifyCos";

    /**
     * set all distribution list attributes
     */
    public static final String RT_modifyDistributionList = "modifyDistributionList";

    /**
     * set all domain attributes
     */
    public static final String RT_modifyDomain = "modifyDomain";

    /**
     * modify all global config attributes
     */
    public static final String RT_modifyGlobalConfig = "modifyGlobalConfig";

    /**
     * set all server attributes
     */
    public static final String RT_modifyServer = "modifyServer";

    /**
     * set all XMPP component attributes
     */
    public static final String RT_modifyXMPPComponent = "modifyXMPPComponent";

    /**
     * set all zimlet attributes
     */
    public static final String RT_modifyZimlet = "modifyZimlet";

    /**
     * move account mailbox
     */
    public static final String RT_moveAccountMailbox = "moveAccountMailbox";

    /**
     * move calendar resource mailbox
     */
    public static final String RT_moveCalendarResourceMailbox = "moveCalendarResourceMailbox";

    /**
     * move mailboxes from a server and purge moved mailboxes
     */
    public static final String RT_moveMailboxFromServer = "moveMailboxFromServer";

    /**
     * move mailboxes to a server
     */
    public static final String RT_moveMailboxToServer = "moveMailboxToServer";

    /**
     * publish share info on account
     */
    public static final String RT_publishAccountShareInfo = "publishAccountShareInfo";

    /**
     * publish share info on calendar resource
     */
    public static final String RT_publishCalendarResourceShareInfo = "publishCalendarResourceShareInfo";

    /**
     * publish share info on distribution list
     */
    public static final String RT_publishDistributionListShareInfo = "publishDistributionListShareInfo";

    /**
     * purge account calendar cache
     */
    public static final String RT_purgeAccountCalendarCache = "purgeAccountCalendarCache";

    /**
     * purge calendar resource calendar cache
     */
    public static final String RT_purgeCalendarResourceCalendarCache = "purgeCalendarResourceCalendarCache";

    /**
     * purge messages of an account
     */
    public static final String RT_purgeMessages = "purgeMessages";

    /**
     * delete all inactive search tasks on a server.
     */
    public static final String RT_purgeXMbxSearch = "purgeXMbxSearch";

    /**
     * reindex mailbox
     */
    public static final String RT_reindexMailbox = "reindexMailbox";

    /**
     * remove account alias
     */
    public static final String RT_removeAccountAlias = "removeAccountAlias";

    /**
     * remove calendar resource alias
     */
    public static final String RT_removeCalendarResourceAlias = "removeCalendarResourceAlias";

    /**
     * remove distribution list alias
     */
    public static final String RT_removeDistributionListAlias = "removeDistributionListAlias";

    /**
     * remove member from distribution list
     */
    public static final String RT_removeDistributionListMember = "removeDistributionListMember";

    /**
     * rename account
     */
    public static final String RT_renameAccount = "renameAccount";

    /**
     * rename calendar resource
     */
    public static final String RT_renameCalendarResource = "renameCalendarResource";

    /**
     * rename cos
     */
    public static final String RT_renameCos = "renameCos";

    /**
     * rename distribution list
     */
    public static final String RT_renameDistributionList = "renameDistributionList";

    /**
     * restore accounts on a server
     */
    public static final String RT_restoreAccount = "restoreAccount";

    /**
     * rollover redo log on a server
     */
    public static final String RT_rolloverRedoLog = "rolloverRedoLog";

    /**
     * set account password
     */
    public static final String RT_setAccountPassword = "setAccountPassword";

    /**
     * save admin saved searches
     */
    public static final String RT_setAdminSavedSearch = "setAdminSavedSearch";

    /**
     * set calendar resource password
     */
    public static final String RT_setCalendarResourcePassword = "setCalendarResourcePassword";

    /**
     * account and calendar resource attrs modifiable by domain admins for
     * domain based access manager
     */
    public static final String RT_setDomainAdminAccountAndCalendarResourceAttrs = "setDomainAdminAccountAndCalendarResourceAttrs";

    /**
     * calendar resource attrs modifiable by domain admins for domain based
     * access manager
     */
    public static final String RT_setDomainAdminCalendarResourceAttrs = "setDomainAdminCalendarResourceAttrs";

    /**
     * distribution list attrs modifiable by domain admins for domain based
     * access manager
     */
    public static final String RT_setDomainAdminDistributionListAttrs = "setDomainAdminDistributionListAttrs";

    /**
     * domain attrs modifiable by domain admins for domain based access
     * manager
     */
    public static final String RT_setDomainAdminDomainAttrs = "setDomainAdminDomainAttrs";

    /**
     * right to run the GetAdminConsoleUIComp SOAP call when an account other
     * than the authenticated account is provided. Note, this is a preset
     * right instead of a getAttrs right, because it carries extra meanings
     * than simply get the zimbraAdminConsoleUIComponents attribute on the
     * account. GetAdminConsoleUIComp return the union of
     * zimbraAdminConsoleUIComponents on the account and that on all admin
     * groups the account belongs. Instead of checking get attr right for
     * zimbraAdminConsoleUIComponents on the account and on all admin groups
     * it belong, GetAdminConsoleUICompRequest just checks the
     * viewAccountAdminUI right.
     */
    public static final String RT_viewAccountAdminUI = "viewAccountAdminUI";

    /**
     * view admin saved searches
     */
    public static final String RT_viewAdminSavedSearch = "viewAdminSavedSearch";

    /**
     * right to run the GetAdminConsoleUIComp SOAP call when a distribution
     * list is provided. Note, this is a preset right instead of a getAttrs
     * right, because it carries extra meanings than simply get the
     * zimbraAdminConsoleUIComponents attribute on the distribution list.
     * GetAdminConsoleUIComp return the union of
     * zimbraAdminConsoleUIComponents on the dl and that on all admin groups
     * the dl belongs. Instead of checking get attr right for
     * zimbraAdminConsoleUIComponents on the dl and on all admin groups it
     * belong, GetAdminConsoleUICompRequest just checks the
     * viewDistributionListAdminUI right.
     */
    public static final String RT_viewDistributionListAdminUI = "viewDistributionListAdminUI";

    /**
     * view grants on all target types
     */
    public static final String RT_viewGrants = "viewGrants";

    /**
     * view password strength
     */
    public static final String RT_viewPasswordStrength = "viewPasswordStrength";

    ///// END-AUTO-GEN-REPLACE
}
