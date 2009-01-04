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
package com.zimbra.cs.offline.ab;

import com.zimbra.cs.mailbox.Contact;
import com.zimbra.cs.mailbox.Contact.Attachment;
import com.zimbra.common.service.ServiceException;

import java.util.Map;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AbUtil {
    public static String getFileAs(Map<String, String> fields) {
        if (!fields.containsKey(Contact.A_firstName) &&
            !fields.containsKey(Contact.A_lastName)) {
            String fileAs;
            if ((fileAs = fields.get(Contact.A_fullName)) != null ||
                (fileAs = fields.get(Contact.A_nickname)) != null ||
                (fileAs = fields.get(Contact.A_email)) != null ||
                (fileAs = fields.get(Contact.A_email2)) != null ||
                (fileAs = fields.get(Contact.A_workEmail1)) != null ||
                (fileAs = fields.get(Contact.A_imAddress1)) != null) {
                return fileAs;
            }
        }
        return null;
    }

    public static Attachment getPhoto(Contact contact) {
        for (Attachment attachment : contact.getAttachments()) {
            if (attachment.getName().equalsIgnoreCase(Contact.A_image) &&
                attachment.getContentType().startsWith("image/")) {
                return attachment;
            }
        }
        return null;
    }

    public static byte[] getContent(Contact contact, Attachment attach)
        throws ServiceException {
        try {
            return attach.getContent(contact);
        } catch (Exception e) {
            throw ServiceException.FAILURE(
                "Unable to get photo attachment for item id " + contact.getId(), e);
        }
    }

    public static byte[] readFully(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int len;
        while ((len = is.read(buf)) != -1) {
            baos.write(buf, 0, len);
        }
        return baos.toByteArray();
    }
}
