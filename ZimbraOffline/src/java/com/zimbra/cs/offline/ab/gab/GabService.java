/*
 * ***** BEGIN LICENSE BLOCK *****
 *
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2007, 2008 Zimbra, Inc.
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
package com.zimbra.cs.offline.ab.gab;

import com.zimbra.cs.offline.OfflineLC;
import com.zimbra.cs.offline.OfflineLog;
import com.zimbra.cs.offline.ab.AbUtil;
import com.zimbra.cs.mailbox.Contact;
import com.zimbra.cs.mailbox.Contact.Attachment;
import com.zimbra.common.service.ServiceException;
import com.zimbra.common.util.Log;
import com.google.gdata.client.contacts.ContactsService;
import com.google.gdata.client.Query;
import com.google.gdata.client.Service.GDataRequest;
import com.google.gdata.client.Service.GDataRequest.RequestType;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.VersionConflictException;
import com.google.gdata.util.ContentType;
import com.google.gdata.util.common.xml.XmlWriter;
import com.google.gdata.data.BaseEntry;
import com.google.gdata.data.ParseSource;
import com.google.gdata.data.BaseFeed;
import com.google.gdata.data.DateTime;
import com.google.gdata.data.Link;
import com.google.gdata.data.contacts.ContactEntry;
import com.google.gdata.data.contacts.ContactFeed;
import com.google.gdata.data.contacts.ContactGroupFeed;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.StringWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.EnumSet;

class GabService {
    private final ContactsService cs;
    private final URL contactFeedUrl;
    private final URL groupFeedUrl;

    private static final Log LOG = OfflineLog.gab;

    private static final String BASE_URL = OfflineLC.zdesktop_gab_base_url.value();

    private static final String APP_NAME = String.format("Zimbra-%s-%s",
        OfflineLC.zdesktop_name.value(), OfflineLC.zdesktop_version.value());
    
    GabService(String user, String pass) throws ServiceException {
        this.cs = new ContactsService(APP_NAME);
        contactFeedUrl = toUrl(BASE_URL + "/contacts/" + user + "/full");
        groupFeedUrl = toUrl(BASE_URL + "/groups/" + user + "/full");
        authenticate(user, pass);
    }

    private void authenticate(String user, String pass) throws ServiceException {
        try {
            cs.setUserCredentials(user, pass);
        } catch (AuthenticationException e) {
            throw ServiceException.FAILURE("Google address book authentication failed", e);
        }
    }

    public ContactFeed getContacts(DateTime updatedMin, DateTime updatedMax)
        throws IOException, ServiceException {
        return getFeed(contactFeedUrl, ContactFeed.class, updatedMin, updatedMax);
    }

    public ContactGroupFeed getGroups(DateTime updatedMin, DateTime updatedMax)
        throws IOException, ServiceException {
        return getFeed(groupFeedUrl, ContactGroupFeed.class, updatedMin, updatedMax);
    }

    private <T extends BaseFeed> T getFeed(URL feedUrl, Class <T> feedClass,
                                           DateTime updatedMin, DateTime updatedMax)
        throws IOException, ServiceException {
        try {
            Query query = new Query(feedUrl);
            query.setMaxResults(9999999);
            query.setUpdatedMax(updatedMax);
            if (updatedMin != null) {
                // Only show deleted entries if this is not initial sync
                query.setUpdatedMin(updatedMin);
                query.setStringCustomParameter("showdeleted", "true");
            }
            return cs.getFeed(query, feedClass, updatedMin);
        } catch (com.google.gdata.util.ServiceException e) {
            throw ServiceException.FAILURE(
                "Unable to retrieve feed: " + feedUrl, e);
        }
    }

    public <T extends BaseEntry> T parseEntry(String xml, Class<T> entryClass)
        throws ServiceException {
        try {
            return BaseEntry.readEntry(new ParseSource(new StringReader(xml)),
                                       entryClass, cs.getExtensionProfile());
        } catch (Exception e) {
            throw ServiceException.FAILURE("Unable to parse contact data", e);
        }
    }

    public String pp(BaseEntry entry) {
        try {
            StringWriter sw = new StringWriter();
            XmlWriter xw = new XmlWriter(sw,
                EnumSet.of(XmlWriter.WriterFlags.PRETTY_PRINT), null);
            entry.generateAtom(xw, cs.getExtensionProfile());
            return sw.toString();
        } catch (IOException e) {
            return "<Unavailable>";
        }
    }

    public String toXml(BaseEntry entry) throws ServiceException {
        StringWriter sw = new StringWriter();
        try {
            entry.generateAtom(new XmlWriter(sw), cs.getExtensionProfile());
            return sw.toString();
        } catch (IOException e) {
            throw ServiceException.FAILURE(
                "Unable to generate XML for entry id " + entry.getId() , e);
        }
    }
    
    public BaseEntry getCurrentEntry(VersionConflictException e,
                                     Class<? extends BaseEntry> entryClass)
        throws ServiceException, IOException {
        String xml = e.getResponseBody();
        if (xml == null) {
            throw ServiceException.FAILURE("Missing response body", null);
        }
        return parseEntry(xml, entryClass);
    }

    public <T extends BaseEntry> T insert(T entry)
        throws IOException, com.google.gdata.util.ServiceException {
        return cs.insert(getFeedUrl(entry), entry);
    }

    public <T extends BaseEntry> T update(T entry)
        throws IOException, com.google.gdata.util.ServiceException {
        return cs.update(getEditUrl(entry), entry);
    }

    public void delete(BaseEntry entry)
        throws IOException, com.google.gdata.util.ServiceException {
        cs.delete(getEditUrl(entry));
    }

    public void addPhoto(ContactEntry entry, byte[] data, String type)
        throws IOException, com.google.gdata.util.ServiceException {
        URL url = new URL(entry.getContactEditPhotoLink().getHref());
        GDataRequest req = cs.createRequest(RequestType.UPDATE, url, new ContentType(type));
        req.getRequestStream().write(data);
        req.execute();
        LOG.debug("Added photo for entry %s: edit url = %s, size = %d, type = %s",
                  entry.getId(), url, data.length, type);
    }

    public Attachment getPhoto(ContactEntry entry)
        throws IOException, com.google.gdata.util.ServiceException {
        Link link = entry.getContactPhotoLink();
        if (link == null) return null;
        URL url = new URL(link.getHref());
        GDataRequest req = cs.createRequest(RequestType.QUERY, url, null);
        req.execute();
        ContentType ctype = req.getResponseContentType();
        byte[] content = AbUtil.readFully(req.getResponseStream());
        LOG.debug("Retrieved photo for entry %s: size = %d, type = %s",
                  entry.getId(), content.length, ctype.getMediaType());
        return new Attachment(content, ctype.getMediaType(), Contact.A_image, null);
    }

    public void deletePhoto(ContactEntry entry)
        throws IOException, com.google.gdata.util.ServiceException {
        URL url = new URL(entry.getContactEditPhotoLink().getHref());
        cs.delete(url);
        LOG.debug("Deleted photo for entry %s: edit url = %s", entry.getId(), url);
    }

    private URL getFeedUrl(BaseEntry entry) {
        return entry.getClass() == ContactEntry.class ? contactFeedUrl : groupFeedUrl;
    }
    
    private static URL getEditUrl(BaseEntry entry) throws MalformedURLException {
        return new URL(entry.getEditLink().getHref());
    }
    
    private static URL toUrl(String url) throws ServiceException {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw ServiceException.FAILURE("Bad URL format: " + url, null);
        }
    }
}
