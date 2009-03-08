/*
 * ***** BEGIN LICENSE BLOCK *****
 * 
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2004, 2005, 2006, 2007 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * 
 * ***** END LICENSE BLOCK *****
 */

/*
 * Created on Sep 23, 2004
 *
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.zimbra.cs.account;

import com.zimbra.common.util.DateUtil;
import com.zimbra.common.util.StringUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * AUTO-GENERATED. DO NOT EDIT.
 *
 */
public class ZAttrCos extends NamedEntry {

    public ZAttrCos(String name, String id, Map<String,Object> attrs, Provisioning prov) {
        super(name, id, attrs, null, prov);
    }

    ///// BEGIN-AUTO-GEN-REPLACE

    /* build: 5.0 pshao 20090307-2029 */

    /**
     * RFC2256: common name(s) for which the entity is known by
     *
     * @return cn, or null if unset
     */
    @ZAttr(id=-1)
    public String getCn() {
        return getAttr(Provisioning.A_cn, null);
    }

    /**
     * RFC2256: common name(s) for which the entity is known by
     *
     * @param cn new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void setCn(String cn) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_cn, cn);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: common name(s) for which the entity is known by
     *
     * @param cn new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> setCn(String cn, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_cn, cn);
        return attrs;
    }

    /**
     * RFC2256: common name(s) for which the entity is known by
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void unsetCn() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_cn, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: common name(s) for which the entity is known by
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> unsetCn(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_cn, "");
        return attrs;
    }

    /**
     * RFC2256: descriptive information
     *
     * @return description, or ampty array if unset
     */
    @ZAttr(id=-1)
    public String[] getDescription() {
        return getMultiAttr(Provisioning.A_description);
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void setDescription(String[] description) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_description, description);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> setDescription(String[] description, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_description, description);
        return attrs;
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void addDescription(String description) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_description, description);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> addDescription(String description, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_description, description);
        return attrs;
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void removeDescription(String description) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_description, description);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: descriptive information
     *
     * @param description existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> removeDescription(String description, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_description, description);
        return attrs;
    }

    /**
     * RFC2256: descriptive information
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=-1)
    public void unsetDescription() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_description, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * RFC2256: descriptive information
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=-1)
    public Map<String,Object> unsetDescription(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_description, "");
        return attrs;
    }

    /**
     * Zimbra access control list
     *
     * @return zimbraACE, or ampty array if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public String[] getACE() {
        return getMultiAttr(Provisioning.A_zimbraACE);
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public void setACE(String[] zimbraACE) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraACE, zimbraACE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public Map<String,Object> setACE(String[] zimbraACE, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraACE, zimbraACE);
        return attrs;
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public void addACE(String zimbraACE) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraACE, zimbraACE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public Map<String,Object> addACE(String zimbraACE, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraACE, zimbraACE);
        return attrs;
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public void removeACE(String zimbraACE) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraACE, zimbraACE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra access control list
     *
     * @param zimbraACE existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public Map<String,Object> removeACE(String zimbraACE, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraACE, zimbraACE);
        return attrs;
    }

    /**
     * Zimbra access control list
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public void unsetACE() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraACE, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra access control list
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=659)
    public Map<String,Object> unsetACE(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraACE, "");
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * <p>Use getAdminAuthTokenLifetimeAsString to access value as a string.
     *
     * @see #getAdminAuthTokenLifetimeAsString()
     *
     * @return zimbraAdminAuthTokenLifetime in millseconds, or 43200000 (12h)  if unset
     */
    @ZAttr(id=109)
    public long getAdminAuthTokenLifetime() {
        return getTimeInterval(Provisioning.A_zimbraAdminAuthTokenLifetime, 43200000L);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * @return zimbraAdminAuthTokenLifetime, or "12h" if unset
     */
    @ZAttr(id=109)
    public String getAdminAuthTokenLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraAdminAuthTokenLifetime, "12h");
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * @param zimbraAdminAuthTokenLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=109)
    public void setAdminAuthTokenLifetime(String zimbraAdminAuthTokenLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminAuthTokenLifetime, zimbraAdminAuthTokenLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * @param zimbraAdminAuthTokenLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=109)
    public Map<String,Object> setAdminAuthTokenLifetime(String zimbraAdminAuthTokenLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminAuthTokenLifetime, zimbraAdminAuthTokenLifetime);
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=109)
    public void unsetAdminAuthTokenLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminAuthTokenLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created admin auth tokens
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=109)
    public Map<String,Object> unsetAdminAuthTokenLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminAuthTokenLifetime, "");
        return attrs;
    }

    /**
     * admin saved searches
     *
     * @return zimbraAdminSavedSearches, or ampty array if unset
     */
    @ZAttr(id=446)
    public String[] getAdminSavedSearches() {
        return getMultiAttr(Provisioning.A_zimbraAdminSavedSearches);
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=446)
    public void setAdminSavedSearches(String[] zimbraAdminSavedSearches) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=446)
    public Map<String,Object> setAdminSavedSearches(String[] zimbraAdminSavedSearches, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        return attrs;
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=446)
    public void addAdminSavedSearches(String zimbraAdminSavedSearches) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=446)
    public Map<String,Object> addAdminSavedSearches(String zimbraAdminSavedSearches, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        return attrs;
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=446)
    public void removeAdminSavedSearches(String zimbraAdminSavedSearches) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * admin saved searches
     *
     * @param zimbraAdminSavedSearches existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=446)
    public Map<String,Object> removeAdminSavedSearches(String zimbraAdminSavedSearches, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAdminSavedSearches, zimbraAdminSavedSearches);
        return attrs;
    }

    /**
     * admin saved searches
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=446)
    public void unsetAdminSavedSearches() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminSavedSearches, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * admin saved searches
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=446)
    public Map<String,Object> unsetAdminSavedSearches(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAdminSavedSearches, "");
        return attrs;
    }

    /**
     * Whether this account can use any from address. Not changeable by
     * domain admin to allow arbitrary addresses
     *
     * @return zimbraAllowAnyFromAddress, or false if unset
     */
    @ZAttr(id=427)
    public boolean isAllowAnyFromAddress() {
        return getBooleanAttr(Provisioning.A_zimbraAllowAnyFromAddress, false);
    }

    /**
     * Whether this account can use any from address. Not changeable by
     * domain admin to allow arbitrary addresses
     *
     * @param zimbraAllowAnyFromAddress new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=427)
    public void setAllowAnyFromAddress(boolean zimbraAllowAnyFromAddress) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAllowAnyFromAddress, zimbraAllowAnyFromAddress ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether this account can use any from address. Not changeable by
     * domain admin to allow arbitrary addresses
     *
     * @param zimbraAllowAnyFromAddress new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=427)
    public Map<String,Object> setAllowAnyFromAddress(boolean zimbraAllowAnyFromAddress, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAllowAnyFromAddress, zimbraAllowAnyFromAddress ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether this account can use any from address. Not changeable by
     * domain admin to allow arbitrary addresses
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=427)
    public void unsetAllowAnyFromAddress() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAllowAnyFromAddress, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether this account can use any from address. Not changeable by
     * domain admin to allow arbitrary addresses
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=427)
    public Map<String,Object> unsetAllowAnyFromAddress(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAllowAnyFromAddress, "");
        return attrs;
    }

    /**
     * An account or CoS setting that works with the name template that
     * allows you to dictate the date format used in the name template. This
     * is a Java SimpleDateFormat specifier. The default is an LDAP
     * generalized time format:
     *
     * @return zimbraArchiveAccountDateTemplate, or "yyyyMMdd" if unset
     */
    @ZAttr(id=432)
    public String getArchiveAccountDateTemplate() {
        return getAttr(Provisioning.A_zimbraArchiveAccountDateTemplate, "yyyyMMdd");
    }

    /**
     * An account or CoS setting that works with the name template that
     * allows you to dictate the date format used in the name template. This
     * is a Java SimpleDateFormat specifier. The default is an LDAP
     * generalized time format:
     *
     * @param zimbraArchiveAccountDateTemplate new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=432)
    public void setArchiveAccountDateTemplate(String zimbraArchiveAccountDateTemplate) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountDateTemplate, zimbraArchiveAccountDateTemplate);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * An account or CoS setting that works with the name template that
     * allows you to dictate the date format used in the name template. This
     * is a Java SimpleDateFormat specifier. The default is an LDAP
     * generalized time format:
     *
     * @param zimbraArchiveAccountDateTemplate new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=432)
    public Map<String,Object> setArchiveAccountDateTemplate(String zimbraArchiveAccountDateTemplate, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountDateTemplate, zimbraArchiveAccountDateTemplate);
        return attrs;
    }

    /**
     * An account or CoS setting that works with the name template that
     * allows you to dictate the date format used in the name template. This
     * is a Java SimpleDateFormat specifier. The default is an LDAP
     * generalized time format:
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=432)
    public void unsetArchiveAccountDateTemplate() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountDateTemplate, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * An account or CoS setting that works with the name template that
     * allows you to dictate the date format used in the name template. This
     * is a Java SimpleDateFormat specifier. The default is an LDAP
     * generalized time format:
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=432)
    public Map<String,Object> unsetArchiveAccountDateTemplate(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountDateTemplate, "");
        return attrs;
    }

    /**
     * An account or CoS setting - typically only in CoS - that tells the
     * archiving system how to derive the archive mailbox name. ID, USER,
     * DATE, and DOMAIN are expanded.
     *
     * @return zimbraArchiveAccountNameTemplate, or "${USER}-${DATE}@${DOMAIN}.archive" if unset
     */
    @ZAttr(id=431)
    public String getArchiveAccountNameTemplate() {
        return getAttr(Provisioning.A_zimbraArchiveAccountNameTemplate, "${USER}-${DATE}@${DOMAIN}.archive");
    }

    /**
     * An account or CoS setting - typically only in CoS - that tells the
     * archiving system how to derive the archive mailbox name. ID, USER,
     * DATE, and DOMAIN are expanded.
     *
     * @param zimbraArchiveAccountNameTemplate new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=431)
    public void setArchiveAccountNameTemplate(String zimbraArchiveAccountNameTemplate) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountNameTemplate, zimbraArchiveAccountNameTemplate);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * An account or CoS setting - typically only in CoS - that tells the
     * archiving system how to derive the archive mailbox name. ID, USER,
     * DATE, and DOMAIN are expanded.
     *
     * @param zimbraArchiveAccountNameTemplate new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=431)
    public Map<String,Object> setArchiveAccountNameTemplate(String zimbraArchiveAccountNameTemplate, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountNameTemplate, zimbraArchiveAccountNameTemplate);
        return attrs;
    }

    /**
     * An account or CoS setting - typically only in CoS - that tells the
     * archiving system how to derive the archive mailbox name. ID, USER,
     * DATE, and DOMAIN are expanded.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=431)
    public void unsetArchiveAccountNameTemplate() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountNameTemplate, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * An account or CoS setting - typically only in CoS - that tells the
     * archiving system how to derive the archive mailbox name. ID, USER,
     * DATE, and DOMAIN are expanded.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=431)
    public Map<String,Object> unsetArchiveAccountNameTemplate(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraArchiveAccountNameTemplate, "");
        return attrs;
    }

    /**
     * block all attachment downloading
     *
     * @return zimbraAttachmentsBlocked, or false if unset
     */
    @ZAttr(id=115)
    public boolean isAttachmentsBlocked() {
        return getBooleanAttr(Provisioning.A_zimbraAttachmentsBlocked, false);
    }

    /**
     * block all attachment downloading
     *
     * @param zimbraAttachmentsBlocked new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=115)
    public void setAttachmentsBlocked(boolean zimbraAttachmentsBlocked) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsBlocked, zimbraAttachmentsBlocked ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * block all attachment downloading
     *
     * @param zimbraAttachmentsBlocked new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=115)
    public Map<String,Object> setAttachmentsBlocked(boolean zimbraAttachmentsBlocked, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsBlocked, zimbraAttachmentsBlocked ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * block all attachment downloading
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=115)
    public void unsetAttachmentsBlocked() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsBlocked, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * block all attachment downloading
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=115)
    public Map<String,Object> unsetAttachmentsBlocked(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsBlocked, "");
        return attrs;
    }

    /**
     * whether or not to index attachemts
     *
     * @return zimbraAttachmentsIndexingEnabled, or true if unset
     */
    @ZAttr(id=173)
    public boolean isAttachmentsIndexingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraAttachmentsIndexingEnabled, true);
    }

    /**
     * whether or not to index attachemts
     *
     * @param zimbraAttachmentsIndexingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=173)
    public void setAttachmentsIndexingEnabled(boolean zimbraAttachmentsIndexingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsIndexingEnabled, zimbraAttachmentsIndexingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to index attachemts
     *
     * @param zimbraAttachmentsIndexingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=173)
    public Map<String,Object> setAttachmentsIndexingEnabled(boolean zimbraAttachmentsIndexingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsIndexingEnabled, zimbraAttachmentsIndexingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not to index attachemts
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=173)
    public void unsetAttachmentsIndexingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsIndexingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to index attachemts
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=173)
    public Map<String,Object> unsetAttachmentsIndexingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsIndexingEnabled, "");
        return attrs;
    }

    /**
     * view all attachments in html only
     *
     * @return zimbraAttachmentsViewInHtmlOnly, or false if unset
     */
    @ZAttr(id=116)
    public boolean isAttachmentsViewInHtmlOnly() {
        return getBooleanAttr(Provisioning.A_zimbraAttachmentsViewInHtmlOnly, false);
    }

    /**
     * view all attachments in html only
     *
     * @param zimbraAttachmentsViewInHtmlOnly new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=116)
    public void setAttachmentsViewInHtmlOnly(boolean zimbraAttachmentsViewInHtmlOnly) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsViewInHtmlOnly, zimbraAttachmentsViewInHtmlOnly ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * view all attachments in html only
     *
     * @param zimbraAttachmentsViewInHtmlOnly new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=116)
    public Map<String,Object> setAttachmentsViewInHtmlOnly(boolean zimbraAttachmentsViewInHtmlOnly, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsViewInHtmlOnly, zimbraAttachmentsViewInHtmlOnly ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * view all attachments in html only
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=116)
    public void unsetAttachmentsViewInHtmlOnly() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsViewInHtmlOnly, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * view all attachments in html only
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=116)
    public Map<String,Object> unsetAttachmentsViewInHtmlOnly(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAttachmentsViewInHtmlOnly, "");
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * <p>Use getAuthTokenLifetimeAsString to access value as a string.
     *
     * @see #getAuthTokenLifetimeAsString()
     *
     * @return zimbraAuthTokenLifetime in millseconds, or 172800000 (2d)  if unset
     */
    @ZAttr(id=108)
    public long getAuthTokenLifetime() {
        return getTimeInterval(Provisioning.A_zimbraAuthTokenLifetime, 172800000L);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * @return zimbraAuthTokenLifetime, or "2d" if unset
     */
    @ZAttr(id=108)
    public String getAuthTokenLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraAuthTokenLifetime, "2d");
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * @param zimbraAuthTokenLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=108)
    public void setAuthTokenLifetime(String zimbraAuthTokenLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAuthTokenLifetime, zimbraAuthTokenLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * @param zimbraAuthTokenLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=108)
    public Map<String,Object> setAuthTokenLifetime(String zimbraAuthTokenLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAuthTokenLifetime, zimbraAuthTokenLifetime);
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=108)
    public void unsetAuthTokenLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAuthTokenLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of newly created auth tokens
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=108)
    public Map<String,Object> unsetAuthTokenLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAuthTokenLifetime, "");
        return attrs;
    }

    /**
     * Locales available for this account
     *
     * @return zimbraAvailableLocale, or ampty array if unset
     */
    @ZAttr(id=487)
    public String[] getAvailableLocale() {
        return getMultiAttr(Provisioning.A_zimbraAvailableLocale);
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=487)
    public void setAvailableLocale(String[] zimbraAvailableLocale) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=487)
    public Map<String,Object> setAvailableLocale(String[] zimbraAvailableLocale, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        return attrs;
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=487)
    public void addAvailableLocale(String zimbraAvailableLocale) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=487)
    public Map<String,Object> addAvailableLocale(String zimbraAvailableLocale, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        return attrs;
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=487)
    public void removeAvailableLocale(String zimbraAvailableLocale) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Locales available for this account
     *
     * @param zimbraAvailableLocale existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=487)
    public Map<String,Object> removeAvailableLocale(String zimbraAvailableLocale, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAvailableLocale, zimbraAvailableLocale);
        return attrs;
    }

    /**
     * Locales available for this account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=487)
    public void unsetAvailableLocale() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableLocale, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Locales available for this account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=487)
    public Map<String,Object> unsetAvailableLocale(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableLocale, "");
        return attrs;
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @return zimbraAvailableSkin, or ampty array if unset
     */
    @ZAttr(id=364)
    public String[] getAvailableSkin() {
        return getMultiAttr(Provisioning.A_zimbraAvailableSkin);
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=364)
    public void setAvailableSkin(String[] zimbraAvailableSkin) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=364)
    public Map<String,Object> setAvailableSkin(String[] zimbraAvailableSkin, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        return attrs;
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=364)
    public void addAvailableSkin(String zimbraAvailableSkin) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=364)
    public Map<String,Object> addAvailableSkin(String zimbraAvailableSkin, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        return attrs;
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=364)
    public void removeAvailableSkin(String zimbraAvailableSkin) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param zimbraAvailableSkin existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=364)
    public Map<String,Object> removeAvailableSkin(String zimbraAvailableSkin, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraAvailableSkin, zimbraAvailableSkin);
        return attrs;
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=364)
    public void unsetAvailableSkin() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableSkin, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skins available for this account. Fallback order is: 1. the normal
     * account/cos inheritance 2. if not set on account/cos, use the value on
     * the domain of the account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=364)
    public Map<String,Object> unsetAvailableSkin(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraAvailableSkin, "");
        return attrs;
    }

    /**
     * Batch size to use when indexing data
     *
     * @return zimbraBatchedIndexingSize, or 0 if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=619)
    public int getBatchedIndexingSize() {
        return getIntAttr(Provisioning.A_zimbraBatchedIndexingSize, 0);
    }

    /**
     * Batch size to use when indexing data
     *
     * @param zimbraBatchedIndexingSize new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=619)
    public void setBatchedIndexingSize(int zimbraBatchedIndexingSize) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraBatchedIndexingSize, Integer.toString(zimbraBatchedIndexingSize));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Batch size to use when indexing data
     *
     * @param zimbraBatchedIndexingSize new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=619)
    public Map<String,Object> setBatchedIndexingSize(int zimbraBatchedIndexingSize, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraBatchedIndexingSize, Integer.toString(zimbraBatchedIndexingSize));
        return attrs;
    }

    /**
     * Batch size to use when indexing data
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=619)
    public void unsetBatchedIndexingSize() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraBatchedIndexingSize, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Batch size to use when indexing data
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=619)
    public Map<String,Object> unsetBatchedIndexingSize(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraBatchedIndexingSize, "");
        return attrs;
    }

    /**
     * CalDAV shared folder cache duration
     *
     * <p>Use getCalendarCalDavSharedFolderCacheDurationAsString to access value as a string.
     *
     * @see #getCalendarCalDavSharedFolderCacheDurationAsString()
     *
     * @return zimbraCalendarCalDavSharedFolderCacheDuration in millseconds, or 60000 (1m)  if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public long getCalendarCalDavSharedFolderCacheDuration() {
        return getTimeInterval(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, 60000L);
    }

    /**
     * CalDAV shared folder cache duration
     *
     * @return zimbraCalendarCalDavSharedFolderCacheDuration, or "1m" if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public String getCalendarCalDavSharedFolderCacheDurationAsString() {
        return getAttr(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, "1m");
    }

    /**
     * CalDAV shared folder cache duration
     *
     * @param zimbraCalendarCalDavSharedFolderCacheDuration new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public void setCalendarCalDavSharedFolderCacheDuration(String zimbraCalendarCalDavSharedFolderCacheDuration) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, zimbraCalendarCalDavSharedFolderCacheDuration);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * CalDAV shared folder cache duration
     *
     * @param zimbraCalendarCalDavSharedFolderCacheDuration new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public Map<String,Object> setCalendarCalDavSharedFolderCacheDuration(String zimbraCalendarCalDavSharedFolderCacheDuration, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, zimbraCalendarCalDavSharedFolderCacheDuration);
        return attrs;
    }

    /**
     * CalDAV shared folder cache duration
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public void unsetCalendarCalDavSharedFolderCacheDuration() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * CalDAV shared folder cache duration
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=817)
    public Map<String,Object> unsetCalendarCalDavSharedFolderCacheDuration(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSharedFolderCacheDuration, "");
        return attrs;
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * <p>Use getCalendarCalDavSyncEndAsString to access value as a string.
     *
     * @see #getCalendarCalDavSyncEndAsString()
     *
     * @return zimbraCalendarCalDavSyncEnd in millseconds, or -1 if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public long getCalendarCalDavSyncEnd() {
        return getTimeInterval(Provisioning.A_zimbraCalendarCalDavSyncEnd, -1L);
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * @return zimbraCalendarCalDavSyncEnd, or null if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public String getCalendarCalDavSyncEndAsString() {
        return getAttr(Provisioning.A_zimbraCalendarCalDavSyncEnd, null);
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * @param zimbraCalendarCalDavSyncEnd new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public void setCalendarCalDavSyncEnd(String zimbraCalendarCalDavSyncEnd) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncEnd, zimbraCalendarCalDavSyncEnd);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * @param zimbraCalendarCalDavSyncEnd new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public Map<String,Object> setCalendarCalDavSyncEnd(String zimbraCalendarCalDavSyncEnd, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncEnd, zimbraCalendarCalDavSyncEnd);
        return attrs;
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public void unsetCalendarCalDavSyncEnd() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncEnd, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * see description of zimbraCalendarCalDavSyncStart
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=816)
    public Map<String,Object> unsetCalendarCalDavSyncEnd(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncEnd, "");
        return attrs;
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * <p>Use getCalendarCalDavSyncStartAsString to access value as a string.
     *
     * @see #getCalendarCalDavSyncStartAsString()
     *
     * @return zimbraCalendarCalDavSyncStart in millseconds, or -1 if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public long getCalendarCalDavSyncStart() {
        return getTimeInterval(Provisioning.A_zimbraCalendarCalDavSyncStart, -1L);
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * @return zimbraCalendarCalDavSyncStart, or null if unset
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public String getCalendarCalDavSyncStartAsString() {
        return getAttr(Provisioning.A_zimbraCalendarCalDavSyncStart, null);
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * @param zimbraCalendarCalDavSyncStart new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public void setCalendarCalDavSyncStart(String zimbraCalendarCalDavSyncStart) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncStart, zimbraCalendarCalDavSyncStart);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * @param zimbraCalendarCalDavSyncStart new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public Map<String,Object> setCalendarCalDavSyncStart(String zimbraCalendarCalDavSyncStart, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncStart, zimbraCalendarCalDavSyncStart);
        return attrs;
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public void unsetCalendarCalDavSyncStart() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncStart, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimbraCalendarCalDavSyncStart and zimbraCalendarCalDavSyncEnd limits
     * the window of appointment data available via CalDAV. for example when
     * zimbraCalendarCalDavSyncStart is set to 30 days, and
     * zimbraCalendarCalDavSyncEnd is set to 1 years, then the appointments
     * between (now - 30 days) and (now + 1 year) will be available via
     * CalDAV. When they are unset all the appointments are available via
     * CalDAV.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.14
     */
    @ZAttr(id=815)
    public Map<String,Object> unsetCalendarCalDavSyncStart(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarCalDavSyncStart, "");
        return attrs;
    }

    /**
     * maximum number of revisions to keep for calendar items (appointments
     * and tasks). 0 means unlimited.
     *
     * @return zimbraCalendarMaxRevisions, or 1 if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=709)
    public int getCalendarMaxRevisions() {
        return getIntAttr(Provisioning.A_zimbraCalendarMaxRevisions, 1);
    }

    /**
     * maximum number of revisions to keep for calendar items (appointments
     * and tasks). 0 means unlimited.
     *
     * @param zimbraCalendarMaxRevisions new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=709)
    public void setCalendarMaxRevisions(int zimbraCalendarMaxRevisions) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarMaxRevisions, Integer.toString(zimbraCalendarMaxRevisions));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of revisions to keep for calendar items (appointments
     * and tasks). 0 means unlimited.
     *
     * @param zimbraCalendarMaxRevisions new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=709)
    public Map<String,Object> setCalendarMaxRevisions(int zimbraCalendarMaxRevisions, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarMaxRevisions, Integer.toString(zimbraCalendarMaxRevisions));
        return attrs;
    }

    /**
     * maximum number of revisions to keep for calendar items (appointments
     * and tasks). 0 means unlimited.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=709)
    public void unsetCalendarMaxRevisions() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarMaxRevisions, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of revisions to keep for calendar items (appointments
     * and tasks). 0 means unlimited.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=709)
    public Map<String,Object> unsetCalendarMaxRevisions(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCalendarMaxRevisions, "");
        return attrs;
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @return zimbraConstraint, or ampty array if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public String[] getConstraint() {
        return getMultiAttr(Provisioning.A_zimbraConstraint);
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public void setConstraint(String[] zimbraConstraint) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraConstraint, zimbraConstraint);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public Map<String,Object> setConstraint(String[] zimbraConstraint, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraConstraint, zimbraConstraint);
        return attrs;
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public void addConstraint(String zimbraConstraint) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraConstraint, zimbraConstraint);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public Map<String,Object> addConstraint(String zimbraConstraint, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraConstraint, zimbraConstraint);
        return attrs;
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public void removeConstraint(String zimbraConstraint) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraConstraint, zimbraConstraint);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param zimbraConstraint existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public Map<String,Object> removeConstraint(String zimbraConstraint, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraConstraint, zimbraConstraint);
        return attrs;
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public void unsetConstraint() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraConstraint, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * attribute constraints TODO: fill all the constraints
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=766)
    public Map<String,Object> unsetConstraint(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraConstraint, "");
        return attrs;
    }

    /**
     * Comma separates list of attributes in contact object to search for
     * email addresses when generating auto-complete contact list. The same
     * set of fields are used for GAL contacts as well because LDAP
     * attributes for GAL objects are mapped to Contact compatible attributes
     * via zimbraGalLdapAttrMap.
     *
     * @return zimbraContactAutoCompleteEmailFields, or "email,email2,email3" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=760)
    public String getContactAutoCompleteEmailFields() {
        return getAttr(Provisioning.A_zimbraContactAutoCompleteEmailFields, "email,email2,email3");
    }

    /**
     * Comma separates list of attributes in contact object to search for
     * email addresses when generating auto-complete contact list. The same
     * set of fields are used for GAL contacts as well because LDAP
     * attributes for GAL objects are mapped to Contact compatible attributes
     * via zimbraGalLdapAttrMap.
     *
     * @param zimbraContactAutoCompleteEmailFields new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=760)
    public void setContactAutoCompleteEmailFields(String zimbraContactAutoCompleteEmailFields) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteEmailFields, zimbraContactAutoCompleteEmailFields);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Comma separates list of attributes in contact object to search for
     * email addresses when generating auto-complete contact list. The same
     * set of fields are used for GAL contacts as well because LDAP
     * attributes for GAL objects are mapped to Contact compatible attributes
     * via zimbraGalLdapAttrMap.
     *
     * @param zimbraContactAutoCompleteEmailFields new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=760)
    public Map<String,Object> setContactAutoCompleteEmailFields(String zimbraContactAutoCompleteEmailFields, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteEmailFields, zimbraContactAutoCompleteEmailFields);
        return attrs;
    }

    /**
     * Comma separates list of attributes in contact object to search for
     * email addresses when generating auto-complete contact list. The same
     * set of fields are used for GAL contacts as well because LDAP
     * attributes for GAL objects are mapped to Contact compatible attributes
     * via zimbraGalLdapAttrMap.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=760)
    public void unsetContactAutoCompleteEmailFields() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteEmailFields, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Comma separates list of attributes in contact object to search for
     * email addresses when generating auto-complete contact list. The same
     * set of fields are used for GAL contacts as well because LDAP
     * attributes for GAL objects are mapped to Contact compatible attributes
     * via zimbraGalLdapAttrMap.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=760)
    public Map<String,Object> unsetContactAutoCompleteEmailFields(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteEmailFields, "");
        return attrs;
    }

    /**
     * maximum number of contact entries to return from an auto complete
     *
     * @return zimbraContactAutoCompleteMaxResults, or 20 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=827)
    public int getContactAutoCompleteMaxResults() {
        return getIntAttr(Provisioning.A_zimbraContactAutoCompleteMaxResults, 20);
    }

    /**
     * maximum number of contact entries to return from an auto complete
     *
     * @param zimbraContactAutoCompleteMaxResults new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=827)
    public void setContactAutoCompleteMaxResults(int zimbraContactAutoCompleteMaxResults) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteMaxResults, Integer.toString(zimbraContactAutoCompleteMaxResults));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of contact entries to return from an auto complete
     *
     * @param zimbraContactAutoCompleteMaxResults new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=827)
    public Map<String,Object> setContactAutoCompleteMaxResults(int zimbraContactAutoCompleteMaxResults, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteMaxResults, Integer.toString(zimbraContactAutoCompleteMaxResults));
        return attrs;
    }

    /**
     * maximum number of contact entries to return from an auto complete
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=827)
    public void unsetContactAutoCompleteMaxResults() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteMaxResults, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of contact entries to return from an auto complete
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=827)
    public Map<String,Object> unsetContactAutoCompleteMaxResults(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactAutoCompleteMaxResults, "");
        return attrs;
    }

    /**
     * Maximum number of contacts allowed in mailbox. 0 means no limit.
     *
     * @return zimbraContactMaxNumEntries, or 10000 if unset
     */
    @ZAttr(id=107)
    public int getContactMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraContactMaxNumEntries, 10000);
    }

    /**
     * Maximum number of contacts allowed in mailbox. 0 means no limit.
     *
     * @param zimbraContactMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=107)
    public void setContactMaxNumEntries(int zimbraContactMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactMaxNumEntries, Integer.toString(zimbraContactMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of contacts allowed in mailbox. 0 means no limit.
     *
     * @param zimbraContactMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=107)
    public Map<String,Object> setContactMaxNumEntries(int zimbraContactMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactMaxNumEntries, Integer.toString(zimbraContactMaxNumEntries));
        return attrs;
    }

    /**
     * Maximum number of contacts allowed in mailbox. 0 means no limit.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=107)
    public void unsetContactMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of contacts allowed in mailbox. 0 means no limit.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=107)
    public Map<String,Object> unsetContactMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactMaxNumEntries, "");
        return attrs;
    }

    /**
     * Size of the contact ranking table. Ranking table is used to keep track
     * of most heavily used contacts in outgoing email. Contacts in the
     * ranking table are given the priority when generating the auto-complete
     * contact list.
     *
     * @return zimbraContactRankingTableSize, or 40 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=758)
    public int getContactRankingTableSize() {
        return getIntAttr(Provisioning.A_zimbraContactRankingTableSize, 40);
    }

    /**
     * Size of the contact ranking table. Ranking table is used to keep track
     * of most heavily used contacts in outgoing email. Contacts in the
     * ranking table are given the priority when generating the auto-complete
     * contact list.
     *
     * @param zimbraContactRankingTableSize new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=758)
    public void setContactRankingTableSize(int zimbraContactRankingTableSize) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactRankingTableSize, Integer.toString(zimbraContactRankingTableSize));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Size of the contact ranking table. Ranking table is used to keep track
     * of most heavily used contacts in outgoing email. Contacts in the
     * ranking table are given the priority when generating the auto-complete
     * contact list.
     *
     * @param zimbraContactRankingTableSize new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=758)
    public Map<String,Object> setContactRankingTableSize(int zimbraContactRankingTableSize, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactRankingTableSize, Integer.toString(zimbraContactRankingTableSize));
        return attrs;
    }

    /**
     * Size of the contact ranking table. Ranking table is used to keep track
     * of most heavily used contacts in outgoing email. Contacts in the
     * ranking table are given the priority when generating the auto-complete
     * contact list.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=758)
    public void unsetContactRankingTableSize() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactRankingTableSize, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Size of the contact ranking table. Ranking table is used to keep track
     * of most heavily used contacts in outgoing email. Contacts in the
     * ranking table are given the priority when generating the auto-complete
     * contact list.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=758)
    public Map<String,Object> unsetContactRankingTableSize(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraContactRankingTableSize, "");
        return attrs;
    }

    /**
     * time object was created
     *
     * <p>Use getCreateTimestampAsString to access value as a string.
     *
     * @see #getCreateTimestampAsString()
     *
     * @return zimbraCreateTimestamp as Date, null if unset or unable to parse
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public Date getCreateTimestamp() {
        return getGeneralizedTimeAttr(Provisioning.A_zimbraCreateTimestamp, null);
    }

    /**
     * time object was created
     *
     * @return zimbraCreateTimestamp, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public String getCreateTimestampAsString() {
        return getAttr(Provisioning.A_zimbraCreateTimestamp, null);
    }

    /**
     * time object was created
     *
     * @param zimbraCreateTimestamp new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public void setCreateTimestamp(Date zimbraCreateTimestamp) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, DateUtil.toGeneralizedTime(zimbraCreateTimestamp));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time object was created
     *
     * @param zimbraCreateTimestamp new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public Map<String,Object> setCreateTimestamp(Date zimbraCreateTimestamp, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, DateUtil.toGeneralizedTime(zimbraCreateTimestamp));
        return attrs;
    }

    /**
     * time object was created
     *
     * @param zimbraCreateTimestamp new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public void setCreateTimestampAsString(String zimbraCreateTimestamp) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, zimbraCreateTimestamp);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time object was created
     *
     * @param zimbraCreateTimestamp new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public Map<String,Object> setCreateTimestampAsString(String zimbraCreateTimestamp, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, zimbraCreateTimestamp);
        return attrs;
    }

    /**
     * time object was created
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public void unsetCreateTimestamp() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time object was created
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=790)
    public Map<String,Object> unsetCreateTimestamp(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraCreateTimestamp, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceCaldavPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceCaldavPollingIntervalAsString()
     *
     * @return zimbraDataSourceCaldavPollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public long getDataSourceCaldavPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceCaldavPollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceCaldavPollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public String getDataSourceCaldavPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceCaldavPollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceCaldavPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public void setDataSourceCaldavPollingInterval(String zimbraDataSourceCaldavPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCaldavPollingInterval, zimbraDataSourceCaldavPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceCaldavPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public Map<String,Object> setDataSourceCaldavPollingInterval(String zimbraDataSourceCaldavPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCaldavPollingInterval, zimbraDataSourceCaldavPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public void unsetDataSourceCaldavPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCaldavPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Caldav data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=788)
    public Map<String,Object> unsetDataSourceCaldavPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCaldavPollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceCalendarPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceCalendarPollingIntervalAsString()
     *
     * @return zimbraDataSourceCalendarPollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public long getDataSourceCalendarPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceCalendarPollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceCalendarPollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public String getDataSourceCalendarPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceCalendarPollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceCalendarPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public void setDataSourceCalendarPollingInterval(String zimbraDataSourceCalendarPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCalendarPollingInterval, zimbraDataSourceCalendarPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceCalendarPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public Map<String,Object> setDataSourceCalendarPollingInterval(String zimbraDataSourceCalendarPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCalendarPollingInterval, zimbraDataSourceCalendarPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public void unsetDataSourceCalendarPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCalendarPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a remote calendar
     * data source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=819)
    public Map<String,Object> unsetDataSourceCalendarPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceCalendarPollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceGalPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceGalPollingIntervalAsString()
     *
     * @return zimbraDataSourceGalPollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public long getDataSourceGalPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceGalPollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceGalPollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public String getDataSourceGalPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceGalPollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceGalPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public void setDataSourceGalPollingInterval(String zimbraDataSourceGalPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceGalPollingInterval, zimbraDataSourceGalPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceGalPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public Map<String,Object> setDataSourceGalPollingInterval(String zimbraDataSourceGalPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceGalPollingInterval, zimbraDataSourceGalPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public void unsetDataSourceGalPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceGalPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a GAL data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=826)
    public Map<String,Object> unsetDataSourceGalPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceGalPollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceImapPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceImapPollingIntervalAsString()
     *
     * @return zimbraDataSourceImapPollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public long getDataSourceImapPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceImapPollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceImapPollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public String getDataSourceImapPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceImapPollingInterval, null);
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceImapPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public void setDataSourceImapPollingInterval(String zimbraDataSourceImapPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceImapPollingInterval, zimbraDataSourceImapPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceImapPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public Map<String,Object> setDataSourceImapPollingInterval(String zimbraDataSourceImapPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceImapPollingInterval, zimbraDataSourceImapPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public void unsetDataSourceImapPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceImapPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for an Imap data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=768)
    public Map<String,Object> unsetDataSourceImapPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceImapPollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceLivePollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceLivePollingIntervalAsString()
     *
     * @return zimbraDataSourceLivePollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public long getDataSourceLivePollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceLivePollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceLivePollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public String getDataSourceLivePollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceLivePollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceLivePollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public void setDataSourceLivePollingInterval(String zimbraDataSourceLivePollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceLivePollingInterval, zimbraDataSourceLivePollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceLivePollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public Map<String,Object> setDataSourceLivePollingInterval(String zimbraDataSourceLivePollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceLivePollingInterval, zimbraDataSourceLivePollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public void unsetDataSourceLivePollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceLivePollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Live data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=769)
    public Map<String,Object> unsetDataSourceLivePollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceLivePollingInterval, "");
        return attrs;
    }

    /**
     * Maximum number of data sources allowed on an account
     *
     * @return zimbraDataSourceMaxNumEntries, or 20 if unset
     */
    @ZAttr(id=426)
    public int getDataSourceMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraDataSourceMaxNumEntries, 20);
    }

    /**
     * Maximum number of data sources allowed on an account
     *
     * @param zimbraDataSourceMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=426)
    public void setDataSourceMaxNumEntries(int zimbraDataSourceMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMaxNumEntries, Integer.toString(zimbraDataSourceMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of data sources allowed on an account
     *
     * @param zimbraDataSourceMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=426)
    public Map<String,Object> setDataSourceMaxNumEntries(int zimbraDataSourceMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMaxNumEntries, Integer.toString(zimbraDataSourceMaxNumEntries));
        return attrs;
    }

    /**
     * Maximum number of data sources allowed on an account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=426)
    public void unsetDataSourceMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of data sources allowed on an account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=426)
    public Map<String,Object> unsetDataSourceMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMaxNumEntries, "");
        return attrs;
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * <p>Use getDataSourceMinPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceMinPollingIntervalAsString()
     *
     * @return zimbraDataSourceMinPollingInterval in millseconds, or 60000 (1m)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public long getDataSourceMinPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceMinPollingInterval, 60000L);
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * @return zimbraDataSourceMinPollingInterval, or "1m" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public String getDataSourceMinPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceMinPollingInterval, "1m");
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * @param zimbraDataSourceMinPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public void setDataSourceMinPollingInterval(String zimbraDataSourceMinPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMinPollingInterval, zimbraDataSourceMinPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * @param zimbraDataSourceMinPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public Map<String,Object> setDataSourceMinPollingInterval(String zimbraDataSourceMinPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMinPollingInterval, zimbraDataSourceMinPollingInterval);
        return attrs;
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public void unsetDataSourceMinPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMinPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Shortest allowed duration for zimbraDataSourcePollingInterval.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=525)
    public Map<String,Object> unsetDataSourceMinPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceMinPollingInterval, "");
        return attrs;
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * <p>Use getDataSourcePollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourcePollingIntervalAsString()
     *
     * @return zimbraDataSourcePollingInterval in millseconds, or -1 if unset
     */
    @ZAttr(id=455)
    public long getDataSourcePollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourcePollingInterval, -1L);
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * @return zimbraDataSourcePollingInterval, or null if unset
     */
    @ZAttr(id=455)
    public String getDataSourcePollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourcePollingInterval, null);
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * @param zimbraDataSourcePollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=455)
    public void setDataSourcePollingInterval(String zimbraDataSourcePollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePollingInterval, zimbraDataSourcePollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * @param zimbraDataSourcePollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=455)
    public Map<String,Object> setDataSourcePollingInterval(String zimbraDataSourcePollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePollingInterval, zimbraDataSourcePollingInterval);
        return attrs;
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=455)
    public void unsetDataSourcePollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Prior to 6.0.1: The time interval between automated data imports for a
     * data source, or all data sources owned by an account. If unset or 0,
     * the data source will not be scheduled for automated polling. Since
     * 6.0.1: Deprecated on account/cos since 6.0.1. Values on account/cos
     * are migrated to protocol specific
     * zimbraDataSource{proto}PollingInterval attributes. 1. if
     * zimbraDataSourcePollingInterval is set on data source, use it 2.
     * otherwise use the zimbraDataSource{Proto}PollingInterval on
     * account/cos 3. if zimbraDataSource{Proto}PollingInterval is not set on
     * account/cos, use 0, which means no automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=455)
    public Map<String,Object> unsetDataSourcePollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourcePop3PollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourcePop3PollingIntervalAsString()
     *
     * @return zimbraDataSourcePop3PollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public long getDataSourcePop3PollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourcePop3PollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourcePop3PollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public String getDataSourcePop3PollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourcePop3PollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourcePop3PollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public void setDataSourcePop3PollingInterval(String zimbraDataSourcePop3PollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePop3PollingInterval, zimbraDataSourcePop3PollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourcePop3PollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public Map<String,Object> setDataSourcePop3PollingInterval(String zimbraDataSourcePop3PollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePop3PollingInterval, zimbraDataSourcePop3PollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public void unsetDataSourcePop3PollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePop3PollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Pop3 data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=767)
    public Map<String,Object> unsetDataSourcePop3PollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourcePop3PollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * <p>Use getDataSourceRssPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceRssPollingIntervalAsString()
     *
     * @return zimbraDataSourceRssPollingInterval in millseconds, or 43200000 (12h)  if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public long getDataSourceRssPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceRssPollingInterval, 43200000L);
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @return zimbraDataSourceRssPollingInterval, or "12h" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public String getDataSourceRssPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceRssPollingInterval, "12h");
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceRssPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public void setDataSourceRssPollingInterval(String zimbraDataSourceRssPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceRssPollingInterval, zimbraDataSourceRssPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param zimbraDataSourceRssPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public Map<String,Object> setDataSourceRssPollingInterval(String zimbraDataSourceRssPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceRssPollingInterval, zimbraDataSourceRssPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public void unsetDataSourceRssPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceRssPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Rss data
     * source. If unset or 0, the data source will not be scheduled for
     * automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=770)
    public Map<String,Object> unsetDataSourceRssPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceRssPollingInterval, "");
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * <p>Use getDataSourceYabPollingIntervalAsString to access value as a string.
     *
     * @see #getDataSourceYabPollingIntervalAsString()
     *
     * @return zimbraDataSourceYabPollingInterval in millseconds, or -1 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public long getDataSourceYabPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraDataSourceYabPollingInterval, -1L);
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * @return zimbraDataSourceYabPollingInterval, or null if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public String getDataSourceYabPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraDataSourceYabPollingInterval, null);
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * @param zimbraDataSourceYabPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public void setDataSourceYabPollingInterval(String zimbraDataSourceYabPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceYabPollingInterval, zimbraDataSourceYabPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * @param zimbraDataSourceYabPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public Map<String,Object> setDataSourceYabPollingInterval(String zimbraDataSourceYabPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceYabPollingInterval, zimbraDataSourceYabPollingInterval);
        return attrs;
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public void unsetDataSourceYabPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceYabPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The time interval between automated data imports for a Yahoo address
     * book data source. If unset or 0, the data source will not be scheduled
     * for automated polling.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=789)
    public Map<String,Object> unsetDataSourceYabPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDataSourceYabPollingInterval, "");
        return attrs;
    }

    /**
     * maximum amount of mail quota a domain admin can set on a user
     *
     * @return zimbraDomainAdminMaxMailQuota, or -1 if unset
     */
    @ZAttr(id=398)
    public long getDomainAdminMaxMailQuota() {
        return getLongAttr(Provisioning.A_zimbraDomainAdminMaxMailQuota, -1L);
    }

    /**
     * maximum amount of mail quota a domain admin can set on a user
     *
     * @param zimbraDomainAdminMaxMailQuota new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=398)
    public void setDomainAdminMaxMailQuota(long zimbraDomainAdminMaxMailQuota) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDomainAdminMaxMailQuota, Long.toString(zimbraDomainAdminMaxMailQuota));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum amount of mail quota a domain admin can set on a user
     *
     * @param zimbraDomainAdminMaxMailQuota new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=398)
    public Map<String,Object> setDomainAdminMaxMailQuota(long zimbraDomainAdminMaxMailQuota, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDomainAdminMaxMailQuota, Long.toString(zimbraDomainAdminMaxMailQuota));
        return attrs;
    }

    /**
     * maximum amount of mail quota a domain admin can set on a user
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=398)
    public void unsetDomainAdminMaxMailQuota() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDomainAdminMaxMailQuota, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum amount of mail quota a domain admin can set on a user
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=398)
    public Map<String,Object> unsetDomainAdminMaxMailQuota(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraDomainAdminMaxMailQuota, "");
        return attrs;
    }

    /**
     * advanced search button enabled
     *
     * @return zimbraFeatureAdvancedSearchEnabled, or true if unset
     */
    @ZAttr(id=138)
    public boolean isFeatureAdvancedSearchEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureAdvancedSearchEnabled, true);
    }

    /**
     * advanced search button enabled
     *
     * @param zimbraFeatureAdvancedSearchEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=138)
    public void setFeatureAdvancedSearchEnabled(boolean zimbraFeatureAdvancedSearchEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureAdvancedSearchEnabled, zimbraFeatureAdvancedSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * advanced search button enabled
     *
     * @param zimbraFeatureAdvancedSearchEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=138)
    public Map<String,Object> setFeatureAdvancedSearchEnabled(boolean zimbraFeatureAdvancedSearchEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureAdvancedSearchEnabled, zimbraFeatureAdvancedSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * advanced search button enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=138)
    public void unsetFeatureAdvancedSearchEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureAdvancedSearchEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * advanced search button enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=138)
    public Map<String,Object> unsetFeatureAdvancedSearchEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureAdvancedSearchEnabled, "");
        return attrs;
    }

    /**
     * whether to allow use of briefcase feature
     *
     * @return zimbraFeatureBriefcasesEnabled, or true if unset
     */
    @ZAttr(id=498)
    public boolean isFeatureBriefcasesEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureBriefcasesEnabled, true);
    }

    /**
     * whether to allow use of briefcase feature
     *
     * @param zimbraFeatureBriefcasesEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=498)
    public void setFeatureBriefcasesEnabled(boolean zimbraFeatureBriefcasesEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureBriefcasesEnabled, zimbraFeatureBriefcasesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of briefcase feature
     *
     * @param zimbraFeatureBriefcasesEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=498)
    public Map<String,Object> setFeatureBriefcasesEnabled(boolean zimbraFeatureBriefcasesEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureBriefcasesEnabled, zimbraFeatureBriefcasesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow use of briefcase feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=498)
    public void unsetFeatureBriefcasesEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureBriefcasesEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of briefcase feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=498)
    public Map<String,Object> unsetFeatureBriefcasesEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureBriefcasesEnabled, "");
        return attrs;
    }

    /**
     * calendar features
     *
     * @return zimbraFeatureCalendarEnabled, or true if unset
     */
    @ZAttr(id=136)
    public boolean isFeatureCalendarEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureCalendarEnabled, true);
    }

    /**
     * calendar features
     *
     * @param zimbraFeatureCalendarEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=136)
    public void setFeatureCalendarEnabled(boolean zimbraFeatureCalendarEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarEnabled, zimbraFeatureCalendarEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar features
     *
     * @param zimbraFeatureCalendarEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=136)
    public Map<String,Object> setFeatureCalendarEnabled(boolean zimbraFeatureCalendarEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarEnabled, zimbraFeatureCalendarEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * calendar features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=136)
    public void unsetFeatureCalendarEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=136)
    public Map<String,Object> unsetFeatureCalendarEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarEnabled, "");
        return attrs;
    }

    /**
     * calendar upsell enabled
     *
     * @return zimbraFeatureCalendarUpsellEnabled, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=531)
    public boolean isFeatureCalendarUpsellEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureCalendarUpsellEnabled, false);
    }

    /**
     * calendar upsell enabled
     *
     * @param zimbraFeatureCalendarUpsellEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=531)
    public void setFeatureCalendarUpsellEnabled(boolean zimbraFeatureCalendarUpsellEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellEnabled, zimbraFeatureCalendarUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar upsell enabled
     *
     * @param zimbraFeatureCalendarUpsellEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=531)
    public Map<String,Object> setFeatureCalendarUpsellEnabled(boolean zimbraFeatureCalendarUpsellEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellEnabled, zimbraFeatureCalendarUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * calendar upsell enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=531)
    public void unsetFeatureCalendarUpsellEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar upsell enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=531)
    public Map<String,Object> unsetFeatureCalendarUpsellEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellEnabled, "");
        return attrs;
    }

    /**
     * calendar upsell URL
     *
     * @return zimbraFeatureCalendarUpsellURL, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=532)
    public String getFeatureCalendarUpsellURL() {
        return getAttr(Provisioning.A_zimbraFeatureCalendarUpsellURL, null);
    }

    /**
     * calendar upsell URL
     *
     * @param zimbraFeatureCalendarUpsellURL new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=532)
    public void setFeatureCalendarUpsellURL(String zimbraFeatureCalendarUpsellURL) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellURL, zimbraFeatureCalendarUpsellURL);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar upsell URL
     *
     * @param zimbraFeatureCalendarUpsellURL new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=532)
    public Map<String,Object> setFeatureCalendarUpsellURL(String zimbraFeatureCalendarUpsellURL, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellURL, zimbraFeatureCalendarUpsellURL);
        return attrs;
    }

    /**
     * calendar upsell URL
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=532)
    public void unsetFeatureCalendarUpsellURL() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellURL, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * calendar upsell URL
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=532)
    public Map<String,Object> unsetFeatureCalendarUpsellURL(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureCalendarUpsellURL, "");
        return attrs;
    }

    /**
     * password changing
     *
     * @return zimbraFeatureChangePasswordEnabled, or true if unset
     */
    @ZAttr(id=141)
    public boolean isFeatureChangePasswordEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureChangePasswordEnabled, true);
    }

    /**
     * password changing
     *
     * @param zimbraFeatureChangePasswordEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=141)
    public void setFeatureChangePasswordEnabled(boolean zimbraFeatureChangePasswordEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureChangePasswordEnabled, zimbraFeatureChangePasswordEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * password changing
     *
     * @param zimbraFeatureChangePasswordEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=141)
    public Map<String,Object> setFeatureChangePasswordEnabled(boolean zimbraFeatureChangePasswordEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureChangePasswordEnabled, zimbraFeatureChangePasswordEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * password changing
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=141)
    public void unsetFeatureChangePasswordEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureChangePasswordEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * password changing
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=141)
    public Map<String,Object> unsetFeatureChangePasswordEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureChangePasswordEnabled, "");
        return attrs;
    }

    /**
     * whether or not compose messages in a new windows is allowed
     *
     * @return zimbraFeatureComposeInNewWindowEnabled, or true if unset
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=584)
    public boolean isFeatureComposeInNewWindowEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureComposeInNewWindowEnabled, true);
    }

    /**
     * whether or not compose messages in a new windows is allowed
     *
     * @param zimbraFeatureComposeInNewWindowEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=584)
    public void setFeatureComposeInNewWindowEnabled(boolean zimbraFeatureComposeInNewWindowEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureComposeInNewWindowEnabled, zimbraFeatureComposeInNewWindowEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not compose messages in a new windows is allowed
     *
     * @param zimbraFeatureComposeInNewWindowEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=584)
    public Map<String,Object> setFeatureComposeInNewWindowEnabled(boolean zimbraFeatureComposeInNewWindowEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureComposeInNewWindowEnabled, zimbraFeatureComposeInNewWindowEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not compose messages in a new windows is allowed
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=584)
    public void unsetFeatureComposeInNewWindowEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureComposeInNewWindowEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not compose messages in a new windows is allowed
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=584)
    public Map<String,Object> unsetFeatureComposeInNewWindowEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureComposeInNewWindowEnabled, "");
        return attrs;
    }

    /**
     * whether a confirmation page should be display after an operation is
     * done in the UI
     *
     * @return zimbraFeatureConfirmationPageEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=806)
    public boolean isFeatureConfirmationPageEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureConfirmationPageEnabled, false);
    }

    /**
     * whether a confirmation page should be display after an operation is
     * done in the UI
     *
     * @param zimbraFeatureConfirmationPageEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=806)
    public void setFeatureConfirmationPageEnabled(boolean zimbraFeatureConfirmationPageEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConfirmationPageEnabled, zimbraFeatureConfirmationPageEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether a confirmation page should be display after an operation is
     * done in the UI
     *
     * @param zimbraFeatureConfirmationPageEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=806)
    public Map<String,Object> setFeatureConfirmationPageEnabled(boolean zimbraFeatureConfirmationPageEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConfirmationPageEnabled, zimbraFeatureConfirmationPageEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether a confirmation page should be display after an operation is
     * done in the UI
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=806)
    public void unsetFeatureConfirmationPageEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConfirmationPageEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether a confirmation page should be display after an operation is
     * done in the UI
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=806)
    public Map<String,Object> unsetFeatureConfirmationPageEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConfirmationPageEnabled, "");
        return attrs;
    }

    /**
     * contact features
     *
     * @return zimbraFeatureContactsEnabled, or true if unset
     */
    @ZAttr(id=135)
    public boolean isFeatureContactsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureContactsEnabled, true);
    }

    /**
     * contact features
     *
     * @param zimbraFeatureContactsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=135)
    public void setFeatureContactsEnabled(boolean zimbraFeatureContactsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsEnabled, zimbraFeatureContactsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * contact features
     *
     * @param zimbraFeatureContactsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=135)
    public Map<String,Object> setFeatureContactsEnabled(boolean zimbraFeatureContactsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsEnabled, zimbraFeatureContactsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * contact features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=135)
    public void unsetFeatureContactsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * contact features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=135)
    public Map<String,Object> unsetFeatureContactsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsEnabled, "");
        return attrs;
    }

    /**
     * address book upsell enabled
     *
     * @return zimbraFeatureContactsUpsellEnabled, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=529)
    public boolean isFeatureContactsUpsellEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureContactsUpsellEnabled, false);
    }

    /**
     * address book upsell enabled
     *
     * @param zimbraFeatureContactsUpsellEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=529)
    public void setFeatureContactsUpsellEnabled(boolean zimbraFeatureContactsUpsellEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellEnabled, zimbraFeatureContactsUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * address book upsell enabled
     *
     * @param zimbraFeatureContactsUpsellEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=529)
    public Map<String,Object> setFeatureContactsUpsellEnabled(boolean zimbraFeatureContactsUpsellEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellEnabled, zimbraFeatureContactsUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * address book upsell enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=529)
    public void unsetFeatureContactsUpsellEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * address book upsell enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=529)
    public Map<String,Object> unsetFeatureContactsUpsellEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellEnabled, "");
        return attrs;
    }

    /**
     * address book upsell URL
     *
     * @return zimbraFeatureContactsUpsellURL, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=530)
    public String getFeatureContactsUpsellURL() {
        return getAttr(Provisioning.A_zimbraFeatureContactsUpsellURL, null);
    }

    /**
     * address book upsell URL
     *
     * @param zimbraFeatureContactsUpsellURL new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=530)
    public void setFeatureContactsUpsellURL(String zimbraFeatureContactsUpsellURL) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellURL, zimbraFeatureContactsUpsellURL);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * address book upsell URL
     *
     * @param zimbraFeatureContactsUpsellURL new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=530)
    public Map<String,Object> setFeatureContactsUpsellURL(String zimbraFeatureContactsUpsellURL, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellURL, zimbraFeatureContactsUpsellURL);
        return attrs;
    }

    /**
     * address book upsell URL
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=530)
    public void unsetFeatureContactsUpsellURL() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellURL, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * address book upsell URL
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=530)
    public Map<String,Object> unsetFeatureContactsUpsellURL(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureContactsUpsellURL, "");
        return attrs;
    }

    /**
     * conversations
     *
     * @return zimbraFeatureConversationsEnabled, or true if unset
     */
    @ZAttr(id=140)
    public boolean isFeatureConversationsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureConversationsEnabled, true);
    }

    /**
     * conversations
     *
     * @param zimbraFeatureConversationsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=140)
    public void setFeatureConversationsEnabled(boolean zimbraFeatureConversationsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConversationsEnabled, zimbraFeatureConversationsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * conversations
     *
     * @param zimbraFeatureConversationsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=140)
    public Map<String,Object> setFeatureConversationsEnabled(boolean zimbraFeatureConversationsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConversationsEnabled, zimbraFeatureConversationsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * conversations
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=140)
    public void unsetFeatureConversationsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConversationsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * conversations
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=140)
    public Map<String,Object> unsetFeatureConversationsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureConversationsEnabled, "");
        return attrs;
    }

    /**
     * enable end-user mail discarding defined in mail filters features
     *
     * @return zimbraFeatureDiscardInFiltersEnabled, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=773)
    public boolean isFeatureDiscardInFiltersEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureDiscardInFiltersEnabled, true);
    }

    /**
     * enable end-user mail discarding defined in mail filters features
     *
     * @param zimbraFeatureDiscardInFiltersEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=773)
    public void setFeatureDiscardInFiltersEnabled(boolean zimbraFeatureDiscardInFiltersEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureDiscardInFiltersEnabled, zimbraFeatureDiscardInFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail discarding defined in mail filters features
     *
     * @param zimbraFeatureDiscardInFiltersEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=773)
    public Map<String,Object> setFeatureDiscardInFiltersEnabled(boolean zimbraFeatureDiscardInFiltersEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureDiscardInFiltersEnabled, zimbraFeatureDiscardInFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enable end-user mail discarding defined in mail filters features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=773)
    public void unsetFeatureDiscardInFiltersEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureDiscardInFiltersEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail discarding defined in mail filters features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=773)
    public Map<String,Object> unsetFeatureDiscardInFiltersEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureDiscardInFiltersEnabled, "");
        return attrs;
    }

    /**
     * filter prefs enabled
     *
     * @return zimbraFeatureFiltersEnabled, or true if unset
     */
    @ZAttr(id=143)
    public boolean isFeatureFiltersEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureFiltersEnabled, true);
    }

    /**
     * filter prefs enabled
     *
     * @param zimbraFeatureFiltersEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=143)
    public void setFeatureFiltersEnabled(boolean zimbraFeatureFiltersEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFiltersEnabled, zimbraFeatureFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * filter prefs enabled
     *
     * @param zimbraFeatureFiltersEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=143)
    public Map<String,Object> setFeatureFiltersEnabled(boolean zimbraFeatureFiltersEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFiltersEnabled, zimbraFeatureFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * filter prefs enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=143)
    public void unsetFeatureFiltersEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFiltersEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * filter prefs enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=143)
    public Map<String,Object> unsetFeatureFiltersEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFiltersEnabled, "");
        return attrs;
    }

    /**
     * whether to allow use of flagging feature
     *
     * @return zimbraFeatureFlaggingEnabled, or true if unset
     */
    @ZAttr(id=499)
    public boolean isFeatureFlaggingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureFlaggingEnabled, true);
    }

    /**
     * whether to allow use of flagging feature
     *
     * @param zimbraFeatureFlaggingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=499)
    public void setFeatureFlaggingEnabled(boolean zimbraFeatureFlaggingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFlaggingEnabled, zimbraFeatureFlaggingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of flagging feature
     *
     * @param zimbraFeatureFlaggingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=499)
    public Map<String,Object> setFeatureFlaggingEnabled(boolean zimbraFeatureFlaggingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFlaggingEnabled, zimbraFeatureFlaggingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow use of flagging feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=499)
    public void unsetFeatureFlaggingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFlaggingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of flagging feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=499)
    public Map<String,Object> unsetFeatureFlaggingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureFlaggingEnabled, "");
        return attrs;
    }

    /**
     * enable auto-completion from the GAL, zimbraFeatureGalEnabled also has
     * to be enabled for the auto-completion feature
     *
     * @return zimbraFeatureGalAutoCompleteEnabled, or true if unset
     */
    @ZAttr(id=359)
    public boolean isFeatureGalAutoCompleteEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureGalAutoCompleteEnabled, true);
    }

    /**
     * enable auto-completion from the GAL, zimbraFeatureGalEnabled also has
     * to be enabled for the auto-completion feature
     *
     * @param zimbraFeatureGalAutoCompleteEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=359)
    public void setFeatureGalAutoCompleteEnabled(boolean zimbraFeatureGalAutoCompleteEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalAutoCompleteEnabled, zimbraFeatureGalAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable auto-completion from the GAL, zimbraFeatureGalEnabled also has
     * to be enabled for the auto-completion feature
     *
     * @param zimbraFeatureGalAutoCompleteEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=359)
    public Map<String,Object> setFeatureGalAutoCompleteEnabled(boolean zimbraFeatureGalAutoCompleteEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalAutoCompleteEnabled, zimbraFeatureGalAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enable auto-completion from the GAL, zimbraFeatureGalEnabled also has
     * to be enabled for the auto-completion feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=359)
    public void unsetFeatureGalAutoCompleteEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalAutoCompleteEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable auto-completion from the GAL, zimbraFeatureGalEnabled also has
     * to be enabled for the auto-completion feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=359)
    public Map<String,Object> unsetFeatureGalAutoCompleteEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalAutoCompleteEnabled, "");
        return attrs;
    }

    /**
     * whether GAL features are enabled
     *
     * @return zimbraFeatureGalEnabled, or true if unset
     */
    @ZAttr(id=149)
    public boolean isFeatureGalEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureGalEnabled, true);
    }

    /**
     * whether GAL features are enabled
     *
     * @param zimbraFeatureGalEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=149)
    public void setFeatureGalEnabled(boolean zimbraFeatureGalEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalEnabled, zimbraFeatureGalEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether GAL features are enabled
     *
     * @param zimbraFeatureGalEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=149)
    public Map<String,Object> setFeatureGalEnabled(boolean zimbraFeatureGalEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalEnabled, zimbraFeatureGalEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether GAL features are enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=149)
    public void unsetFeatureGalEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether GAL features are enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=149)
    public Map<String,Object> unsetFeatureGalEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalEnabled, "");
        return attrs;
    }

    /**
     * whether GAL sync feature is enabled
     *
     * @return zimbraFeatureGalSyncEnabled, or true if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=711)
    public boolean isFeatureGalSyncEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureGalSyncEnabled, true);
    }

    /**
     * whether GAL sync feature is enabled
     *
     * @param zimbraFeatureGalSyncEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=711)
    public void setFeatureGalSyncEnabled(boolean zimbraFeatureGalSyncEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalSyncEnabled, zimbraFeatureGalSyncEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether GAL sync feature is enabled
     *
     * @param zimbraFeatureGalSyncEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=711)
    public Map<String,Object> setFeatureGalSyncEnabled(boolean zimbraFeatureGalSyncEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalSyncEnabled, zimbraFeatureGalSyncEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether GAL sync feature is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=711)
    public void unsetFeatureGalSyncEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalSyncEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether GAL sync feature is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=711)
    public Map<String,Object> unsetFeatureGalSyncEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGalSyncEnabled, "");
        return attrs;
    }

    /**
     * group calendar features. if set to FALSE, calendar works as a personal
     * calendar and attendees and scheduling etc are turned off in web UI
     *
     * @return zimbraFeatureGroupCalendarEnabled, or true if unset
     */
    @ZAttr(id=481)
    public boolean isFeatureGroupCalendarEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureGroupCalendarEnabled, true);
    }

    /**
     * group calendar features. if set to FALSE, calendar works as a personal
     * calendar and attendees and scheduling etc are turned off in web UI
     *
     * @param zimbraFeatureGroupCalendarEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=481)
    public void setFeatureGroupCalendarEnabled(boolean zimbraFeatureGroupCalendarEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGroupCalendarEnabled, zimbraFeatureGroupCalendarEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * group calendar features. if set to FALSE, calendar works as a personal
     * calendar and attendees and scheduling etc are turned off in web UI
     *
     * @param zimbraFeatureGroupCalendarEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=481)
    public Map<String,Object> setFeatureGroupCalendarEnabled(boolean zimbraFeatureGroupCalendarEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGroupCalendarEnabled, zimbraFeatureGroupCalendarEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * group calendar features. if set to FALSE, calendar works as a personal
     * calendar and attendees and scheduling etc are turned off in web UI
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=481)
    public void unsetFeatureGroupCalendarEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGroupCalendarEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * group calendar features. if set to FALSE, calendar works as a personal
     * calendar and attendees and scheduling etc are turned off in web UI
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=481)
    public Map<String,Object> unsetFeatureGroupCalendarEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureGroupCalendarEnabled, "");
        return attrs;
    }

    /**
     * enabled html composing
     *
     * @return zimbraFeatureHtmlComposeEnabled, or true if unset
     */
    @ZAttr(id=219)
    public boolean isFeatureHtmlComposeEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureHtmlComposeEnabled, true);
    }

    /**
     * enabled html composing
     *
     * @param zimbraFeatureHtmlComposeEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=219)
    public void setFeatureHtmlComposeEnabled(boolean zimbraFeatureHtmlComposeEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureHtmlComposeEnabled, zimbraFeatureHtmlComposeEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enabled html composing
     *
     * @param zimbraFeatureHtmlComposeEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=219)
    public Map<String,Object> setFeatureHtmlComposeEnabled(boolean zimbraFeatureHtmlComposeEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureHtmlComposeEnabled, zimbraFeatureHtmlComposeEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enabled html composing
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=219)
    public void unsetFeatureHtmlComposeEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureHtmlComposeEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enabled html composing
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=219)
    public Map<String,Object> unsetFeatureHtmlComposeEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureHtmlComposeEnabled, "");
        return attrs;
    }

    /**
     * IM features
     *
     * @return zimbraFeatureIMEnabled, or false if unset
     */
    @ZAttr(id=305)
    public boolean isFeatureIMEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureIMEnabled, false);
    }

    /**
     * IM features
     *
     * @param zimbraFeatureIMEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=305)
    public void setFeatureIMEnabled(boolean zimbraFeatureIMEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIMEnabled, zimbraFeatureIMEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM features
     *
     * @param zimbraFeatureIMEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=305)
    public Map<String,Object> setFeatureIMEnabled(boolean zimbraFeatureIMEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIMEnabled, zimbraFeatureIMEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * IM features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=305)
    public void unsetFeatureIMEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIMEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=305)
    public Map<String,Object> unsetFeatureIMEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIMEnabled, "");
        return attrs;
    }

    /**
     * whether to allow use of identities feature
     *
     * @return zimbraFeatureIdentitiesEnabled, or true if unset
     */
    @ZAttr(id=415)
    public boolean isFeatureIdentitiesEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureIdentitiesEnabled, true);
    }

    /**
     * whether to allow use of identities feature
     *
     * @param zimbraFeatureIdentitiesEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=415)
    public void setFeatureIdentitiesEnabled(boolean zimbraFeatureIdentitiesEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIdentitiesEnabled, zimbraFeatureIdentitiesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of identities feature
     *
     * @param zimbraFeatureIdentitiesEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=415)
    public Map<String,Object> setFeatureIdentitiesEnabled(boolean zimbraFeatureIdentitiesEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIdentitiesEnabled, zimbraFeatureIdentitiesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow use of identities feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=415)
    public void unsetFeatureIdentitiesEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIdentitiesEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of identities feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=415)
    public Map<String,Object> unsetFeatureIdentitiesEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureIdentitiesEnabled, "");
        return attrs;
    }

    /**
     * whether user is allowed to retrieve mail from an external IMAP data
     * source
     *
     * @return zimbraFeatureImapDataSourceEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=568)
    public boolean isFeatureImapDataSourceEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureImapDataSourceEnabled, true);
    }

    /**
     * whether user is allowed to retrieve mail from an external IMAP data
     * source
     *
     * @param zimbraFeatureImapDataSourceEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=568)
    public void setFeatureImapDataSourceEnabled(boolean zimbraFeatureImapDataSourceEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImapDataSourceEnabled, zimbraFeatureImapDataSourceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether user is allowed to retrieve mail from an external IMAP data
     * source
     *
     * @param zimbraFeatureImapDataSourceEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=568)
    public Map<String,Object> setFeatureImapDataSourceEnabled(boolean zimbraFeatureImapDataSourceEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImapDataSourceEnabled, zimbraFeatureImapDataSourceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether user is allowed to retrieve mail from an external IMAP data
     * source
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=568)
    public void unsetFeatureImapDataSourceEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImapDataSourceEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether user is allowed to retrieve mail from an external IMAP data
     * source
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=568)
    public Map<String,Object> unsetFeatureImapDataSourceEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImapDataSourceEnabled, "");
        return attrs;
    }

    /**
     * whether import export folder feature is enabled
     *
     * @return zimbraFeatureImportExportFolderEnabled, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=750)
    public boolean isFeatureImportExportFolderEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureImportExportFolderEnabled, true);
    }

    /**
     * whether import export folder feature is enabled
     *
     * @param zimbraFeatureImportExportFolderEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=750)
    public void setFeatureImportExportFolderEnabled(boolean zimbraFeatureImportExportFolderEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImportExportFolderEnabled, zimbraFeatureImportExportFolderEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether import export folder feature is enabled
     *
     * @param zimbraFeatureImportExportFolderEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=750)
    public Map<String,Object> setFeatureImportExportFolderEnabled(boolean zimbraFeatureImportExportFolderEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImportExportFolderEnabled, zimbraFeatureImportExportFolderEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether import export folder feature is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=750)
    public void unsetFeatureImportExportFolderEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImportExportFolderEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether import export folder feature is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=750)
    public Map<String,Object> unsetFeatureImportExportFolderEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureImportExportFolderEnabled, "");
        return attrs;
    }

    /**
     * preference to set initial search
     *
     * @return zimbraFeatureInitialSearchPreferenceEnabled, or true if unset
     */
    @ZAttr(id=142)
    public boolean isFeatureInitialSearchPreferenceEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureInitialSearchPreferenceEnabled, true);
    }

    /**
     * preference to set initial search
     *
     * @param zimbraFeatureInitialSearchPreferenceEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=142)
    public void setFeatureInitialSearchPreferenceEnabled(boolean zimbraFeatureInitialSearchPreferenceEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInitialSearchPreferenceEnabled, zimbraFeatureInitialSearchPreferenceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * preference to set initial search
     *
     * @param zimbraFeatureInitialSearchPreferenceEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=142)
    public Map<String,Object> setFeatureInitialSearchPreferenceEnabled(boolean zimbraFeatureInitialSearchPreferenceEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInitialSearchPreferenceEnabled, zimbraFeatureInitialSearchPreferenceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * preference to set initial search
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=142)
    public void unsetFeatureInitialSearchPreferenceEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInitialSearchPreferenceEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * preference to set initial search
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=142)
    public Map<String,Object> unsetFeatureInitialSearchPreferenceEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInitialSearchPreferenceEnabled, "");
        return attrs;
    }

    /**
     * Enable instant notifications
     *
     * @return zimbraFeatureInstantNotify, or true if unset
     */
    @ZAttr(id=521)
    public boolean isFeatureInstantNotify() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureInstantNotify, true);
    }

    /**
     * Enable instant notifications
     *
     * @param zimbraFeatureInstantNotify new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=521)
    public void setFeatureInstantNotify(boolean zimbraFeatureInstantNotify) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInstantNotify, zimbraFeatureInstantNotify ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Enable instant notifications
     *
     * @param zimbraFeatureInstantNotify new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=521)
    public Map<String,Object> setFeatureInstantNotify(boolean zimbraFeatureInstantNotify, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInstantNotify, zimbraFeatureInstantNotify ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Enable instant notifications
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=521)
    public void unsetFeatureInstantNotify() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInstantNotify, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Enable instant notifications
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=521)
    public Map<String,Object> unsetFeatureInstantNotify(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureInstantNotify, "");
        return attrs;
    }

    /**
     * email features enabled
     *
     * @return zimbraFeatureMailEnabled, or true if unset
     */
    @ZAttr(id=489)
    public boolean isFeatureMailEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailEnabled, true);
    }

    /**
     * email features enabled
     *
     * @param zimbraFeatureMailEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=489)
    public void setFeatureMailEnabled(boolean zimbraFeatureMailEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailEnabled, zimbraFeatureMailEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email features enabled
     *
     * @param zimbraFeatureMailEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=489)
    public Map<String,Object> setFeatureMailEnabled(boolean zimbraFeatureMailEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailEnabled, zimbraFeatureMailEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * email features enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=489)
    public void unsetFeatureMailEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email features enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=489)
    public Map<String,Object> unsetFeatureMailEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailEnabled, "");
        return attrs;
    }

    /**
     * enable end-user mail forwarding features
     *
     * @return zimbraFeatureMailForwardingEnabled, or true if unset
     */
    @ZAttr(id=342)
    public boolean isFeatureMailForwardingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailForwardingEnabled, true);
    }

    /**
     * enable end-user mail forwarding features
     *
     * @param zimbraFeatureMailForwardingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=342)
    public void setFeatureMailForwardingEnabled(boolean zimbraFeatureMailForwardingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingEnabled, zimbraFeatureMailForwardingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail forwarding features
     *
     * @param zimbraFeatureMailForwardingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=342)
    public Map<String,Object> setFeatureMailForwardingEnabled(boolean zimbraFeatureMailForwardingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingEnabled, zimbraFeatureMailForwardingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enable end-user mail forwarding features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=342)
    public void unsetFeatureMailForwardingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail forwarding features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=342)
    public Map<String,Object> unsetFeatureMailForwardingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingEnabled, "");
        return attrs;
    }

    /**
     * enable end-user mail forwarding defined in mail filters features
     *
     * @return zimbraFeatureMailForwardingInFiltersEnabled, or true if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=704)
    public boolean isFeatureMailForwardingInFiltersEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailForwardingInFiltersEnabled, true);
    }

    /**
     * enable end-user mail forwarding defined in mail filters features
     *
     * @param zimbraFeatureMailForwardingInFiltersEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=704)
    public void setFeatureMailForwardingInFiltersEnabled(boolean zimbraFeatureMailForwardingInFiltersEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingInFiltersEnabled, zimbraFeatureMailForwardingInFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail forwarding defined in mail filters features
     *
     * @param zimbraFeatureMailForwardingInFiltersEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=704)
    public Map<String,Object> setFeatureMailForwardingInFiltersEnabled(boolean zimbraFeatureMailForwardingInFiltersEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingInFiltersEnabled, zimbraFeatureMailForwardingInFiltersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enable end-user mail forwarding defined in mail filters features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=704)
    public void unsetFeatureMailForwardingInFiltersEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingInFiltersEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enable end-user mail forwarding defined in mail filters features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=704)
    public Map<String,Object> unsetFeatureMailForwardingInFiltersEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailForwardingInFiltersEnabled, "");
        return attrs;
    }

    /**
     * Deprecated since: 5.0. done via skin template overrides. Orig desc:
     * whether user is allowed to set mail polling interval
     *
     * @return zimbraFeatureMailPollingIntervalPreferenceEnabled, or true if unset
     */
    @ZAttr(id=441)
    public boolean isFeatureMailPollingIntervalPreferenceEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailPollingIntervalPreferenceEnabled, true);
    }

    /**
     * Deprecated since: 5.0. done via skin template overrides. Orig desc:
     * whether user is allowed to set mail polling interval
     *
     * @param zimbraFeatureMailPollingIntervalPreferenceEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=441)
    public void setFeatureMailPollingIntervalPreferenceEnabled(boolean zimbraFeatureMailPollingIntervalPreferenceEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPollingIntervalPreferenceEnabled, zimbraFeatureMailPollingIntervalPreferenceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Deprecated since: 5.0. done via skin template overrides. Orig desc:
     * whether user is allowed to set mail polling interval
     *
     * @param zimbraFeatureMailPollingIntervalPreferenceEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=441)
    public Map<String,Object> setFeatureMailPollingIntervalPreferenceEnabled(boolean zimbraFeatureMailPollingIntervalPreferenceEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPollingIntervalPreferenceEnabled, zimbraFeatureMailPollingIntervalPreferenceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Deprecated since: 5.0. done via skin template overrides. Orig desc:
     * whether user is allowed to set mail polling interval
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=441)
    public void unsetFeatureMailPollingIntervalPreferenceEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPollingIntervalPreferenceEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Deprecated since: 5.0. done via skin template overrides. Orig desc:
     * whether user is allowed to set mail polling interval
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=441)
    public Map<String,Object> unsetFeatureMailPollingIntervalPreferenceEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPollingIntervalPreferenceEnabled, "");
        return attrs;
    }

    /**
     * mail priority feature
     *
     * @return zimbraFeatureMailPriorityEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=566)
    public boolean isFeatureMailPriorityEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailPriorityEnabled, true);
    }

    /**
     * mail priority feature
     *
     * @param zimbraFeatureMailPriorityEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=566)
    public void setFeatureMailPriorityEnabled(boolean zimbraFeatureMailPriorityEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPriorityEnabled, zimbraFeatureMailPriorityEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail priority feature
     *
     * @param zimbraFeatureMailPriorityEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=566)
    public Map<String,Object> setFeatureMailPriorityEnabled(boolean zimbraFeatureMailPriorityEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPriorityEnabled, zimbraFeatureMailPriorityEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * mail priority feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=566)
    public void unsetFeatureMailPriorityEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPriorityEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail priority feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=566)
    public Map<String,Object> unsetFeatureMailPriorityEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailPriorityEnabled, "");
        return attrs;
    }

    /**
     * email upsell enabled
     *
     * @return zimbraFeatureMailUpsellEnabled, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=527)
    public boolean isFeatureMailUpsellEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMailUpsellEnabled, false);
    }

    /**
     * email upsell enabled
     *
     * @param zimbraFeatureMailUpsellEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=527)
    public void setFeatureMailUpsellEnabled(boolean zimbraFeatureMailUpsellEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellEnabled, zimbraFeatureMailUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email upsell enabled
     *
     * @param zimbraFeatureMailUpsellEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=527)
    public Map<String,Object> setFeatureMailUpsellEnabled(boolean zimbraFeatureMailUpsellEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellEnabled, zimbraFeatureMailUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * email upsell enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=527)
    public void unsetFeatureMailUpsellEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email upsell enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=527)
    public Map<String,Object> unsetFeatureMailUpsellEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellEnabled, "");
        return attrs;
    }

    /**
     * email upsell URL
     *
     * @return zimbraFeatureMailUpsellURL, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=528)
    public String getFeatureMailUpsellURL() {
        return getAttr(Provisioning.A_zimbraFeatureMailUpsellURL, null);
    }

    /**
     * email upsell URL
     *
     * @param zimbraFeatureMailUpsellURL new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=528)
    public void setFeatureMailUpsellURL(String zimbraFeatureMailUpsellURL) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellURL, zimbraFeatureMailUpsellURL);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email upsell URL
     *
     * @param zimbraFeatureMailUpsellURL new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=528)
    public Map<String,Object> setFeatureMailUpsellURL(String zimbraFeatureMailUpsellURL, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellURL, zimbraFeatureMailUpsellURL);
        return attrs;
    }

    /**
     * email upsell URL
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=528)
    public void unsetFeatureMailUpsellURL() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellURL, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * email upsell URL
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=528)
    public Map<String,Object> unsetFeatureMailUpsellURL(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMailUpsellURL, "");
        return attrs;
    }

    /**
     * whether to permit mobile sync
     *
     * @return zimbraFeatureMobileSyncEnabled, or false if unset
     */
    @ZAttr(id=347)
    public boolean isFeatureMobileSyncEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureMobileSyncEnabled, false);
    }

    /**
     * whether to permit mobile sync
     *
     * @param zimbraFeatureMobileSyncEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=347)
    public void setFeatureMobileSyncEnabled(boolean zimbraFeatureMobileSyncEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMobileSyncEnabled, zimbraFeatureMobileSyncEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to permit mobile sync
     *
     * @param zimbraFeatureMobileSyncEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=347)
    public Map<String,Object> setFeatureMobileSyncEnabled(boolean zimbraFeatureMobileSyncEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMobileSyncEnabled, zimbraFeatureMobileSyncEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to permit mobile sync
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=347)
    public void unsetFeatureMobileSyncEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMobileSyncEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to permit mobile sync
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=347)
    public Map<String,Object> unsetFeatureMobileSyncEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureMobileSyncEnabled, "");
        return attrs;
    }

    /**
     * Whether user can create address books
     *
     * @return zimbraFeatureNewAddrBookEnabled, or true if unset
     *
     * @since ZCS 5.0.4
     */
    @ZAttr(id=631)
    public boolean isFeatureNewAddrBookEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureNewAddrBookEnabled, true);
    }

    /**
     * Whether user can create address books
     *
     * @param zimbraFeatureNewAddrBookEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.4
     */
    @ZAttr(id=631)
    public void setFeatureNewAddrBookEnabled(boolean zimbraFeatureNewAddrBookEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewAddrBookEnabled, zimbraFeatureNewAddrBookEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether user can create address books
     *
     * @param zimbraFeatureNewAddrBookEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.4
     */
    @ZAttr(id=631)
    public Map<String,Object> setFeatureNewAddrBookEnabled(boolean zimbraFeatureNewAddrBookEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewAddrBookEnabled, zimbraFeatureNewAddrBookEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether user can create address books
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.4
     */
    @ZAttr(id=631)
    public void unsetFeatureNewAddrBookEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewAddrBookEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether user can create address books
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.4
     */
    @ZAttr(id=631)
    public Map<String,Object> unsetFeatureNewAddrBookEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewAddrBookEnabled, "");
        return attrs;
    }

    /**
     * Whether new mail notification feature should be allowed for this
     * account or in this cos
     *
     * @return zimbraFeatureNewMailNotificationEnabled, or true if unset
     */
    @ZAttr(id=367)
    public boolean isFeatureNewMailNotificationEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureNewMailNotificationEnabled, true);
    }

    /**
     * Whether new mail notification feature should be allowed for this
     * account or in this cos
     *
     * @param zimbraFeatureNewMailNotificationEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=367)
    public void setFeatureNewMailNotificationEnabled(boolean zimbraFeatureNewMailNotificationEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewMailNotificationEnabled, zimbraFeatureNewMailNotificationEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether new mail notification feature should be allowed for this
     * account or in this cos
     *
     * @param zimbraFeatureNewMailNotificationEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=367)
    public Map<String,Object> setFeatureNewMailNotificationEnabled(boolean zimbraFeatureNewMailNotificationEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewMailNotificationEnabled, zimbraFeatureNewMailNotificationEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether new mail notification feature should be allowed for this
     * account or in this cos
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=367)
    public void unsetFeatureNewMailNotificationEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewMailNotificationEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether new mail notification feature should be allowed for this
     * account or in this cos
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=367)
    public Map<String,Object> unsetFeatureNewMailNotificationEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNewMailNotificationEnabled, "");
        return attrs;
    }

    /**
     * Whether notebook feature should be allowed for this account or in this
     * cos
     *
     * @return zimbraFeatureNotebookEnabled, or true if unset
     */
    @ZAttr(id=356)
    public boolean isFeatureNotebookEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureNotebookEnabled, true);
    }

    /**
     * Whether notebook feature should be allowed for this account or in this
     * cos
     *
     * @param zimbraFeatureNotebookEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=356)
    public void setFeatureNotebookEnabled(boolean zimbraFeatureNotebookEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNotebookEnabled, zimbraFeatureNotebookEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether notebook feature should be allowed for this account or in this
     * cos
     *
     * @param zimbraFeatureNotebookEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=356)
    public Map<String,Object> setFeatureNotebookEnabled(boolean zimbraFeatureNotebookEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNotebookEnabled, zimbraFeatureNotebookEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether notebook feature should be allowed for this account or in this
     * cos
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=356)
    public void unsetFeatureNotebookEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNotebookEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether notebook feature should be allowed for this account or in this
     * cos
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=356)
    public Map<String,Object> unsetFeatureNotebookEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureNotebookEnabled, "");
        return attrs;
    }

    /**
     * whether or not open a new msg/conv in a new windows is allowed
     *
     * @return zimbraFeatureOpenMailInNewWindowEnabled, or true if unset
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=585)
    public boolean isFeatureOpenMailInNewWindowEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureOpenMailInNewWindowEnabled, true);
    }

    /**
     * whether or not open a new msg/conv in a new windows is allowed
     *
     * @param zimbraFeatureOpenMailInNewWindowEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=585)
    public void setFeatureOpenMailInNewWindowEnabled(boolean zimbraFeatureOpenMailInNewWindowEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOpenMailInNewWindowEnabled, zimbraFeatureOpenMailInNewWindowEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not open a new msg/conv in a new windows is allowed
     *
     * @param zimbraFeatureOpenMailInNewWindowEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=585)
    public Map<String,Object> setFeatureOpenMailInNewWindowEnabled(boolean zimbraFeatureOpenMailInNewWindowEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOpenMailInNewWindowEnabled, zimbraFeatureOpenMailInNewWindowEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not open a new msg/conv in a new windows is allowed
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=585)
    public void unsetFeatureOpenMailInNewWindowEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOpenMailInNewWindowEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not open a new msg/conv in a new windows is allowed
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.1
     */
    @ZAttr(id=585)
    public Map<String,Object> unsetFeatureOpenMailInNewWindowEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOpenMailInNewWindowEnabled, "");
        return attrs;
    }

    /**
     * whether an account can modify its zimbraPref* attributes
     *
     * @return zimbraFeatureOptionsEnabled, or true if unset
     */
    @ZAttr(id=451)
    public boolean isFeatureOptionsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureOptionsEnabled, true);
    }

    /**
     * whether an account can modify its zimbraPref* attributes
     *
     * @param zimbraFeatureOptionsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=451)
    public void setFeatureOptionsEnabled(boolean zimbraFeatureOptionsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOptionsEnabled, zimbraFeatureOptionsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether an account can modify its zimbraPref* attributes
     *
     * @param zimbraFeatureOptionsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=451)
    public Map<String,Object> setFeatureOptionsEnabled(boolean zimbraFeatureOptionsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOptionsEnabled, zimbraFeatureOptionsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether an account can modify its zimbraPref* attributes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=451)
    public void unsetFeatureOptionsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOptionsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether an account can modify its zimbraPref* attributes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=451)
    public Map<String,Object> unsetFeatureOptionsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOptionsEnabled, "");
        return attrs;
    }

    /**
     * Whether out of office reply feature should be allowed for this account
     * or in this cos
     *
     * @return zimbraFeatureOutOfOfficeReplyEnabled, or true if unset
     */
    @ZAttr(id=366)
    public boolean isFeatureOutOfOfficeReplyEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureOutOfOfficeReplyEnabled, true);
    }

    /**
     * Whether out of office reply feature should be allowed for this account
     * or in this cos
     *
     * @param zimbraFeatureOutOfOfficeReplyEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=366)
    public void setFeatureOutOfOfficeReplyEnabled(boolean zimbraFeatureOutOfOfficeReplyEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOutOfOfficeReplyEnabled, zimbraFeatureOutOfOfficeReplyEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether out of office reply feature should be allowed for this account
     * or in this cos
     *
     * @param zimbraFeatureOutOfOfficeReplyEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=366)
    public Map<String,Object> setFeatureOutOfOfficeReplyEnabled(boolean zimbraFeatureOutOfOfficeReplyEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOutOfOfficeReplyEnabled, zimbraFeatureOutOfOfficeReplyEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether out of office reply feature should be allowed for this account
     * or in this cos
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=366)
    public void unsetFeatureOutOfOfficeReplyEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOutOfOfficeReplyEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether out of office reply feature should be allowed for this account
     * or in this cos
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=366)
    public Map<String,Object> unsetFeatureOutOfOfficeReplyEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureOutOfOfficeReplyEnabled, "");
        return attrs;
    }

    /**
     * whether user is allowed to retrieve mail from an external POP3 data
     * source
     *
     * @return zimbraFeaturePop3DataSourceEnabled, or true if unset
     */
    @ZAttr(id=416)
    public boolean isFeaturePop3DataSourceEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeaturePop3DataSourceEnabled, true);
    }

    /**
     * whether user is allowed to retrieve mail from an external POP3 data
     * source
     *
     * @param zimbraFeaturePop3DataSourceEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=416)
    public void setFeaturePop3DataSourceEnabled(boolean zimbraFeaturePop3DataSourceEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePop3DataSourceEnabled, zimbraFeaturePop3DataSourceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether user is allowed to retrieve mail from an external POP3 data
     * source
     *
     * @param zimbraFeaturePop3DataSourceEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=416)
    public Map<String,Object> setFeaturePop3DataSourceEnabled(boolean zimbraFeaturePop3DataSourceEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePop3DataSourceEnabled, zimbraFeaturePop3DataSourceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether user is allowed to retrieve mail from an external POP3 data
     * source
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=416)
    public void unsetFeaturePop3DataSourceEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePop3DataSourceEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether user is allowed to retrieve mail from an external POP3 data
     * source
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=416)
    public Map<String,Object> unsetFeaturePop3DataSourceEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePop3DataSourceEnabled, "");
        return attrs;
    }

    /**
     * portal features
     *
     * @return zimbraFeaturePortalEnabled, or false if unset
     */
    @ZAttr(id=447)
    public boolean isFeaturePortalEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeaturePortalEnabled, false);
    }

    /**
     * portal features
     *
     * @param zimbraFeaturePortalEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=447)
    public void setFeaturePortalEnabled(boolean zimbraFeaturePortalEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePortalEnabled, zimbraFeaturePortalEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * portal features
     *
     * @param zimbraFeaturePortalEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=447)
    public Map<String,Object> setFeaturePortalEnabled(boolean zimbraFeaturePortalEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePortalEnabled, zimbraFeaturePortalEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * portal features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=447)
    public void unsetFeaturePortalEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePortalEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * portal features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=447)
    public Map<String,Object> unsetFeaturePortalEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeaturePortalEnabled, "");
        return attrs;
    }

    /**
     * whether the web UI shows UI elements related to read receipts
     *
     * @return zimbraFeatureReadReceiptsEnabled, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=821)
    public boolean isFeatureReadReceiptsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureReadReceiptsEnabled, true);
    }

    /**
     * whether the web UI shows UI elements related to read receipts
     *
     * @param zimbraFeatureReadReceiptsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=821)
    public void setFeatureReadReceiptsEnabled(boolean zimbraFeatureReadReceiptsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureReadReceiptsEnabled, zimbraFeatureReadReceiptsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether the web UI shows UI elements related to read receipts
     *
     * @param zimbraFeatureReadReceiptsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=821)
    public Map<String,Object> setFeatureReadReceiptsEnabled(boolean zimbraFeatureReadReceiptsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureReadReceiptsEnabled, zimbraFeatureReadReceiptsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether the web UI shows UI elements related to read receipts
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=821)
    public void unsetFeatureReadReceiptsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureReadReceiptsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether the web UI shows UI elements related to read receipts
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=821)
    public Map<String,Object> unsetFeatureReadReceiptsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureReadReceiptsEnabled, "");
        return attrs;
    }

    /**
     * saved search feature
     *
     * @return zimbraFeatureSavedSearchesEnabled, or true if unset
     */
    @ZAttr(id=139)
    public boolean isFeatureSavedSearchesEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureSavedSearchesEnabled, true);
    }

    /**
     * saved search feature
     *
     * @param zimbraFeatureSavedSearchesEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=139)
    public void setFeatureSavedSearchesEnabled(boolean zimbraFeatureSavedSearchesEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSavedSearchesEnabled, zimbraFeatureSavedSearchesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * saved search feature
     *
     * @param zimbraFeatureSavedSearchesEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=139)
    public Map<String,Object> setFeatureSavedSearchesEnabled(boolean zimbraFeatureSavedSearchesEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSavedSearchesEnabled, zimbraFeatureSavedSearchesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * saved search feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=139)
    public void unsetFeatureSavedSearchesEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSavedSearchesEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * saved search feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=139)
    public Map<String,Object> unsetFeatureSavedSearchesEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSavedSearchesEnabled, "");
        return attrs;
    }

    /**
     * enabled sharing
     *
     * @return zimbraFeatureSharingEnabled, or true if unset
     */
    @ZAttr(id=335)
    public boolean isFeatureSharingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureSharingEnabled, true);
    }

    /**
     * enabled sharing
     *
     * @param zimbraFeatureSharingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=335)
    public void setFeatureSharingEnabled(boolean zimbraFeatureSharingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSharingEnabled, zimbraFeatureSharingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enabled sharing
     *
     * @param zimbraFeatureSharingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=335)
    public Map<String,Object> setFeatureSharingEnabled(boolean zimbraFeatureSharingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSharingEnabled, zimbraFeatureSharingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * enabled sharing
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=335)
    public void unsetFeatureSharingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSharingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * enabled sharing
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=335)
    public Map<String,Object> unsetFeatureSharingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSharingEnabled, "");
        return attrs;
    }

    /**
     * keyboard shortcuts aliases features
     *
     * @return zimbraFeatureShortcutAliasesEnabled, or true if unset
     */
    @ZAttr(id=452)
    public boolean isFeatureShortcutAliasesEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureShortcutAliasesEnabled, true);
    }

    /**
     * keyboard shortcuts aliases features
     *
     * @param zimbraFeatureShortcutAliasesEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=452)
    public void setFeatureShortcutAliasesEnabled(boolean zimbraFeatureShortcutAliasesEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureShortcutAliasesEnabled, zimbraFeatureShortcutAliasesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * keyboard shortcuts aliases features
     *
     * @param zimbraFeatureShortcutAliasesEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=452)
    public Map<String,Object> setFeatureShortcutAliasesEnabled(boolean zimbraFeatureShortcutAliasesEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureShortcutAliasesEnabled, zimbraFeatureShortcutAliasesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * keyboard shortcuts aliases features
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=452)
    public void unsetFeatureShortcutAliasesEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureShortcutAliasesEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * keyboard shortcuts aliases features
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=452)
    public Map<String,Object> unsetFeatureShortcutAliasesEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureShortcutAliasesEnabled, "");
        return attrs;
    }

    /**
     * whether to allow use of signature feature
     *
     * @return zimbraFeatureSignaturesEnabled, or true if unset
     */
    @ZAttr(id=494)
    public boolean isFeatureSignaturesEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureSignaturesEnabled, true);
    }

    /**
     * whether to allow use of signature feature
     *
     * @param zimbraFeatureSignaturesEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=494)
    public void setFeatureSignaturesEnabled(boolean zimbraFeatureSignaturesEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSignaturesEnabled, zimbraFeatureSignaturesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of signature feature
     *
     * @param zimbraFeatureSignaturesEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=494)
    public Map<String,Object> setFeatureSignaturesEnabled(boolean zimbraFeatureSignaturesEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSignaturesEnabled, zimbraFeatureSignaturesEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow use of signature feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=494)
    public void unsetFeatureSignaturesEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSignaturesEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of signature feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=494)
    public Map<String,Object> unsetFeatureSignaturesEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSignaturesEnabled, "");
        return attrs;
    }

    /**
     * Whether changing skin is allowed for this account or in this cos
     *
     * @return zimbraFeatureSkinChangeEnabled, or true if unset
     */
    @ZAttr(id=354)
    public boolean isFeatureSkinChangeEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureSkinChangeEnabled, true);
    }

    /**
     * Whether changing skin is allowed for this account or in this cos
     *
     * @param zimbraFeatureSkinChangeEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=354)
    public void setFeatureSkinChangeEnabled(boolean zimbraFeatureSkinChangeEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSkinChangeEnabled, zimbraFeatureSkinChangeEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether changing skin is allowed for this account or in this cos
     *
     * @param zimbraFeatureSkinChangeEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=354)
    public Map<String,Object> setFeatureSkinChangeEnabled(boolean zimbraFeatureSkinChangeEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSkinChangeEnabled, zimbraFeatureSkinChangeEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether changing skin is allowed for this account or in this cos
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=354)
    public void unsetFeatureSkinChangeEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSkinChangeEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether changing skin is allowed for this account or in this cos
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=354)
    public Map<String,Object> unsetFeatureSkinChangeEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureSkinChangeEnabled, "");
        return attrs;
    }

    /**
     * tagging feature
     *
     * @return zimbraFeatureTaggingEnabled, or true if unset
     */
    @ZAttr(id=137)
    public boolean isFeatureTaggingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureTaggingEnabled, true);
    }

    /**
     * tagging feature
     *
     * @param zimbraFeatureTaggingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=137)
    public void setFeatureTaggingEnabled(boolean zimbraFeatureTaggingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTaggingEnabled, zimbraFeatureTaggingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * tagging feature
     *
     * @param zimbraFeatureTaggingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=137)
    public Map<String,Object> setFeatureTaggingEnabled(boolean zimbraFeatureTaggingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTaggingEnabled, zimbraFeatureTaggingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * tagging feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=137)
    public void unsetFeatureTaggingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTaggingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * tagging feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=137)
    public Map<String,Object> unsetFeatureTaggingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTaggingEnabled, "");
        return attrs;
    }

    /**
     * whether to allow use of tasks feature
     *
     * @return zimbraFeatureTasksEnabled, or true if unset
     */
    @ZAttr(id=436)
    public boolean isFeatureTasksEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureTasksEnabled, true);
    }

    /**
     * whether to allow use of tasks feature
     *
     * @param zimbraFeatureTasksEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=436)
    public void setFeatureTasksEnabled(boolean zimbraFeatureTasksEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTasksEnabled, zimbraFeatureTasksEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of tasks feature
     *
     * @param zimbraFeatureTasksEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=436)
    public Map<String,Object> setFeatureTasksEnabled(boolean zimbraFeatureTasksEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTasksEnabled, zimbraFeatureTasksEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow use of tasks feature
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=436)
    public void unsetFeatureTasksEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTasksEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow use of tasks feature
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=436)
    public Map<String,Object> unsetFeatureTasksEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureTasksEnabled, "");
        return attrs;
    }

    /**
     * option to view attachments in html
     *
     * @return zimbraFeatureViewInHtmlEnabled, or false if unset
     */
    @ZAttr(id=312)
    public boolean isFeatureViewInHtmlEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureViewInHtmlEnabled, false);
    }

    /**
     * option to view attachments in html
     *
     * @param zimbraFeatureViewInHtmlEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=312)
    public void setFeatureViewInHtmlEnabled(boolean zimbraFeatureViewInHtmlEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureViewInHtmlEnabled, zimbraFeatureViewInHtmlEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * option to view attachments in html
     *
     * @param zimbraFeatureViewInHtmlEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=312)
    public Map<String,Object> setFeatureViewInHtmlEnabled(boolean zimbraFeatureViewInHtmlEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureViewInHtmlEnabled, zimbraFeatureViewInHtmlEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * option to view attachments in html
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=312)
    public void unsetFeatureViewInHtmlEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureViewInHtmlEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * option to view attachments in html
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=312)
    public Map<String,Object> unsetFeatureViewInHtmlEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureViewInHtmlEnabled, "");
        return attrs;
    }

    /**
     * Voicemail features enabled
     *
     * @return zimbraFeatureVoiceEnabled, or false if unset
     */
    @ZAttr(id=445)
    public boolean isFeatureVoiceEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureVoiceEnabled, false);
    }

    /**
     * Voicemail features enabled
     *
     * @param zimbraFeatureVoiceEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=445)
    public void setFeatureVoiceEnabled(boolean zimbraFeatureVoiceEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceEnabled, zimbraFeatureVoiceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Voicemail features enabled
     *
     * @param zimbraFeatureVoiceEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=445)
    public Map<String,Object> setFeatureVoiceEnabled(boolean zimbraFeatureVoiceEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceEnabled, zimbraFeatureVoiceEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Voicemail features enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=445)
    public void unsetFeatureVoiceEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Voicemail features enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=445)
    public Map<String,Object> unsetFeatureVoiceEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceEnabled, "");
        return attrs;
    }

    /**
     * voice upsell enabled
     *
     * @return zimbraFeatureVoiceUpsellEnabled, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=533)
    public boolean isFeatureVoiceUpsellEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureVoiceUpsellEnabled, false);
    }

    /**
     * voice upsell enabled
     *
     * @param zimbraFeatureVoiceUpsellEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=533)
    public void setFeatureVoiceUpsellEnabled(boolean zimbraFeatureVoiceUpsellEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellEnabled, zimbraFeatureVoiceUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * voice upsell enabled
     *
     * @param zimbraFeatureVoiceUpsellEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=533)
    public Map<String,Object> setFeatureVoiceUpsellEnabled(boolean zimbraFeatureVoiceUpsellEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellEnabled, zimbraFeatureVoiceUpsellEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * voice upsell enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=533)
    public void unsetFeatureVoiceUpsellEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * voice upsell enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=533)
    public Map<String,Object> unsetFeatureVoiceUpsellEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellEnabled, "");
        return attrs;
    }

    /**
     * voice upsell URL
     *
     * @return zimbraFeatureVoiceUpsellURL, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=534)
    public String getFeatureVoiceUpsellURL() {
        return getAttr(Provisioning.A_zimbraFeatureVoiceUpsellURL, null);
    }

    /**
     * voice upsell URL
     *
     * @param zimbraFeatureVoiceUpsellURL new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=534)
    public void setFeatureVoiceUpsellURL(String zimbraFeatureVoiceUpsellURL) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellURL, zimbraFeatureVoiceUpsellURL);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * voice upsell URL
     *
     * @param zimbraFeatureVoiceUpsellURL new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=534)
    public Map<String,Object> setFeatureVoiceUpsellURL(String zimbraFeatureVoiceUpsellURL, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellURL, zimbraFeatureVoiceUpsellURL);
        return attrs;
    }

    /**
     * voice upsell URL
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=534)
    public void unsetFeatureVoiceUpsellURL() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellURL, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * voice upsell URL
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=534)
    public Map<String,Object> unsetFeatureVoiceUpsellURL(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureVoiceUpsellURL, "");
        return attrs;
    }

    /**
     * whether web search feature is enabled
     *
     * @return zimbraFeatureWebSearchEnabled, or true if unset
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=602)
    public boolean isFeatureWebSearchEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureWebSearchEnabled, true);
    }

    /**
     * whether web search feature is enabled
     *
     * @param zimbraFeatureWebSearchEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=602)
    public void setFeatureWebSearchEnabled(boolean zimbraFeatureWebSearchEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureWebSearchEnabled, zimbraFeatureWebSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether web search feature is enabled
     *
     * @param zimbraFeatureWebSearchEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=602)
    public Map<String,Object> setFeatureWebSearchEnabled(boolean zimbraFeatureWebSearchEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureWebSearchEnabled, zimbraFeatureWebSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether web search feature is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=602)
    public void unsetFeatureWebSearchEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureWebSearchEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether web search feature is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=602)
    public Map<String,Object> unsetFeatureWebSearchEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureWebSearchEnabled, "");
        return attrs;
    }

    /**
     * Zimbra Assistant enabled
     *
     * @return zimbraFeatureZimbraAssistantEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=544)
    public boolean isFeatureZimbraAssistantEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraFeatureZimbraAssistantEnabled, true);
    }

    /**
     * Zimbra Assistant enabled
     *
     * @param zimbraFeatureZimbraAssistantEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=544)
    public void setFeatureZimbraAssistantEnabled(boolean zimbraFeatureZimbraAssistantEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureZimbraAssistantEnabled, zimbraFeatureZimbraAssistantEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra Assistant enabled
     *
     * @param zimbraFeatureZimbraAssistantEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=544)
    public Map<String,Object> setFeatureZimbraAssistantEnabled(boolean zimbraFeatureZimbraAssistantEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureZimbraAssistantEnabled, zimbraFeatureZimbraAssistantEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Zimbra Assistant enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=544)
    public void unsetFeatureZimbraAssistantEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureZimbraAssistantEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra Assistant enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=544)
    public Map<String,Object> unsetFeatureZimbraAssistantEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFeatureZimbraAssistantEnabled, "");
        return attrs;
    }

    /**
     * Exchange user password for free/busy lookup and propagation
     *
     * @return zimbraFreebusyExchangeAuthPassword, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=609)
    public String getFreebusyExchangeAuthPassword() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeAuthPassword, null);
    }

    /**
     * Exchange user password for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeAuthPassword new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=609)
    public void setFreebusyExchangeAuthPassword(String zimbraFreebusyExchangeAuthPassword) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthPassword, zimbraFreebusyExchangeAuthPassword);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Exchange user password for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeAuthPassword new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=609)
    public Map<String,Object> setFreebusyExchangeAuthPassword(String zimbraFreebusyExchangeAuthPassword, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthPassword, zimbraFreebusyExchangeAuthPassword);
        return attrs;
    }

    /**
     * Exchange user password for free/busy lookup and propagation
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=609)
    public void unsetFreebusyExchangeAuthPassword() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthPassword, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Exchange user password for free/busy lookup and propagation
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=609)
    public Map<String,Object> unsetFreebusyExchangeAuthPassword(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthPassword, "");
        return attrs;
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @return zimbraFreebusyExchangeAuthScheme, or null if unset and/or has invalid value
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public ZAttrProvisioning.FreebusyExchangeAuthScheme getFreebusyExchangeAuthScheme() {
        try { String v = getAttr(Provisioning.A_zimbraFreebusyExchangeAuthScheme); return v == null ? null : ZAttrProvisioning.FreebusyExchangeAuthScheme.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return null; }
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @return zimbraFreebusyExchangeAuthScheme, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public String getFreebusyExchangeAuthSchemeAsString() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeAuthScheme, null);
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @param zimbraFreebusyExchangeAuthScheme new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public void setFreebusyExchangeAuthScheme(ZAttrProvisioning.FreebusyExchangeAuthScheme zimbraFreebusyExchangeAuthScheme) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, zimbraFreebusyExchangeAuthScheme.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @param zimbraFreebusyExchangeAuthScheme new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public Map<String,Object> setFreebusyExchangeAuthScheme(ZAttrProvisioning.FreebusyExchangeAuthScheme zimbraFreebusyExchangeAuthScheme, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, zimbraFreebusyExchangeAuthScheme.toString());
        return attrs;
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @param zimbraFreebusyExchangeAuthScheme new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public void setFreebusyExchangeAuthSchemeAsString(String zimbraFreebusyExchangeAuthScheme) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, zimbraFreebusyExchangeAuthScheme);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @param zimbraFreebusyExchangeAuthScheme new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public Map<String,Object> setFreebusyExchangeAuthSchemeAsString(String zimbraFreebusyExchangeAuthScheme, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, zimbraFreebusyExchangeAuthScheme);
        return attrs;
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public void unsetFreebusyExchangeAuthScheme() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * auth scheme to use
     *
     * <p>Valid values: [basic, form]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=611)
    public Map<String,Object> unsetFreebusyExchangeAuthScheme(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthScheme, "");
        return attrs;
    }

    /**
     * Exchange username for free/busy lookup and propagation
     *
     * @return zimbraFreebusyExchangeAuthUsername, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=608)
    public String getFreebusyExchangeAuthUsername() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeAuthUsername, null);
    }

    /**
     * Exchange username for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeAuthUsername new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=608)
    public void setFreebusyExchangeAuthUsername(String zimbraFreebusyExchangeAuthUsername) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthUsername, zimbraFreebusyExchangeAuthUsername);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Exchange username for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeAuthUsername new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=608)
    public Map<String,Object> setFreebusyExchangeAuthUsername(String zimbraFreebusyExchangeAuthUsername, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthUsername, zimbraFreebusyExchangeAuthUsername);
        return attrs;
    }

    /**
     * Exchange username for free/busy lookup and propagation
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=608)
    public void unsetFreebusyExchangeAuthUsername() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthUsername, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Exchange username for free/busy lookup and propagation
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=608)
    public Map<String,Object> unsetFreebusyExchangeAuthUsername(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeAuthUsername, "");
        return attrs;
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * <p>Use getFreebusyExchangeCachedIntervalAsString to access value as a string.
     *
     * @see #getFreebusyExchangeCachedIntervalAsString()
     *
     * @return zimbraFreebusyExchangeCachedInterval in millseconds, or -1 if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public long getFreebusyExchangeCachedInterval() {
        return getTimeInterval(Provisioning.A_zimbraFreebusyExchangeCachedInterval, -1L);
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * @return zimbraFreebusyExchangeCachedInterval, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public String getFreebusyExchangeCachedIntervalAsString() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeCachedInterval, null);
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * @param zimbraFreebusyExchangeCachedInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public void setFreebusyExchangeCachedInterval(String zimbraFreebusyExchangeCachedInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedInterval, zimbraFreebusyExchangeCachedInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * @param zimbraFreebusyExchangeCachedInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public Map<String,Object> setFreebusyExchangeCachedInterval(String zimbraFreebusyExchangeCachedInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedInterval, zimbraFreebusyExchangeCachedInterval);
        return attrs;
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public void unsetFreebusyExchangeCachedInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The duration of f/b block pushed to Exchange server.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=621)
    public Map<String,Object> unsetFreebusyExchangeCachedInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedInterval, "");
        return attrs;
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * <p>Use getFreebusyExchangeCachedIntervalStartAsString to access value as a string.
     *
     * @see #getFreebusyExchangeCachedIntervalStartAsString()
     *
     * @return zimbraFreebusyExchangeCachedIntervalStart in millseconds, or -1 if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public long getFreebusyExchangeCachedIntervalStart() {
        return getTimeInterval(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, -1L);
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * @return zimbraFreebusyExchangeCachedIntervalStart, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public String getFreebusyExchangeCachedIntervalStartAsString() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, null);
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * @param zimbraFreebusyExchangeCachedIntervalStart new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public void setFreebusyExchangeCachedIntervalStart(String zimbraFreebusyExchangeCachedIntervalStart) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, zimbraFreebusyExchangeCachedIntervalStart);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * @param zimbraFreebusyExchangeCachedIntervalStart new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public Map<String,Object> setFreebusyExchangeCachedIntervalStart(String zimbraFreebusyExchangeCachedIntervalStart, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, zimbraFreebusyExchangeCachedIntervalStart);
        return attrs;
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public void unsetFreebusyExchangeCachedIntervalStart() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The value of duration is used to indicate the start date (in the past
     * relative to today) of the f/b interval pushed to Exchange server.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=620)
    public Map<String,Object> unsetFreebusyExchangeCachedIntervalStart(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeCachedIntervalStart, "");
        return attrs;
    }

    /**
     * URL to Exchange server for free/busy lookup and propagation
     *
     * @return zimbraFreebusyExchangeURL, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=607)
    public String getFreebusyExchangeURL() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeURL, null);
    }

    /**
     * URL to Exchange server for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeURL new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=607)
    public void setFreebusyExchangeURL(String zimbraFreebusyExchangeURL) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeURL, zimbraFreebusyExchangeURL);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * URL to Exchange server for free/busy lookup and propagation
     *
     * @param zimbraFreebusyExchangeURL new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=607)
    public Map<String,Object> setFreebusyExchangeURL(String zimbraFreebusyExchangeURL, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeURL, zimbraFreebusyExchangeURL);
        return attrs;
    }

    /**
     * URL to Exchange server for free/busy lookup and propagation
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=607)
    public void unsetFreebusyExchangeURL() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeURL, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * URL to Exchange server for free/busy lookup and propagation
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=607)
    public Map<String,Object> unsetFreebusyExchangeURL(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeURL, "");
        return attrs;
    }

    /**
     * O and OU used in legacyExchangeDN attribute
     *
     * @return zimbraFreebusyExchangeUserOrg, or null if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=610)
    public String getFreebusyExchangeUserOrg() {
        return getAttr(Provisioning.A_zimbraFreebusyExchangeUserOrg, null);
    }

    /**
     * O and OU used in legacyExchangeDN attribute
     *
     * @param zimbraFreebusyExchangeUserOrg new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=610)
    public void setFreebusyExchangeUserOrg(String zimbraFreebusyExchangeUserOrg) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeUserOrg, zimbraFreebusyExchangeUserOrg);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * O and OU used in legacyExchangeDN attribute
     *
     * @param zimbraFreebusyExchangeUserOrg new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=610)
    public Map<String,Object> setFreebusyExchangeUserOrg(String zimbraFreebusyExchangeUserOrg, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeUserOrg, zimbraFreebusyExchangeUserOrg);
        return attrs;
    }

    /**
     * O and OU used in legacyExchangeDN attribute
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=610)
    public void unsetFreebusyExchangeUserOrg() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeUserOrg, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * O and OU used in legacyExchangeDN attribute
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=610)
    public Map<String,Object> unsetFreebusyExchangeUserOrg(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyExchangeUserOrg, "");
        return attrs;
    }

    /**
     * when set to TRUE, free/busy for the account is not calculated from
     * local mailbox.
     *
     * @return zimbraFreebusyLocalMailboxNotActive, or false if unset
     *
     * @since ZCS 5.0.11
     */
    @ZAttr(id=752)
    public boolean isFreebusyLocalMailboxNotActive() {
        return getBooleanAttr(Provisioning.A_zimbraFreebusyLocalMailboxNotActive, false);
    }

    /**
     * when set to TRUE, free/busy for the account is not calculated from
     * local mailbox.
     *
     * @param zimbraFreebusyLocalMailboxNotActive new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.11
     */
    @ZAttr(id=752)
    public void setFreebusyLocalMailboxNotActive(boolean zimbraFreebusyLocalMailboxNotActive) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyLocalMailboxNotActive, zimbraFreebusyLocalMailboxNotActive ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * when set to TRUE, free/busy for the account is not calculated from
     * local mailbox.
     *
     * @param zimbraFreebusyLocalMailboxNotActive new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.11
     */
    @ZAttr(id=752)
    public Map<String,Object> setFreebusyLocalMailboxNotActive(boolean zimbraFreebusyLocalMailboxNotActive, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyLocalMailboxNotActive, zimbraFreebusyLocalMailboxNotActive ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * when set to TRUE, free/busy for the account is not calculated from
     * local mailbox.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.11
     */
    @ZAttr(id=752)
    public void unsetFreebusyLocalMailboxNotActive() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyLocalMailboxNotActive, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * when set to TRUE, free/busy for the account is not calculated from
     * local mailbox.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.11
     */
    @ZAttr(id=752)
    public Map<String,Object> unsetFreebusyLocalMailboxNotActive(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraFreebusyLocalMailboxNotActive, "");
        return attrs;
    }

    /**
     * available IM interop gateways
     *
     * @return zimbraIMAvailableInteropGateways, or ampty array if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public String[] getIMAvailableInteropGateways() {
        return getMultiAttr(Provisioning.A_zimbraIMAvailableInteropGateways);
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public void setIMAvailableInteropGateways(String[] zimbraIMAvailableInteropGateways) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public Map<String,Object> setIMAvailableInteropGateways(String[] zimbraIMAvailableInteropGateways, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        return attrs;
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public void addIMAvailableInteropGateways(String zimbraIMAvailableInteropGateways) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public Map<String,Object> addIMAvailableInteropGateways(String zimbraIMAvailableInteropGateways, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        return attrs;
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public void removeIMAvailableInteropGateways(String zimbraIMAvailableInteropGateways) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * available IM interop gateways
     *
     * @param zimbraIMAvailableInteropGateways existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public Map<String,Object> removeIMAvailableInteropGateways(String zimbraIMAvailableInteropGateways, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraIMAvailableInteropGateways, zimbraIMAvailableInteropGateways);
        return attrs;
    }

    /**
     * available IM interop gateways
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public void unsetIMAvailableInteropGateways() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMAvailableInteropGateways, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * available IM interop gateways
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=571)
    public Map<String,Object> unsetIMAvailableInteropGateways(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMAvailableInteropGateways, "");
        return attrs;
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @return zimbraIMService, or ZAttrProvisioning.IMService.zimbra if unset and/or has invalid value
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public ZAttrProvisioning.IMService getIMService() {
        try { String v = getAttr(Provisioning.A_zimbraIMService); return v == null ? ZAttrProvisioning.IMService.zimbra : ZAttrProvisioning.IMService.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.IMService.zimbra; }
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @return zimbraIMService, or "zimbra" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public String getIMServiceAsString() {
        return getAttr(Provisioning.A_zimbraIMService, "zimbra");
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @param zimbraIMService new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public void setIMService(ZAttrProvisioning.IMService zimbraIMService) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, zimbraIMService.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @param zimbraIMService new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public Map<String,Object> setIMService(ZAttrProvisioning.IMService zimbraIMService, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, zimbraIMService.toString());
        return attrs;
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @param zimbraIMService new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public void setIMServiceAsString(String zimbraIMService) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, zimbraIMService);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @param zimbraIMService new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public Map<String,Object> setIMServiceAsString(String zimbraIMService, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, zimbraIMService);
        return attrs;
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public void unsetIMService() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM service
     *
     * <p>Valid values: [yahoo, zimbra]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=762)
    public Map<String,Object> unsetIMService(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIMService, "");
        return attrs;
    }

    /**
     * Zimbra Systems Unique ID
     *
     * @return zimbraId, or null if unset
     */
    @ZAttr(id=1)
    public String getId() {
        return getAttr(Provisioning.A_zimbraId, null);
    }

    /**
     * Zimbra Systems Unique ID
     *
     * @param zimbraId new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=1)
    public void setId(String zimbraId) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraId, zimbraId);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra Systems Unique ID
     *
     * @param zimbraId new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=1)
    public Map<String,Object> setId(String zimbraId, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraId, zimbraId);
        return attrs;
    }

    /**
     * Zimbra Systems Unique ID
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=1)
    public void unsetId() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraId, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Zimbra Systems Unique ID
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=1)
    public Map<String,Object> unsetId(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraId, "");
        return attrs;
    }

    /**
     * maximum number of identities allowed on an account
     *
     * @return zimbraIdentityMaxNumEntries, or 20 if unset
     */
    @ZAttr(id=414)
    public int getIdentityMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraIdentityMaxNumEntries, 20);
    }

    /**
     * maximum number of identities allowed on an account
     *
     * @param zimbraIdentityMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=414)
    public void setIdentityMaxNumEntries(int zimbraIdentityMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIdentityMaxNumEntries, Integer.toString(zimbraIdentityMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of identities allowed on an account
     *
     * @param zimbraIdentityMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=414)
    public Map<String,Object> setIdentityMaxNumEntries(int zimbraIdentityMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIdentityMaxNumEntries, Integer.toString(zimbraIdentityMaxNumEntries));
        return attrs;
    }

    /**
     * maximum number of identities allowed on an account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=414)
    public void unsetIdentityMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIdentityMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of identities allowed on an account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=414)
    public Map<String,Object> unsetIdentityMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraIdentityMaxNumEntries, "");
        return attrs;
    }

    /**
     * whether IMAP is enabled for an account
     *
     * @return zimbraImapEnabled, or true if unset
     */
    @ZAttr(id=174)
    public boolean isImapEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraImapEnabled, true);
    }

    /**
     * whether IMAP is enabled for an account
     *
     * @param zimbraImapEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=174)
    public void setImapEnabled(boolean zimbraImapEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraImapEnabled, zimbraImapEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether IMAP is enabled for an account
     *
     * @param zimbraImapEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=174)
    public Map<String,Object> setImapEnabled(boolean zimbraImapEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraImapEnabled, zimbraImapEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether IMAP is enabled for an account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=174)
    public void unsetImapEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraImapEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether IMAP is enabled for an account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=174)
    public Map<String,Object> unsetImapEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraImapEnabled, "");
        return attrs;
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @return zimbraInterceptAddress, or ampty array if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public String[] getInterceptAddress() {
        return getMultiAttr(Provisioning.A_zimbraInterceptAddress);
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public void setInterceptAddress(String[] zimbraInterceptAddress) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public Map<String,Object> setInterceptAddress(String[] zimbraInterceptAddress, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        return attrs;
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public void addInterceptAddress(String zimbraInterceptAddress) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public Map<String,Object> addInterceptAddress(String zimbraInterceptAddress, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        return attrs;
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public void removeInterceptAddress(String zimbraInterceptAddress) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param zimbraInterceptAddress existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public Map<String,Object> removeInterceptAddress(String zimbraInterceptAddress, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraInterceptAddress, zimbraInterceptAddress);
        return attrs;
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public void unsetInterceptAddress() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptAddress, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The address to which legal intercept messages will be sent.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=614)
    public Map<String,Object> unsetInterceptAddress(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptAddress, "");
        return attrs;
    }

    /**
     * Template used to construct the body of a legal intercept message.
     *
     * @return zimbraInterceptBody, or "Intercepted message for ${ACCOUNT_ADDRESS}.${NEWLINE}Operation=${OPERATION}, folder=${FOLDER_NAME}, folder ID=${FOLDER_ID}." if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=618)
    public String getInterceptBody() {
        return getAttr(Provisioning.A_zimbraInterceptBody, "Intercepted message for ${ACCOUNT_ADDRESS}.${NEWLINE}Operation=${OPERATION}, folder=${FOLDER_NAME}, folder ID=${FOLDER_ID}.");
    }

    /**
     * Template used to construct the body of a legal intercept message.
     *
     * @param zimbraInterceptBody new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=618)
    public void setInterceptBody(String zimbraInterceptBody) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptBody, zimbraInterceptBody);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the body of a legal intercept message.
     *
     * @param zimbraInterceptBody new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=618)
    public Map<String,Object> setInterceptBody(String zimbraInterceptBody, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptBody, zimbraInterceptBody);
        return attrs;
    }

    /**
     * Template used to construct the body of a legal intercept message.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=618)
    public void unsetInterceptBody() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptBody, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the body of a legal intercept message.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=618)
    public Map<String,Object> unsetInterceptBody(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptBody, "");
        return attrs;
    }

    /**
     * Template used to construct the sender of a legal intercept message.
     *
     * @return zimbraInterceptFrom, or "Postmaster <postmaster@${ACCOUNT_DOMAIN}>" if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=616)
    public String getInterceptFrom() {
        return getAttr(Provisioning.A_zimbraInterceptFrom, "Postmaster <postmaster@${ACCOUNT_DOMAIN}>");
    }

    /**
     * Template used to construct the sender of a legal intercept message.
     *
     * @param zimbraInterceptFrom new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=616)
    public void setInterceptFrom(String zimbraInterceptFrom) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptFrom, zimbraInterceptFrom);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the sender of a legal intercept message.
     *
     * @param zimbraInterceptFrom new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=616)
    public Map<String,Object> setInterceptFrom(String zimbraInterceptFrom, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptFrom, zimbraInterceptFrom);
        return attrs;
    }

    /**
     * Template used to construct the sender of a legal intercept message.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=616)
    public void unsetInterceptFrom() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptFrom, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the sender of a legal intercept message.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=616)
    public Map<String,Object> unsetInterceptFrom(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptFrom, "");
        return attrs;
    }

    /**
     * Specifies whether legal intercept messages should contain the entire
     * original message or just the headers.
     *
     * @return zimbraInterceptSendHeadersOnly, or false if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=615)
    public boolean isInterceptSendHeadersOnly() {
        return getBooleanAttr(Provisioning.A_zimbraInterceptSendHeadersOnly, false);
    }

    /**
     * Specifies whether legal intercept messages should contain the entire
     * original message or just the headers.
     *
     * @param zimbraInterceptSendHeadersOnly new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=615)
    public void setInterceptSendHeadersOnly(boolean zimbraInterceptSendHeadersOnly) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSendHeadersOnly, zimbraInterceptSendHeadersOnly ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Specifies whether legal intercept messages should contain the entire
     * original message or just the headers.
     *
     * @param zimbraInterceptSendHeadersOnly new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=615)
    public Map<String,Object> setInterceptSendHeadersOnly(boolean zimbraInterceptSendHeadersOnly, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSendHeadersOnly, zimbraInterceptSendHeadersOnly ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Specifies whether legal intercept messages should contain the entire
     * original message or just the headers.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=615)
    public void unsetInterceptSendHeadersOnly() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSendHeadersOnly, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Specifies whether legal intercept messages should contain the entire
     * original message or just the headers.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=615)
    public Map<String,Object> unsetInterceptSendHeadersOnly(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSendHeadersOnly, "");
        return attrs;
    }

    /**
     * Template used to construct the subject of a legal intercept message.
     *
     * @return zimbraInterceptSubject, or "Intercepted message for ${ACCOUNT_ADDRESS}: ${MESSAGE_SUBJECT}" if unset
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=617)
    public String getInterceptSubject() {
        return getAttr(Provisioning.A_zimbraInterceptSubject, "Intercepted message for ${ACCOUNT_ADDRESS}: ${MESSAGE_SUBJECT}");
    }

    /**
     * Template used to construct the subject of a legal intercept message.
     *
     * @param zimbraInterceptSubject new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=617)
    public void setInterceptSubject(String zimbraInterceptSubject) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSubject, zimbraInterceptSubject);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the subject of a legal intercept message.
     *
     * @param zimbraInterceptSubject new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=617)
    public Map<String,Object> setInterceptSubject(String zimbraInterceptSubject, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSubject, zimbraInterceptSubject);
        return attrs;
    }

    /**
     * Template used to construct the subject of a legal intercept message.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=617)
    public void unsetInterceptSubject() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSubject, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Template used to construct the subject of a legal intercept message.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.3
     */
    @ZAttr(id=617)
    public Map<String,Object> unsetInterceptSubject(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraInterceptSubject, "");
        return attrs;
    }

    /**
     * Whether to index junk messages
     *
     * @return zimbraJunkMessagesIndexingEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=579)
    public boolean isJunkMessagesIndexingEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraJunkMessagesIndexingEnabled, true);
    }

    /**
     * Whether to index junk messages
     *
     * @param zimbraJunkMessagesIndexingEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=579)
    public void setJunkMessagesIndexingEnabled(boolean zimbraJunkMessagesIndexingEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraJunkMessagesIndexingEnabled, zimbraJunkMessagesIndexingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether to index junk messages
     *
     * @param zimbraJunkMessagesIndexingEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=579)
    public Map<String,Object> setJunkMessagesIndexingEnabled(boolean zimbraJunkMessagesIndexingEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraJunkMessagesIndexingEnabled, zimbraJunkMessagesIndexingEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether to index junk messages
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=579)
    public void unsetJunkMessagesIndexingEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraJunkMessagesIndexingEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether to index junk messages
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=579)
    public Map<String,Object> unsetJunkMessagesIndexingEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraJunkMessagesIndexingEnabled, "");
        return attrs;
    }

    /**
     * locale of entry, e.g. en_US
     *
     * @return zimbraLocale, or null if unset
     */
    @ZAttr(id=345)
    public String getLocaleAsString() {
        return getAttr(Provisioning.A_zimbraLocale, null);
    }

    /**
     * locale of entry, e.g. en_US
     *
     * @param zimbraLocale new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=345)
    public void setLocale(String zimbraLocale) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraLocale, zimbraLocale);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * locale of entry, e.g. en_US
     *
     * @param zimbraLocale new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=345)
    public Map<String,Object> setLocale(String zimbraLocale, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraLocale, zimbraLocale);
        return attrs;
    }

    /**
     * locale of entry, e.g. en_US
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=345)
    public void unsetLocale() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraLocale, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * locale of entry, e.g. en_US
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=345)
    public Map<String,Object> unsetLocale(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraLocale, "");
        return attrs;
    }

    /**
     * Maximum number of entries for per user black list. This restricts the
     * number of values that can be set on the amavisBlacklistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @return zimbraMailBlacklistMaxNumEntries, or 100 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=799)
    public int getMailBlacklistMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraMailBlacklistMaxNumEntries, 100);
    }

    /**
     * Maximum number of entries for per user black list. This restricts the
     * number of values that can be set on the amavisBlacklistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param zimbraMailBlacklistMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=799)
    public void setMailBlacklistMaxNumEntries(int zimbraMailBlacklistMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailBlacklistMaxNumEntries, Integer.toString(zimbraMailBlacklistMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of entries for per user black list. This restricts the
     * number of values that can be set on the amavisBlacklistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param zimbraMailBlacklistMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=799)
    public Map<String,Object> setMailBlacklistMaxNumEntries(int zimbraMailBlacklistMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailBlacklistMaxNumEntries, Integer.toString(zimbraMailBlacklistMaxNumEntries));
        return attrs;
    }

    /**
     * Maximum number of entries for per user black list. This restricts the
     * number of values that can be set on the amavisBlacklistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=799)
    public void unsetMailBlacklistMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailBlacklistMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of entries for per user black list. This restricts the
     * number of values that can be set on the amavisBlacklistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=799)
    public Map<String,Object> unsetMailBlacklistMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailBlacklistMaxNumEntries, "");
        return attrs;
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @return zimbraMailHostPool, or ampty array if unset
     */
    @ZAttr(id=125)
    public String[] getMailHostPool() {
        return getMultiAttr(Provisioning.A_zimbraMailHostPool);
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=125)
    public void setMailHostPool(String[] zimbraMailHostPool) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=125)
    public Map<String,Object> setMailHostPool(String[] zimbraMailHostPool, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        return attrs;
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=125)
    public void addMailHostPool(String zimbraMailHostPool) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=125)
    public Map<String,Object> addMailHostPool(String zimbraMailHostPool, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        return attrs;
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=125)
    public void removeMailHostPool(String zimbraMailHostPool) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param zimbraMailHostPool existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=125)
    public Map<String,Object> removeMailHostPool(String zimbraMailHostPool, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraMailHostPool, zimbraMailHostPool);
        return attrs;
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=125)
    public void unsetMailHostPool() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailHostPool, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * servers that an account can be initially provisioned on
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=125)
    public Map<String,Object> unsetMailHostPool(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailHostPool, "");
        return attrs;
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * <p>Use getMailIdleSessionTimeoutAsString to access value as a string.
     *
     * @see #getMailIdleSessionTimeoutAsString()
     *
     * @return zimbraMailIdleSessionTimeout in millseconds, or 0 (0)  if unset
     */
    @ZAttr(id=147)
    public long getMailIdleSessionTimeout() {
        return getTimeInterval(Provisioning.A_zimbraMailIdleSessionTimeout, 0L);
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * @return zimbraMailIdleSessionTimeout, or "0" if unset
     */
    @ZAttr(id=147)
    public String getMailIdleSessionTimeoutAsString() {
        return getAttr(Provisioning.A_zimbraMailIdleSessionTimeout, "0");
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * @param zimbraMailIdleSessionTimeout new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=147)
    public void setMailIdleSessionTimeout(String zimbraMailIdleSessionTimeout) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailIdleSessionTimeout, zimbraMailIdleSessionTimeout);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * @param zimbraMailIdleSessionTimeout new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=147)
    public Map<String,Object> setMailIdleSessionTimeout(String zimbraMailIdleSessionTimeout, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailIdleSessionTimeout, zimbraMailIdleSessionTimeout);
        return attrs;
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=147)
    public void unsetMailIdleSessionTimeout() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailIdleSessionTimeout, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * idle timeout (nnnnn[hmsd])
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=147)
    public Map<String,Object> unsetMailIdleSessionTimeout(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailIdleSessionTimeout, "");
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * <p>Use getMailMessageLifetimeAsString to access value as a string.
     *
     * @see #getMailMessageLifetimeAsString()
     *
     * @return zimbraMailMessageLifetime in millseconds, or 0 (0)  if unset
     */
    @ZAttr(id=106)
    public long getMailMessageLifetime() {
        return getTimeInterval(Provisioning.A_zimbraMailMessageLifetime, 0L);
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * @return zimbraMailMessageLifetime, or "0" if unset
     */
    @ZAttr(id=106)
    public String getMailMessageLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraMailMessageLifetime, "0");
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * @param zimbraMailMessageLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=106)
    public void setMailMessageLifetime(String zimbraMailMessageLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMessageLifetime, zimbraMailMessageLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * @param zimbraMailMessageLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=106)
    public Map<String,Object> setMailMessageLifetime(String zimbraMailMessageLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMessageLifetime, zimbraMailMessageLifetime);
        return attrs;
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=106)
    public void unsetMailMessageLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMessageLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * lifetime (nnnnn[hmsd]) of a mail message regardless of location
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=106)
    public Map<String,Object> unsetMailMessageLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMessageLifetime, "");
        return attrs;
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * <p>Use getMailMinPollingIntervalAsString to access value as a string.
     *
     * @see #getMailMinPollingIntervalAsString()
     *
     * @return zimbraMailMinPollingInterval in millseconds, or 120000 (2m)  if unset
     */
    @ZAttr(id=110)
    public long getMailMinPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraMailMinPollingInterval, 120000L);
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * @return zimbraMailMinPollingInterval, or "2m" if unset
     */
    @ZAttr(id=110)
    public String getMailMinPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraMailMinPollingInterval, "2m");
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * @param zimbraMailMinPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=110)
    public void setMailMinPollingInterval(String zimbraMailMinPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMinPollingInterval, zimbraMailMinPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * @param zimbraMailMinPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=110)
    public Map<String,Object> setMailMinPollingInterval(String zimbraMailMinPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMinPollingInterval, zimbraMailMinPollingInterval);
        return attrs;
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=110)
    public void unsetMailMinPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMinPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum allowed value for zimbraPrefMailPollingInterval (nnnnn[hmsd])
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=110)
    public Map<String,Object> unsetMailMinPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailMinPollingInterval, "");
        return attrs;
    }

    /**
     * If TRUE, a message is purged from trash based on the date that it was
     * moved to the Trash folder. If FALSE, a message is purged from Trash
     * based on the date that it was added to the mailbox.
     *
     * @return zimbraMailPurgeUseChangeDateForTrash, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=748)
    public boolean isMailPurgeUseChangeDateForTrash() {
        return getBooleanAttr(Provisioning.A_zimbraMailPurgeUseChangeDateForTrash, true);
    }

    /**
     * If TRUE, a message is purged from trash based on the date that it was
     * moved to the Trash folder. If FALSE, a message is purged from Trash
     * based on the date that it was added to the mailbox.
     *
     * @param zimbraMailPurgeUseChangeDateForTrash new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=748)
    public void setMailPurgeUseChangeDateForTrash(boolean zimbraMailPurgeUseChangeDateForTrash) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailPurgeUseChangeDateForTrash, zimbraMailPurgeUseChangeDateForTrash ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If TRUE, a message is purged from trash based on the date that it was
     * moved to the Trash folder. If FALSE, a message is purged from Trash
     * based on the date that it was added to the mailbox.
     *
     * @param zimbraMailPurgeUseChangeDateForTrash new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=748)
    public Map<String,Object> setMailPurgeUseChangeDateForTrash(boolean zimbraMailPurgeUseChangeDateForTrash, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailPurgeUseChangeDateForTrash, zimbraMailPurgeUseChangeDateForTrash ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * If TRUE, a message is purged from trash based on the date that it was
     * moved to the Trash folder. If FALSE, a message is purged from Trash
     * based on the date that it was added to the mailbox.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=748)
    public void unsetMailPurgeUseChangeDateForTrash() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailPurgeUseChangeDateForTrash, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If TRUE, a message is purged from trash based on the date that it was
     * moved to the Trash folder. If FALSE, a message is purged from Trash
     * based on the date that it was added to the mailbox.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=748)
    public Map<String,Object> unsetMailPurgeUseChangeDateForTrash(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailPurgeUseChangeDateForTrash, "");
        return attrs;
    }

    /**
     * mail quota in bytes
     *
     * @return zimbraMailQuota, or 0 if unset
     */
    @ZAttr(id=16)
    public long getMailQuota() {
        return getLongAttr(Provisioning.A_zimbraMailQuota, 0L);
    }

    /**
     * mail quota in bytes
     *
     * @param zimbraMailQuota new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=16)
    public void setMailQuota(long zimbraMailQuota) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailQuota, Long.toString(zimbraMailQuota));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail quota in bytes
     *
     * @param zimbraMailQuota new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=16)
    public Map<String,Object> setMailQuota(long zimbraMailQuota, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailQuota, Long.toString(zimbraMailQuota));
        return attrs;
    }

    /**
     * mail quota in bytes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=16)
    public void unsetMailQuota() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailQuota, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail quota in bytes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=16)
    public Map<String,Object> unsetMailQuota(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailQuota, "");
        return attrs;
    }

    /**
     * maximum length of mail signature, 0 means unlimited. If not set,
     * default is 1024
     *
     * @return zimbraMailSignatureMaxLength, or 1024 if unset
     */
    @ZAttr(id=454)
    public long getMailSignatureMaxLength() {
        return getLongAttr(Provisioning.A_zimbraMailSignatureMaxLength, 1024L);
    }

    /**
     * maximum length of mail signature, 0 means unlimited. If not set,
     * default is 1024
     *
     * @param zimbraMailSignatureMaxLength new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=454)
    public void setMailSignatureMaxLength(long zimbraMailSignatureMaxLength) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSignatureMaxLength, Long.toString(zimbraMailSignatureMaxLength));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum length of mail signature, 0 means unlimited. If not set,
     * default is 1024
     *
     * @param zimbraMailSignatureMaxLength new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=454)
    public Map<String,Object> setMailSignatureMaxLength(long zimbraMailSignatureMaxLength, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSignatureMaxLength, Long.toString(zimbraMailSignatureMaxLength));
        return attrs;
    }

    /**
     * maximum length of mail signature, 0 means unlimited. If not set,
     * default is 1024
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=454)
    public void unsetMailSignatureMaxLength() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSignatureMaxLength, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum length of mail signature, 0 means unlimited. If not set,
     * default is 1024
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=454)
    public Map<String,Object> unsetMailSignatureMaxLength(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSignatureMaxLength, "");
        return attrs;
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * <p>Use getMailSpamLifetimeAsString to access value as a string.
     *
     * @see #getMailSpamLifetimeAsString()
     *
     * @return zimbraMailSpamLifetime in millseconds, or 2592000000 (30d)  if unset
     */
    @ZAttr(id=105)
    public long getMailSpamLifetime() {
        return getTimeInterval(Provisioning.A_zimbraMailSpamLifetime, 2592000000L);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * @return zimbraMailSpamLifetime, or "30d" if unset
     */
    @ZAttr(id=105)
    public String getMailSpamLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraMailSpamLifetime, "30d");
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * @param zimbraMailSpamLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=105)
    public void setMailSpamLifetime(String zimbraMailSpamLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSpamLifetime, zimbraMailSpamLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * @param zimbraMailSpamLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=105)
    public Map<String,Object> setMailSpamLifetime(String zimbraMailSpamLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSpamLifetime, zimbraMailSpamLifetime);
        return attrs;
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=105)
    public void unsetMailSpamLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSpamLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefJunkLifetime, which is user-modifiable. The
     * shorter duration is used.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=105)
    public Map<String,Object> unsetMailSpamLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailSpamLifetime, "");
        return attrs;
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * <p>Use getMailTrashLifetimeAsString to access value as a string.
     *
     * @see #getMailTrashLifetimeAsString()
     *
     * @return zimbraMailTrashLifetime in millseconds, or 2592000000 (30d)  if unset
     */
    @ZAttr(id=104)
    public long getMailTrashLifetime() {
        return getTimeInterval(Provisioning.A_zimbraMailTrashLifetime, 2592000000L);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * @return zimbraMailTrashLifetime, or "30d" if unset
     */
    @ZAttr(id=104)
    public String getMailTrashLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraMailTrashLifetime, "30d");
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraMailTrashLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=104)
    public void setMailTrashLifetime(String zimbraMailTrashLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailTrashLifetime, zimbraMailTrashLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraMailTrashLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=104)
    public Map<String,Object> setMailTrashLifetime(String zimbraMailTrashLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailTrashLifetime, zimbraMailTrashLifetime);
        return attrs;
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=104)
    public void unsetMailTrashLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailTrashLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This admin-modifiable attribute works in
     * conjunction with zimbraPrefTrashLifetime, which is user-modifiable.
     * The shorter duration is used.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=104)
    public Map<String,Object> unsetMailTrashLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailTrashLifetime, "");
        return attrs;
    }

    /**
     * Maximum number of entries for per user white list. This restricts the
     * number of values that can be set on the amavisWhitelistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @return zimbraMailWhitelistMaxNumEntries, or 100 if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=798)
    public int getMailWhitelistMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraMailWhitelistMaxNumEntries, 100);
    }

    /**
     * Maximum number of entries for per user white list. This restricts the
     * number of values that can be set on the amavisWhitelistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param zimbraMailWhitelistMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=798)
    public void setMailWhitelistMaxNumEntries(int zimbraMailWhitelistMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailWhitelistMaxNumEntries, Integer.toString(zimbraMailWhitelistMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of entries for per user white list. This restricts the
     * number of values that can be set on the amavisWhitelistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param zimbraMailWhitelistMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=798)
    public Map<String,Object> setMailWhitelistMaxNumEntries(int zimbraMailWhitelistMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailWhitelistMaxNumEntries, Integer.toString(zimbraMailWhitelistMaxNumEntries));
        return attrs;
    }

    /**
     * Maximum number of entries for per user white list. This restricts the
     * number of values that can be set on the amavisWhitelistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=798)
    public void unsetMailWhitelistMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailWhitelistMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Maximum number of entries for per user white list. This restricts the
     * number of values that can be set on the amavisWhitelistSender
     * attribute of an account. If set to 0, the per user white list feature
     * is disabled.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=798)
    public Map<String,Object> unsetMailWhitelistMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraMailWhitelistMaxNumEntries, "");
        return attrs;
    }

    /**
     * template used to construct the body of an email notification message
     *
     * @return zimbraNewMailNotificationBody, or "New message received at ${RECIPIENT_ADDRESS}.${NEWLINE}Sender: ${SENDER_ADDRESS}${NEWLINE}Subject: ${SUBJECT}" if unset
     */
    @ZAttr(id=152)
    public String getNewMailNotificationBody() {
        return getAttr(Provisioning.A_zimbraNewMailNotificationBody, "New message received at ${RECIPIENT_ADDRESS}.${NEWLINE}Sender: ${SENDER_ADDRESS}${NEWLINE}Subject: ${SUBJECT}");
    }

    /**
     * template used to construct the body of an email notification message
     *
     * @param zimbraNewMailNotificationBody new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=152)
    public void setNewMailNotificationBody(String zimbraNewMailNotificationBody) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationBody, zimbraNewMailNotificationBody);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the body of an email notification message
     *
     * @param zimbraNewMailNotificationBody new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=152)
    public Map<String,Object> setNewMailNotificationBody(String zimbraNewMailNotificationBody, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationBody, zimbraNewMailNotificationBody);
        return attrs;
    }

    /**
     * template used to construct the body of an email notification message
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=152)
    public void unsetNewMailNotificationBody() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationBody, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the body of an email notification message
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=152)
    public Map<String,Object> unsetNewMailNotificationBody(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationBody, "");
        return attrs;
    }

    /**
     * template used to construct the sender of an email notification message
     *
     * @return zimbraNewMailNotificationFrom, or "Postmaster <postmaster@${RECIPIENT_DOMAIN}>" if unset
     */
    @ZAttr(id=150)
    public String getNewMailNotificationFrom() {
        return getAttr(Provisioning.A_zimbraNewMailNotificationFrom, "Postmaster <postmaster@${RECIPIENT_DOMAIN}>");
    }

    /**
     * template used to construct the sender of an email notification message
     *
     * @param zimbraNewMailNotificationFrom new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=150)
    public void setNewMailNotificationFrom(String zimbraNewMailNotificationFrom) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationFrom, zimbraNewMailNotificationFrom);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the sender of an email notification message
     *
     * @param zimbraNewMailNotificationFrom new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=150)
    public Map<String,Object> setNewMailNotificationFrom(String zimbraNewMailNotificationFrom, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationFrom, zimbraNewMailNotificationFrom);
        return attrs;
    }

    /**
     * template used to construct the sender of an email notification message
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=150)
    public void unsetNewMailNotificationFrom() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationFrom, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the sender of an email notification message
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=150)
    public Map<String,Object> unsetNewMailNotificationFrom(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationFrom, "");
        return attrs;
    }

    /**
     * template used to construct the subject of an email notification
     * message
     *
     * @return zimbraNewMailNotificationSubject, or "New message received at ${RECIPIENT_ADDRESS}" if unset
     */
    @ZAttr(id=151)
    public String getNewMailNotificationSubject() {
        return getAttr(Provisioning.A_zimbraNewMailNotificationSubject, "New message received at ${RECIPIENT_ADDRESS}");
    }

    /**
     * template used to construct the subject of an email notification
     * message
     *
     * @param zimbraNewMailNotificationSubject new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=151)
    public void setNewMailNotificationSubject(String zimbraNewMailNotificationSubject) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationSubject, zimbraNewMailNotificationSubject);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the subject of an email notification
     * message
     *
     * @param zimbraNewMailNotificationSubject new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=151)
    public Map<String,Object> setNewMailNotificationSubject(String zimbraNewMailNotificationSubject, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationSubject, zimbraNewMailNotificationSubject);
        return attrs;
    }

    /**
     * template used to construct the subject of an email notification
     * message
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=151)
    public void unsetNewMailNotificationSubject() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationSubject, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * template used to construct the subject of an email notification
     * message
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=151)
    public Map<String,Object> unsetNewMailNotificationSubject(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNewMailNotificationSubject, "");
        return attrs;
    }

    /**
     * maximum number of revisions to keep for wiki pages and documents. 0
     * means unlimited.
     *
     * @return zimbraNotebookMaxRevisions, or 0 if unset
     */
    @ZAttr(id=482)
    public int getNotebookMaxRevisions() {
        return getIntAttr(Provisioning.A_zimbraNotebookMaxRevisions, 0);
    }

    /**
     * maximum number of revisions to keep for wiki pages and documents. 0
     * means unlimited.
     *
     * @param zimbraNotebookMaxRevisions new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=482)
    public void setNotebookMaxRevisions(int zimbraNotebookMaxRevisions) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookMaxRevisions, Integer.toString(zimbraNotebookMaxRevisions));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of revisions to keep for wiki pages and documents. 0
     * means unlimited.
     *
     * @param zimbraNotebookMaxRevisions new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=482)
    public Map<String,Object> setNotebookMaxRevisions(int zimbraNotebookMaxRevisions, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookMaxRevisions, Integer.toString(zimbraNotebookMaxRevisions));
        return attrs;
    }

    /**
     * maximum number of revisions to keep for wiki pages and documents. 0
     * means unlimited.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=482)
    public void unsetNotebookMaxRevisions() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookMaxRevisions, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of revisions to keep for wiki pages and documents. 0
     * means unlimited.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=482)
    public Map<String,Object> unsetNotebookMaxRevisions(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookMaxRevisions, "");
        return attrs;
    }

    /**
     * whether to strip off potentially harming HTML tags in Wiki and HTML
     * Documents.
     *
     * @return zimbraNotebookSanitizeHtml, or true if unset
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=646)
    public boolean isNotebookSanitizeHtml() {
        return getBooleanAttr(Provisioning.A_zimbraNotebookSanitizeHtml, true);
    }

    /**
     * whether to strip off potentially harming HTML tags in Wiki and HTML
     * Documents.
     *
     * @param zimbraNotebookSanitizeHtml new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=646)
    public void setNotebookSanitizeHtml(boolean zimbraNotebookSanitizeHtml) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookSanitizeHtml, zimbraNotebookSanitizeHtml ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to strip off potentially harming HTML tags in Wiki and HTML
     * Documents.
     *
     * @param zimbraNotebookSanitizeHtml new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=646)
    public Map<String,Object> setNotebookSanitizeHtml(boolean zimbraNotebookSanitizeHtml, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookSanitizeHtml, zimbraNotebookSanitizeHtml ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to strip off potentially harming HTML tags in Wiki and HTML
     * Documents.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=646)
    public void unsetNotebookSanitizeHtml() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookSanitizeHtml, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to strip off potentially harming HTML tags in Wiki and HTML
     * Documents.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=646)
    public Map<String,Object> unsetNotebookSanitizeHtml(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotebookSanitizeHtml, "");
        return attrs;
    }

    /**
     * administrative notes
     *
     * @return zimbraNotes, or null if unset
     */
    @ZAttr(id=9)
    public String getNotes() {
        return getAttr(Provisioning.A_zimbraNotes, null);
    }

    /**
     * administrative notes
     *
     * @param zimbraNotes new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=9)
    public void setNotes(String zimbraNotes) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotes, zimbraNotes);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * administrative notes
     *
     * @param zimbraNotes new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=9)
    public Map<String,Object> setNotes(String zimbraNotes, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotes, zimbraNotes);
        return attrs;
    }

    /**
     * administrative notes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=9)
    public void unsetNotes() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotes, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * administrative notes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=9)
    public Map<String,Object> unsetNotes(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraNotes, "");
        return attrs;
    }

    /**
     * whether or not to enforce password history. Number of unique passwords
     * a user must have before being allowed to re-use an old one. A value of
     * 0 means no password history.
     *
     * @return zimbraPasswordEnforceHistory, or 0 if unset
     */
    @ZAttr(id=37)
    public int getPasswordEnforceHistory() {
        return getIntAttr(Provisioning.A_zimbraPasswordEnforceHistory, 0);
    }

    /**
     * whether or not to enforce password history. Number of unique passwords
     * a user must have before being allowed to re-use an old one. A value of
     * 0 means no password history.
     *
     * @param zimbraPasswordEnforceHistory new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=37)
    public void setPasswordEnforceHistory(int zimbraPasswordEnforceHistory) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordEnforceHistory, Integer.toString(zimbraPasswordEnforceHistory));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to enforce password history. Number of unique passwords
     * a user must have before being allowed to re-use an old one. A value of
     * 0 means no password history.
     *
     * @param zimbraPasswordEnforceHistory new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=37)
    public Map<String,Object> setPasswordEnforceHistory(int zimbraPasswordEnforceHistory, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordEnforceHistory, Integer.toString(zimbraPasswordEnforceHistory));
        return attrs;
    }

    /**
     * whether or not to enforce password history. Number of unique passwords
     * a user must have before being allowed to re-use an old one. A value of
     * 0 means no password history.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=37)
    public void unsetPasswordEnforceHistory() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordEnforceHistory, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to enforce password history. Number of unique passwords
     * a user must have before being allowed to re-use an old one. A value of
     * 0 means no password history.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=37)
    public Map<String,Object> unsetPasswordEnforceHistory(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordEnforceHistory, "");
        return attrs;
    }

    /**
     * user is unable to change password
     *
     * @return zimbraPasswordLocked, or false if unset
     */
    @ZAttr(id=45)
    public boolean isPasswordLocked() {
        return getBooleanAttr(Provisioning.A_zimbraPasswordLocked, false);
    }

    /**
     * user is unable to change password
     *
     * @param zimbraPasswordLocked new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=45)
    public void setPasswordLocked(boolean zimbraPasswordLocked) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLocked, zimbraPasswordLocked ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user is unable to change password
     *
     * @param zimbraPasswordLocked new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=45)
    public Map<String,Object> setPasswordLocked(boolean zimbraPasswordLocked, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLocked, zimbraPasswordLocked ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * user is unable to change password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=45)
    public void unsetPasswordLocked() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLocked, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user is unable to change password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=45)
    public Map<String,Object> unsetPasswordLocked(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLocked, "");
        return attrs;
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * <p>Use getPasswordLockoutDurationAsString to access value as a string.
     *
     * @see #getPasswordLockoutDurationAsString()
     *
     * @return zimbraPasswordLockoutDuration in millseconds, or 3600000 (1h)  if unset
     */
    @ZAttr(id=379)
    public long getPasswordLockoutDuration() {
        return getTimeInterval(Provisioning.A_zimbraPasswordLockoutDuration, 3600000L);
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * @return zimbraPasswordLockoutDuration, or "1h" if unset
     */
    @ZAttr(id=379)
    public String getPasswordLockoutDurationAsString() {
        return getAttr(Provisioning.A_zimbraPasswordLockoutDuration, "1h");
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * @param zimbraPasswordLockoutDuration new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=379)
    public void setPasswordLockoutDuration(String zimbraPasswordLockoutDuration) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutDuration, zimbraPasswordLockoutDuration);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * @param zimbraPasswordLockoutDuration new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=379)
    public Map<String,Object> setPasswordLockoutDuration(String zimbraPasswordLockoutDuration, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutDuration, zimbraPasswordLockoutDuration);
        return attrs;
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=379)
    public void unsetPasswordLockoutDuration() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutDuration, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * how long an account is locked out. Use 0 to lockout an account until
     * admin resets it
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=379)
    public Map<String,Object> unsetPasswordLockoutDuration(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutDuration, "");
        return attrs;
    }

    /**
     * whether or not account lockout is enabled.
     *
     * @return zimbraPasswordLockoutEnabled, or false if unset
     */
    @ZAttr(id=378)
    public boolean isPasswordLockoutEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPasswordLockoutEnabled, false);
    }

    /**
     * whether or not account lockout is enabled.
     *
     * @param zimbraPasswordLockoutEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=378)
    public void setPasswordLockoutEnabled(boolean zimbraPasswordLockoutEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutEnabled, zimbraPasswordLockoutEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not account lockout is enabled.
     *
     * @param zimbraPasswordLockoutEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=378)
    public Map<String,Object> setPasswordLockoutEnabled(boolean zimbraPasswordLockoutEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutEnabled, zimbraPasswordLockoutEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not account lockout is enabled.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=378)
    public void unsetPasswordLockoutEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not account lockout is enabled.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=378)
    public Map<String,Object> unsetPasswordLockoutEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutEnabled, "");
        return attrs;
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * <p>Use getPasswordLockoutFailureLifetimeAsString to access value as a string.
     *
     * @see #getPasswordLockoutFailureLifetimeAsString()
     *
     * @return zimbraPasswordLockoutFailureLifetime in millseconds, or 3600000 (1h)  if unset
     */
    @ZAttr(id=381)
    public long getPasswordLockoutFailureLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPasswordLockoutFailureLifetime, 3600000L);
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * @return zimbraPasswordLockoutFailureLifetime, or "1h" if unset
     */
    @ZAttr(id=381)
    public String getPasswordLockoutFailureLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPasswordLockoutFailureLifetime, "1h");
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * @param zimbraPasswordLockoutFailureLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=381)
    public void setPasswordLockoutFailureLifetime(String zimbraPasswordLockoutFailureLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutFailureLifetime, zimbraPasswordLockoutFailureLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * @param zimbraPasswordLockoutFailureLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=381)
    public Map<String,Object> setPasswordLockoutFailureLifetime(String zimbraPasswordLockoutFailureLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutFailureLifetime, zimbraPasswordLockoutFailureLifetime);
        return attrs;
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=381)
    public void unsetPasswordLockoutFailureLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutFailureLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * the duration after which old consecutive failed login attempts are
     * purged from the list, even though no successful authentication has
     * occurred
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=381)
    public Map<String,Object> unsetPasswordLockoutFailureLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutFailureLifetime, "");
        return attrs;
    }

    /**
     * number of consecutive failed login attempts until an account is locked
     * out
     *
     * @return zimbraPasswordLockoutMaxFailures, or 10 if unset
     */
    @ZAttr(id=380)
    public int getPasswordLockoutMaxFailures() {
        return getIntAttr(Provisioning.A_zimbraPasswordLockoutMaxFailures, 10);
    }

    /**
     * number of consecutive failed login attempts until an account is locked
     * out
     *
     * @param zimbraPasswordLockoutMaxFailures new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=380)
    public void setPasswordLockoutMaxFailures(int zimbraPasswordLockoutMaxFailures) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutMaxFailures, Integer.toString(zimbraPasswordLockoutMaxFailures));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of consecutive failed login attempts until an account is locked
     * out
     *
     * @param zimbraPasswordLockoutMaxFailures new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=380)
    public Map<String,Object> setPasswordLockoutMaxFailures(int zimbraPasswordLockoutMaxFailures, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutMaxFailures, Integer.toString(zimbraPasswordLockoutMaxFailures));
        return attrs;
    }

    /**
     * number of consecutive failed login attempts until an account is locked
     * out
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=380)
    public void unsetPasswordLockoutMaxFailures() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutMaxFailures, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of consecutive failed login attempts until an account is locked
     * out
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=380)
    public Map<String,Object> unsetPasswordLockoutMaxFailures(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordLockoutMaxFailures, "");
        return attrs;
    }

    /**
     * maximum days between password changes
     *
     * @return zimbraPasswordMaxAge, or 0 if unset
     */
    @ZAttr(id=36)
    public int getPasswordMaxAge() {
        return getIntAttr(Provisioning.A_zimbraPasswordMaxAge, 0);
    }

    /**
     * maximum days between password changes
     *
     * @param zimbraPasswordMaxAge new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=36)
    public void setPasswordMaxAge(int zimbraPasswordMaxAge) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxAge, Integer.toString(zimbraPasswordMaxAge));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum days between password changes
     *
     * @param zimbraPasswordMaxAge new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=36)
    public Map<String,Object> setPasswordMaxAge(int zimbraPasswordMaxAge, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxAge, Integer.toString(zimbraPasswordMaxAge));
        return attrs;
    }

    /**
     * maximum days between password changes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=36)
    public void unsetPasswordMaxAge() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxAge, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum days between password changes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=36)
    public Map<String,Object> unsetPasswordMaxAge(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxAge, "");
        return attrs;
    }

    /**
     * max length of a password
     *
     * @return zimbraPasswordMaxLength, or 64 if unset
     */
    @ZAttr(id=34)
    public int getPasswordMaxLength() {
        return getIntAttr(Provisioning.A_zimbraPasswordMaxLength, 64);
    }

    /**
     * max length of a password
     *
     * @param zimbraPasswordMaxLength new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=34)
    public void setPasswordMaxLength(int zimbraPasswordMaxLength) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxLength, Integer.toString(zimbraPasswordMaxLength));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * max length of a password
     *
     * @param zimbraPasswordMaxLength new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=34)
    public Map<String,Object> setPasswordMaxLength(int zimbraPasswordMaxLength, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxLength, Integer.toString(zimbraPasswordMaxLength));
        return attrs;
    }

    /**
     * max length of a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=34)
    public void unsetPasswordMaxLength() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxLength, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * max length of a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=34)
    public Map<String,Object> unsetPasswordMaxLength(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMaxLength, "");
        return attrs;
    }

    /**
     * minimum days between password changes
     *
     * @return zimbraPasswordMinAge, or 0 if unset
     */
    @ZAttr(id=35)
    public int getPasswordMinAge() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinAge, 0);
    }

    /**
     * minimum days between password changes
     *
     * @param zimbraPasswordMinAge new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=35)
    public void setPasswordMinAge(int zimbraPasswordMinAge) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinAge, Integer.toString(zimbraPasswordMinAge));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum days between password changes
     *
     * @param zimbraPasswordMinAge new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=35)
    public Map<String,Object> setPasswordMinAge(int zimbraPasswordMinAge, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinAge, Integer.toString(zimbraPasswordMinAge));
        return attrs;
    }

    /**
     * minimum days between password changes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=35)
    public void unsetPasswordMinAge() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinAge, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum days between password changes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=35)
    public Map<String,Object> unsetPasswordMinAge(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinAge, "");
        return attrs;
    }

    /**
     * minimum length of a password
     *
     * @return zimbraPasswordMinLength, or 6 if unset
     */
    @ZAttr(id=33)
    public int getPasswordMinLength() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinLength, 6);
    }

    /**
     * minimum length of a password
     *
     * @param zimbraPasswordMinLength new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=33)
    public void setPasswordMinLength(int zimbraPasswordMinLength) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLength, Integer.toString(zimbraPasswordMinLength));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum length of a password
     *
     * @param zimbraPasswordMinLength new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=33)
    public Map<String,Object> setPasswordMinLength(int zimbraPasswordMinLength, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLength, Integer.toString(zimbraPasswordMinLength));
        return attrs;
    }

    /**
     * minimum length of a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=33)
    public void unsetPasswordMinLength() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLength, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum length of a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=33)
    public Map<String,Object> unsetPasswordMinLength(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLength, "");
        return attrs;
    }

    /**
     * minimum number of lower case characters required in a password
     *
     * @return zimbraPasswordMinLowerCaseChars, or 0 if unset
     */
    @ZAttr(id=390)
    public int getPasswordMinLowerCaseChars() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinLowerCaseChars, 0);
    }

    /**
     * minimum number of lower case characters required in a password
     *
     * @param zimbraPasswordMinLowerCaseChars new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=390)
    public void setPasswordMinLowerCaseChars(int zimbraPasswordMinLowerCaseChars) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLowerCaseChars, Integer.toString(zimbraPasswordMinLowerCaseChars));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of lower case characters required in a password
     *
     * @param zimbraPasswordMinLowerCaseChars new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=390)
    public Map<String,Object> setPasswordMinLowerCaseChars(int zimbraPasswordMinLowerCaseChars, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLowerCaseChars, Integer.toString(zimbraPasswordMinLowerCaseChars));
        return attrs;
    }

    /**
     * minimum number of lower case characters required in a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=390)
    public void unsetPasswordMinLowerCaseChars() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLowerCaseChars, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of lower case characters required in a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=390)
    public Map<String,Object> unsetPasswordMinLowerCaseChars(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinLowerCaseChars, "");
        return attrs;
    }

    /**
     * minimum number of numeric characters required in a password
     *
     * @return zimbraPasswordMinNumericChars, or 0 if unset
     */
    @ZAttr(id=392)
    public int getPasswordMinNumericChars() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinNumericChars, 0);
    }

    /**
     * minimum number of numeric characters required in a password
     *
     * @param zimbraPasswordMinNumericChars new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=392)
    public void setPasswordMinNumericChars(int zimbraPasswordMinNumericChars) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinNumericChars, Integer.toString(zimbraPasswordMinNumericChars));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of numeric characters required in a password
     *
     * @param zimbraPasswordMinNumericChars new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=392)
    public Map<String,Object> setPasswordMinNumericChars(int zimbraPasswordMinNumericChars, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinNumericChars, Integer.toString(zimbraPasswordMinNumericChars));
        return attrs;
    }

    /**
     * minimum number of numeric characters required in a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=392)
    public void unsetPasswordMinNumericChars() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinNumericChars, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of numeric characters required in a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=392)
    public Map<String,Object> unsetPasswordMinNumericChars(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinNumericChars, "");
        return attrs;
    }

    /**
     * minimum number of ascii punctuation characters required in a password
     *
     * @return zimbraPasswordMinPunctuationChars, or 0 if unset
     */
    @ZAttr(id=391)
    public int getPasswordMinPunctuationChars() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinPunctuationChars, 0);
    }

    /**
     * minimum number of ascii punctuation characters required in a password
     *
     * @param zimbraPasswordMinPunctuationChars new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=391)
    public void setPasswordMinPunctuationChars(int zimbraPasswordMinPunctuationChars) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinPunctuationChars, Integer.toString(zimbraPasswordMinPunctuationChars));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of ascii punctuation characters required in a password
     *
     * @param zimbraPasswordMinPunctuationChars new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=391)
    public Map<String,Object> setPasswordMinPunctuationChars(int zimbraPasswordMinPunctuationChars, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinPunctuationChars, Integer.toString(zimbraPasswordMinPunctuationChars));
        return attrs;
    }

    /**
     * minimum number of ascii punctuation characters required in a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=391)
    public void unsetPasswordMinPunctuationChars() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinPunctuationChars, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of ascii punctuation characters required in a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=391)
    public Map<String,Object> unsetPasswordMinPunctuationChars(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinPunctuationChars, "");
        return attrs;
    }

    /**
     * minimum number of upper case characters required in a password
     *
     * @return zimbraPasswordMinUpperCaseChars, or 0 if unset
     */
    @ZAttr(id=389)
    public int getPasswordMinUpperCaseChars() {
        return getIntAttr(Provisioning.A_zimbraPasswordMinUpperCaseChars, 0);
    }

    /**
     * minimum number of upper case characters required in a password
     *
     * @param zimbraPasswordMinUpperCaseChars new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=389)
    public void setPasswordMinUpperCaseChars(int zimbraPasswordMinUpperCaseChars) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinUpperCaseChars, Integer.toString(zimbraPasswordMinUpperCaseChars));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of upper case characters required in a password
     *
     * @param zimbraPasswordMinUpperCaseChars new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=389)
    public Map<String,Object> setPasswordMinUpperCaseChars(int zimbraPasswordMinUpperCaseChars, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinUpperCaseChars, Integer.toString(zimbraPasswordMinUpperCaseChars));
        return attrs;
    }

    /**
     * minimum number of upper case characters required in a password
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=389)
    public void unsetPasswordMinUpperCaseChars() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinUpperCaseChars, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of upper case characters required in a password
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=389)
    public Map<String,Object> unsetPasswordMinUpperCaseChars(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPasswordMinUpperCaseChars, "");
        return attrs;
    }

    /**
     * whether POP3 is enabled for an account
     *
     * @return zimbraPop3Enabled, or true if unset
     */
    @ZAttr(id=175)
    public boolean isPop3Enabled() {
        return getBooleanAttr(Provisioning.A_zimbraPop3Enabled, true);
    }

    /**
     * whether POP3 is enabled for an account
     *
     * @param zimbraPop3Enabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=175)
    public void setPop3Enabled(boolean zimbraPop3Enabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPop3Enabled, zimbraPop3Enabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether POP3 is enabled for an account
     *
     * @param zimbraPop3Enabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=175)
    public Map<String,Object> setPop3Enabled(boolean zimbraPop3Enabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPop3Enabled, zimbraPop3Enabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether POP3 is enabled for an account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=175)
    public void unsetPop3Enabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPop3Enabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether POP3 is enabled for an account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=175)
    public Map<String,Object> unsetPop3Enabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPop3Enabled, "");
        return attrs;
    }

    /**
     * portal name
     *
     * @return zimbraPortalName, or "example" if unset
     */
    @ZAttr(id=448)
    public String getPortalName() {
        return getAttr(Provisioning.A_zimbraPortalName, "example");
    }

    /**
     * portal name
     *
     * @param zimbraPortalName new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=448)
    public void setPortalName(String zimbraPortalName) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPortalName, zimbraPortalName);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * portal name
     *
     * @param zimbraPortalName new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=448)
    public Map<String,Object> setPortalName(String zimbraPortalName, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPortalName, zimbraPortalName);
        return attrs;
    }

    /**
     * portal name
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=448)
    public void unsetPortalName() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPortalName, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * portal name
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=448)
    public Map<String,Object> unsetPortalName(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPortalName, "");
        return attrs;
    }

    /**
     * After login, whether the advanced client should enforce minimum
     * display resolution
     *
     * @return zimbraPrefAdvancedClientEnforceMinDisplay, or true if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=678)
    public boolean isPrefAdvancedClientEnforceMinDisplay() {
        return getBooleanAttr(Provisioning.A_zimbraPrefAdvancedClientEnforceMinDisplay, true);
    }

    /**
     * After login, whether the advanced client should enforce minimum
     * display resolution
     *
     * @param zimbraPrefAdvancedClientEnforceMinDisplay new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=678)
    public void setPrefAdvancedClientEnforceMinDisplay(boolean zimbraPrefAdvancedClientEnforceMinDisplay) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAdvancedClientEnforceMinDisplay, zimbraPrefAdvancedClientEnforceMinDisplay ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * After login, whether the advanced client should enforce minimum
     * display resolution
     *
     * @param zimbraPrefAdvancedClientEnforceMinDisplay new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=678)
    public Map<String,Object> setPrefAdvancedClientEnforceMinDisplay(boolean zimbraPrefAdvancedClientEnforceMinDisplay, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAdvancedClientEnforceMinDisplay, zimbraPrefAdvancedClientEnforceMinDisplay ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * After login, whether the advanced client should enforce minimum
     * display resolution
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=678)
    public void unsetPrefAdvancedClientEnforceMinDisplay() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAdvancedClientEnforceMinDisplay, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * After login, whether the advanced client should enforce minimum
     * display resolution
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=678)
    public Map<String,Object> unsetPrefAdvancedClientEnforceMinDisplay(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAdvancedClientEnforceMinDisplay, "");
        return attrs;
    }

    /**
     * whether or not new address in outgoing email are auto added to address
     * book
     *
     * @return zimbraPrefAutoAddAddressEnabled, or true if unset
     */
    @ZAttr(id=131)
    public boolean isPrefAutoAddAddressEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefAutoAddAddressEnabled, true);
    }

    /**
     * whether or not new address in outgoing email are auto added to address
     * book
     *
     * @param zimbraPrefAutoAddAddressEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=131)
    public void setPrefAutoAddAddressEnabled(boolean zimbraPrefAutoAddAddressEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoAddAddressEnabled, zimbraPrefAutoAddAddressEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not new address in outgoing email are auto added to address
     * book
     *
     * @param zimbraPrefAutoAddAddressEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=131)
    public Map<String,Object> setPrefAutoAddAddressEnabled(boolean zimbraPrefAutoAddAddressEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoAddAddressEnabled, zimbraPrefAutoAddAddressEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not new address in outgoing email are auto added to address
     * book
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=131)
    public void unsetPrefAutoAddAddressEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoAddAddressEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not new address in outgoing email are auto added to address
     * book
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=131)
    public Map<String,Object> unsetPrefAutoAddAddressEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoAddAddressEnabled, "");
        return attrs;
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * <p>Use getPrefAutoSaveDraftIntervalAsString to access value as a string.
     *
     * @see #getPrefAutoSaveDraftIntervalAsString()
     *
     * @return zimbraPrefAutoSaveDraftInterval in millseconds, or 30000 (30s)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public long getPrefAutoSaveDraftInterval() {
        return getTimeInterval(Provisioning.A_zimbraPrefAutoSaveDraftInterval, 30000L);
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * @return zimbraPrefAutoSaveDraftInterval, or "30s" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public String getPrefAutoSaveDraftIntervalAsString() {
        return getAttr(Provisioning.A_zimbraPrefAutoSaveDraftInterval, "30s");
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * @param zimbraPrefAutoSaveDraftInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public void setPrefAutoSaveDraftInterval(String zimbraPrefAutoSaveDraftInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoSaveDraftInterval, zimbraPrefAutoSaveDraftInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * @param zimbraPrefAutoSaveDraftInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public Map<String,Object> setPrefAutoSaveDraftInterval(String zimbraPrefAutoSaveDraftInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoSaveDraftInterval, zimbraPrefAutoSaveDraftInterval);
        return attrs;
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public void unsetPrefAutoSaveDraftInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoSaveDraftInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time to wait before auto saving a draft(nnnnn[hmsd])
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=561)
    public Map<String,Object> unsetPrefAutoSaveDraftInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefAutoSaveDraftInterval, "");
        return attrs;
    }

    /**
     * whether to allow a cancel email sent to organizer of appointment
     *
     * @return zimbraPrefCalendarAllowCancelEmailToSelf, or false if unset
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=702)
    public boolean isPrefCalendarAllowCancelEmailToSelf() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarAllowCancelEmailToSelf, false);
    }

    /**
     * whether to allow a cancel email sent to organizer of appointment
     *
     * @param zimbraPrefCalendarAllowCancelEmailToSelf new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=702)
    public void setPrefCalendarAllowCancelEmailToSelf(boolean zimbraPrefCalendarAllowCancelEmailToSelf) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowCancelEmailToSelf, zimbraPrefCalendarAllowCancelEmailToSelf ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow a cancel email sent to organizer of appointment
     *
     * @param zimbraPrefCalendarAllowCancelEmailToSelf new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=702)
    public Map<String,Object> setPrefCalendarAllowCancelEmailToSelf(boolean zimbraPrefCalendarAllowCancelEmailToSelf, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowCancelEmailToSelf, zimbraPrefCalendarAllowCancelEmailToSelf ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to allow a cancel email sent to organizer of appointment
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=702)
    public void unsetPrefCalendarAllowCancelEmailToSelf() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowCancelEmailToSelf, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to allow a cancel email sent to organizer of appointment
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=702)
    public Map<String,Object> unsetPrefCalendarAllowCancelEmailToSelf(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowCancelEmailToSelf, "");
        return attrs;
    }

    /**
     * whether calendar invite part in a forwarded email is auto-added to
     * calendar
     *
     * @return zimbraPrefCalendarAllowForwardedInvite, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=686)
    public boolean isPrefCalendarAllowForwardedInvite() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarAllowForwardedInvite, true);
    }

    /**
     * whether calendar invite part in a forwarded email is auto-added to
     * calendar
     *
     * @param zimbraPrefCalendarAllowForwardedInvite new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=686)
    public void setPrefCalendarAllowForwardedInvite(boolean zimbraPrefCalendarAllowForwardedInvite) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowForwardedInvite, zimbraPrefCalendarAllowForwardedInvite ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether calendar invite part in a forwarded email is auto-added to
     * calendar
     *
     * @param zimbraPrefCalendarAllowForwardedInvite new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=686)
    public Map<String,Object> setPrefCalendarAllowForwardedInvite(boolean zimbraPrefCalendarAllowForwardedInvite, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowForwardedInvite, zimbraPrefCalendarAllowForwardedInvite ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether calendar invite part in a forwarded email is auto-added to
     * calendar
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=686)
    public void unsetPrefCalendarAllowForwardedInvite() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowForwardedInvite, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether calendar invite part in a forwarded email is auto-added to
     * calendar
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=686)
    public Map<String,Object> unsetPrefCalendarAllowForwardedInvite(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowForwardedInvite, "");
        return attrs;
    }

    /**
     * whether calendar invite part with PUBLISH method is auto-added to
     * calendar
     *
     * @return zimbraPrefCalendarAllowPublishMethodInvite, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=688)
    public boolean isPrefCalendarAllowPublishMethodInvite() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarAllowPublishMethodInvite, false);
    }

    /**
     * whether calendar invite part with PUBLISH method is auto-added to
     * calendar
     *
     * @param zimbraPrefCalendarAllowPublishMethodInvite new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=688)
    public void setPrefCalendarAllowPublishMethodInvite(boolean zimbraPrefCalendarAllowPublishMethodInvite) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowPublishMethodInvite, zimbraPrefCalendarAllowPublishMethodInvite ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether calendar invite part with PUBLISH method is auto-added to
     * calendar
     *
     * @param zimbraPrefCalendarAllowPublishMethodInvite new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=688)
    public Map<String,Object> setPrefCalendarAllowPublishMethodInvite(boolean zimbraPrefCalendarAllowPublishMethodInvite, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowPublishMethodInvite, zimbraPrefCalendarAllowPublishMethodInvite ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether calendar invite part with PUBLISH method is auto-added to
     * calendar
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=688)
    public void unsetPrefCalendarAllowPublishMethodInvite() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowPublishMethodInvite, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether calendar invite part with PUBLISH method is auto-added to
     * calendar
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=688)
    public Map<String,Object> unsetPrefCalendarAllowPublishMethodInvite(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAllowPublishMethodInvite, "");
        return attrs;
    }

    /**
     * always show the mini calendar
     *
     * @return zimbraPrefCalendarAlwaysShowMiniCal, or true if unset
     */
    @ZAttr(id=276)
    public boolean isPrefCalendarAlwaysShowMiniCal() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarAlwaysShowMiniCal, true);
    }

    /**
     * always show the mini calendar
     *
     * @param zimbraPrefCalendarAlwaysShowMiniCal new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=276)
    public void setPrefCalendarAlwaysShowMiniCal(boolean zimbraPrefCalendarAlwaysShowMiniCal) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAlwaysShowMiniCal, zimbraPrefCalendarAlwaysShowMiniCal ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * always show the mini calendar
     *
     * @param zimbraPrefCalendarAlwaysShowMiniCal new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=276)
    public Map<String,Object> setPrefCalendarAlwaysShowMiniCal(boolean zimbraPrefCalendarAlwaysShowMiniCal, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAlwaysShowMiniCal, zimbraPrefCalendarAlwaysShowMiniCal ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * always show the mini calendar
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=276)
    public void unsetPrefCalendarAlwaysShowMiniCal() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAlwaysShowMiniCal, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * always show the mini calendar
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=276)
    public Map<String,Object> unsetPrefCalendarAlwaysShowMiniCal(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarAlwaysShowMiniCal, "");
        return attrs;
    }

    /**
     * number of minutes (0 = never) before appt to show reminder dialog
     *
     * @return zimbraPrefCalendarApptReminderWarningTime, or 5 if unset
     */
    @ZAttr(id=341)
    public int getPrefCalendarApptReminderWarningTime() {
        return getIntAttr(Provisioning.A_zimbraPrefCalendarApptReminderWarningTime, 5);
    }

    /**
     * number of minutes (0 = never) before appt to show reminder dialog
     *
     * @param zimbraPrefCalendarApptReminderWarningTime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=341)
    public void setPrefCalendarApptReminderWarningTime(int zimbraPrefCalendarApptReminderWarningTime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptReminderWarningTime, Integer.toString(zimbraPrefCalendarApptReminderWarningTime));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of minutes (0 = never) before appt to show reminder dialog
     *
     * @param zimbraPrefCalendarApptReminderWarningTime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=341)
    public Map<String,Object> setPrefCalendarApptReminderWarningTime(int zimbraPrefCalendarApptReminderWarningTime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptReminderWarningTime, Integer.toString(zimbraPrefCalendarApptReminderWarningTime));
        return attrs;
    }

    /**
     * number of minutes (0 = never) before appt to show reminder dialog
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=341)
    public void unsetPrefCalendarApptReminderWarningTime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptReminderWarningTime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of minutes (0 = never) before appt to show reminder dialog
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=341)
    public Map<String,Object> unsetPrefCalendarApptReminderWarningTime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptReminderWarningTime, "");
        return attrs;
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @return zimbraPrefCalendarApptVisibility, or ZAttrProvisioning.PrefCalendarApptVisibility._public if unset and/or has invalid value
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public ZAttrProvisioning.PrefCalendarApptVisibility getPrefCalendarApptVisibility() {
        try { String v = getAttr(Provisioning.A_zimbraPrefCalendarApptVisibility); return v == null ? ZAttrProvisioning.PrefCalendarApptVisibility._public : ZAttrProvisioning.PrefCalendarApptVisibility.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefCalendarApptVisibility._public; }
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @return zimbraPrefCalendarApptVisibility, or "public" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public String getPrefCalendarApptVisibilityAsString() {
        return getAttr(Provisioning.A_zimbraPrefCalendarApptVisibility, "public");
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @param zimbraPrefCalendarApptVisibility new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public void setPrefCalendarApptVisibility(ZAttrProvisioning.PrefCalendarApptVisibility zimbraPrefCalendarApptVisibility) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, zimbraPrefCalendarApptVisibility.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @param zimbraPrefCalendarApptVisibility new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public Map<String,Object> setPrefCalendarApptVisibility(ZAttrProvisioning.PrefCalendarApptVisibility zimbraPrefCalendarApptVisibility, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, zimbraPrefCalendarApptVisibility.toString());
        return attrs;
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @param zimbraPrefCalendarApptVisibility new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public void setPrefCalendarApptVisibilityAsString(String zimbraPrefCalendarApptVisibility) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, zimbraPrefCalendarApptVisibility);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @param zimbraPrefCalendarApptVisibility new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public Map<String,Object> setPrefCalendarApptVisibilityAsString(String zimbraPrefCalendarApptVisibility, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, zimbraPrefCalendarApptVisibility);
        return attrs;
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public void unsetPrefCalendarApptVisibility() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default visibility of the appointment when starting a new appointment
     * in the UI
     *
     * <p>Valid values: [public, private]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=832)
    public Map<String,Object> unsetPrefCalendarApptVisibility(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarApptVisibility, "");
        return attrs;
    }

    /**
     * hour of day that the day view should end at, non-inclusive (16=4pm, 24
     * = midnight, etc)
     *
     * @return zimbraPrefCalendarDayHourEnd, or 18 if unset
     */
    @ZAttr(id=440)
    public int getPrefCalendarDayHourEnd() {
        return getIntAttr(Provisioning.A_zimbraPrefCalendarDayHourEnd, 18);
    }

    /**
     * hour of day that the day view should end at, non-inclusive (16=4pm, 24
     * = midnight, etc)
     *
     * @param zimbraPrefCalendarDayHourEnd new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=440)
    public void setPrefCalendarDayHourEnd(int zimbraPrefCalendarDayHourEnd) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourEnd, Integer.toString(zimbraPrefCalendarDayHourEnd));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * hour of day that the day view should end at, non-inclusive (16=4pm, 24
     * = midnight, etc)
     *
     * @param zimbraPrefCalendarDayHourEnd new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=440)
    public Map<String,Object> setPrefCalendarDayHourEnd(int zimbraPrefCalendarDayHourEnd, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourEnd, Integer.toString(zimbraPrefCalendarDayHourEnd));
        return attrs;
    }

    /**
     * hour of day that the day view should end at, non-inclusive (16=4pm, 24
     * = midnight, etc)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=440)
    public void unsetPrefCalendarDayHourEnd() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourEnd, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * hour of day that the day view should end at, non-inclusive (16=4pm, 24
     * = midnight, etc)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=440)
    public Map<String,Object> unsetPrefCalendarDayHourEnd(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourEnd, "");
        return attrs;
    }

    /**
     * hour of day that the day view should start at (1=1 AM, 8=8 AM, etc)
     *
     * @return zimbraPrefCalendarDayHourStart, or 8 if unset
     */
    @ZAttr(id=439)
    public int getPrefCalendarDayHourStart() {
        return getIntAttr(Provisioning.A_zimbraPrefCalendarDayHourStart, 8);
    }

    /**
     * hour of day that the day view should start at (1=1 AM, 8=8 AM, etc)
     *
     * @param zimbraPrefCalendarDayHourStart new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=439)
    public void setPrefCalendarDayHourStart(int zimbraPrefCalendarDayHourStart) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourStart, Integer.toString(zimbraPrefCalendarDayHourStart));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * hour of day that the day view should start at (1=1 AM, 8=8 AM, etc)
     *
     * @param zimbraPrefCalendarDayHourStart new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=439)
    public Map<String,Object> setPrefCalendarDayHourStart(int zimbraPrefCalendarDayHourStart, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourStart, Integer.toString(zimbraPrefCalendarDayHourStart));
        return attrs;
    }

    /**
     * hour of day that the day view should start at (1=1 AM, 8=8 AM, etc)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=439)
    public void unsetPrefCalendarDayHourStart() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourStart, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * hour of day that the day view should start at (1=1 AM, 8=8 AM, etc)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=439)
    public Map<String,Object> unsetPrefCalendarDayHourStart(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarDayHourStart, "");
        return attrs;
    }

    /**
     * first day of week to show in calendar (0=sunday, 6=saturday)
     *
     * @return zimbraPrefCalendarFirstDayOfWeek, or 0 if unset
     */
    @ZAttr(id=261)
    public int getPrefCalendarFirstDayOfWeek() {
        return getIntAttr(Provisioning.A_zimbraPrefCalendarFirstDayOfWeek, 0);
    }

    /**
     * first day of week to show in calendar (0=sunday, 6=saturday)
     *
     * @param zimbraPrefCalendarFirstDayOfWeek new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=261)
    public void setPrefCalendarFirstDayOfWeek(int zimbraPrefCalendarFirstDayOfWeek) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarFirstDayOfWeek, Integer.toString(zimbraPrefCalendarFirstDayOfWeek));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * first day of week to show in calendar (0=sunday, 6=saturday)
     *
     * @param zimbraPrefCalendarFirstDayOfWeek new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=261)
    public Map<String,Object> setPrefCalendarFirstDayOfWeek(int zimbraPrefCalendarFirstDayOfWeek, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarFirstDayOfWeek, Integer.toString(zimbraPrefCalendarFirstDayOfWeek));
        return attrs;
    }

    /**
     * first day of week to show in calendar (0=sunday, 6=saturday)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=261)
    public void unsetPrefCalendarFirstDayOfWeek() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarFirstDayOfWeek, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * first day of week to show in calendar (0=sunday, 6=saturday)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=261)
    public Map<String,Object> unsetPrefCalendarFirstDayOfWeek(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarFirstDayOfWeek, "");
        return attrs;
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @return zimbraPrefCalendarInitialView, or ZAttrProvisioning.PrefCalendarInitialView.workWeek if unset and/or has invalid value
     */
    @ZAttr(id=240)
    public ZAttrProvisioning.PrefCalendarInitialView getPrefCalendarInitialView() {
        try { String v = getAttr(Provisioning.A_zimbraPrefCalendarInitialView); return v == null ? ZAttrProvisioning.PrefCalendarInitialView.workWeek : ZAttrProvisioning.PrefCalendarInitialView.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefCalendarInitialView.workWeek; }
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @return zimbraPrefCalendarInitialView, or "workWeek" if unset
     */
    @ZAttr(id=240)
    public String getPrefCalendarInitialViewAsString() {
        return getAttr(Provisioning.A_zimbraPrefCalendarInitialView, "workWeek");
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @param zimbraPrefCalendarInitialView new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=240)
    public void setPrefCalendarInitialView(ZAttrProvisioning.PrefCalendarInitialView zimbraPrefCalendarInitialView) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, zimbraPrefCalendarInitialView.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @param zimbraPrefCalendarInitialView new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=240)
    public Map<String,Object> setPrefCalendarInitialView(ZAttrProvisioning.PrefCalendarInitialView zimbraPrefCalendarInitialView, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, zimbraPrefCalendarInitialView.toString());
        return attrs;
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @param zimbraPrefCalendarInitialView new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=240)
    public void setPrefCalendarInitialViewAsString(String zimbraPrefCalendarInitialView) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, zimbraPrefCalendarInitialView);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @param zimbraPrefCalendarInitialView new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=240)
    public Map<String,Object> setPrefCalendarInitialViewAsString(String zimbraPrefCalendarInitialView, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, zimbraPrefCalendarInitialView);
        return attrs;
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=240)
    public void unsetPrefCalendarInitialView() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial calendar view to use
     *
     * <p>Valid values: [list, month, schedule, day, workWeek, week]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=240)
    public Map<String,Object> unsetPrefCalendarInitialView(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarInitialView, "");
        return attrs;
    }

    /**
     * If set to true, user is notified by email of changes made to her
     * calendar by others via delegated calendar access.
     *
     * @return zimbraPrefCalendarNotifyDelegatedChanges, or false if unset
     */
    @ZAttr(id=273)
    public boolean isPrefCalendarNotifyDelegatedChanges() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarNotifyDelegatedChanges, false);
    }

    /**
     * If set to true, user is notified by email of changes made to her
     * calendar by others via delegated calendar access.
     *
     * @param zimbraPrefCalendarNotifyDelegatedChanges new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=273)
    public void setPrefCalendarNotifyDelegatedChanges(boolean zimbraPrefCalendarNotifyDelegatedChanges) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarNotifyDelegatedChanges, zimbraPrefCalendarNotifyDelegatedChanges ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If set to true, user is notified by email of changes made to her
     * calendar by others via delegated calendar access.
     *
     * @param zimbraPrefCalendarNotifyDelegatedChanges new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=273)
    public Map<String,Object> setPrefCalendarNotifyDelegatedChanges(boolean zimbraPrefCalendarNotifyDelegatedChanges, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarNotifyDelegatedChanges, zimbraPrefCalendarNotifyDelegatedChanges ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * If set to true, user is notified by email of changes made to her
     * calendar by others via delegated calendar access.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=273)
    public void unsetPrefCalendarNotifyDelegatedChanges() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarNotifyDelegatedChanges, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If set to true, user is notified by email of changes made to her
     * calendar by others via delegated calendar access.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=273)
    public Map<String,Object> unsetPrefCalendarNotifyDelegatedChanges(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarNotifyDelegatedChanges, "");
        return attrs;
    }

    /**
     * When to send the first reminder for an event.
     *
     * @return zimbraPrefCalendarReminderDuration1, or "-PT15M" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=573)
    public String getPrefCalendarReminderDuration1() {
        return getAttr(Provisioning.A_zimbraPrefCalendarReminderDuration1, "-PT15M");
    }

    /**
     * When to send the first reminder for an event.
     *
     * @param zimbraPrefCalendarReminderDuration1 new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=573)
    public void setPrefCalendarReminderDuration1(String zimbraPrefCalendarReminderDuration1) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration1, zimbraPrefCalendarReminderDuration1);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When to send the first reminder for an event.
     *
     * @param zimbraPrefCalendarReminderDuration1 new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=573)
    public Map<String,Object> setPrefCalendarReminderDuration1(String zimbraPrefCalendarReminderDuration1, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration1, zimbraPrefCalendarReminderDuration1);
        return attrs;
    }

    /**
     * When to send the first reminder for an event.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=573)
    public void unsetPrefCalendarReminderDuration1() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration1, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When to send the first reminder for an event.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=573)
    public Map<String,Object> unsetPrefCalendarReminderDuration1(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration1, "");
        return attrs;
    }

    /**
     * When to send the second reminder for an event.
     *
     * @return zimbraPrefCalendarReminderDuration2, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=574)
    public String getPrefCalendarReminderDuration2() {
        return getAttr(Provisioning.A_zimbraPrefCalendarReminderDuration2, null);
    }

    /**
     * When to send the second reminder for an event.
     *
     * @param zimbraPrefCalendarReminderDuration2 new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=574)
    public void setPrefCalendarReminderDuration2(String zimbraPrefCalendarReminderDuration2) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration2, zimbraPrefCalendarReminderDuration2);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When to send the second reminder for an event.
     *
     * @param zimbraPrefCalendarReminderDuration2 new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=574)
    public Map<String,Object> setPrefCalendarReminderDuration2(String zimbraPrefCalendarReminderDuration2, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration2, zimbraPrefCalendarReminderDuration2);
        return attrs;
    }

    /**
     * When to send the second reminder for an event.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=574)
    public void unsetPrefCalendarReminderDuration2() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration2, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When to send the second reminder for an event.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=574)
    public Map<String,Object> unsetPrefCalendarReminderDuration2(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderDuration2, "");
        return attrs;
    }

    /**
     * The email the reminder goes to.
     *
     * @return zimbraPrefCalendarReminderEmail, or null if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=575)
    public String getPrefCalendarReminderEmail() {
        return getAttr(Provisioning.A_zimbraPrefCalendarReminderEmail, null);
    }

    /**
     * The email the reminder goes to.
     *
     * @param zimbraPrefCalendarReminderEmail new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=575)
    public void setPrefCalendarReminderEmail(String zimbraPrefCalendarReminderEmail) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderEmail, zimbraPrefCalendarReminderEmail);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The email the reminder goes to.
     *
     * @param zimbraPrefCalendarReminderEmail new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=575)
    public Map<String,Object> setPrefCalendarReminderEmail(String zimbraPrefCalendarReminderEmail, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderEmail, zimbraPrefCalendarReminderEmail);
        return attrs;
    }

    /**
     * The email the reminder goes to.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=575)
    public void unsetPrefCalendarReminderEmail() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderEmail, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The email the reminder goes to.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=575)
    public Map<String,Object> unsetPrefCalendarReminderEmail(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderEmail, "");
        return attrs;
    }

    /**
     * Flash title when on appointment remimnder notification
     *
     * @return zimbraPrefCalendarReminderFlashTitle, or true if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=682)
    public boolean isPrefCalendarReminderFlashTitle() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarReminderFlashTitle, true);
    }

    /**
     * Flash title when on appointment remimnder notification
     *
     * @param zimbraPrefCalendarReminderFlashTitle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=682)
    public void setPrefCalendarReminderFlashTitle(boolean zimbraPrefCalendarReminderFlashTitle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderFlashTitle, zimbraPrefCalendarReminderFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title when on appointment remimnder notification
     *
     * @param zimbraPrefCalendarReminderFlashTitle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=682)
    public Map<String,Object> setPrefCalendarReminderFlashTitle(boolean zimbraPrefCalendarReminderFlashTitle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderFlashTitle, zimbraPrefCalendarReminderFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Flash title when on appointment remimnder notification
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=682)
    public void unsetPrefCalendarReminderFlashTitle() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderFlashTitle, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title when on appointment remimnder notification
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=682)
    public Map<String,Object> unsetPrefCalendarReminderFlashTitle(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderFlashTitle, "");
        return attrs;
    }

    /**
     * The mobile device (phone) the reminder goes to.
     *
     * @return zimbraPrefCalendarReminderMobile, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=577)
    public boolean isPrefCalendarReminderMobile() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarReminderMobile, false);
    }

    /**
     * The mobile device (phone) the reminder goes to.
     *
     * @param zimbraPrefCalendarReminderMobile new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=577)
    public void setPrefCalendarReminderMobile(boolean zimbraPrefCalendarReminderMobile) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderMobile, zimbraPrefCalendarReminderMobile ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The mobile device (phone) the reminder goes to.
     *
     * @param zimbraPrefCalendarReminderMobile new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=577)
    public Map<String,Object> setPrefCalendarReminderMobile(boolean zimbraPrefCalendarReminderMobile, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderMobile, zimbraPrefCalendarReminderMobile ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * The mobile device (phone) the reminder goes to.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=577)
    public void unsetPrefCalendarReminderMobile() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderMobile, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The mobile device (phone) the reminder goes to.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=577)
    public Map<String,Object> unsetPrefCalendarReminderMobile(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderMobile, "");
        return attrs;
    }

    /**
     * To send email or to not send email is the question.
     *
     * @return zimbraPrefCalendarReminderSendEmail, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=576)
    public boolean isPrefCalendarReminderSendEmail() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarReminderSendEmail, false);
    }

    /**
     * To send email or to not send email is the question.
     *
     * @param zimbraPrefCalendarReminderSendEmail new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=576)
    public void setPrefCalendarReminderSendEmail(boolean zimbraPrefCalendarReminderSendEmail) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSendEmail, zimbraPrefCalendarReminderSendEmail ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * To send email or to not send email is the question.
     *
     * @param zimbraPrefCalendarReminderSendEmail new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=576)
    public Map<String,Object> setPrefCalendarReminderSendEmail(boolean zimbraPrefCalendarReminderSendEmail, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSendEmail, zimbraPrefCalendarReminderSendEmail ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * To send email or to not send email is the question.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=576)
    public void unsetPrefCalendarReminderSendEmail() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSendEmail, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * To send email or to not send email is the question.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=576)
    public Map<String,Object> unsetPrefCalendarReminderSendEmail(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSendEmail, "");
        return attrs;
    }

    /**
     * whether audible alert is enabled when appointment notification is
     * played
     *
     * @return zimbraPrefCalendarReminderSoundsEnabled, or true if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=667)
    public boolean isPrefCalendarReminderSoundsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarReminderSoundsEnabled, true);
    }

    /**
     * whether audible alert is enabled when appointment notification is
     * played
     *
     * @param zimbraPrefCalendarReminderSoundsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=667)
    public void setPrefCalendarReminderSoundsEnabled(boolean zimbraPrefCalendarReminderSoundsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSoundsEnabled, zimbraPrefCalendarReminderSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether audible alert is enabled when appointment notification is
     * played
     *
     * @param zimbraPrefCalendarReminderSoundsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=667)
    public Map<String,Object> setPrefCalendarReminderSoundsEnabled(boolean zimbraPrefCalendarReminderSoundsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSoundsEnabled, zimbraPrefCalendarReminderSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether audible alert is enabled when appointment notification is
     * played
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=667)
    public void unsetPrefCalendarReminderSoundsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSoundsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether audible alert is enabled when appointment notification is
     * played
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=667)
    public Map<String,Object> unsetPrefCalendarReminderSoundsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderSoundsEnabled, "");
        return attrs;
    }

    /**
     * Send a reminder via YIM
     *
     * @return zimbraPrefCalendarReminderYMessenger, or false if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=578)
    public boolean isPrefCalendarReminderYMessenger() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarReminderYMessenger, false);
    }

    /**
     * Send a reminder via YIM
     *
     * @param zimbraPrefCalendarReminderYMessenger new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=578)
    public void setPrefCalendarReminderYMessenger(boolean zimbraPrefCalendarReminderYMessenger) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderYMessenger, zimbraPrefCalendarReminderYMessenger ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Send a reminder via YIM
     *
     * @param zimbraPrefCalendarReminderYMessenger new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=578)
    public Map<String,Object> setPrefCalendarReminderYMessenger(boolean zimbraPrefCalendarReminderYMessenger, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderYMessenger, zimbraPrefCalendarReminderYMessenger ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Send a reminder via YIM
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=578)
    public void unsetPrefCalendarReminderYMessenger() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderYMessenger, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Send a reminder via YIM
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=578)
    public Map<String,Object> unsetPrefCalendarReminderYMessenger(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarReminderYMessenger, "");
        return attrs;
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @return zimbraPrefCalendarToasterEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=813)
    public boolean isPrefCalendarToasterEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarToasterEnabled, false);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param zimbraPrefCalendarToasterEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=813)
    public void setPrefCalendarToasterEnabled(boolean zimbraPrefCalendarToasterEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarToasterEnabled, zimbraPrefCalendarToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param zimbraPrefCalendarToasterEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=813)
    public Map<String,Object> setPrefCalendarToasterEnabled(boolean zimbraPrefCalendarToasterEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarToasterEnabled, zimbraPrefCalendarToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=813)
    public void unsetPrefCalendarToasterEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarToasterEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=813)
    public Map<String,Object> unsetPrefCalendarToasterEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarToasterEnabled, "");
        return attrs;
    }

    /**
     * whether or not use quick add dialog or go into full appt edit view
     *
     * @return zimbraPrefCalendarUseQuickAdd, or true if unset
     */
    @ZAttr(id=274)
    public boolean isPrefCalendarUseQuickAdd() {
        return getBooleanAttr(Provisioning.A_zimbraPrefCalendarUseQuickAdd, true);
    }

    /**
     * whether or not use quick add dialog or go into full appt edit view
     *
     * @param zimbraPrefCalendarUseQuickAdd new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=274)
    public void setPrefCalendarUseQuickAdd(boolean zimbraPrefCalendarUseQuickAdd) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarUseQuickAdd, zimbraPrefCalendarUseQuickAdd ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not use quick add dialog or go into full appt edit view
     *
     * @param zimbraPrefCalendarUseQuickAdd new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=274)
    public Map<String,Object> setPrefCalendarUseQuickAdd(boolean zimbraPrefCalendarUseQuickAdd, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarUseQuickAdd, zimbraPrefCalendarUseQuickAdd ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not use quick add dialog or go into full appt edit view
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=274)
    public void unsetPrefCalendarUseQuickAdd() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarUseQuickAdd, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not use quick add dialog or go into full appt edit view
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=274)
    public Map<String,Object> unsetPrefCalendarUseQuickAdd(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefCalendarUseQuickAdd, "");
        return attrs;
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @return zimbraPrefClientType, or ZAttrProvisioning.PrefClientType.advanced if unset and/or has invalid value
     */
    @ZAttr(id=453)
    public ZAttrProvisioning.PrefClientType getPrefClientType() {
        try { String v = getAttr(Provisioning.A_zimbraPrefClientType); return v == null ? ZAttrProvisioning.PrefClientType.advanced : ZAttrProvisioning.PrefClientType.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefClientType.advanced; }
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @return zimbraPrefClientType, or "advanced" if unset
     */
    @ZAttr(id=453)
    public String getPrefClientTypeAsString() {
        return getAttr(Provisioning.A_zimbraPrefClientType, "advanced");
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @param zimbraPrefClientType new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=453)
    public void setPrefClientType(ZAttrProvisioning.PrefClientType zimbraPrefClientType) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, zimbraPrefClientType.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @param zimbraPrefClientType new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=453)
    public Map<String,Object> setPrefClientType(ZAttrProvisioning.PrefClientType zimbraPrefClientType, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, zimbraPrefClientType.toString());
        return attrs;
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @param zimbraPrefClientType new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=453)
    public void setPrefClientTypeAsString(String zimbraPrefClientType) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, zimbraPrefClientType);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @param zimbraPrefClientType new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=453)
    public Map<String,Object> setPrefClientTypeAsString(String zimbraPrefClientType, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, zimbraPrefClientType);
        return attrs;
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=453)
    public void unsetPrefClientType() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user preference of client type
     *
     * <p>Valid values: [standard, advanced]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=453)
    public Map<String,Object> unsetPrefClientType(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefClientType, "");
        return attrs;
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @return zimbraPrefComposeFormat, or ZAttrProvisioning.PrefComposeFormat.text if unset and/or has invalid value
     */
    @ZAttr(id=217)
    public ZAttrProvisioning.PrefComposeFormat getPrefComposeFormat() {
        try { String v = getAttr(Provisioning.A_zimbraPrefComposeFormat); return v == null ? ZAttrProvisioning.PrefComposeFormat.text : ZAttrProvisioning.PrefComposeFormat.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefComposeFormat.text; }
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @return zimbraPrefComposeFormat, or "text" if unset
     */
    @ZAttr(id=217)
    public String getPrefComposeFormatAsString() {
        return getAttr(Provisioning.A_zimbraPrefComposeFormat, "text");
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @param zimbraPrefComposeFormat new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=217)
    public void setPrefComposeFormat(ZAttrProvisioning.PrefComposeFormat zimbraPrefComposeFormat) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, zimbraPrefComposeFormat.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @param zimbraPrefComposeFormat new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=217)
    public Map<String,Object> setPrefComposeFormat(ZAttrProvisioning.PrefComposeFormat zimbraPrefComposeFormat, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, zimbraPrefComposeFormat.toString());
        return attrs;
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @param zimbraPrefComposeFormat new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=217)
    public void setPrefComposeFormatAsString(String zimbraPrefComposeFormat) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, zimbraPrefComposeFormat);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @param zimbraPrefComposeFormat new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=217)
    public Map<String,Object> setPrefComposeFormatAsString(String zimbraPrefComposeFormat, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, zimbraPrefComposeFormat);
        return attrs;
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=217)
    public void unsetPrefComposeFormat() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to compose in html or text.
     *
     * <p>Valid values: [html, text]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=217)
    public Map<String,Object> unsetPrefComposeFormat(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeFormat, "");
        return attrs;
    }

    /**
     * whether or not compose messages in a new windows by default
     *
     * @return zimbraPrefComposeInNewWindow, or false if unset
     */
    @ZAttr(id=209)
    public boolean isPrefComposeInNewWindow() {
        return getBooleanAttr(Provisioning.A_zimbraPrefComposeInNewWindow, false);
    }

    /**
     * whether or not compose messages in a new windows by default
     *
     * @param zimbraPrefComposeInNewWindow new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=209)
    public void setPrefComposeInNewWindow(boolean zimbraPrefComposeInNewWindow) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeInNewWindow, zimbraPrefComposeInNewWindow ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not compose messages in a new windows by default
     *
     * @param zimbraPrefComposeInNewWindow new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=209)
    public Map<String,Object> setPrefComposeInNewWindow(boolean zimbraPrefComposeInNewWindow, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeInNewWindow, zimbraPrefComposeInNewWindow ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not compose messages in a new windows by default
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=209)
    public void unsetPrefComposeInNewWindow() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeInNewWindow, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not compose messages in a new windows by default
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=209)
    public Map<String,Object> unsetPrefComposeInNewWindow(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefComposeInNewWindow, "");
        return attrs;
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @return zimbraPrefContactsInitialView, or ZAttrProvisioning.PrefContactsInitialView.list if unset and/or has invalid value
     */
    @ZAttr(id=167)
    public ZAttrProvisioning.PrefContactsInitialView getPrefContactsInitialView() {
        try { String v = getAttr(Provisioning.A_zimbraPrefContactsInitialView); return v == null ? ZAttrProvisioning.PrefContactsInitialView.list : ZAttrProvisioning.PrefContactsInitialView.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefContactsInitialView.list; }
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @return zimbraPrefContactsInitialView, or "list" if unset
     */
    @ZAttr(id=167)
    public String getPrefContactsInitialViewAsString() {
        return getAttr(Provisioning.A_zimbraPrefContactsInitialView, "list");
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @param zimbraPrefContactsInitialView new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=167)
    public void setPrefContactsInitialView(ZAttrProvisioning.PrefContactsInitialView zimbraPrefContactsInitialView) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, zimbraPrefContactsInitialView.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @param zimbraPrefContactsInitialView new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=167)
    public Map<String,Object> setPrefContactsInitialView(ZAttrProvisioning.PrefContactsInitialView zimbraPrefContactsInitialView, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, zimbraPrefContactsInitialView.toString());
        return attrs;
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @param zimbraPrefContactsInitialView new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=167)
    public void setPrefContactsInitialViewAsString(String zimbraPrefContactsInitialView) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, zimbraPrefContactsInitialView);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @param zimbraPrefContactsInitialView new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=167)
    public Map<String,Object> setPrefContactsInitialViewAsString(String zimbraPrefContactsInitialView, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, zimbraPrefContactsInitialView);
        return attrs;
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=167)
    public void unsetPrefContactsInitialView() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial contact view to use
     *
     * <p>Valid values: [list, cards]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=167)
    public Map<String,Object> unsetPrefContactsInitialView(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsInitialView, "");
        return attrs;
    }

    /**
     * number of contacts per page
     *
     * @return zimbraPrefContactsPerPage, or 25 if unset
     */
    @ZAttr(id=148)
    public int getPrefContactsPerPage() {
        return getIntAttr(Provisioning.A_zimbraPrefContactsPerPage, 25);
    }

    /**
     * number of contacts per page
     *
     * @param zimbraPrefContactsPerPage new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=148)
    public void setPrefContactsPerPage(int zimbraPrefContactsPerPage) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsPerPage, Integer.toString(zimbraPrefContactsPerPage));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of contacts per page
     *
     * @param zimbraPrefContactsPerPage new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=148)
    public Map<String,Object> setPrefContactsPerPage(int zimbraPrefContactsPerPage, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsPerPage, Integer.toString(zimbraPrefContactsPerPage));
        return attrs;
    }

    /**
     * number of contacts per page
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=148)
    public void unsetPrefContactsPerPage() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsPerPage, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of contacts per page
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=148)
    public Map<String,Object> unsetPrefContactsPerPage(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefContactsPerPage, "");
        return attrs;
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @return zimbraPrefConversationOrder, or ZAttrProvisioning.PrefConversationOrder.dateDesc if unset and/or has invalid value
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public ZAttrProvisioning.PrefConversationOrder getPrefConversationOrder() {
        try { String v = getAttr(Provisioning.A_zimbraPrefConversationOrder); return v == null ? ZAttrProvisioning.PrefConversationOrder.dateDesc : ZAttrProvisioning.PrefConversationOrder.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefConversationOrder.dateDesc; }
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @return zimbraPrefConversationOrder, or "dateDesc" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public String getPrefConversationOrderAsString() {
        return getAttr(Provisioning.A_zimbraPrefConversationOrder, "dateDesc");
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @param zimbraPrefConversationOrder new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public void setPrefConversationOrder(ZAttrProvisioning.PrefConversationOrder zimbraPrefConversationOrder) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, zimbraPrefConversationOrder.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @param zimbraPrefConversationOrder new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public Map<String,Object> setPrefConversationOrder(ZAttrProvisioning.PrefConversationOrder zimbraPrefConversationOrder, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, zimbraPrefConversationOrder.toString());
        return attrs;
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @param zimbraPrefConversationOrder new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public void setPrefConversationOrderAsString(String zimbraPrefConversationOrder) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, zimbraPrefConversationOrder);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @param zimbraPrefConversationOrder new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public Map<String,Object> setPrefConversationOrderAsString(String zimbraPrefConversationOrder, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, zimbraPrefConversationOrder);
        return attrs;
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public void unsetPrefConversationOrder() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * order of messages displayed within a conversation
     *
     * <p>Valid values: [dateDesc, dateAsc]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=818)
    public Map<String,Object> unsetPrefConversationOrder(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefConversationOrder, "");
        return attrs;
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @return zimbraPrefDedupeMessagesSentToSelf, or ZAttrProvisioning.PrefDedupeMessagesSentToSelf.dedupeNone if unset and/or has invalid value
     */
    @ZAttr(id=144)
    public ZAttrProvisioning.PrefDedupeMessagesSentToSelf getPrefDedupeMessagesSentToSelf() {
        try { String v = getAttr(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf); return v == null ? ZAttrProvisioning.PrefDedupeMessagesSentToSelf.dedupeNone : ZAttrProvisioning.PrefDedupeMessagesSentToSelf.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefDedupeMessagesSentToSelf.dedupeNone; }
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @return zimbraPrefDedupeMessagesSentToSelf, or "dedupeNone" if unset
     */
    @ZAttr(id=144)
    public String getPrefDedupeMessagesSentToSelfAsString() {
        return getAttr(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, "dedupeNone");
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @param zimbraPrefDedupeMessagesSentToSelf new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=144)
    public void setPrefDedupeMessagesSentToSelf(ZAttrProvisioning.PrefDedupeMessagesSentToSelf zimbraPrefDedupeMessagesSentToSelf) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, zimbraPrefDedupeMessagesSentToSelf.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @param zimbraPrefDedupeMessagesSentToSelf new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=144)
    public Map<String,Object> setPrefDedupeMessagesSentToSelf(ZAttrProvisioning.PrefDedupeMessagesSentToSelf zimbraPrefDedupeMessagesSentToSelf, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, zimbraPrefDedupeMessagesSentToSelf.toString());
        return attrs;
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @param zimbraPrefDedupeMessagesSentToSelf new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=144)
    public void setPrefDedupeMessagesSentToSelfAsString(String zimbraPrefDedupeMessagesSentToSelf) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, zimbraPrefDedupeMessagesSentToSelf);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @param zimbraPrefDedupeMessagesSentToSelf new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=144)
    public Map<String,Object> setPrefDedupeMessagesSentToSelfAsString(String zimbraPrefDedupeMessagesSentToSelf, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, zimbraPrefDedupeMessagesSentToSelf);
        return attrs;
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=144)
    public void unsetPrefDedupeMessagesSentToSelf() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * dedupeNone|secondCopyIfOnToOrCC|moveSentMessageToInbox|dedupeAll
     *
     * <p>Valid values: [dedupeAll, dedupeNone, secondCopyifOnToOrCC]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=144)
    public Map<String,Object> unsetPrefDedupeMessagesSentToSelf(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDedupeMessagesSentToSelf, "");
        return attrs;
    }

    /**
     * whether meeting invite emails are moved to Trash folder upon
     * accept/decline
     *
     * @return zimbraPrefDeleteInviteOnReply, or true if unset
     */
    @ZAttr(id=470)
    public boolean isPrefDeleteInviteOnReply() {
        return getBooleanAttr(Provisioning.A_zimbraPrefDeleteInviteOnReply, true);
    }

    /**
     * whether meeting invite emails are moved to Trash folder upon
     * accept/decline
     *
     * @param zimbraPrefDeleteInviteOnReply new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=470)
    public void setPrefDeleteInviteOnReply(boolean zimbraPrefDeleteInviteOnReply) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDeleteInviteOnReply, zimbraPrefDeleteInviteOnReply ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether meeting invite emails are moved to Trash folder upon
     * accept/decline
     *
     * @param zimbraPrefDeleteInviteOnReply new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=470)
    public Map<String,Object> setPrefDeleteInviteOnReply(boolean zimbraPrefDeleteInviteOnReply, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDeleteInviteOnReply, zimbraPrefDeleteInviteOnReply ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether meeting invite emails are moved to Trash folder upon
     * accept/decline
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=470)
    public void unsetPrefDeleteInviteOnReply() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDeleteInviteOnReply, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether meeting invite emails are moved to Trash folder upon
     * accept/decline
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=470)
    public Map<String,Object> unsetPrefDeleteInviteOnReply(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDeleteInviteOnReply, "");
        return attrs;
    }

    /**
     * whether to display external images in HTML mail
     *
     * @return zimbraPrefDisplayExternalImages, or false if unset
     */
    @ZAttr(id=511)
    public boolean isPrefDisplayExternalImages() {
        return getBooleanAttr(Provisioning.A_zimbraPrefDisplayExternalImages, false);
    }

    /**
     * whether to display external images in HTML mail
     *
     * @param zimbraPrefDisplayExternalImages new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=511)
    public void setPrefDisplayExternalImages(boolean zimbraPrefDisplayExternalImages) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDisplayExternalImages, zimbraPrefDisplayExternalImages ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to display external images in HTML mail
     *
     * @param zimbraPrefDisplayExternalImages new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=511)
    public Map<String,Object> setPrefDisplayExternalImages(boolean zimbraPrefDisplayExternalImages, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDisplayExternalImages, zimbraPrefDisplayExternalImages ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to display external images in HTML mail
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=511)
    public void unsetPrefDisplayExternalImages() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDisplayExternalImages, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to display external images in HTML mail
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=511)
    public Map<String,Object> unsetPrefDisplayExternalImages(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefDisplayExternalImages, "");
        return attrs;
    }

    /**
     * whether folder color is enabled
     *
     * @return zimbraPrefFolderColorEnabled, or true if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=771)
    public boolean isPrefFolderColorEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefFolderColorEnabled, true);
    }

    /**
     * whether folder color is enabled
     *
     * @param zimbraPrefFolderColorEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=771)
    public void setPrefFolderColorEnabled(boolean zimbraPrefFolderColorEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderColorEnabled, zimbraPrefFolderColorEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether folder color is enabled
     *
     * @param zimbraPrefFolderColorEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=771)
    public Map<String,Object> setPrefFolderColorEnabled(boolean zimbraPrefFolderColorEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderColorEnabled, zimbraPrefFolderColorEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether folder color is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=771)
    public void unsetPrefFolderColorEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderColorEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether folder color is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=771)
    public Map<String,Object> unsetPrefFolderColorEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderColorEnabled, "");
        return attrs;
    }

    /**
     * whether or not folder tree is expanded
     *
     * @return zimbraPrefFolderTreeOpen, or true if unset
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=637)
    public boolean isPrefFolderTreeOpen() {
        return getBooleanAttr(Provisioning.A_zimbraPrefFolderTreeOpen, true);
    }

    /**
     * whether or not folder tree is expanded
     *
     * @param zimbraPrefFolderTreeOpen new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=637)
    public void setPrefFolderTreeOpen(boolean zimbraPrefFolderTreeOpen) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderTreeOpen, zimbraPrefFolderTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not folder tree is expanded
     *
     * @param zimbraPrefFolderTreeOpen new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=637)
    public Map<String,Object> setPrefFolderTreeOpen(boolean zimbraPrefFolderTreeOpen, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderTreeOpen, zimbraPrefFolderTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not folder tree is expanded
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=637)
    public void unsetPrefFolderTreeOpen() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderTreeOpen, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not folder tree is expanded
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=637)
    public Map<String,Object> unsetPrefFolderTreeOpen(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefFolderTreeOpen, "");
        return attrs;
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @return zimbraPrefForwardIncludeOriginalText, or ZAttrProvisioning.PrefForwardIncludeOriginalText.includeBody if unset and/or has invalid value
     */
    @ZAttr(id=134)
    public ZAttrProvisioning.PrefForwardIncludeOriginalText getPrefForwardIncludeOriginalText() {
        try { String v = getAttr(Provisioning.A_zimbraPrefForwardIncludeOriginalText); return v == null ? ZAttrProvisioning.PrefForwardIncludeOriginalText.includeBody : ZAttrProvisioning.PrefForwardIncludeOriginalText.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefForwardIncludeOriginalText.includeBody; }
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @return zimbraPrefForwardIncludeOriginalText, or "includeBody" if unset
     */
    @ZAttr(id=134)
    public String getPrefForwardIncludeOriginalTextAsString() {
        return getAttr(Provisioning.A_zimbraPrefForwardIncludeOriginalText, "includeBody");
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefForwardIncludeOriginalText new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=134)
    public void setPrefForwardIncludeOriginalText(ZAttrProvisioning.PrefForwardIncludeOriginalText zimbraPrefForwardIncludeOriginalText) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, zimbraPrefForwardIncludeOriginalText.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefForwardIncludeOriginalText new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=134)
    public Map<String,Object> setPrefForwardIncludeOriginalText(ZAttrProvisioning.PrefForwardIncludeOriginalText zimbraPrefForwardIncludeOriginalText, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, zimbraPrefForwardIncludeOriginalText.toString());
        return attrs;
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefForwardIncludeOriginalText new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=134)
    public void setPrefForwardIncludeOriginalTextAsString(String zimbraPrefForwardIncludeOriginalText) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, zimbraPrefForwardIncludeOriginalText);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefForwardIncludeOriginalText new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=134)
    public Map<String,Object> setPrefForwardIncludeOriginalTextAsString(String zimbraPrefForwardIncludeOriginalText, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, zimbraPrefForwardIncludeOriginalText);
        return attrs;
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=134)
    public void unsetPrefForwardIncludeOriginalText() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during forwards
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeBodyAndHeadersWithPrefix, includeBody, includeBodyWithPrefix]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=134)
    public Map<String,Object> unsetPrefForwardIncludeOriginalText(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardIncludeOriginalText, "");
        return attrs;
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @return zimbraPrefForwardReplyFormat, or ZAttrProvisioning.PrefForwardReplyFormat.text if unset and/or has invalid value
     */
    @ZAttr(id=413)
    public ZAttrProvisioning.PrefForwardReplyFormat getPrefForwardReplyFormat() {
        try { String v = getAttr(Provisioning.A_zimbraPrefForwardReplyFormat); return v == null ? ZAttrProvisioning.PrefForwardReplyFormat.text : ZAttrProvisioning.PrefForwardReplyFormat.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefForwardReplyFormat.text; }
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @return zimbraPrefForwardReplyFormat, or "text" if unset
     */
    @ZAttr(id=413)
    public String getPrefForwardReplyFormatAsString() {
        return getAttr(Provisioning.A_zimbraPrefForwardReplyFormat, "text");
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @param zimbraPrefForwardReplyFormat new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=413)
    public void setPrefForwardReplyFormat(ZAttrProvisioning.PrefForwardReplyFormat zimbraPrefForwardReplyFormat) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, zimbraPrefForwardReplyFormat.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @param zimbraPrefForwardReplyFormat new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=413)
    public Map<String,Object> setPrefForwardReplyFormat(ZAttrProvisioning.PrefForwardReplyFormat zimbraPrefForwardReplyFormat, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, zimbraPrefForwardReplyFormat.toString());
        return attrs;
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @param zimbraPrefForwardReplyFormat new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=413)
    public void setPrefForwardReplyFormatAsString(String zimbraPrefForwardReplyFormat) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, zimbraPrefForwardReplyFormat);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @param zimbraPrefForwardReplyFormat new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=413)
    public Map<String,Object> setPrefForwardReplyFormatAsString(String zimbraPrefForwardReplyFormat, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, zimbraPrefForwardReplyFormat);
        return attrs;
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=413)
    public void unsetPrefForwardReplyFormat() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what format we reply/forward messages in (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [same, html, text]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=413)
    public Map<String,Object> unsetPrefForwardReplyFormat(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyFormat, "");
        return attrs;
    }

    /**
     * Deprecated since: 4.5. Deprecated in favor of
     * zimbraPrefForwardReplyFormat. Orig desc: whether or not to use same
     * format (text or html) of message we are replying to
     *
     * @return zimbraPrefForwardReplyInOriginalFormat, or false if unset
     */
    @ZAttr(id=218)
    public boolean isPrefForwardReplyInOriginalFormat() {
        return getBooleanAttr(Provisioning.A_zimbraPrefForwardReplyInOriginalFormat, false);
    }

    /**
     * Deprecated since: 4.5. Deprecated in favor of
     * zimbraPrefForwardReplyFormat. Orig desc: whether or not to use same
     * format (text or html) of message we are replying to
     *
     * @param zimbraPrefForwardReplyInOriginalFormat new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=218)
    public void setPrefForwardReplyInOriginalFormat(boolean zimbraPrefForwardReplyInOriginalFormat) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyInOriginalFormat, zimbraPrefForwardReplyInOriginalFormat ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Deprecated since: 4.5. Deprecated in favor of
     * zimbraPrefForwardReplyFormat. Orig desc: whether or not to use same
     * format (text or html) of message we are replying to
     *
     * @param zimbraPrefForwardReplyInOriginalFormat new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=218)
    public Map<String,Object> setPrefForwardReplyInOriginalFormat(boolean zimbraPrefForwardReplyInOriginalFormat, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyInOriginalFormat, zimbraPrefForwardReplyInOriginalFormat ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Deprecated since: 4.5. Deprecated in favor of
     * zimbraPrefForwardReplyFormat. Orig desc: whether or not to use same
     * format (text or html) of message we are replying to
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=218)
    public void unsetPrefForwardReplyInOriginalFormat() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyInOriginalFormat, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Deprecated since: 4.5. Deprecated in favor of
     * zimbraPrefForwardReplyFormat. Orig desc: whether or not to use same
     * format (text or html) of message we are replying to
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=218)
    public Map<String,Object> unsetPrefForwardReplyInOriginalFormat(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyInOriginalFormat, "");
        return attrs;
    }

    /**
     * prefix character to use during forward/reply (deprecatedSince 5.0 in
     * identity)
     *
     * @return zimbraPrefForwardReplyPrefixChar, or ">" if unset
     */
    @ZAttr(id=130)
    public String getPrefForwardReplyPrefixChar() {
        return getAttr(Provisioning.A_zimbraPrefForwardReplyPrefixChar, ">");
    }

    /**
     * prefix character to use during forward/reply (deprecatedSince 5.0 in
     * identity)
     *
     * @param zimbraPrefForwardReplyPrefixChar new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=130)
    public void setPrefForwardReplyPrefixChar(String zimbraPrefForwardReplyPrefixChar) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyPrefixChar, zimbraPrefForwardReplyPrefixChar);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * prefix character to use during forward/reply (deprecatedSince 5.0 in
     * identity)
     *
     * @param zimbraPrefForwardReplyPrefixChar new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=130)
    public Map<String,Object> setPrefForwardReplyPrefixChar(String zimbraPrefForwardReplyPrefixChar, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyPrefixChar, zimbraPrefForwardReplyPrefixChar);
        return attrs;
    }

    /**
     * prefix character to use during forward/reply (deprecatedSince 5.0 in
     * identity)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=130)
    public void unsetPrefForwardReplyPrefixChar() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyPrefixChar, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * prefix character to use during forward/reply (deprecatedSince 5.0 in
     * identity)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=130)
    public Map<String,Object> unsetPrefForwardReplyPrefixChar(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefForwardReplyPrefixChar, "");
        return attrs;
    }

    /**
     * whether end-user wants auto-complete from GAL. Feature must also be
     * enabled.
     *
     * @return zimbraPrefGalAutoCompleteEnabled, or false if unset
     */
    @ZAttr(id=372)
    public boolean isPrefGalAutoCompleteEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefGalAutoCompleteEnabled, false);
    }

    /**
     * whether end-user wants auto-complete from GAL. Feature must also be
     * enabled.
     *
     * @param zimbraPrefGalAutoCompleteEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=372)
    public void setPrefGalAutoCompleteEnabled(boolean zimbraPrefGalAutoCompleteEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalAutoCompleteEnabled, zimbraPrefGalAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants auto-complete from GAL. Feature must also be
     * enabled.
     *
     * @param zimbraPrefGalAutoCompleteEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=372)
    public Map<String,Object> setPrefGalAutoCompleteEnabled(boolean zimbraPrefGalAutoCompleteEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalAutoCompleteEnabled, zimbraPrefGalAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether end-user wants auto-complete from GAL. Feature must also be
     * enabled.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=372)
    public void unsetPrefGalAutoCompleteEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalAutoCompleteEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants auto-complete from GAL. Feature must also be
     * enabled.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=372)
    public Map<String,Object> unsetPrefGalAutoCompleteEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalAutoCompleteEnabled, "");
        return attrs;
    }

    /**
     * whether end-user wants search from GAL. Feature must also be enabled
     *
     * @return zimbraPrefGalSearchEnabled, or true if unset
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=635)
    public boolean isPrefGalSearchEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefGalSearchEnabled, true);
    }

    /**
     * whether end-user wants search from GAL. Feature must also be enabled
     *
     * @param zimbraPrefGalSearchEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=635)
    public void setPrefGalSearchEnabled(boolean zimbraPrefGalSearchEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalSearchEnabled, zimbraPrefGalSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants search from GAL. Feature must also be enabled
     *
     * @param zimbraPrefGalSearchEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=635)
    public Map<String,Object> setPrefGalSearchEnabled(boolean zimbraPrefGalSearchEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalSearchEnabled, zimbraPrefGalSearchEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether end-user wants search from GAL. Feature must also be enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=635)
    public void unsetPrefGalSearchEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalSearchEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants search from GAL. Feature must also be enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=635)
    public Map<String,Object> unsetPrefGalSearchEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGalSearchEnabled, "");
        return attrs;
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @return zimbraPrefGroupMailBy, or ZAttrProvisioning.PrefGroupMailBy.conversation if unset and/or has invalid value
     */
    @ZAttr(id=54)
    public ZAttrProvisioning.PrefGroupMailBy getPrefGroupMailBy() {
        try { String v = getAttr(Provisioning.A_zimbraPrefGroupMailBy); return v == null ? ZAttrProvisioning.PrefGroupMailBy.conversation : ZAttrProvisioning.PrefGroupMailBy.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefGroupMailBy.conversation; }
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @return zimbraPrefGroupMailBy, or "conversation" if unset
     */
    @ZAttr(id=54)
    public String getPrefGroupMailByAsString() {
        return getAttr(Provisioning.A_zimbraPrefGroupMailBy, "conversation");
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @param zimbraPrefGroupMailBy new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=54)
    public void setPrefGroupMailBy(ZAttrProvisioning.PrefGroupMailBy zimbraPrefGroupMailBy) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, zimbraPrefGroupMailBy.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @param zimbraPrefGroupMailBy new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=54)
    public Map<String,Object> setPrefGroupMailBy(ZAttrProvisioning.PrefGroupMailBy zimbraPrefGroupMailBy, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, zimbraPrefGroupMailBy.toString());
        return attrs;
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @param zimbraPrefGroupMailBy new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=54)
    public void setPrefGroupMailByAsString(String zimbraPrefGroupMailBy) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, zimbraPrefGroupMailBy);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @param zimbraPrefGroupMailBy new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=54)
    public Map<String,Object> setPrefGroupMailByAsString(String zimbraPrefGroupMailBy, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, zimbraPrefGroupMailBy);
        return attrs;
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=54)
    public void unsetPrefGroupMailBy() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * how to group mail by default
     *
     * <p>Valid values: [conversation, message]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=54)
    public Map<String,Object> unsetPrefGroupMailBy(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefGroupMailBy, "");
        return attrs;
    }

    /**
     * default font color
     *
     * @return zimbraPrefHtmlEditorDefaultFontColor, or "#000000" if unset
     */
    @ZAttr(id=260)
    public String getPrefHtmlEditorDefaultFontColor() {
        return getAttr(Provisioning.A_zimbraPrefHtmlEditorDefaultFontColor, "#000000");
    }

    /**
     * default font color
     *
     * @param zimbraPrefHtmlEditorDefaultFontColor new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=260)
    public void setPrefHtmlEditorDefaultFontColor(String zimbraPrefHtmlEditorDefaultFontColor) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontColor, zimbraPrefHtmlEditorDefaultFontColor);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font color
     *
     * @param zimbraPrefHtmlEditorDefaultFontColor new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=260)
    public Map<String,Object> setPrefHtmlEditorDefaultFontColor(String zimbraPrefHtmlEditorDefaultFontColor, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontColor, zimbraPrefHtmlEditorDefaultFontColor);
        return attrs;
    }

    /**
     * default font color
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=260)
    public void unsetPrefHtmlEditorDefaultFontColor() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontColor, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font color
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=260)
    public Map<String,Object> unsetPrefHtmlEditorDefaultFontColor(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontColor, "");
        return attrs;
    }

    /**
     * default font family
     *
     * @return zimbraPrefHtmlEditorDefaultFontFamily, or "Times New Roman" if unset
     */
    @ZAttr(id=258)
    public String getPrefHtmlEditorDefaultFontFamily() {
        return getAttr(Provisioning.A_zimbraPrefHtmlEditorDefaultFontFamily, "Times New Roman");
    }

    /**
     * default font family
     *
     * @param zimbraPrefHtmlEditorDefaultFontFamily new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=258)
    public void setPrefHtmlEditorDefaultFontFamily(String zimbraPrefHtmlEditorDefaultFontFamily) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontFamily, zimbraPrefHtmlEditorDefaultFontFamily);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font family
     *
     * @param zimbraPrefHtmlEditorDefaultFontFamily new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=258)
    public Map<String,Object> setPrefHtmlEditorDefaultFontFamily(String zimbraPrefHtmlEditorDefaultFontFamily, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontFamily, zimbraPrefHtmlEditorDefaultFontFamily);
        return attrs;
    }

    /**
     * default font family
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=258)
    public void unsetPrefHtmlEditorDefaultFontFamily() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontFamily, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font family
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=258)
    public Map<String,Object> unsetPrefHtmlEditorDefaultFontFamily(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontFamily, "");
        return attrs;
    }

    /**
     * default font size
     *
     * @return zimbraPrefHtmlEditorDefaultFontSize, or "12pt" if unset
     */
    @ZAttr(id=259)
    public String getPrefHtmlEditorDefaultFontSize() {
        return getAttr(Provisioning.A_zimbraPrefHtmlEditorDefaultFontSize, "12pt");
    }

    /**
     * default font size
     *
     * @param zimbraPrefHtmlEditorDefaultFontSize new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=259)
    public void setPrefHtmlEditorDefaultFontSize(String zimbraPrefHtmlEditorDefaultFontSize) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontSize, zimbraPrefHtmlEditorDefaultFontSize);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font size
     *
     * @param zimbraPrefHtmlEditorDefaultFontSize new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=259)
    public Map<String,Object> setPrefHtmlEditorDefaultFontSize(String zimbraPrefHtmlEditorDefaultFontSize, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontSize, zimbraPrefHtmlEditorDefaultFontSize);
        return attrs;
    }

    /**
     * default font size
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=259)
    public void unsetPrefHtmlEditorDefaultFontSize() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontSize, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * default font size
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=259)
    public Map<String,Object> unsetPrefHtmlEditorDefaultFontSize(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefHtmlEditorDefaultFontSize, "");
        return attrs;
    }

    /**
     * whether to login to the IM client automatically
     *
     * @return zimbraPrefIMAutoLogin, or false if unset
     */
    @ZAttr(id=488)
    public boolean isPrefIMAutoLogin() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMAutoLogin, false);
    }

    /**
     * whether to login to the IM client automatically
     *
     * @param zimbraPrefIMAutoLogin new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=488)
    public void setPrefIMAutoLogin(boolean zimbraPrefIMAutoLogin) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMAutoLogin, zimbraPrefIMAutoLogin ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to login to the IM client automatically
     *
     * @param zimbraPrefIMAutoLogin new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=488)
    public Map<String,Object> setPrefIMAutoLogin(boolean zimbraPrefIMAutoLogin, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMAutoLogin, zimbraPrefIMAutoLogin ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to login to the IM client automatically
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=488)
    public void unsetPrefIMAutoLogin() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMAutoLogin, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to login to the IM client automatically
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=488)
    public Map<String,Object> unsetPrefIMAutoLogin(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMAutoLogin, "");
        return attrs;
    }

    /**
     * IM buddy list sort order
     *
     * @return zimbraPrefIMBuddyListSort, or null if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=705)
    public String getPrefIMBuddyListSort() {
        return getAttr(Provisioning.A_zimbraPrefIMBuddyListSort, null);
    }

    /**
     * IM buddy list sort order
     *
     * @param zimbraPrefIMBuddyListSort new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=705)
    public void setPrefIMBuddyListSort(String zimbraPrefIMBuddyListSort) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMBuddyListSort, zimbraPrefIMBuddyListSort);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM buddy list sort order
     *
     * @param zimbraPrefIMBuddyListSort new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=705)
    public Map<String,Object> setPrefIMBuddyListSort(String zimbraPrefIMBuddyListSort, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMBuddyListSort, zimbraPrefIMBuddyListSort);
        return attrs;
    }

    /**
     * IM buddy list sort order
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=705)
    public void unsetPrefIMBuddyListSort() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMBuddyListSort, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM buddy list sort order
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=705)
    public Map<String,Object> unsetPrefIMBuddyListSort(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMBuddyListSort, "");
        return attrs;
    }

    /**
     * Flash IM icon on new messages
     *
     * @return zimbraPrefIMFlashIcon, or true if unset
     */
    @ZAttr(id=462)
    public boolean isPrefIMFlashIcon() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMFlashIcon, true);
    }

    /**
     * Flash IM icon on new messages
     *
     * @param zimbraPrefIMFlashIcon new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=462)
    public void setPrefIMFlashIcon(boolean zimbraPrefIMFlashIcon) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashIcon, zimbraPrefIMFlashIcon ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash IM icon on new messages
     *
     * @param zimbraPrefIMFlashIcon new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=462)
    public Map<String,Object> setPrefIMFlashIcon(boolean zimbraPrefIMFlashIcon, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashIcon, zimbraPrefIMFlashIcon ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Flash IM icon on new messages
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=462)
    public void unsetPrefIMFlashIcon() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashIcon, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash IM icon on new messages
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=462)
    public Map<String,Object> unsetPrefIMFlashIcon(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashIcon, "");
        return attrs;
    }

    /**
     * Flash title bar when a new IM arrives
     *
     * @return zimbraPrefIMFlashTitle, or true if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=679)
    public boolean isPrefIMFlashTitle() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMFlashTitle, true);
    }

    /**
     * Flash title bar when a new IM arrives
     *
     * @param zimbraPrefIMFlashTitle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=679)
    public void setPrefIMFlashTitle(boolean zimbraPrefIMFlashTitle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashTitle, zimbraPrefIMFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title bar when a new IM arrives
     *
     * @param zimbraPrefIMFlashTitle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=679)
    public Map<String,Object> setPrefIMFlashTitle(boolean zimbraPrefIMFlashTitle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashTitle, zimbraPrefIMFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Flash title bar when a new IM arrives
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=679)
    public void unsetPrefIMFlashTitle() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashTitle, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title bar when a new IM arrives
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=679)
    public Map<String,Object> unsetPrefIMFlashTitle(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMFlashTitle, "");
        return attrs;
    }

    /**
     * whether to hide IM blocked buddies
     *
     * @return zimbraPrefIMHideBlockedBuddies, or false if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=707)
    public boolean isPrefIMHideBlockedBuddies() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMHideBlockedBuddies, false);
    }

    /**
     * whether to hide IM blocked buddies
     *
     * @param zimbraPrefIMHideBlockedBuddies new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=707)
    public void setPrefIMHideBlockedBuddies(boolean zimbraPrefIMHideBlockedBuddies) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideBlockedBuddies, zimbraPrefIMHideBlockedBuddies ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to hide IM blocked buddies
     *
     * @param zimbraPrefIMHideBlockedBuddies new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=707)
    public Map<String,Object> setPrefIMHideBlockedBuddies(boolean zimbraPrefIMHideBlockedBuddies, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideBlockedBuddies, zimbraPrefIMHideBlockedBuddies ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to hide IM blocked buddies
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=707)
    public void unsetPrefIMHideBlockedBuddies() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideBlockedBuddies, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to hide IM blocked buddies
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=707)
    public Map<String,Object> unsetPrefIMHideBlockedBuddies(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideBlockedBuddies, "");
        return attrs;
    }

    /**
     * whether to hide IM offline buddies
     *
     * @return zimbraPrefIMHideOfflineBuddies, or false if unset
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=706)
    public boolean isPrefIMHideOfflineBuddies() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMHideOfflineBuddies, false);
    }

    /**
     * whether to hide IM offline buddies
     *
     * @param zimbraPrefIMHideOfflineBuddies new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=706)
    public void setPrefIMHideOfflineBuddies(boolean zimbraPrefIMHideOfflineBuddies) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideOfflineBuddies, zimbraPrefIMHideOfflineBuddies ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to hide IM offline buddies
     *
     * @param zimbraPrefIMHideOfflineBuddies new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=706)
    public Map<String,Object> setPrefIMHideOfflineBuddies(boolean zimbraPrefIMHideOfflineBuddies, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideOfflineBuddies, zimbraPrefIMHideOfflineBuddies ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to hide IM offline buddies
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=706)
    public void unsetPrefIMHideOfflineBuddies() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideOfflineBuddies, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to hide IM offline buddies
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.10
     */
    @ZAttr(id=706)
    public Map<String,Object> unsetPrefIMHideOfflineBuddies(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMHideOfflineBuddies, "");
        return attrs;
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @return zimbraPrefIMIdleStatus, or ZAttrProvisioning.PrefIMIdleStatus.away if unset and/or has invalid value
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public ZAttrProvisioning.PrefIMIdleStatus getPrefIMIdleStatus() {
        try { String v = getAttr(Provisioning.A_zimbraPrefIMIdleStatus); return v == null ? ZAttrProvisioning.PrefIMIdleStatus.away : ZAttrProvisioning.PrefIMIdleStatus.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefIMIdleStatus.away; }
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @return zimbraPrefIMIdleStatus, or "away" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public String getPrefIMIdleStatusAsString() {
        return getAttr(Provisioning.A_zimbraPrefIMIdleStatus, "away");
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @param zimbraPrefIMIdleStatus new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public void setPrefIMIdleStatus(ZAttrProvisioning.PrefIMIdleStatus zimbraPrefIMIdleStatus) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, zimbraPrefIMIdleStatus.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @param zimbraPrefIMIdleStatus new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public Map<String,Object> setPrefIMIdleStatus(ZAttrProvisioning.PrefIMIdleStatus zimbraPrefIMIdleStatus, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, zimbraPrefIMIdleStatus.toString());
        return attrs;
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @param zimbraPrefIMIdleStatus new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public void setPrefIMIdleStatusAsString(String zimbraPrefIMIdleStatus) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, zimbraPrefIMIdleStatus);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @param zimbraPrefIMIdleStatus new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public Map<String,Object> setPrefIMIdleStatusAsString(String zimbraPrefIMIdleStatus, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, zimbraPrefIMIdleStatus);
        return attrs;
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public void unsetPrefIMIdleStatus() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM idle status
     *
     * <p>Valid values: [away, xa, offline, invisible]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=560)
    public Map<String,Object> unsetPrefIMIdleStatus(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleStatus, "");
        return attrs;
    }

    /**
     * IM session idle timeout in minutes
     *
     * @return zimbraPrefIMIdleTimeout, or 10 if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=559)
    public int getPrefIMIdleTimeout() {
        return getIntAttr(Provisioning.A_zimbraPrefIMIdleTimeout, 10);
    }

    /**
     * IM session idle timeout in minutes
     *
     * @param zimbraPrefIMIdleTimeout new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=559)
    public void setPrefIMIdleTimeout(int zimbraPrefIMIdleTimeout) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleTimeout, Integer.toString(zimbraPrefIMIdleTimeout));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM session idle timeout in minutes
     *
     * @param zimbraPrefIMIdleTimeout new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=559)
    public Map<String,Object> setPrefIMIdleTimeout(int zimbraPrefIMIdleTimeout, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleTimeout, Integer.toString(zimbraPrefIMIdleTimeout));
        return attrs;
    }

    /**
     * IM session idle timeout in minutes
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=559)
    public void unsetPrefIMIdleTimeout() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleTimeout, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * IM session idle timeout in minutes
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=559)
    public Map<String,Object> unsetPrefIMIdleTimeout(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMIdleTimeout, "");
        return attrs;
    }

    /**
     * Enable instant notifications
     *
     * @return zimbraPrefIMInstantNotify, or true if unset
     */
    @ZAttr(id=517)
    public boolean isPrefIMInstantNotify() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMInstantNotify, true);
    }

    /**
     * Enable instant notifications
     *
     * @param zimbraPrefIMInstantNotify new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=517)
    public void setPrefIMInstantNotify(boolean zimbraPrefIMInstantNotify) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMInstantNotify, zimbraPrefIMInstantNotify ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Enable instant notifications
     *
     * @param zimbraPrefIMInstantNotify new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=517)
    public Map<String,Object> setPrefIMInstantNotify(boolean zimbraPrefIMInstantNotify, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMInstantNotify, zimbraPrefIMInstantNotify ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Enable instant notifications
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=517)
    public void unsetPrefIMInstantNotify() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMInstantNotify, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Enable instant notifications
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=517)
    public Map<String,Object> unsetPrefIMInstantNotify(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMInstantNotify, "");
        return attrs;
    }

    /**
     * whether to log IM chats to the Chats folder
     *
     * @return zimbraPrefIMLogChats, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=556)
    public boolean isPrefIMLogChats() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMLogChats, true);
    }

    /**
     * whether to log IM chats to the Chats folder
     *
     * @param zimbraPrefIMLogChats new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=556)
    public void setPrefIMLogChats(boolean zimbraPrefIMLogChats) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChats, zimbraPrefIMLogChats ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to log IM chats to the Chats folder
     *
     * @param zimbraPrefIMLogChats new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=556)
    public Map<String,Object> setPrefIMLogChats(boolean zimbraPrefIMLogChats, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChats, zimbraPrefIMLogChats ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to log IM chats to the Chats folder
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=556)
    public void unsetPrefIMLogChats() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChats, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to log IM chats to the Chats folder
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=556)
    public Map<String,Object> unsetPrefIMLogChats(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChats, "");
        return attrs;
    }

    /**
     * whether IM log chats is enabled
     *
     * @return zimbraPrefIMLogChatsEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=552)
    public boolean isPrefIMLogChatsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMLogChatsEnabled, true);
    }

    /**
     * whether IM log chats is enabled
     *
     * @param zimbraPrefIMLogChatsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=552)
    public void setPrefIMLogChatsEnabled(boolean zimbraPrefIMLogChatsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChatsEnabled, zimbraPrefIMLogChatsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether IM log chats is enabled
     *
     * @param zimbraPrefIMLogChatsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=552)
    public Map<String,Object> setPrefIMLogChatsEnabled(boolean zimbraPrefIMLogChatsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChatsEnabled, zimbraPrefIMLogChatsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether IM log chats is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=552)
    public void unsetPrefIMLogChatsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChatsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether IM log chats is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=552)
    public Map<String,Object> unsetPrefIMLogChatsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMLogChatsEnabled, "");
        return attrs;
    }

    /**
     * Notify for presence modifications
     *
     * @return zimbraPrefIMNotifyPresence, or true if unset
     */
    @ZAttr(id=463)
    public boolean isPrefIMNotifyPresence() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMNotifyPresence, true);
    }

    /**
     * Notify for presence modifications
     *
     * @param zimbraPrefIMNotifyPresence new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=463)
    public void setPrefIMNotifyPresence(boolean zimbraPrefIMNotifyPresence) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyPresence, zimbraPrefIMNotifyPresence ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Notify for presence modifications
     *
     * @param zimbraPrefIMNotifyPresence new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=463)
    public Map<String,Object> setPrefIMNotifyPresence(boolean zimbraPrefIMNotifyPresence, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyPresence, zimbraPrefIMNotifyPresence ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Notify for presence modifications
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=463)
    public void unsetPrefIMNotifyPresence() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyPresence, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Notify for presence modifications
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=463)
    public Map<String,Object> unsetPrefIMNotifyPresence(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyPresence, "");
        return attrs;
    }

    /**
     * Notify for status change
     *
     * @return zimbraPrefIMNotifyStatus, or true if unset
     */
    @ZAttr(id=464)
    public boolean isPrefIMNotifyStatus() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMNotifyStatus, true);
    }

    /**
     * Notify for status change
     *
     * @param zimbraPrefIMNotifyStatus new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=464)
    public void setPrefIMNotifyStatus(boolean zimbraPrefIMNotifyStatus) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyStatus, zimbraPrefIMNotifyStatus ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Notify for status change
     *
     * @param zimbraPrefIMNotifyStatus new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=464)
    public Map<String,Object> setPrefIMNotifyStatus(boolean zimbraPrefIMNotifyStatus, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyStatus, zimbraPrefIMNotifyStatus ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Notify for status change
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=464)
    public void unsetPrefIMNotifyStatus() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyStatus, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Notify for status change
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=464)
    public Map<String,Object> unsetPrefIMNotifyStatus(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMNotifyStatus, "");
        return attrs;
    }

    /**
     * whether to report IM idle status
     *
     * @return zimbraPrefIMReportIdle, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=558)
    public boolean isPrefIMReportIdle() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMReportIdle, true);
    }

    /**
     * whether to report IM idle status
     *
     * @param zimbraPrefIMReportIdle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=558)
    public void setPrefIMReportIdle(boolean zimbraPrefIMReportIdle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMReportIdle, zimbraPrefIMReportIdle ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to report IM idle status
     *
     * @param zimbraPrefIMReportIdle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=558)
    public Map<String,Object> setPrefIMReportIdle(boolean zimbraPrefIMReportIdle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMReportIdle, zimbraPrefIMReportIdle ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to report IM idle status
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=558)
    public void unsetPrefIMReportIdle() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMReportIdle, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to report IM idle status
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=558)
    public Map<String,Object> unsetPrefIMReportIdle(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMReportIdle, "");
        return attrs;
    }

    /**
     * whether sounds is enabled in IM
     *
     * @return zimbraPrefIMSoundsEnabled, or true if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=570)
    public boolean isPrefIMSoundsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMSoundsEnabled, true);
    }

    /**
     * whether sounds is enabled in IM
     *
     * @param zimbraPrefIMSoundsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=570)
    public void setPrefIMSoundsEnabled(boolean zimbraPrefIMSoundsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMSoundsEnabled, zimbraPrefIMSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether sounds is enabled in IM
     *
     * @param zimbraPrefIMSoundsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=570)
    public Map<String,Object> setPrefIMSoundsEnabled(boolean zimbraPrefIMSoundsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMSoundsEnabled, zimbraPrefIMSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether sounds is enabled in IM
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=570)
    public void unsetPrefIMSoundsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMSoundsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether sounds is enabled in IM
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=570)
    public Map<String,Object> unsetPrefIMSoundsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMSoundsEnabled, "");
        return attrs;
    }

    /**
     * whether to enable toaster notification for IM
     *
     * @return zimbraPrefIMToasterEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=814)
    public boolean isPrefIMToasterEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIMToasterEnabled, false);
    }

    /**
     * whether to enable toaster notification for IM
     *
     * @param zimbraPrefIMToasterEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=814)
    public void setPrefIMToasterEnabled(boolean zimbraPrefIMToasterEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMToasterEnabled, zimbraPrefIMToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for IM
     *
     * @param zimbraPrefIMToasterEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=814)
    public Map<String,Object> setPrefIMToasterEnabled(boolean zimbraPrefIMToasterEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMToasterEnabled, zimbraPrefIMToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to enable toaster notification for IM
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=814)
    public void unsetPrefIMToasterEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMToasterEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for IM
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=814)
    public Map<String,Object> unsetPrefIMToasterEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIMToasterEnabled, "");
        return attrs;
    }

    /**
     * whether or not the IMAP server exports search folders
     *
     * @return zimbraPrefImapSearchFoldersEnabled, or true if unset
     */
    @ZAttr(id=241)
    public boolean isPrefImapSearchFoldersEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefImapSearchFoldersEnabled, true);
    }

    /**
     * whether or not the IMAP server exports search folders
     *
     * @param zimbraPrefImapSearchFoldersEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=241)
    public void setPrefImapSearchFoldersEnabled(boolean zimbraPrefImapSearchFoldersEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefImapSearchFoldersEnabled, zimbraPrefImapSearchFoldersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not the IMAP server exports search folders
     *
     * @param zimbraPrefImapSearchFoldersEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=241)
    public Map<String,Object> setPrefImapSearchFoldersEnabled(boolean zimbraPrefImapSearchFoldersEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefImapSearchFoldersEnabled, zimbraPrefImapSearchFoldersEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not the IMAP server exports search folders
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=241)
    public void unsetPrefImapSearchFoldersEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefImapSearchFoldersEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not the IMAP server exports search folders
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=241)
    public Map<String,Object> unsetPrefImapSearchFoldersEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefImapSearchFoldersEnabled, "");
        return attrs;
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * <p>Use getPrefInboxReadLifetimeAsString to access value as a string.
     *
     * @see #getPrefInboxReadLifetimeAsString()
     *
     * @return zimbraPrefInboxReadLifetime in millseconds, or 0 (0)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public long getPrefInboxReadLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPrefInboxReadLifetime, 0L);
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @return zimbraPrefInboxReadLifetime, or "0" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public String getPrefInboxReadLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPrefInboxReadLifetime, "0");
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param zimbraPrefInboxReadLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public void setPrefInboxReadLifetime(String zimbraPrefInboxReadLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxReadLifetime, zimbraPrefInboxReadLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param zimbraPrefInboxReadLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public Map<String,Object> setPrefInboxReadLifetime(String zimbraPrefInboxReadLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxReadLifetime, zimbraPrefInboxReadLifetime);
        return attrs;
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public void unsetPrefInboxReadLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxReadLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of read messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=538)
    public Map<String,Object> unsetPrefInboxReadLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxReadLifetime, "");
        return attrs;
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * <p>Use getPrefInboxUnreadLifetimeAsString to access value as a string.
     *
     * @see #getPrefInboxUnreadLifetimeAsString()
     *
     * @return zimbraPrefInboxUnreadLifetime in millseconds, or 0 (0)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public long getPrefInboxUnreadLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPrefInboxUnreadLifetime, 0L);
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @return zimbraPrefInboxUnreadLifetime, or "0" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public String getPrefInboxUnreadLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPrefInboxUnreadLifetime, "0");
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param zimbraPrefInboxUnreadLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public void setPrefInboxUnreadLifetime(String zimbraPrefInboxUnreadLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxUnreadLifetime, zimbraPrefInboxUnreadLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param zimbraPrefInboxUnreadLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public Map<String,Object> setPrefInboxUnreadLifetime(String zimbraPrefInboxUnreadLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxUnreadLifetime, zimbraPrefInboxUnreadLifetime);
        return attrs;
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public void unsetPrefInboxUnreadLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxUnreadLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of unread messages in the Inbox folder. 0 means that
     * all messages will be retained.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=537)
    public Map<String,Object> unsetPrefInboxUnreadLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefInboxUnreadLifetime, "");
        return attrs;
    }

    /**
     * whether or not to include spam in search by default
     *
     * @return zimbraPrefIncludeSpamInSearch, or false if unset
     */
    @ZAttr(id=55)
    public boolean isPrefIncludeSpamInSearch() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIncludeSpamInSearch, false);
    }

    /**
     * whether or not to include spam in search by default
     *
     * @param zimbraPrefIncludeSpamInSearch new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=55)
    public void setPrefIncludeSpamInSearch(boolean zimbraPrefIncludeSpamInSearch) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeSpamInSearch, zimbraPrefIncludeSpamInSearch ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to include spam in search by default
     *
     * @param zimbraPrefIncludeSpamInSearch new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=55)
    public Map<String,Object> setPrefIncludeSpamInSearch(boolean zimbraPrefIncludeSpamInSearch, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeSpamInSearch, zimbraPrefIncludeSpamInSearch ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not to include spam in search by default
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=55)
    public void unsetPrefIncludeSpamInSearch() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeSpamInSearch, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to include spam in search by default
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=55)
    public Map<String,Object> unsetPrefIncludeSpamInSearch(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeSpamInSearch, "");
        return attrs;
    }

    /**
     * whether or not to include trash in search by default
     *
     * @return zimbraPrefIncludeTrashInSearch, or false if unset
     */
    @ZAttr(id=56)
    public boolean isPrefIncludeTrashInSearch() {
        return getBooleanAttr(Provisioning.A_zimbraPrefIncludeTrashInSearch, false);
    }

    /**
     * whether or not to include trash in search by default
     *
     * @param zimbraPrefIncludeTrashInSearch new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=56)
    public void setPrefIncludeTrashInSearch(boolean zimbraPrefIncludeTrashInSearch) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeTrashInSearch, zimbraPrefIncludeTrashInSearch ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to include trash in search by default
     *
     * @param zimbraPrefIncludeTrashInSearch new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=56)
    public Map<String,Object> setPrefIncludeTrashInSearch(boolean zimbraPrefIncludeTrashInSearch, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeTrashInSearch, zimbraPrefIncludeTrashInSearch ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not to include trash in search by default
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=56)
    public void unsetPrefIncludeTrashInSearch() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeTrashInSearch, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to include trash in search by default
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=56)
    public Map<String,Object> unsetPrefIncludeTrashInSearch(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefIncludeTrashInSearch, "");
        return attrs;
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * <p>Use getPrefJunkLifetimeAsString to access value as a string.
     *
     * @see #getPrefJunkLifetimeAsString()
     *
     * @return zimbraPrefJunkLifetime in millseconds, or 0 (0)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public long getPrefJunkLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPrefJunkLifetime, 0L);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @return zimbraPrefJunkLifetime, or "0" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public String getPrefJunkLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPrefJunkLifetime, "0");
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraPrefJunkLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public void setPrefJunkLifetime(String zimbraPrefJunkLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefJunkLifetime, zimbraPrefJunkLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraPrefJunkLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public Map<String,Object> setPrefJunkLifetime(String zimbraPrefJunkLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefJunkLifetime, zimbraPrefJunkLifetime);
        return attrs;
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public void unsetPrefJunkLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefJunkLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Junk folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailSpamLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=540)
    public Map<String,Object> unsetPrefJunkLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefJunkLifetime, "");
        return attrs;
    }

    /**
     * list view columns in web client
     *
     * @return zimbraPrefListViewColumns, or null if unset
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=694)
    public String getPrefListViewColumns() {
        return getAttr(Provisioning.A_zimbraPrefListViewColumns, null);
    }

    /**
     * list view columns in web client
     *
     * @param zimbraPrefListViewColumns new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=694)
    public void setPrefListViewColumns(String zimbraPrefListViewColumns) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefListViewColumns, zimbraPrefListViewColumns);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * list view columns in web client
     *
     * @param zimbraPrefListViewColumns new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=694)
    public Map<String,Object> setPrefListViewColumns(String zimbraPrefListViewColumns, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefListViewColumns, zimbraPrefListViewColumns);
        return attrs;
    }

    /**
     * list view columns in web client
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=694)
    public void unsetPrefListViewColumns() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefListViewColumns, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * list view columns in web client
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.9
     */
    @ZAttr(id=694)
    public Map<String,Object> unsetPrefListViewColumns(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefListViewColumns, "");
        return attrs;
    }

    /**
     * user locale preference, e.g. en_US Whenever the server looks for the
     * user locale, it will first look for zimbraPrefLocale, if it is not set
     * then it will fallback to the current mechanism of looking for
     * zimbraLocale in the various places for a user. zimbraLocale is the non
     * end-user attribute that specifies which locale an object defaults to,
     * it is not an end-user setting.
     *
     * @return zimbraPrefLocale, or null if unset
     */
    @ZAttr(id=442)
    public String getPrefLocale() {
        return getAttr(Provisioning.A_zimbraPrefLocale, null);
    }

    /**
     * user locale preference, e.g. en_US Whenever the server looks for the
     * user locale, it will first look for zimbraPrefLocale, if it is not set
     * then it will fallback to the current mechanism of looking for
     * zimbraLocale in the various places for a user. zimbraLocale is the non
     * end-user attribute that specifies which locale an object defaults to,
     * it is not an end-user setting.
     *
     * @param zimbraPrefLocale new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=442)
    public void setPrefLocale(String zimbraPrefLocale) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefLocale, zimbraPrefLocale);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user locale preference, e.g. en_US Whenever the server looks for the
     * user locale, it will first look for zimbraPrefLocale, if it is not set
     * then it will fallback to the current mechanism of looking for
     * zimbraLocale in the various places for a user. zimbraLocale is the non
     * end-user attribute that specifies which locale an object defaults to,
     * it is not an end-user setting.
     *
     * @param zimbraPrefLocale new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=442)
    public Map<String,Object> setPrefLocale(String zimbraPrefLocale, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefLocale, zimbraPrefLocale);
        return attrs;
    }

    /**
     * user locale preference, e.g. en_US Whenever the server looks for the
     * user locale, it will first look for zimbraPrefLocale, if it is not set
     * then it will fallback to the current mechanism of looking for
     * zimbraLocale in the various places for a user. zimbraLocale is the non
     * end-user attribute that specifies which locale an object defaults to,
     * it is not an end-user setting.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=442)
    public void unsetPrefLocale() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefLocale, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * user locale preference, e.g. en_US Whenever the server looks for the
     * user locale, it will first look for zimbraPrefLocale, if it is not set
     * then it will fallback to the current mechanism of looking for
     * zimbraLocale in the various places for a user. zimbraLocale is the non
     * end-user attribute that specifies which locale an object defaults to,
     * it is not an end-user setting.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=442)
    public Map<String,Object> unsetPrefLocale(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefLocale, "");
        return attrs;
    }

    /**
     * Default Charset for mail composing and parsing text
     *
     * @return zimbraPrefMailDefaultCharset, or "UTF-8" if unset
     */
    @ZAttr(id=469)
    public String getPrefMailDefaultCharset() {
        return getAttr(Provisioning.A_zimbraPrefMailDefaultCharset, "UTF-8");
    }

    /**
     * Default Charset for mail composing and parsing text
     *
     * @param zimbraPrefMailDefaultCharset new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=469)
    public void setPrefMailDefaultCharset(String zimbraPrefMailDefaultCharset) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailDefaultCharset, zimbraPrefMailDefaultCharset);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Default Charset for mail composing and parsing text
     *
     * @param zimbraPrefMailDefaultCharset new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=469)
    public Map<String,Object> setPrefMailDefaultCharset(String zimbraPrefMailDefaultCharset, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailDefaultCharset, zimbraPrefMailDefaultCharset);
        return attrs;
    }

    /**
     * Default Charset for mail composing and parsing text
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=469)
    public void unsetPrefMailDefaultCharset() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailDefaultCharset, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Default Charset for mail composing and parsing text
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=469)
    public Map<String,Object> unsetPrefMailDefaultCharset(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailDefaultCharset, "");
        return attrs;
    }

    /**
     * Flash icon when a new email arrives
     *
     * @return zimbraPrefMailFlashIcon, or false if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=681)
    public boolean isPrefMailFlashIcon() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMailFlashIcon, false);
    }

    /**
     * Flash icon when a new email arrives
     *
     * @param zimbraPrefMailFlashIcon new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=681)
    public void setPrefMailFlashIcon(boolean zimbraPrefMailFlashIcon) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashIcon, zimbraPrefMailFlashIcon ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash icon when a new email arrives
     *
     * @param zimbraPrefMailFlashIcon new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=681)
    public Map<String,Object> setPrefMailFlashIcon(boolean zimbraPrefMailFlashIcon, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashIcon, zimbraPrefMailFlashIcon ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Flash icon when a new email arrives
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=681)
    public void unsetPrefMailFlashIcon() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashIcon, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash icon when a new email arrives
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=681)
    public Map<String,Object> unsetPrefMailFlashIcon(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashIcon, "");
        return attrs;
    }

    /**
     * Flash title bar when a new email arrives
     *
     * @return zimbraPrefMailFlashTitle, or false if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=680)
    public boolean isPrefMailFlashTitle() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMailFlashTitle, false);
    }

    /**
     * Flash title bar when a new email arrives
     *
     * @param zimbraPrefMailFlashTitle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=680)
    public void setPrefMailFlashTitle(boolean zimbraPrefMailFlashTitle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashTitle, zimbraPrefMailFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title bar when a new email arrives
     *
     * @param zimbraPrefMailFlashTitle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=680)
    public Map<String,Object> setPrefMailFlashTitle(boolean zimbraPrefMailFlashTitle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashTitle, zimbraPrefMailFlashTitle ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Flash title bar when a new email arrives
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=680)
    public void unsetPrefMailFlashTitle() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashTitle, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Flash title bar when a new email arrives
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=680)
    public Map<String,Object> unsetPrefMailFlashTitle(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailFlashTitle, "");
        return attrs;
    }

    /**
     * initial search done by dhtml client
     *
     * @return zimbraPrefMailInitialSearch, or "in:inbox" if unset
     */
    @ZAttr(id=102)
    public String getPrefMailInitialSearch() {
        return getAttr(Provisioning.A_zimbraPrefMailInitialSearch, "in:inbox");
    }

    /**
     * initial search done by dhtml client
     *
     * @param zimbraPrefMailInitialSearch new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=102)
    public void setPrefMailInitialSearch(String zimbraPrefMailInitialSearch) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailInitialSearch, zimbraPrefMailInitialSearch);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial search done by dhtml client
     *
     * @param zimbraPrefMailInitialSearch new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=102)
    public Map<String,Object> setPrefMailInitialSearch(String zimbraPrefMailInitialSearch, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailInitialSearch, zimbraPrefMailInitialSearch);
        return attrs;
    }

    /**
     * initial search done by dhtml client
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=102)
    public void unsetPrefMailInitialSearch() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailInitialSearch, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * initial search done by dhtml client
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=102)
    public Map<String,Object> unsetPrefMailInitialSearch(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailInitialSearch, "");
        return attrs;
    }

    /**
     * number of messages/conversations per page
     *
     * @return zimbraPrefMailItemsPerPage, or 25 if unset
     */
    @ZAttr(id=57)
    public int getPrefMailItemsPerPage() {
        return getIntAttr(Provisioning.A_zimbraPrefMailItemsPerPage, 25);
    }

    /**
     * number of messages/conversations per page
     *
     * @param zimbraPrefMailItemsPerPage new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=57)
    public void setPrefMailItemsPerPage(int zimbraPrefMailItemsPerPage) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailItemsPerPage, Integer.toString(zimbraPrefMailItemsPerPage));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of messages/conversations per page
     *
     * @param zimbraPrefMailItemsPerPage new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=57)
    public Map<String,Object> setPrefMailItemsPerPage(int zimbraPrefMailItemsPerPage, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailItemsPerPage, Integer.toString(zimbraPrefMailItemsPerPage));
        return attrs;
    }

    /**
     * number of messages/conversations per page
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=57)
    public void unsetPrefMailItemsPerPage() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailItemsPerPage, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of messages/conversations per page
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=57)
    public Map<String,Object> unsetPrefMailItemsPerPage(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailItemsPerPage, "");
        return attrs;
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * <p>Use getPrefMailPollingIntervalAsString to access value as a string.
     *
     * @see #getPrefMailPollingIntervalAsString()
     *
     * @return zimbraPrefMailPollingInterval in millseconds, or 300000 (5m)  if unset
     */
    @ZAttr(id=111)
    public long getPrefMailPollingInterval() {
        return getTimeInterval(Provisioning.A_zimbraPrefMailPollingInterval, 300000L);
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * @return zimbraPrefMailPollingInterval, or "5m" if unset
     */
    @ZAttr(id=111)
    public String getPrefMailPollingIntervalAsString() {
        return getAttr(Provisioning.A_zimbraPrefMailPollingInterval, "5m");
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * @param zimbraPrefMailPollingInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=111)
    public void setPrefMailPollingInterval(String zimbraPrefMailPollingInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailPollingInterval, zimbraPrefMailPollingInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * @param zimbraPrefMailPollingInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=111)
    public Map<String,Object> setPrefMailPollingInterval(String zimbraPrefMailPollingInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailPollingInterval, zimbraPrefMailPollingInterval);
        return attrs;
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=111)
    public void unsetPrefMailPollingInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailPollingInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * interval at which the web client polls the server for new messages
     * (nnnnn[hmsd])
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=111)
    public Map<String,Object> unsetPrefMailPollingInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailPollingInterval, "");
        return attrs;
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @return zimbraPrefMailSendReadReceipts, or ZAttrProvisioning.PrefMailSendReadReceipts.never if unset and/or has invalid value
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public ZAttrProvisioning.PrefMailSendReadReceipts getPrefMailSendReadReceipts() {
        try { String v = getAttr(Provisioning.A_zimbraPrefMailSendReadReceipts); return v == null ? ZAttrProvisioning.PrefMailSendReadReceipts.never : ZAttrProvisioning.PrefMailSendReadReceipts.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefMailSendReadReceipts.never; }
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @return zimbraPrefMailSendReadReceipts, or "never" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public String getPrefMailSendReadReceiptsAsString() {
        return getAttr(Provisioning.A_zimbraPrefMailSendReadReceipts, "never");
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @param zimbraPrefMailSendReadReceipts new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public void setPrefMailSendReadReceipts(ZAttrProvisioning.PrefMailSendReadReceipts zimbraPrefMailSendReadReceipts) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, zimbraPrefMailSendReadReceipts.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @param zimbraPrefMailSendReadReceipts new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public Map<String,Object> setPrefMailSendReadReceipts(ZAttrProvisioning.PrefMailSendReadReceipts zimbraPrefMailSendReadReceipts, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, zimbraPrefMailSendReadReceipts.toString());
        return attrs;
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @param zimbraPrefMailSendReadReceipts new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public void setPrefMailSendReadReceiptsAsString(String zimbraPrefMailSendReadReceipts) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, zimbraPrefMailSendReadReceipts);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @param zimbraPrefMailSendReadReceipts new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public Map<String,Object> setPrefMailSendReadReceiptsAsString(String zimbraPrefMailSendReadReceipts, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, zimbraPrefMailSendReadReceipts);
        return attrs;
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public void unsetPrefMailSendReadReceipts() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to send read receipt
     *
     * <p>Valid values: [prompt, never, always]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=822)
    public Map<String,Object> unsetPrefMailSendReadReceipts(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSendReadReceipts, "");
        return attrs;
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @return zimbraPrefMailSignatureStyle, or ZAttrProvisioning.PrefMailSignatureStyle.outlook if unset and/or has invalid value
     */
    @ZAttr(id=156)
    public ZAttrProvisioning.PrefMailSignatureStyle getPrefMailSignatureStyle() {
        try { String v = getAttr(Provisioning.A_zimbraPrefMailSignatureStyle); return v == null ? ZAttrProvisioning.PrefMailSignatureStyle.outlook : ZAttrProvisioning.PrefMailSignatureStyle.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefMailSignatureStyle.outlook; }
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @return zimbraPrefMailSignatureStyle, or "outlook" if unset
     */
    @ZAttr(id=156)
    public String getPrefMailSignatureStyleAsString() {
        return getAttr(Provisioning.A_zimbraPrefMailSignatureStyle, "outlook");
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @param zimbraPrefMailSignatureStyle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=156)
    public void setPrefMailSignatureStyle(ZAttrProvisioning.PrefMailSignatureStyle zimbraPrefMailSignatureStyle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, zimbraPrefMailSignatureStyle.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @param zimbraPrefMailSignatureStyle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=156)
    public Map<String,Object> setPrefMailSignatureStyle(ZAttrProvisioning.PrefMailSignatureStyle zimbraPrefMailSignatureStyle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, zimbraPrefMailSignatureStyle.toString());
        return attrs;
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @param zimbraPrefMailSignatureStyle new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=156)
    public void setPrefMailSignatureStyleAsString(String zimbraPrefMailSignatureStyle) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, zimbraPrefMailSignatureStyle);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @param zimbraPrefMailSignatureStyle new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=156)
    public Map<String,Object> setPrefMailSignatureStyleAsString(String zimbraPrefMailSignatureStyle, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, zimbraPrefMailSignatureStyle);
        return attrs;
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=156)
    public void unsetPrefMailSignatureStyle() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * mail signature style outlook|internet (deprecatedSince 5.0 in
     * identity)
     *
     * <p>Valid values: [outlook, internet]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=156)
    public Map<String,Object> unsetPrefMailSignatureStyle(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSignatureStyle, "");
        return attrs;
    }

    /**
     * whether audible alert is enabled when a new email arrives
     *
     * @return zimbraPrefMailSoundsEnabled, or false if unset
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=666)
    public boolean isPrefMailSoundsEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMailSoundsEnabled, false);
    }

    /**
     * whether audible alert is enabled when a new email arrives
     *
     * @param zimbraPrefMailSoundsEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=666)
    public void setPrefMailSoundsEnabled(boolean zimbraPrefMailSoundsEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSoundsEnabled, zimbraPrefMailSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether audible alert is enabled when a new email arrives
     *
     * @param zimbraPrefMailSoundsEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=666)
    public Map<String,Object> setPrefMailSoundsEnabled(boolean zimbraPrefMailSoundsEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSoundsEnabled, zimbraPrefMailSoundsEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether audible alert is enabled when a new email arrives
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=666)
    public void unsetPrefMailSoundsEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSoundsEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether audible alert is enabled when a new email arrives
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.7
     */
    @ZAttr(id=666)
    public Map<String,Object> unsetPrefMailSoundsEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailSoundsEnabled, "");
        return attrs;
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @return zimbraPrefMailToasterEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=812)
    public boolean isPrefMailToasterEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMailToasterEnabled, false);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param zimbraPrefMailToasterEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=812)
    public void setPrefMailToasterEnabled(boolean zimbraPrefMailToasterEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailToasterEnabled, zimbraPrefMailToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param zimbraPrefMailToasterEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=812)
    public Map<String,Object> setPrefMailToasterEnabled(boolean zimbraPrefMailToasterEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailToasterEnabled, zimbraPrefMailToasterEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=812)
    public void unsetPrefMailToasterEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailToasterEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to enable toaster notification for new mail
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=812)
    public Map<String,Object> unsetPrefMailToasterEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMailToasterEnabled, "");
        return attrs;
    }

    /**
     * whether mandatory spell check is enabled
     *
     * @return zimbraPrefMandatorySpellCheckEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=749)
    public boolean isPrefMandatorySpellCheckEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMandatorySpellCheckEnabled, false);
    }

    /**
     * whether mandatory spell check is enabled
     *
     * @param zimbraPrefMandatorySpellCheckEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=749)
    public void setPrefMandatorySpellCheckEnabled(boolean zimbraPrefMandatorySpellCheckEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMandatorySpellCheckEnabled, zimbraPrefMandatorySpellCheckEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether mandatory spell check is enabled
     *
     * @param zimbraPrefMandatorySpellCheckEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=749)
    public Map<String,Object> setPrefMandatorySpellCheckEnabled(boolean zimbraPrefMandatorySpellCheckEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMandatorySpellCheckEnabled, zimbraPrefMandatorySpellCheckEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether mandatory spell check is enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=749)
    public void unsetPrefMandatorySpellCheckEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMandatorySpellCheckEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether mandatory spell check is enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=749)
    public Map<String,Object> unsetPrefMandatorySpellCheckEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMandatorySpellCheckEnabled, "");
        return attrs;
    }

    /**
     * whether and mark a message as read -1: Do not mark read 0: Mark read
     * 1..n: Mark read after this many seconds
     *
     * @return zimbraPrefMarkMsgRead, or 0 if unset
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=650)
    public int getPrefMarkMsgRead() {
        return getIntAttr(Provisioning.A_zimbraPrefMarkMsgRead, 0);
    }

    /**
     * whether and mark a message as read -1: Do not mark read 0: Mark read
     * 1..n: Mark read after this many seconds
     *
     * @param zimbraPrefMarkMsgRead new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=650)
    public void setPrefMarkMsgRead(int zimbraPrefMarkMsgRead) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMarkMsgRead, Integer.toString(zimbraPrefMarkMsgRead));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether and mark a message as read -1: Do not mark read 0: Mark read
     * 1..n: Mark read after this many seconds
     *
     * @param zimbraPrefMarkMsgRead new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=650)
    public Map<String,Object> setPrefMarkMsgRead(int zimbraPrefMarkMsgRead, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMarkMsgRead, Integer.toString(zimbraPrefMarkMsgRead));
        return attrs;
    }

    /**
     * whether and mark a message as read -1: Do not mark read 0: Mark read
     * 1..n: Mark read after this many seconds
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=650)
    public void unsetPrefMarkMsgRead() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMarkMsgRead, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether and mark a message as read -1: Do not mark read 0: Mark read
     * 1..n: Mark read after this many seconds
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=650)
    public Map<String,Object> unsetPrefMarkMsgRead(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMarkMsgRead, "");
        return attrs;
    }

    /**
     * whether client prefers text/html or text/plain
     *
     * @return zimbraPrefMessageViewHtmlPreferred, or true if unset
     */
    @ZAttr(id=145)
    public boolean isPrefMessageViewHtmlPreferred() {
        return getBooleanAttr(Provisioning.A_zimbraPrefMessageViewHtmlPreferred, true);
    }

    /**
     * whether client prefers text/html or text/plain
     *
     * @param zimbraPrefMessageViewHtmlPreferred new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=145)
    public void setPrefMessageViewHtmlPreferred(boolean zimbraPrefMessageViewHtmlPreferred) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMessageViewHtmlPreferred, zimbraPrefMessageViewHtmlPreferred ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether client prefers text/html or text/plain
     *
     * @param zimbraPrefMessageViewHtmlPreferred new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=145)
    public Map<String,Object> setPrefMessageViewHtmlPreferred(boolean zimbraPrefMessageViewHtmlPreferred, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMessageViewHtmlPreferred, zimbraPrefMessageViewHtmlPreferred ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether client prefers text/html or text/plain
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=145)
    public void unsetPrefMessageViewHtmlPreferred() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMessageViewHtmlPreferred, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether client prefers text/html or text/plain
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=145)
    public Map<String,Object> unsetPrefMessageViewHtmlPreferred(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefMessageViewHtmlPreferred, "");
        return attrs;
    }

    /**
     * whether or not the client opens a new msg/conv in a new window (via
     * dbl-click)
     *
     * @return zimbraPrefOpenMailInNewWindow, or false if unset
     */
    @ZAttr(id=500)
    public boolean isPrefOpenMailInNewWindow() {
        return getBooleanAttr(Provisioning.A_zimbraPrefOpenMailInNewWindow, false);
    }

    /**
     * whether or not the client opens a new msg/conv in a new window (via
     * dbl-click)
     *
     * @param zimbraPrefOpenMailInNewWindow new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=500)
    public void setPrefOpenMailInNewWindow(boolean zimbraPrefOpenMailInNewWindow) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOpenMailInNewWindow, zimbraPrefOpenMailInNewWindow ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not the client opens a new msg/conv in a new window (via
     * dbl-click)
     *
     * @param zimbraPrefOpenMailInNewWindow new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=500)
    public Map<String,Object> setPrefOpenMailInNewWindow(boolean zimbraPrefOpenMailInNewWindow, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOpenMailInNewWindow, zimbraPrefOpenMailInNewWindow ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not the client opens a new msg/conv in a new window (via
     * dbl-click)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=500)
    public void unsetPrefOpenMailInNewWindow() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOpenMailInNewWindow, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not the client opens a new msg/conv in a new window (via
     * dbl-click)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=500)
    public Map<String,Object> unsetPrefOpenMailInNewWindow(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOpenMailInNewWindow, "");
        return attrs;
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * <p>Use getPrefOutOfOfficeCacheDurationAsString to access value as a string.
     *
     * @see #getPrefOutOfOfficeCacheDurationAsString()
     *
     * @return zimbraPrefOutOfOfficeCacheDuration in millseconds, or 604800000 (7d)  if unset
     */
    @ZAttr(id=386)
    public long getPrefOutOfOfficeCacheDuration() {
        return getTimeInterval(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, 604800000L);
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * @return zimbraPrefOutOfOfficeCacheDuration, or "7d" if unset
     */
    @ZAttr(id=386)
    public String getPrefOutOfOfficeCacheDurationAsString() {
        return getAttr(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, "7d");
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * @param zimbraPrefOutOfOfficeCacheDuration new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=386)
    public void setPrefOutOfOfficeCacheDuration(String zimbraPrefOutOfOfficeCacheDuration) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, zimbraPrefOutOfOfficeCacheDuration);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * @param zimbraPrefOutOfOfficeCacheDuration new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=386)
    public Map<String,Object> setPrefOutOfOfficeCacheDuration(String zimbraPrefOutOfOfficeCacheDuration, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, zimbraPrefOutOfOfficeCacheDuration);
        return attrs;
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=386)
    public void unsetPrefOutOfOfficeCacheDuration() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * server remembers addresses to which notifications have been sent for
     * this interval, and does not send duplicate notifications in this
     * interval
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=386)
    public Map<String,Object> unsetPrefOutOfOfficeCacheDuration(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefOutOfOfficeCacheDuration, "");
        return attrs;
    }

    /**
     * download pop3 messages since
     *
     * <p>Use getPrefPop3DownloadSinceAsString to access value as a string.
     *
     * @see #getPrefPop3DownloadSinceAsString()
     *
     * @return zimbraPrefPop3DownloadSince as Date, null if unset or unable to parse
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public Date getPrefPop3DownloadSince() {
        return getGeneralizedTimeAttr(Provisioning.A_zimbraPrefPop3DownloadSince, null);
    }

    /**
     * download pop3 messages since
     *
     * @return zimbraPrefPop3DownloadSince, or null if unset
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public String getPrefPop3DownloadSinceAsString() {
        return getAttr(Provisioning.A_zimbraPrefPop3DownloadSince, null);
    }

    /**
     * download pop3 messages since
     *
     * @param zimbraPrefPop3DownloadSince new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public void setPrefPop3DownloadSince(Date zimbraPrefPop3DownloadSince) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, DateUtil.toGeneralizedTime(zimbraPrefPop3DownloadSince));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * download pop3 messages since
     *
     * @param zimbraPrefPop3DownloadSince new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public Map<String,Object> setPrefPop3DownloadSince(Date zimbraPrefPop3DownloadSince, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, DateUtil.toGeneralizedTime(zimbraPrefPop3DownloadSince));
        return attrs;
    }

    /**
     * download pop3 messages since
     *
     * @param zimbraPrefPop3DownloadSince new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public void setPrefPop3DownloadSinceAsString(String zimbraPrefPop3DownloadSince) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, zimbraPrefPop3DownloadSince);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * download pop3 messages since
     *
     * @param zimbraPrefPop3DownloadSince new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public Map<String,Object> setPrefPop3DownloadSinceAsString(String zimbraPrefPop3DownloadSince, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, zimbraPrefPop3DownloadSince);
        return attrs;
    }

    /**
     * download pop3 messages since
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public void unsetPrefPop3DownloadSince() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * download pop3 messages since
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.6
     */
    @ZAttr(id=653)
    public Map<String,Object> unsetPrefPop3DownloadSince(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefPop3DownloadSince, "");
        return attrs;
    }

    /**
     * whether reading pane is shown by default
     *
     * @return zimbraPrefReadingPaneEnabled, or true if unset
     */
    @ZAttr(id=394)
    public boolean isPrefReadingPaneEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefReadingPaneEnabled, true);
    }

    /**
     * whether reading pane is shown by default
     *
     * @param zimbraPrefReadingPaneEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=394)
    public void setPrefReadingPaneEnabled(boolean zimbraPrefReadingPaneEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneEnabled, zimbraPrefReadingPaneEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether reading pane is shown by default
     *
     * @param zimbraPrefReadingPaneEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=394)
    public Map<String,Object> setPrefReadingPaneEnabled(boolean zimbraPrefReadingPaneEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneEnabled, zimbraPrefReadingPaneEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether reading pane is shown by default
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=394)
    public void unsetPrefReadingPaneEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether reading pane is shown by default
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=394)
    public Map<String,Object> unsetPrefReadingPaneEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneEnabled, "");
        return attrs;
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @return zimbraPrefReadingPaneLocation, or ZAttrProvisioning.PrefReadingPaneLocation.bottom if unset and/or has invalid value
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public ZAttrProvisioning.PrefReadingPaneLocation getPrefReadingPaneLocation() {
        try { String v = getAttr(Provisioning.A_zimbraPrefReadingPaneLocation); return v == null ? ZAttrProvisioning.PrefReadingPaneLocation.bottom : ZAttrProvisioning.PrefReadingPaneLocation.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefReadingPaneLocation.bottom; }
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @return zimbraPrefReadingPaneLocation, or "bottom" if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public String getPrefReadingPaneLocationAsString() {
        return getAttr(Provisioning.A_zimbraPrefReadingPaneLocation, "bottom");
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @param zimbraPrefReadingPaneLocation new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public void setPrefReadingPaneLocation(ZAttrProvisioning.PrefReadingPaneLocation zimbraPrefReadingPaneLocation) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, zimbraPrefReadingPaneLocation.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @param zimbraPrefReadingPaneLocation new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public Map<String,Object> setPrefReadingPaneLocation(ZAttrProvisioning.PrefReadingPaneLocation zimbraPrefReadingPaneLocation, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, zimbraPrefReadingPaneLocation.toString());
        return attrs;
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @param zimbraPrefReadingPaneLocation new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public void setPrefReadingPaneLocationAsString(String zimbraPrefReadingPaneLocation) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, zimbraPrefReadingPaneLocation);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @param zimbraPrefReadingPaneLocation new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public Map<String,Object> setPrefReadingPaneLocationAsString(String zimbraPrefReadingPaneLocation, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, zimbraPrefReadingPaneLocation);
        return attrs;
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public void unsetPrefReadingPaneLocation() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * where the message reading pane is displayed
     *
     * <p>Valid values: [bottom, right]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=804)
    public Map<String,Object> unsetPrefReadingPaneLocation(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReadingPaneLocation, "");
        return attrs;
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @return zimbraPrefReplyIncludeOriginalText, or ZAttrProvisioning.PrefReplyIncludeOriginalText.includeBody if unset and/or has invalid value
     */
    @ZAttr(id=133)
    public ZAttrProvisioning.PrefReplyIncludeOriginalText getPrefReplyIncludeOriginalText() {
        try { String v = getAttr(Provisioning.A_zimbraPrefReplyIncludeOriginalText); return v == null ? ZAttrProvisioning.PrefReplyIncludeOriginalText.includeBody : ZAttrProvisioning.PrefReplyIncludeOriginalText.fromString(v); } catch(com.zimbra.common.service.ServiceException e) { return ZAttrProvisioning.PrefReplyIncludeOriginalText.includeBody; }
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @return zimbraPrefReplyIncludeOriginalText, or "includeBody" if unset
     */
    @ZAttr(id=133)
    public String getPrefReplyIncludeOriginalTextAsString() {
        return getAttr(Provisioning.A_zimbraPrefReplyIncludeOriginalText, "includeBody");
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefReplyIncludeOriginalText new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=133)
    public void setPrefReplyIncludeOriginalText(ZAttrProvisioning.PrefReplyIncludeOriginalText zimbraPrefReplyIncludeOriginalText) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, zimbraPrefReplyIncludeOriginalText.toString());
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefReplyIncludeOriginalText new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=133)
    public Map<String,Object> setPrefReplyIncludeOriginalText(ZAttrProvisioning.PrefReplyIncludeOriginalText zimbraPrefReplyIncludeOriginalText, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, zimbraPrefReplyIncludeOriginalText.toString());
        return attrs;
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefReplyIncludeOriginalText new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=133)
    public void setPrefReplyIncludeOriginalTextAsString(String zimbraPrefReplyIncludeOriginalText) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, zimbraPrefReplyIncludeOriginalText);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @param zimbraPrefReplyIncludeOriginalText new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=133)
    public Map<String,Object> setPrefReplyIncludeOriginalTextAsString(String zimbraPrefReplyIncludeOriginalText, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, zimbraPrefReplyIncludeOriginalText);
        return attrs;
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=133)
    public void unsetPrefReplyIncludeOriginalText() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * what part of the original message to include during replies
     * (deprecatedSince 5.0 in identity)
     *
     * <p>Valid values: [includeAsAttachment, includeNone, includeBodyAndHeadersWithPrefix, includeSmart, includeBody, includeBodyWithPrefix]
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=133)
    public Map<String,Object> unsetPrefReplyIncludeOriginalText(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefReplyIncludeOriginalText, "");
        return attrs;
    }

    /**
     * whether or not to save outgoing mail (deprecatedSince 5.0 in identity)
     *
     * @return zimbraPrefSaveToSent, or true if unset
     */
    @ZAttr(id=22)
    public boolean isPrefSaveToSent() {
        return getBooleanAttr(Provisioning.A_zimbraPrefSaveToSent, true);
    }

    /**
     * whether or not to save outgoing mail (deprecatedSince 5.0 in identity)
     *
     * @param zimbraPrefSaveToSent new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=22)
    public void setPrefSaveToSent(boolean zimbraPrefSaveToSent) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSaveToSent, zimbraPrefSaveToSent ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to save outgoing mail (deprecatedSince 5.0 in identity)
     *
     * @param zimbraPrefSaveToSent new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=22)
    public Map<String,Object> setPrefSaveToSent(boolean zimbraPrefSaveToSent, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSaveToSent, zimbraPrefSaveToSent ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not to save outgoing mail (deprecatedSince 5.0 in identity)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=22)
    public void unsetPrefSaveToSent() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSaveToSent, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not to save outgoing mail (deprecatedSince 5.0 in identity)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=22)
    public Map<String,Object> unsetPrefSaveToSent(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSaveToSent, "");
        return attrs;
    }

    /**
     * whether or not search tree is expanded
     *
     * @return zimbraPrefSearchTreeOpen, or true if unset
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=634)
    public boolean isPrefSearchTreeOpen() {
        return getBooleanAttr(Provisioning.A_zimbraPrefSearchTreeOpen, true);
    }

    /**
     * whether or not search tree is expanded
     *
     * @param zimbraPrefSearchTreeOpen new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=634)
    public void setPrefSearchTreeOpen(boolean zimbraPrefSearchTreeOpen) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSearchTreeOpen, zimbraPrefSearchTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not search tree is expanded
     *
     * @param zimbraPrefSearchTreeOpen new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=634)
    public Map<String,Object> setPrefSearchTreeOpen(boolean zimbraPrefSearchTreeOpen, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSearchTreeOpen, zimbraPrefSearchTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not search tree is expanded
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=634)
    public void unsetPrefSearchTreeOpen() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSearchTreeOpen, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not search tree is expanded
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=634)
    public Map<String,Object> unsetPrefSearchTreeOpen(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSearchTreeOpen, "");
        return attrs;
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * <p>Use getPrefSentLifetimeAsString to access value as a string.
     *
     * @see #getPrefSentLifetimeAsString()
     *
     * @return zimbraPrefSentLifetime in millseconds, or 0 (0)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public long getPrefSentLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPrefSentLifetime, 0L);
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * @return zimbraPrefSentLifetime, or "0" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public String getPrefSentLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPrefSentLifetime, "0");
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * @param zimbraPrefSentLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public void setPrefSentLifetime(String zimbraPrefSentLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentLifetime, zimbraPrefSentLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * @param zimbraPrefSentLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public Map<String,Object> setPrefSentLifetime(String zimbraPrefSentLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentLifetime, zimbraPrefSentLifetime);
        return attrs;
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public void unsetPrefSentLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Sent folder. 0 means that all
     * messages will be retained.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=539)
    public Map<String,Object> unsetPrefSentLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentLifetime, "");
        return attrs;
    }

    /**
     * name of folder to save sent mail in (deprecatedSince 5.0 in identity)
     *
     * @return zimbraPrefSentMailFolder, or "sent" if unset
     */
    @ZAttr(id=103)
    public String getPrefSentMailFolder() {
        return getAttr(Provisioning.A_zimbraPrefSentMailFolder, "sent");
    }

    /**
     * name of folder to save sent mail in (deprecatedSince 5.0 in identity)
     *
     * @param zimbraPrefSentMailFolder new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=103)
    public void setPrefSentMailFolder(String zimbraPrefSentMailFolder) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentMailFolder, zimbraPrefSentMailFolder);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * name of folder to save sent mail in (deprecatedSince 5.0 in identity)
     *
     * @param zimbraPrefSentMailFolder new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=103)
    public Map<String,Object> setPrefSentMailFolder(String zimbraPrefSentMailFolder, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentMailFolder, zimbraPrefSentMailFolder);
        return attrs;
    }

    /**
     * name of folder to save sent mail in (deprecatedSince 5.0 in identity)
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=103)
    public void unsetPrefSentMailFolder() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentMailFolder, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * name of folder to save sent mail in (deprecatedSince 5.0 in identity)
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=103)
    public Map<String,Object> unsetPrefSentMailFolder(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSentMailFolder, "");
        return attrs;
    }

    /**
     * whether end-user wants auto-complete from shared address books.
     *
     * @return zimbraPrefSharedAddrBookAutoCompleteEnabled, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=759)
    public boolean isPrefSharedAddrBookAutoCompleteEnabled() {
        return getBooleanAttr(Provisioning.A_zimbraPrefSharedAddrBookAutoCompleteEnabled, false);
    }

    /**
     * whether end-user wants auto-complete from shared address books.
     *
     * @param zimbraPrefSharedAddrBookAutoCompleteEnabled new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=759)
    public void setPrefSharedAddrBookAutoCompleteEnabled(boolean zimbraPrefSharedAddrBookAutoCompleteEnabled) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSharedAddrBookAutoCompleteEnabled, zimbraPrefSharedAddrBookAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants auto-complete from shared address books.
     *
     * @param zimbraPrefSharedAddrBookAutoCompleteEnabled new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=759)
    public Map<String,Object> setPrefSharedAddrBookAutoCompleteEnabled(boolean zimbraPrefSharedAddrBookAutoCompleteEnabled, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSharedAddrBookAutoCompleteEnabled, zimbraPrefSharedAddrBookAutoCompleteEnabled ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether end-user wants auto-complete from shared address books.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=759)
    public void unsetPrefSharedAddrBookAutoCompleteEnabled() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSharedAddrBookAutoCompleteEnabled, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether end-user wants auto-complete from shared address books.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=759)
    public Map<String,Object> unsetPrefSharedAddrBookAutoCompleteEnabled(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSharedAddrBookAutoCompleteEnabled, "");
        return attrs;
    }

    /**
     * keyboard shortcuts
     *
     * @return zimbraPrefShortcuts, or null if unset
     */
    @ZAttr(id=396)
    public String getPrefShortcuts() {
        return getAttr(Provisioning.A_zimbraPrefShortcuts, null);
    }

    /**
     * keyboard shortcuts
     *
     * @param zimbraPrefShortcuts new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=396)
    public void setPrefShortcuts(String zimbraPrefShortcuts) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShortcuts, zimbraPrefShortcuts);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * keyboard shortcuts
     *
     * @param zimbraPrefShortcuts new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=396)
    public Map<String,Object> setPrefShortcuts(String zimbraPrefShortcuts, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShortcuts, zimbraPrefShortcuts);
        return attrs;
    }

    /**
     * keyboard shortcuts
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=396)
    public void unsetPrefShortcuts() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShortcuts, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * keyboard shortcuts
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=396)
    public Map<String,Object> unsetPrefShortcuts(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShortcuts, "");
        return attrs;
    }

    /**
     * show fragments in conversation and message lists
     *
     * @return zimbraPrefShowFragments, or true if unset
     */
    @ZAttr(id=192)
    public boolean isPrefShowFragments() {
        return getBooleanAttr(Provisioning.A_zimbraPrefShowFragments, true);
    }

    /**
     * show fragments in conversation and message lists
     *
     * @param zimbraPrefShowFragments new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=192)
    public void setPrefShowFragments(boolean zimbraPrefShowFragments) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowFragments, zimbraPrefShowFragments ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * show fragments in conversation and message lists
     *
     * @param zimbraPrefShowFragments new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=192)
    public Map<String,Object> setPrefShowFragments(boolean zimbraPrefShowFragments, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowFragments, zimbraPrefShowFragments ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * show fragments in conversation and message lists
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=192)
    public void unsetPrefShowFragments() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowFragments, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * show fragments in conversation and message lists
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=192)
    public Map<String,Object> unsetPrefShowFragments(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowFragments, "");
        return attrs;
    }

    /**
     * whether to show search box or not
     *
     * @return zimbraPrefShowSearchString, or false if unset
     */
    @ZAttr(id=222)
    public boolean isPrefShowSearchString() {
        return getBooleanAttr(Provisioning.A_zimbraPrefShowSearchString, false);
    }

    /**
     * whether to show search box or not
     *
     * @param zimbraPrefShowSearchString new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=222)
    public void setPrefShowSearchString(boolean zimbraPrefShowSearchString) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSearchString, zimbraPrefShowSearchString ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to show search box or not
     *
     * @param zimbraPrefShowSearchString new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=222)
    public Map<String,Object> setPrefShowSearchString(boolean zimbraPrefShowSearchString, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSearchString, zimbraPrefShowSearchString ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to show search box or not
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=222)
    public void unsetPrefShowSearchString() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSearchString, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to show search box or not
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=222)
    public Map<String,Object> unsetPrefShowSearchString(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSearchString, "");
        return attrs;
    }

    /**
     * show selection checkbox for selecting email, contact, voicemial items
     * in a list view for batch operations
     *
     * @return zimbraPrefShowSelectionCheckbox, or true if unset
     */
    @ZAttr(id=471)
    public boolean isPrefShowSelectionCheckbox() {
        return getBooleanAttr(Provisioning.A_zimbraPrefShowSelectionCheckbox, true);
    }

    /**
     * show selection checkbox for selecting email, contact, voicemial items
     * in a list view for batch operations
     *
     * @param zimbraPrefShowSelectionCheckbox new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=471)
    public void setPrefShowSelectionCheckbox(boolean zimbraPrefShowSelectionCheckbox) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSelectionCheckbox, zimbraPrefShowSelectionCheckbox ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * show selection checkbox for selecting email, contact, voicemial items
     * in a list view for batch operations
     *
     * @param zimbraPrefShowSelectionCheckbox new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=471)
    public Map<String,Object> setPrefShowSelectionCheckbox(boolean zimbraPrefShowSelectionCheckbox, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSelectionCheckbox, zimbraPrefShowSelectionCheckbox ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * show selection checkbox for selecting email, contact, voicemial items
     * in a list view for batch operations
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=471)
    public void unsetPrefShowSelectionCheckbox() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSelectionCheckbox, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * show selection checkbox for selecting email, contact, voicemial items
     * in a list view for batch operations
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=471)
    public Map<String,Object> unsetPrefShowSelectionCheckbox(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefShowSelectionCheckbox, "");
        return attrs;
    }

    /**
     * Skin to use for this account
     *
     * @return zimbraPrefSkin, or "beach" if unset
     */
    @ZAttr(id=355)
    public String getPrefSkin() {
        return getAttr(Provisioning.A_zimbraPrefSkin, "beach");
    }

    /**
     * Skin to use for this account
     *
     * @param zimbraPrefSkin new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=355)
    public void setPrefSkin(String zimbraPrefSkin) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSkin, zimbraPrefSkin);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skin to use for this account
     *
     * @param zimbraPrefSkin new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=355)
    public Map<String,Object> setPrefSkin(String zimbraPrefSkin, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSkin, zimbraPrefSkin);
        return attrs;
    }

    /**
     * Skin to use for this account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=355)
    public void unsetPrefSkin() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSkin, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Skin to use for this account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=355)
    public Map<String,Object> unsetPrefSkin(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefSkin, "");
        return attrs;
    }

    /**
     * whether standard client should operate in accessibility Mode
     *
     * @return zimbraPrefStandardClientAccessibilityMode, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=689)
    public boolean isPrefStandardClientAccessibilityMode() {
        return getBooleanAttr(Provisioning.A_zimbraPrefStandardClientAccessibilityMode, false);
    }

    /**
     * whether standard client should operate in accessibility Mode
     *
     * @param zimbraPrefStandardClientAccessibilityMode new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=689)
    public void setPrefStandardClientAccessibilityMode(boolean zimbraPrefStandardClientAccessibilityMode) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefStandardClientAccessibilityMode, zimbraPrefStandardClientAccessibilityMode ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether standard client should operate in accessibility Mode
     *
     * @param zimbraPrefStandardClientAccessibilityMode new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=689)
    public Map<String,Object> setPrefStandardClientAccessibilityMode(boolean zimbraPrefStandardClientAccessibilityMode, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefStandardClientAccessibilityMode, zimbraPrefStandardClientAccessibilityMode ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether standard client should operate in accessibility Mode
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=689)
    public void unsetPrefStandardClientAccessibilityMode() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefStandardClientAccessibilityMode, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether standard client should operate in accessibility Mode
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=689)
    public Map<String,Object> unsetPrefStandardClientAccessibilityMode(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefStandardClientAccessibilityMode, "");
        return attrs;
    }

    /**
     * whether or not tag tree is expanded
     *
     * @return zimbraPrefTagTreeOpen, or true if unset
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=633)
    public boolean isPrefTagTreeOpen() {
        return getBooleanAttr(Provisioning.A_zimbraPrefTagTreeOpen, true);
    }

    /**
     * whether or not tag tree is expanded
     *
     * @param zimbraPrefTagTreeOpen new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=633)
    public void setPrefTagTreeOpen(boolean zimbraPrefTagTreeOpen) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTagTreeOpen, zimbraPrefTagTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not tag tree is expanded
     *
     * @param zimbraPrefTagTreeOpen new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=633)
    public Map<String,Object> setPrefTagTreeOpen(boolean zimbraPrefTagTreeOpen, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTagTreeOpen, zimbraPrefTagTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not tag tree is expanded
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=633)
    public void unsetPrefTagTreeOpen() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTagTreeOpen, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not tag tree is expanded
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=633)
    public Map<String,Object> unsetPrefTagTreeOpen(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTagTreeOpen, "");
        return attrs;
    }

    /**
     * time zone of user or COS
     *
     * @return zimbraPrefTimeZoneId, or ampty array if unset
     */
    @ZAttr(id=235)
    public String[] getPrefTimeZoneId() {
        String[] value = getMultiAttr(Provisioning.A_zimbraPrefTimeZoneId); return value.length > 0 ? value : new String[] {"(GMT-08.00) Pacific Time (US & Canada)"};
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=235)
    public void setPrefTimeZoneId(String[] zimbraPrefTimeZoneId) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=235)
    public Map<String,Object> setPrefTimeZoneId(String[] zimbraPrefTimeZoneId, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        return attrs;
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=235)
    public void addPrefTimeZoneId(String zimbraPrefTimeZoneId) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=235)
    public Map<String,Object> addPrefTimeZoneId(String zimbraPrefTimeZoneId, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        return attrs;
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=235)
    public void removePrefTimeZoneId(String zimbraPrefTimeZoneId) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time zone of user or COS
     *
     * @param zimbraPrefTimeZoneId existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=235)
    public Map<String,Object> removePrefTimeZoneId(String zimbraPrefTimeZoneId, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraPrefTimeZoneId, zimbraPrefTimeZoneId);
        return attrs;
    }

    /**
     * time zone of user or COS
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=235)
    public void unsetPrefTimeZoneId() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTimeZoneId, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * time zone of user or COS
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=235)
    public Map<String,Object> unsetPrefTimeZoneId(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTimeZoneId, "");
        return attrs;
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * <p>Use getPrefTrashLifetimeAsString to access value as a string.
     *
     * @see #getPrefTrashLifetimeAsString()
     *
     * @return zimbraPrefTrashLifetime in millseconds, or 0 (0)  if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public long getPrefTrashLifetime() {
        return getTimeInterval(Provisioning.A_zimbraPrefTrashLifetime, 0L);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @return zimbraPrefTrashLifetime, or "0" if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public String getPrefTrashLifetimeAsString() {
        return getAttr(Provisioning.A_zimbraPrefTrashLifetime, "0");
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraPrefTrashLifetime new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public void setPrefTrashLifetime(String zimbraPrefTrashLifetime) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTrashLifetime, zimbraPrefTrashLifetime);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param zimbraPrefTrashLifetime new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public Map<String,Object> setPrefTrashLifetime(String zimbraPrefTrashLifetime, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTrashLifetime, zimbraPrefTrashLifetime);
        return attrs;
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public void unsetPrefTrashLifetime() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTrashLifetime, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Retention period of messages in the Trash folder. 0 means that all
     * messages will be retained. This user-modifiable attribute works in
     * conjunction with zimbraMailTrashLifetime, which is admin-modifiable.
     * The shorter duration is used.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=541)
    public Map<String,Object> unsetPrefTrashLifetime(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefTrashLifetime, "");
        return attrs;
    }

    /**
     * whether or not keyboard shortcuts are enabled
     *
     * @return zimbraPrefUseKeyboardShortcuts, or true if unset
     */
    @ZAttr(id=61)
    public boolean isPrefUseKeyboardShortcuts() {
        return getBooleanAttr(Provisioning.A_zimbraPrefUseKeyboardShortcuts, true);
    }

    /**
     * whether or not keyboard shortcuts are enabled
     *
     * @param zimbraPrefUseKeyboardShortcuts new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=61)
    public void setPrefUseKeyboardShortcuts(boolean zimbraPrefUseKeyboardShortcuts) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseKeyboardShortcuts, zimbraPrefUseKeyboardShortcuts ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not keyboard shortcuts are enabled
     *
     * @param zimbraPrefUseKeyboardShortcuts new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=61)
    public Map<String,Object> setPrefUseKeyboardShortcuts(boolean zimbraPrefUseKeyboardShortcuts, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseKeyboardShortcuts, zimbraPrefUseKeyboardShortcuts ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not keyboard shortcuts are enabled
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=61)
    public void unsetPrefUseKeyboardShortcuts() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseKeyboardShortcuts, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not keyboard shortcuts are enabled
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=61)
    public Map<String,Object> unsetPrefUseKeyboardShortcuts(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseKeyboardShortcuts, "");
        return attrs;
    }

    /**
     * When composing and sending mail, whether to use RFC 2231 MIME
     * parameter value encoding. If set to FALSE, then RFC 2047 style
     * encoding is used.
     *
     * @return zimbraPrefUseRfc2231, or false if unset
     */
    @ZAttr(id=395)
    public boolean isPrefUseRfc2231() {
        return getBooleanAttr(Provisioning.A_zimbraPrefUseRfc2231, false);
    }

    /**
     * When composing and sending mail, whether to use RFC 2231 MIME
     * parameter value encoding. If set to FALSE, then RFC 2047 style
     * encoding is used.
     *
     * @param zimbraPrefUseRfc2231 new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=395)
    public void setPrefUseRfc2231(boolean zimbraPrefUseRfc2231) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseRfc2231, zimbraPrefUseRfc2231 ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When composing and sending mail, whether to use RFC 2231 MIME
     * parameter value encoding. If set to FALSE, then RFC 2047 style
     * encoding is used.
     *
     * @param zimbraPrefUseRfc2231 new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=395)
    public Map<String,Object> setPrefUseRfc2231(boolean zimbraPrefUseRfc2231, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseRfc2231, zimbraPrefUseRfc2231 ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * When composing and sending mail, whether to use RFC 2231 MIME
     * parameter value encoding. If set to FALSE, then RFC 2047 style
     * encoding is used.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=395)
    public void unsetPrefUseRfc2231() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseRfc2231, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * When composing and sending mail, whether to use RFC 2231 MIME
     * parameter value encoding. If set to FALSE, then RFC 2047 style
     * encoding is used.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=395)
    public Map<String,Object> unsetPrefUseRfc2231(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseRfc2231, "");
        return attrs;
    }

    /**
     * whether list of well known time zones is displayed in calendar UI
     *
     * @return zimbraPrefUseTimeZoneListInCalendar, or false if unset
     */
    @ZAttr(id=236)
    public boolean isPrefUseTimeZoneListInCalendar() {
        return getBooleanAttr(Provisioning.A_zimbraPrefUseTimeZoneListInCalendar, false);
    }

    /**
     * whether list of well known time zones is displayed in calendar UI
     *
     * @param zimbraPrefUseTimeZoneListInCalendar new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=236)
    public void setPrefUseTimeZoneListInCalendar(boolean zimbraPrefUseTimeZoneListInCalendar) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseTimeZoneListInCalendar, zimbraPrefUseTimeZoneListInCalendar ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether list of well known time zones is displayed in calendar UI
     *
     * @param zimbraPrefUseTimeZoneListInCalendar new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=236)
    public Map<String,Object> setPrefUseTimeZoneListInCalendar(boolean zimbraPrefUseTimeZoneListInCalendar, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseTimeZoneListInCalendar, zimbraPrefUseTimeZoneListInCalendar ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether list of well known time zones is displayed in calendar UI
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=236)
    public void unsetPrefUseTimeZoneListInCalendar() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseTimeZoneListInCalendar, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether list of well known time zones is displayed in calendar UI
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=236)
    public Map<String,Object> unsetPrefUseTimeZoneListInCalendar(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefUseTimeZoneListInCalendar, "");
        return attrs;
    }

    /**
     * number of voice messages/call logs per page
     *
     * @return zimbraPrefVoiceItemsPerPage, or 25 if unset
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=526)
    public int getPrefVoiceItemsPerPage() {
        return getIntAttr(Provisioning.A_zimbraPrefVoiceItemsPerPage, 25);
    }

    /**
     * number of voice messages/call logs per page
     *
     * @param zimbraPrefVoiceItemsPerPage new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=526)
    public void setPrefVoiceItemsPerPage(int zimbraPrefVoiceItemsPerPage) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefVoiceItemsPerPage, Integer.toString(zimbraPrefVoiceItemsPerPage));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of voice messages/call logs per page
     *
     * @param zimbraPrefVoiceItemsPerPage new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=526)
    public Map<String,Object> setPrefVoiceItemsPerPage(int zimbraPrefVoiceItemsPerPage, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefVoiceItemsPerPage, Integer.toString(zimbraPrefVoiceItemsPerPage));
        return attrs;
    }

    /**
     * number of voice messages/call logs per page
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=526)
    public void unsetPrefVoiceItemsPerPage() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefVoiceItemsPerPage, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * number of voice messages/call logs per page
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.0
     */
    @ZAttr(id=526)
    public Map<String,Object> unsetPrefVoiceItemsPerPage(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefVoiceItemsPerPage, "");
        return attrs;
    }

    /**
     * whether to display a warning when users try to navigate away from ZCS
     *
     * @return zimbraPrefWarnOnExit, or true if unset
     */
    @ZAttr(id=456)
    public boolean isPrefWarnOnExit() {
        return getBooleanAttr(Provisioning.A_zimbraPrefWarnOnExit, true);
    }

    /**
     * whether to display a warning when users try to navigate away from ZCS
     *
     * @param zimbraPrefWarnOnExit new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=456)
    public void setPrefWarnOnExit(boolean zimbraPrefWarnOnExit) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefWarnOnExit, zimbraPrefWarnOnExit ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to display a warning when users try to navigate away from ZCS
     *
     * @param zimbraPrefWarnOnExit new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=456)
    public Map<String,Object> setPrefWarnOnExit(boolean zimbraPrefWarnOnExit, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefWarnOnExit, zimbraPrefWarnOnExit ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether to display a warning when users try to navigate away from ZCS
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=456)
    public void unsetPrefWarnOnExit() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefWarnOnExit, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether to display a warning when users try to navigate away from ZCS
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=456)
    public Map<String,Object> unsetPrefWarnOnExit(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefWarnOnExit, "");
        return attrs;
    }

    /**
     * whether or not zimlet tree is expanded
     *
     * @return zimbraPrefZimletTreeOpen, or false if unset
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=638)
    public boolean isPrefZimletTreeOpen() {
        return getBooleanAttr(Provisioning.A_zimbraPrefZimletTreeOpen, false);
    }

    /**
     * whether or not zimlet tree is expanded
     *
     * @param zimbraPrefZimletTreeOpen new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=638)
    public void setPrefZimletTreeOpen(boolean zimbraPrefZimletTreeOpen) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimletTreeOpen, zimbraPrefZimletTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not zimlet tree is expanded
     *
     * @param zimbraPrefZimletTreeOpen new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=638)
    public Map<String,Object> setPrefZimletTreeOpen(boolean zimbraPrefZimletTreeOpen, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimletTreeOpen, zimbraPrefZimletTreeOpen ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * whether or not zimlet tree is expanded
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=638)
    public void unsetPrefZimletTreeOpen() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimletTreeOpen, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * whether or not zimlet tree is expanded
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.5
     */
    @ZAttr(id=638)
    public Map<String,Object> unsetPrefZimletTreeOpen(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimletTreeOpen, "");
        return attrs;
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @return zimbraPrefZimlets, or ampty array if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public String[] getPrefZimlets() {
        return getMultiAttr(Provisioning.A_zimbraPrefZimlets);
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public void setPrefZimlets(String[] zimbraPrefZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public Map<String,Object> setPrefZimlets(String[] zimbraPrefZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        return attrs;
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public void addPrefZimlets(String zimbraPrefZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public Map<String,Object> addPrefZimlets(String zimbraPrefZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        return attrs;
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public void removePrefZimlets(String zimbraPrefZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param zimbraPrefZimlets existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public Map<String,Object> removePrefZimlets(String zimbraPrefZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraPrefZimlets, zimbraPrefZimlets);
        return attrs;
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public void unsetPrefZimlets() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimlets, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * zimlets user wants to see in the UI note: zimlets available to a user
     * is the union of account/cos attr zimbraZimletAvailableZimlets and
     * domain attr zimbraZimletDomainAvailableZimlets
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=765)
    public Map<String,Object> unsetPrefZimlets(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraPrefZimlets, "");
        return attrs;
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @return zimbraProxyAllowedDomains, or ampty array if unset
     */
    @ZAttr(id=294)
    public String[] getProxyAllowedDomains() {
        return getMultiAttr(Provisioning.A_zimbraProxyAllowedDomains);
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=294)
    public void setProxyAllowedDomains(String[] zimbraProxyAllowedDomains) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=294)
    public Map<String,Object> setProxyAllowedDomains(String[] zimbraProxyAllowedDomains, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        return attrs;
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=294)
    public void addProxyAllowedDomains(String zimbraProxyAllowedDomains) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=294)
    public Map<String,Object> addProxyAllowedDomains(String zimbraProxyAllowedDomains, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        return attrs;
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=294)
    public void removeProxyAllowedDomains(String zimbraProxyAllowedDomains) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param zimbraProxyAllowedDomains existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=294)
    public Map<String,Object> removeProxyAllowedDomains(String zimbraProxyAllowedDomains, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraProxyAllowedDomains, zimbraProxyAllowedDomains);
        return attrs;
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=294)
    public void unsetProxyAllowedDomains() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyAllowedDomains, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Allowed domains for Proxy servlet
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=294)
    public Map<String,Object> unsetProxyAllowedDomains(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyAllowedDomains, "");
        return attrs;
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @return zimbraProxyCacheableContentTypes, or ampty array if unset
     */
    @ZAttr(id=303)
    public String[] getProxyCacheableContentTypes() {
        String[] value = getMultiAttr(Provisioning.A_zimbraProxyCacheableContentTypes); return value.length > 0 ? value : new String[] {"text/javascript","application/x-javascript"};
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=303)
    public void setProxyCacheableContentTypes(String[] zimbraProxyCacheableContentTypes) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=303)
    public Map<String,Object> setProxyCacheableContentTypes(String[] zimbraProxyCacheableContentTypes, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        return attrs;
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=303)
    public void addProxyCacheableContentTypes(String zimbraProxyCacheableContentTypes) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=303)
    public Map<String,Object> addProxyCacheableContentTypes(String zimbraProxyCacheableContentTypes, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        return attrs;
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=303)
    public void removeProxyCacheableContentTypes(String zimbraProxyCacheableContentTypes) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param zimbraProxyCacheableContentTypes existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=303)
    public Map<String,Object> removeProxyCacheableContentTypes(String zimbraProxyCacheableContentTypes, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraProxyCacheableContentTypes, zimbraProxyCacheableContentTypes);
        return attrs;
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=303)
    public void unsetProxyCacheableContentTypes() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyCacheableContentTypes, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Content types that can be cached by proxy servlet
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=303)
    public Map<String,Object> unsetProxyCacheableContentTypes(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraProxyCacheableContentTypes, "");
        return attrs;
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * <p>Use getQuotaWarnIntervalAsString to access value as a string.
     *
     * @see #getQuotaWarnIntervalAsString()
     *
     * @return zimbraQuotaWarnInterval in millseconds, or 86400000 (1d)  if unset
     */
    @ZAttr(id=485)
    public long getQuotaWarnInterval() {
        return getTimeInterval(Provisioning.A_zimbraQuotaWarnInterval, 86400000L);
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * @return zimbraQuotaWarnInterval, or "1d" if unset
     */
    @ZAttr(id=485)
    public String getQuotaWarnIntervalAsString() {
        return getAttr(Provisioning.A_zimbraQuotaWarnInterval, "1d");
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * @param zimbraQuotaWarnInterval new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=485)
    public void setQuotaWarnInterval(String zimbraQuotaWarnInterval) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnInterval, zimbraQuotaWarnInterval);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * @param zimbraQuotaWarnInterval new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=485)
    public Map<String,Object> setQuotaWarnInterval(String zimbraQuotaWarnInterval, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnInterval, zimbraQuotaWarnInterval);
        return attrs;
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=485)
    public void unsetQuotaWarnInterval() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnInterval, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Minimum duration of time between quota warnings.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=485)
    public Map<String,Object> unsetQuotaWarnInterval(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnInterval, "");
        return attrs;
    }

    /**
     * Quota warning message template.
     *
     * @return zimbraQuotaWarnMessage, or "From: Postmaster <postmaster@${RECIPIENT_DOMAIN}>${NEWLINE}To: ${RECIPIENT_NAME} <${RECIPIENT_ADDRESS}>${NEWLINE}Subject: Quota warning${NEWLINE}Date: ${DATE}${NEWLINE}Content-Type: text/plain${NEWLINE}${NEWLINE}Your mailbox size has reached ${MBOX_SIZE_MB}MB, which is over ${WARN_PERCENT}% of your ${QUOTA_MB}MB quota.${NEWLINE}Please delete some messages to avoid exceeding your quota.${NEWLINE}" if unset
     */
    @ZAttr(id=486)
    public String getQuotaWarnMessage() {
        return getAttr(Provisioning.A_zimbraQuotaWarnMessage, "From: Postmaster <postmaster@${RECIPIENT_DOMAIN}>${NEWLINE}To: ${RECIPIENT_NAME} <${RECIPIENT_ADDRESS}>${NEWLINE}Subject: Quota warning${NEWLINE}Date: ${DATE}${NEWLINE}Content-Type: text/plain${NEWLINE}${NEWLINE}Your mailbox size has reached ${MBOX_SIZE_MB}MB, which is over ${WARN_PERCENT}% of your ${QUOTA_MB}MB quota.${NEWLINE}Please delete some messages to avoid exceeding your quota.${NEWLINE}");
    }

    /**
     * Quota warning message template.
     *
     * @param zimbraQuotaWarnMessage new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=486)
    public void setQuotaWarnMessage(String zimbraQuotaWarnMessage) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnMessage, zimbraQuotaWarnMessage);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Quota warning message template.
     *
     * @param zimbraQuotaWarnMessage new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=486)
    public Map<String,Object> setQuotaWarnMessage(String zimbraQuotaWarnMessage, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnMessage, zimbraQuotaWarnMessage);
        return attrs;
    }

    /**
     * Quota warning message template.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=486)
    public void unsetQuotaWarnMessage() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnMessage, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Quota warning message template.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=486)
    public Map<String,Object> unsetQuotaWarnMessage(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnMessage, "");
        return attrs;
    }

    /**
     * Threshold for quota warning messages.
     *
     * @return zimbraQuotaWarnPercent, or 90 if unset
     */
    @ZAttr(id=483)
    public int getQuotaWarnPercent() {
        return getIntAttr(Provisioning.A_zimbraQuotaWarnPercent, 90);
    }

    /**
     * Threshold for quota warning messages.
     *
     * @param zimbraQuotaWarnPercent new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=483)
    public void setQuotaWarnPercent(int zimbraQuotaWarnPercent) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnPercent, Integer.toString(zimbraQuotaWarnPercent));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Threshold for quota warning messages.
     *
     * @param zimbraQuotaWarnPercent new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=483)
    public Map<String,Object> setQuotaWarnPercent(int zimbraQuotaWarnPercent, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnPercent, Integer.toString(zimbraQuotaWarnPercent));
        return attrs;
    }

    /**
     * Threshold for quota warning messages.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=483)
    public void unsetQuotaWarnPercent() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnPercent, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Threshold for quota warning messages.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=483)
    public Map<String,Object> unsetQuotaWarnPercent(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraQuotaWarnPercent, "");
        return attrs;
    }

    /**
     * maximum number of signatures allowed on an account
     *
     * @return zimbraSignatureMaxNumEntries, or 20 if unset
     */
    @ZAttr(id=493)
    public int getSignatureMaxNumEntries() {
        return getIntAttr(Provisioning.A_zimbraSignatureMaxNumEntries, 20);
    }

    /**
     * maximum number of signatures allowed on an account
     *
     * @param zimbraSignatureMaxNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=493)
    public void setSignatureMaxNumEntries(int zimbraSignatureMaxNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMaxNumEntries, Integer.toString(zimbraSignatureMaxNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of signatures allowed on an account
     *
     * @param zimbraSignatureMaxNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=493)
    public Map<String,Object> setSignatureMaxNumEntries(int zimbraSignatureMaxNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMaxNumEntries, Integer.toString(zimbraSignatureMaxNumEntries));
        return attrs;
    }

    /**
     * maximum number of signatures allowed on an account
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=493)
    public void unsetSignatureMaxNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMaxNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * maximum number of signatures allowed on an account
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=493)
    public Map<String,Object> unsetSignatureMaxNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMaxNumEntries, "");
        return attrs;
    }

    /**
     * minimum number of signatures allowed on an account, this is only used
     * in the client
     *
     * @return zimbraSignatureMinNumEntries, or 1 if unset
     */
    @ZAttr(id=523)
    public int getSignatureMinNumEntries() {
        return getIntAttr(Provisioning.A_zimbraSignatureMinNumEntries, 1);
    }

    /**
     * minimum number of signatures allowed on an account, this is only used
     * in the client
     *
     * @param zimbraSignatureMinNumEntries new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=523)
    public void setSignatureMinNumEntries(int zimbraSignatureMinNumEntries) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMinNumEntries, Integer.toString(zimbraSignatureMinNumEntries));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of signatures allowed on an account, this is only used
     * in the client
     *
     * @param zimbraSignatureMinNumEntries new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=523)
    public Map<String,Object> setSignatureMinNumEntries(int zimbraSignatureMinNumEntries, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMinNumEntries, Integer.toString(zimbraSignatureMinNumEntries));
        return attrs;
    }

    /**
     * minimum number of signatures allowed on an account, this is only used
     * in the client
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=523)
    public void unsetSignatureMinNumEntries() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMinNumEntries, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * minimum number of signatures allowed on an account, this is only used
     * in the client
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=523)
    public Map<String,Object> unsetSignatureMinNumEntries(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSignatureMinNumEntries, "");
        return attrs;
    }

    /**
     * Whether to enable smtp debug trace
     *
     * @return zimbraSmtpEnableTrace, or false if unset
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=793)
    public boolean isSmtpEnableTrace() {
        return getBooleanAttr(Provisioning.A_zimbraSmtpEnableTrace, false);
    }

    /**
     * Whether to enable smtp debug trace
     *
     * @param zimbraSmtpEnableTrace new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=793)
    public void setSmtpEnableTrace(boolean zimbraSmtpEnableTrace) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSmtpEnableTrace, zimbraSmtpEnableTrace ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether to enable smtp debug trace
     *
     * @param zimbraSmtpEnableTrace new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=793)
    public Map<String,Object> setSmtpEnableTrace(boolean zimbraSmtpEnableTrace, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSmtpEnableTrace, zimbraSmtpEnableTrace ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * Whether to enable smtp debug trace
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=793)
    public void unsetSmtpEnableTrace() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSmtpEnableTrace, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * Whether to enable smtp debug trace
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 6.0.0
     */
    @ZAttr(id=793)
    public Map<String,Object> unsetSmtpEnableTrace(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSmtpEnableTrace, "");
        return attrs;
    }

    /**
     * If TRUE, spam messages will be affected by user mail filters instead
     * of being automatically filed into the Junk folder. This attribute is
     * deprecated and will be removed in a future release. See bug 23886 for
     * details.
     *
     * @return zimbraSpamApplyUserFilters, or false if unset
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=604)
    public boolean isSpamApplyUserFilters() {
        return getBooleanAttr(Provisioning.A_zimbraSpamApplyUserFilters, false);
    }

    /**
     * If TRUE, spam messages will be affected by user mail filters instead
     * of being automatically filed into the Junk folder. This attribute is
     * deprecated and will be removed in a future release. See bug 23886 for
     * details.
     *
     * @param zimbraSpamApplyUserFilters new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=604)
    public void setSpamApplyUserFilters(boolean zimbraSpamApplyUserFilters) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSpamApplyUserFilters, zimbraSpamApplyUserFilters ? Provisioning.TRUE : Provisioning.FALSE);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If TRUE, spam messages will be affected by user mail filters instead
     * of being automatically filed into the Junk folder. This attribute is
     * deprecated and will be removed in a future release. See bug 23886 for
     * details.
     *
     * @param zimbraSpamApplyUserFilters new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=604)
    public Map<String,Object> setSpamApplyUserFilters(boolean zimbraSpamApplyUserFilters, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSpamApplyUserFilters, zimbraSpamApplyUserFilters ? Provisioning.TRUE : Provisioning.FALSE);
        return attrs;
    }

    /**
     * If TRUE, spam messages will be affected by user mail filters instead
     * of being automatically filed into the Junk folder. This attribute is
     * deprecated and will be removed in a future release. See bug 23886 for
     * details.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=604)
    public void unsetSpamApplyUserFilters() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSpamApplyUserFilters, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * If TRUE, spam messages will be affected by user mail filters instead
     * of being automatically filed into the Junk folder. This attribute is
     * deprecated and will be removed in a future release. See bug 23886 for
     * details.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     *
     * @since ZCS 5.0.2
     */
    @ZAttr(id=604)
    public Map<String,Object> unsetSpamApplyUserFilters(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSpamApplyUserFilters, "");
        return attrs;
    }

    /**
     * The maximum batch size for each ZimbraSync transaction. Default value
     * of 0 means to follow client requested size. If set to any positive
     * integer, the value will be the maximum number of items to sync even if
     * client requests more. This setting affects all sync categories
     * including email, contacts, calendar and tasks.
     *
     * @return zimbraSyncWindowSize, or 0 if unset
     */
    @ZAttr(id=437)
    public int getSyncWindowSize() {
        return getIntAttr(Provisioning.A_zimbraSyncWindowSize, 0);
    }

    /**
     * The maximum batch size for each ZimbraSync transaction. Default value
     * of 0 means to follow client requested size. If set to any positive
     * integer, the value will be the maximum number of items to sync even if
     * client requests more. This setting affects all sync categories
     * including email, contacts, calendar and tasks.
     *
     * @param zimbraSyncWindowSize new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=437)
    public void setSyncWindowSize(int zimbraSyncWindowSize) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSyncWindowSize, Integer.toString(zimbraSyncWindowSize));
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The maximum batch size for each ZimbraSync transaction. Default value
     * of 0 means to follow client requested size. If set to any positive
     * integer, the value will be the maximum number of items to sync even if
     * client requests more. This setting affects all sync categories
     * including email, contacts, calendar and tasks.
     *
     * @param zimbraSyncWindowSize new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=437)
    public Map<String,Object> setSyncWindowSize(int zimbraSyncWindowSize, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSyncWindowSize, Integer.toString(zimbraSyncWindowSize));
        return attrs;
    }

    /**
     * The maximum batch size for each ZimbraSync transaction. Default value
     * of 0 means to follow client requested size. If set to any positive
     * integer, the value will be the maximum number of items to sync even if
     * client requests more. This setting affects all sync categories
     * including email, contacts, calendar and tasks.
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=437)
    public void unsetSyncWindowSize() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSyncWindowSize, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The maximum batch size for each ZimbraSync transaction. Default value
     * of 0 means to follow client requested size. If set to any positive
     * integer, the value will be the maximum number of items to sync even if
     * client requests more. This setting affects all sync categories
     * including email, contacts, calendar and tasks.
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=437)
    public Map<String,Object> unsetSyncWindowSize(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraSyncWindowSize, "");
        return attrs;
    }

    /**
     * The registered name of the Zimbra Analyzer Extension for this account
     * to use
     *
     * @return zimbraTextAnalyzer, or null if unset
     */
    @ZAttr(id=393)
    public String getTextAnalyzer() {
        return getAttr(Provisioning.A_zimbraTextAnalyzer, null);
    }

    /**
     * The registered name of the Zimbra Analyzer Extension for this account
     * to use
     *
     * @param zimbraTextAnalyzer new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=393)
    public void setTextAnalyzer(String zimbraTextAnalyzer) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraTextAnalyzer, zimbraTextAnalyzer);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The registered name of the Zimbra Analyzer Extension for this account
     * to use
     *
     * @param zimbraTextAnalyzer new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=393)
    public Map<String,Object> setTextAnalyzer(String zimbraTextAnalyzer, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraTextAnalyzer, zimbraTextAnalyzer);
        return attrs;
    }

    /**
     * The registered name of the Zimbra Analyzer Extension for this account
     * to use
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=393)
    public void unsetTextAnalyzer() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraTextAnalyzer, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * The registered name of the Zimbra Analyzer Extension for this account
     * to use
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=393)
    public Map<String,Object> unsetTextAnalyzer(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraTextAnalyzer, "");
        return attrs;
    }

    /**
     * List of Zimlets available to this COS
     *
     * @return zimbraZimletAvailableZimlets, or ampty array if unset
     */
    @ZAttr(id=291)
    public String[] getZimletAvailableZimlets() {
        return getMultiAttr(Provisioning.A_zimbraZimletAvailableZimlets);
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets new value
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=291)
    public void setZimletAvailableZimlets(String[] zimbraZimletAvailableZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets new value
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=291)
    public Map<String,Object> setZimletAvailableZimlets(String[] zimbraZimletAvailableZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        return attrs;
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets new to add to existing values
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=291)
    public void addZimletAvailableZimlets(String zimbraZimletAvailableZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets new to add to existing values
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=291)
    public Map<String,Object> addZimletAvailableZimlets(String zimbraZimletAvailableZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "+" + Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        return attrs;
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets existing value to remove
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=291)
    public void removeZimletAvailableZimlets(String zimbraZimletAvailableZimlets) throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param zimbraZimletAvailableZimlets existing value to remove
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=291)
    public Map<String,Object> removeZimletAvailableZimlets(String zimbraZimletAvailableZimlets, Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        StringUtil.addToMultiMap(attrs, "-" + Provisioning.A_zimbraZimletAvailableZimlets, zimbraZimletAvailableZimlets);
        return attrs;
    }

    /**
     * List of Zimlets available to this COS
     *
     * @throws com.zimbra.common.service.ServiceException if error during update
     */
    @ZAttr(id=291)
    public void unsetZimletAvailableZimlets() throws com.zimbra.common.service.ServiceException {
        HashMap<String,Object> attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraZimletAvailableZimlets, "");
        getProvisioning().modifyAttrs(this, attrs);
    }

    /**
     * List of Zimlets available to this COS
     *
     * @param attrs existing map to populate, or null to create a new map
     * @return populated map to pass into Provisioning.modifyAttrs
     */
    @ZAttr(id=291)
    public Map<String,Object> unsetZimletAvailableZimlets(Map<String,Object> attrs) {
        if (attrs == null) attrs = new HashMap<String,Object>();
        attrs.put(Provisioning.A_zimbraZimletAvailableZimlets, "");
        return attrs;
    }

    ///// END-AUTO-GEN-REPLACE

}
