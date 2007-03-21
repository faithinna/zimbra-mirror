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
 * Portions created by Zimbra are Copyright (C) 2006, 2007 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s): 
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.mailbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.soap.MailConstants;
import com.zimbra.common.soap.Element;
import com.zimbra.common.util.StringUtil;
import com.zimbra.cs.mailbox.OfflineMailbox.OfflineContext;
import com.zimbra.cs.offline.OfflineLog;
import com.zimbra.cs.service.mail.SyncOperation;
import com.zimbra.cs.session.PendingModifications.Change;

public class DeltaSync {

    private static final OfflineContext sContext = new OfflineContext();

    private final OfflineMailbox ombx;
    private final Set<Integer> mSyncRenames = new HashSet<Integer>();
    private InitialSync isync;

    DeltaSync(OfflineMailbox mbox) {
        ombx = mbox;
    }

    DeltaSync(InitialSync initial) {
        ombx = initial.getMailbox();
        isync = initial;
    }

    OfflineMailbox getMailbox() {
        return ombx;
    }

    private InitialSync getInitialSync() {
        if (isync == null)
            isync = new InitialSync(this);
        return isync;
    }


    public static String sync(OfflineMailbox ombx) throws ServiceException {
        return new DeltaSync(ombx).sync();
    }

    public String sync() throws ServiceException {
        String oldToken = ombx.getSyncToken();
        if (oldToken == null)
            oldToken = InitialSync.sync(ombx);

        Element request = new Element.XMLElement(MailConstants.SYNC_REQUEST).addAttribute(MailConstants.A_TOKEN, oldToken).addAttribute(MailConstants.A_TYPED_DELETES, true);
        Element response = ombx.sendRequest(request);
        String newToken = response.getAttribute(MailConstants.A_TOKEN);

        OfflineLog.offline.debug("starting delta sync");
        deltaSync(response);
        if (!newToken.equals(oldToken))
            ombx.recordSyncComplete(newToken);
        OfflineLog.offline.debug("ending delta sync");

        return newToken;
    }

    private void deltaSync(Element response) throws ServiceException {
        // make sure to handle deletes first, as tags can reuse ids
        Set<Integer> foldersToDelete = processLeafDeletes(response);

        // sync down metadata changes and note items that need to be downloaded in full
        Map<Integer, Integer> messages = null, deltamsgs = null, contacts = null;
        for (Element change : response.listElements()) {
            int id = (int) change.getAttributeLong(MailConstants.A_ID);
            String type = change.getName();

            if (type.equals(MailConstants.E_TAG)) {
                syncTag(change);
                continue;
            }

            int folderId = (id == Mailbox.ID_FOLDER_ROOT ? Mailbox.ID_FOLDER_ROOT : (int) change.getAttributeLong(MailConstants.A_FOLDER));
            boolean create = (change.getAttribute(MailConstants.A_FLAGS, null) == null);

            if (type.equals(MailConstants.E_MSG)) {
                if (create && canDeltaSyncMessage(id, change))
                    (deltamsgs == null ? deltamsgs = new HashMap<Integer,Integer>() : deltamsgs).put(id, folderId);
                else if (create)
                    (messages == null ? messages = new HashMap<Integer,Integer>() : messages).put(id, folderId);
                else
                    syncMessage(change, folderId);
            } else if (type.equals(MailConstants.E_CONTACT)) {
                if (create)
                    (contacts == null ? contacts = new HashMap<Integer,Integer>() : contacts).put(id, folderId);
                else
                    syncContact(change, folderId);
            } else if (InitialSync.KNOWN_FOLDER_TYPES.contains(type)) {
                // can't tell new folders from modified ones, so might as well go through the initial sync process
                syncContainer(change, id);
            }
        }

        // for messages and contacts that are created or had their content modified, fetch new content
        if (deltamsgs != null) {
            Element request = new Element.XMLElement(MailConstants.GET_MSG_METADATA_REQUEST);
            request.addElement(MailConstants.E_MSG).addAttribute(MailConstants.A_IDS, StringUtil.join(",", deltamsgs.keySet()));
            for (Element elt : ombx.sendRequest(request).listElements())
                syncMessage(elt, deltamsgs.get((int) elt.getAttributeLong(MailConstants.A_ID)));
        }
        if (messages != null) {
            for (Map.Entry<Integer,Integer> msgdata : messages.entrySet())
                getInitialSync().syncMessage(msgdata.getKey(), msgdata.getValue());
        }
        if (contacts != null) {
            for (Element elt : InitialSync.fetchContacts(ombx, StringUtil.join(",", contacts.keySet())).listElements())
                getInitialSync().syncContact(elt, contacts.get((int) elt.getAttributeLong(MailConstants.A_ID)));
        }

        // delete any deleted folders, starting from the bottom of the tree
        if (foldersToDelete != null && !foldersToDelete.isEmpty()) {
            synchronized (ombx) {
                List<Folder> folders = ombx.getFolderById(sContext, Mailbox.ID_FOLDER_ROOT).getSubfolderHierarchy();
                Collections.reverse(folders);
                for (Folder folder : folders) {
                    if (foldersToDelete.remove(folder.getId()))
                        processFolderDelete(folder);
                }
            }
        }
    }

    private boolean canDeltaSyncMessage(int id, Element change) throws ServiceException {
        try {
            Message msg = ombx.getMessageById(sContext, id);
            if (msg.getSavedSequence() != change.getAttributeLong(MailConstants.A_REVISION, -1))
                return false;
            if (msg.getModifiedSequence() != change.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE))
                return false;
            return true;
        } catch (MailServiceException.NoSuchItemException e) {
            return false;
        }
    }

    private Set<Integer> processLeafDeletes(Element response) throws ServiceException {
        Element delement = response.getOptionalElement(MailConstants.E_DELETED);
        if (delement == null)
            return null;
        delement.detach();

        // sort the deleted items into a bucket of leaf nodes to delete now and a set of folders to delete later
        List<Integer> leafIds = new ArrayList<Integer>(), tagIds = new ArrayList<Integer>();
        Set<Integer> foldersToDelete = new HashSet<Integer>();

        // sort the deleted items into two sets: leaves and folders
        for (Element deltype : delement.listElements()) {
            byte type = SyncOperation.typeForElementName(deltype.getName());
            if (type == MailItem.TYPE_UNKNOWN || type == MailItem.TYPE_CONVERSATION)
                continue;
            boolean isTag = type == MailItem.TYPE_TAG;
            boolean isFolder = InitialSync.KNOWN_FOLDER_TYPES.contains(deltype.getName());
            for (String idStr : deltype.getAttribute(MailConstants.A_IDS).split(",")) {
                Integer id = Integer.valueOf(idStr);
                // tag numbering conflict issues: don't delete tags we've created locally
                if (isTag && (ombx.getChangeMask(sContext, id, type) & Change.MODIFIED_CONFLICT) != 0)
                    continue;
                (isFolder ? foldersToDelete : leafIds).add(id);
                if (isTag)
                    tagIds.add(id);
            }
        }

        // temporary workaround because tags are left off the "typed delete" list up to 4.5.2
        for (String idStr : delement.getAttribute(MailConstants.A_IDS).split(",")) {
            Integer id = Integer.valueOf(idStr);
            if (id < MailItem.TAG_ID_OFFSET || id >= MailItem.TAG_ID_OFFSET + MailItem.MAX_TAG_COUNT || tagIds.contains(id))
                continue;
            // tag numbering conflict issues: don't delete tags we've created locally
            if ((ombx.getChangeMask(sContext, id, MailItem.TYPE_TAG) & Change.MODIFIED_CONFLICT) != 0)
                continue;
            leafIds.add(id);  tagIds.add(id);
        }

        // delete all the leaves now
        int idx = 0, ids[] = new int[leafIds.size()];
        for (int id : leafIds)
            ids[idx++] = id;
        ombx.delete(sContext, ids, MailItem.TYPE_UNKNOWN, null);
        OfflineLog.offline.debug("delta: deleted leaves: " + Arrays.toString(ids));

        // avoid some nasty corner cases caused by tag id reuse
        for (int tagId : tagIds)
            ombx.removePendingDelete(sContext, tagId, MailItem.TYPE_TAG);

        // save the folder deletes for later
        return (foldersToDelete.isEmpty() ? null : foldersToDelete);
    }

    private void processFolderDelete(Folder folder) throws ServiceException {
        if (!folder.isDeletable()) {
            OfflineLog.offline.warn("delta: cannot delete " + MailItem.getNameForType(folder) + " (" + folder.getId() + "): " + folder.getName());
            return;
        }

        if (folder.getSize() == 0 && !folder.hasSubfolders()) {
            // normal case: contents have already been deleted via processLeafDeletes()
            ombx.delete(sContext, folder.getId(), folder.getType());
            OfflineLog.offline.debug("delta: deleted folder: " + folder.getId());
            return;
        }

        // mark the remote folder for re-creation in order to hold its local contents
        ombx.setChangeMask(sContext, folder.getId(), folder.getType(), Change.MODIFIED_CONFLICT);
        // mark all the contents as moved so that they appear in the remote folder
        for (int contained : ombx.listItemIds(sContext, MailItem.TYPE_UNKNOWN, folder.getId())) {
            int change_mask = ombx.getChangeMask(sContext, contained, MailItem.TYPE_UNKNOWN);
            if ((change_mask & (Change.MODIFIED_FOLDER | Change.MODIFIED_CONFLICT)) == 0)
                ombx.setChangeMask(sContext, contained, MailItem.TYPE_UNKNOWN, change_mask | Change.MODIFIED_FOLDER);
        }
        OfflineLog.offline.debug("delta: queued folder for recreate: " + folder.getId());
    }

    private void syncContainer(Element elt, int id) throws ServiceException {
        String type = elt.getName();
        if (type.equalsIgnoreCase(MailConstants.E_SEARCH))
            syncSearchFolder(elt, id);
        else if (type.equalsIgnoreCase(MailConstants.E_MOUNT))
            syncMountpoint(elt, id);
        else if (type.equalsIgnoreCase(MailConstants.E_FOLDER))
            syncFolder(elt, id);
    }

    void syncSearchFolder(Element elt, int id) throws ServiceException {
        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);
        int flags = Flag.flagsToBitmask(elt.getAttribute(MailConstants.A_FLAGS, null));

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE, -1000) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION, -1);

        String query = elt.getAttribute(MailConstants.A_QUERY);
        String searchTypes = elt.getAttribute(MailConstants.A_SEARCH_TYPES);
        String sort = elt.getAttribute(MailConstants.A_SORTBY);

        synchronized (ombx) {
            // deal with the case where the referenced search folder doesn't exist
            Folder folder = getFolder(id);
            if (folder == null) {
                // if it's been locally deleted but not pushed to the server yet, just return and let the delete happen later
                if (ombx.isPendingDelete(sContext, id, MailItem.TYPE_SEARCHFOLDER))
                    return;
                // resolve any naming conflicts and actually create the folder
                if (resolveFolderConflicts(elt, id, MailItem.TYPE_SEARCHFOLDER, folder)) {
                    getInitialSync().syncSearchFolder(elt, id);
                    return;
                } else {
                    folder = getFolder(id);
                }
            }

            // if the search folder was moved/renamed locally, that trumps any changes made remotely
            resolveFolderConflicts(elt, id, MailItem.TYPE_SEARCHFOLDER, folder);

            int parentId = (int) elt.getAttributeLong(MailConstants.A_FOLDER);
            String name = elt.getAttribute(MailConstants.A_NAME);

            int change_mask = ombx.getChangeMask(sContext, id, MailItem.TYPE_SEARCHFOLDER);
            ombx.rename(sContext, id, MailItem.TYPE_SEARCHFOLDER, name, parentId);
            if ((change_mask & Change.MODIFIED_QUERY) == 0)
                ombx.modifySearchFolder(sContext, id, query, searchTypes, sort);
            ombx.syncMetadata(sContext, id, MailItem.TYPE_SEARCHFOLDER, parentId, flags, 0, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_SEARCHFOLDER, date, mod_content, timestamp, changeId);

            if (elt.getAttributeBool(InitialSync.A_RELOCATED, false))
                ombx.setChangeMask(sContext, id, MailItem.TYPE_SEARCHFOLDER, change_mask | Change.MODIFIED_FOLDER | Change.MODIFIED_NAME);

            OfflineLog.offline.debug("delta: updated search folder (" + id + "): " + name);
        }
    }

    void syncMountpoint(Element elt, int id) throws ServiceException {
        int flags = Flag.flagsToBitmask(elt.getAttribute(MailConstants.A_FLAGS, null));
        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE, -1000) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION, -1);

        synchronized (ombx) {
            // deal with the case where the referenced mountpoint doesn't exist
            Folder folder = getFolder(id);
            if (folder == null) {
                // if it's been locally deleted but not pushed to the server yet, just return and let the delete happen later
                if (ombx.isPendingDelete(sContext, id, MailItem.TYPE_MOUNTPOINT))
                    return;
                // resolve any naming conflicts and actually create the folder
                if (resolveFolderConflicts(elt, id, MailItem.TYPE_MOUNTPOINT, folder)) {
                    getInitialSync().syncMountpoint(elt, id);
                    return;
                } else {
                    folder = getFolder(id);
                }
            }

            // if the mountpoint was moved/renamed locally, that trumps any changes made remotely
            resolveFolderConflicts(elt, id, MailItem.TYPE_MOUNTPOINT, folder);

            int parentId = (int) elt.getAttributeLong(MailConstants.A_FOLDER);
            String name = elt.getAttribute(MailConstants.A_NAME);

            ombx.rename(sContext, id, MailItem.TYPE_MOUNTPOINT, name, parentId);
            ombx.syncMetadata(sContext, id, MailItem.TYPE_MOUNTPOINT, parentId, flags, 0, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_MOUNTPOINT, date, mod_content, timestamp, changeId);

            int change_mask = ombx.getChangeMask(sContext, id, MailItem.TYPE_TAG);
            if (elt.getAttributeBool(InitialSync.A_RELOCATED, false))
                ombx.setChangeMask(sContext, id, MailItem.TYPE_MOUNTPOINT, change_mask | Change.MODIFIED_FOLDER | Change.MODIFIED_NAME);

            OfflineLog.offline.debug("delta: updated mountpoint (" + id + "): " + name);
        }
    }

    void syncFolder(Element elt, int id) throws ServiceException {
        int flags = Flag.flagsToBitmask(elt.getAttribute(MailConstants.A_FLAGS, null)) & ~Flag.BITMASK_UNREAD;
        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);
        String url = elt.getAttribute(MailConstants.A_URL, null);

        ACL acl = getInitialSync().parseACL(elt.getOptionalElement(MailConstants.E_ACL));

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE, -1000) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION, -1);

        synchronized (ombx) {
            // deal with the case where the referenced folder doesn't exist
            Folder folder = getFolder(id);
            if (folder == null) {
                // if it's been locally deleted but not pushed to the server yet, just return and let the delete happen later
                if (ombx.isPendingDelete(sContext, id, MailItem.TYPE_FOLDER))
                    return;
                // resolve any naming conflicts and actually create the folder
                if (resolveFolderConflicts(elt, id, MailItem.TYPE_FOLDER, folder)) {
                    getInitialSync().syncFolder(elt, id);
                    return;
                } else {
                    folder = getFolder(id);
                }
            }

            // if the folder was moved/renamed locally, that trumps any changes made remotely
            resolveFolderConflicts(elt, id, MailItem.TYPE_FOLDER, folder);

            int parentId = (id == Mailbox.ID_FOLDER_ROOT) ? id : (int) elt.getAttributeLong(MailConstants.A_FOLDER);
            String name = (id == Mailbox.ID_FOLDER_ROOT) ? "ROOT" : elt.getAttribute(MailConstants.A_NAME);

            int change_mask = ombx.getChangeMask(sContext, id, MailItem.TYPE_FOLDER);
            if (id != Mailbox.ID_FOLDER_ROOT)
                ombx.rename(sContext, id, MailItem.TYPE_FOLDER, name, parentId);
            // XXX: do we need to sync if the folder has perms but the new ACL is empty?
            if ((change_mask & Change.MODIFIED_ACL) == 0 && acl != null)
                ombx.setPermissions(sContext, id, acl);
            if ((change_mask & Change.MODIFIED_URL) == 0)
                ombx.setFolderUrl(sContext, id, url);
            // don't care about current feed syncpoint; sync can't be done offline
            ombx.syncMetadata(sContext, id, MailItem.TYPE_FOLDER, parentId, flags, 0, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_FOLDER, date, mod_content, timestamp, changeId);

            if (elt.getAttributeBool(InitialSync.A_RELOCATED, false))
                ombx.setChangeMask(sContext, id, MailItem.TYPE_FOLDER, change_mask | Change.MODIFIED_FOLDER | Change.MODIFIED_NAME);

            OfflineLog.offline.debug("delta: updated folder (" + id + "): " + name);
        }
    }

    private Folder getFolder(int id) throws ServiceException {
        try {
            return ombx.getFolderById(sContext, id);
        } catch (MailServiceException.NoSuchItemException nsie) {
            return null;
        }
    }

    private boolean resolveFolderConflicts(Element elt, int id, byte type, Folder local) throws ServiceException {
        int change_mask = (local == null ? 0 : ombx.getChangeMask(sContext, id, type));

        // if the folder was moved/renamed locally, that trumps any changes made remotely
        int parentId = (id == Mailbox.ID_FOLDER_ROOT) ? id : (int) elt.getAttributeLong(MailConstants.A_FOLDER);
        if ((change_mask & Change.MODIFIED_FOLDER) != 0) {
            parentId = local.getFolderId();  elt.addAttribute(MailConstants.A_FOLDER, parentId);
        }

        String name = (id == Mailbox.ID_FOLDER_ROOT) ? "ROOT" : elt.getAttribute(MailConstants.A_NAME);
        if ((change_mask & Change.MODIFIED_NAME) != 0 && !mSyncRenames.contains(id)) {
            name = local.getName();  elt.addAttribute(MailConstants.A_NAME, name);
        } else {
            // handle the off-chance that the server's folder name is invalid
            String validName = MailItem.normalizeItemName(name);
            if (!validName.equals(name)) {
                name = validName;  elt.addAttribute(MailConstants.A_NAME, name).addAttribute(InitialSync.A_RELOCATED, true);
            }
        }

        // if the parent folder doesn't exist or is of an incompatible type, default to using the top-level user folder as the container
        Folder parent = getFolder(parentId);
        if (parent == null || !parent.canContain(type)) {
            parentId = Mailbox.ID_FOLDER_USER_ROOT;  parent = getFolder(parentId);
            elt.addAttribute(MailConstants.A_FOLDER, parentId).addAttribute(InitialSync.A_RELOCATED, true);
        }

        Folder conflict = parent.findSubfolder(name);
        if (conflict != null && conflict.getId() != id) {
            int conflict_mask = ombx.getChangeMask(sContext, conflict.getId(), conflict.getType());

            String uuid = '{' + UUID.randomUUID().toString() + '}', newName;
            if (name.length() + uuid.length() > MailItem.MAX_NAME_LENGTH)
                newName = name.substring(0, MailItem.MAX_NAME_LENGTH - uuid.length()) + uuid;
            else
                newName = name + uuid;

            if (local == null && (conflict_mask & Change.MODIFIED_CONFLICT) != 0 && isCompatibleFolder(conflict, elt, type)) {
                // if the new and existing folders are identical and being created, try to merge them
                ombx.renumberItem(sContext, conflict.getId(), type, id);
                ombx.setChangeMask(sContext, id, type, conflict_mask & ~Change.MODIFIED_CONFLICT);
                return false;
            } else if (!conflict.isMutable() || (conflict_mask & Change.MODIFIED_NAME) != 0) {
                // either the local user also renamed the folder or the folder's immutable, so the local client wins
                name = newName;
                elt.addAttribute(MailConstants.A_NAME, name).addAttribute(InitialSync.A_RELOCATED, true);
            } else {
                // if there's a folder naming conflict within the target folder, usually push the local folder out of the way
                ombx.rename(null, conflict.getId(), conflict.getType(), newName);
                if ((conflict_mask & Change.MODIFIED_NAME) == 0)
                    mSyncRenames.add(conflict.getId());
            }
        }

        // if conflicts have forced us to deviate from the specified sync, update the local store such that these changes are pushed during the next sync
        if (local != null && elt.getAttributeBool(InitialSync.A_RELOCATED, false))
            ombx.rename(null, id, type, name, parentId);

        return true;
    }

    private boolean isCompatibleFolder(Folder folder, Element elt, byte type) {
        if (type != folder.getType())
            return false;

        if (type == MailItem.TYPE_FOLDER)
           return folder.getDefaultView() == MailItem.getTypeForName(elt.getAttribute(MailConstants.A_DEFAULT_VIEW, null));
        else
            return false;
    }

    void syncTag(Element elt) throws ServiceException {
        int id = (int) elt.getAttributeLong(MailConstants.A_ID);
        String name = elt.getAttribute(MailConstants.A_NAME);
        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION);

        synchronized (ombx) {
            Tag tag = getTag(id);

            // we're reusing tag IDs, so it's possible that we've got a conflict with a locally-created tag with that ID
            if (tag != null && !name.equalsIgnoreCase(tag.getName()) && (ombx.getChangeMask(sContext, id, MailItem.TYPE_TAG) & Change.MODIFIED_CONFLICT) != 0) {
                int newId = getAvailableTagId(ombx);
                if (newId < 0)
                    ombx.delete(sContext, id, MailItem.TYPE_TAG);
                else
                    ombx.renumberItem(sContext, id, MailItem.TYPE_TAG, newId);
                tag = null;
            }

            // deal with the case where the referenced tag doesn't exist
            if (tag == null) {
                // if it's been locally deleted but not pushed to the server yet, just return and let the delete happen later
                if (ombx.isPendingDelete(sContext, id, MailItem.TYPE_TAG))
                    return;
                // resolve any naming conflicts and actually create the tag
                if (resolveTagConflicts(elt, id, tag)) {
                    getInitialSync().syncTag(elt);
                    return;
                } else {
                    tag = getTag(id);
                }
            }

            // if the tag was renamed locally, that trumps any changes made remotely
            resolveTagConflicts(elt, id, tag);

            name = elt.getAttribute(MailConstants.A_NAME);

            int change_mask = ombx.getChangeMask(sContext, id, MailItem.TYPE_TAG);
            // FIXME: if FOO was renamed BAR and BAR was renamed FOO, this will break
            if ((change_mask & Change.MODIFIED_NAME) == 0)
                ombx.rename(sContext, id, MailItem.TYPE_TAG, name);
            if ((change_mask & Change.MODIFIED_COLOR) == 0)
                ombx.setColor(sContext, id, MailItem.TYPE_TAG, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_TAG, date, mod_content, timestamp, changeId);

            if (elt.getAttributeBool(InitialSync.A_RELOCATED, false))
                ombx.setChangeMask(sContext, id, MailItem.TYPE_TAG, change_mask | Change.MODIFIED_NAME);

            OfflineLog.offline.debug("delta: updated tag (" + id + "): " + name);
        }
    }

    private boolean resolveTagConflicts(Element elt, int id, Tag local) throws ServiceException {
        int change_mask = (local == null ? 0 : ombx.getChangeMask(sContext, id, MailItem.TYPE_TAG));

        String name = elt.getAttribute(MailConstants.A_NAME);
        if ((change_mask & Change.MODIFIED_NAME) != 0 && !mSyncRenames.contains(id)) {
            name = local.getName();  elt.addAttribute(MailConstants.A_NAME, name);
        } else {
            // handle the off-chance that the server's folder name is invalid
            String validName = MailItem.normalizeItemName(name);
            if (!validName.equals(name)) {
                name = validName;  elt.addAttribute(MailConstants.A_NAME, name).addAttribute(InitialSync.A_RELOCATED, true);
            }
        }

        Tag conflict = getTag(name);
        if (conflict == null)
            return true;

        int conflict_mask = ombx.getChangeMask(sContext, conflict.getId(), MailItem.TYPE_TAG);
        if (conflict.getId() == id) {
            // new tag remotely, new tag locally, same name
            if ((conflict_mask & Change.MODIFIED_CONFLICT) != 0)
                ombx.setChangeMask(sContext, id, MailItem.TYPE_TAG, conflict_mask & ~Change.MODIFIED_CONFLICT);
            return false;
        }

        String uuid = '{' + UUID.randomUUID().toString() + '}', newName;
        if (name.length() + uuid.length() > MailItem.MAX_NAME_LENGTH)
            newName = name.substring(0, MailItem.MAX_NAME_LENGTH - uuid.length()) + uuid;
        else
            newName = name + uuid;

        if (local == null && (conflict_mask & Change.MODIFIED_CONFLICT) != 0) {
            // if the new and existing tags are identical and being created, try to merge them
            ombx.renumberItem(sContext, conflict.getId(), MailItem.TYPE_TAG, id);
            ombx.setChangeMask(sContext, id, MailItem.TYPE_TAG, conflict_mask & ~Change.MODIFIED_CONFLICT);
            return false;
        } else if ((conflict_mask & Change.MODIFIED_NAME) != 0) {
            // the local user also renamed the tag, so the local client wins
            name = newName;
            elt.addAttribute(MailConstants.A_NAME, name).addAttribute(InitialSync.A_RELOCATED, true);
            if (local != null)
                ombx.rename(null, id, MailItem.TYPE_TAG, name);
        } else {
            // if there's a naming conflict, usually rename the local tag out of the way
            ombx.rename(null, conflict.getId(), MailItem.TYPE_TAG, newName);
            mSyncRenames.add(conflict.getId());
        }

        return true;
    }

    static int getAvailableTagId(Mailbox mbox) throws ServiceException {
        int tagId;
        for (tagId = MailItem.TAG_ID_OFFSET + MailItem.MAX_TAG_COUNT - 1; tagId >= MailItem.TAG_ID_OFFSET; tagId--)
            if (getTag(mbox, tagId) == null)
                break;
        return (tagId < MailItem.TAG_ID_OFFSET ? -1 : tagId);
    }

    private Tag getTag(int id) throws ServiceException {
        return getTag(ombx, id);
    }

    static Tag getTag(Mailbox mbox, int id) throws ServiceException {
        try {
            return mbox.getTagById(sContext, id);
        } catch (MailServiceException.NoSuchItemException nsie) {
            return null;
        }
    }

    private Tag getTag(String name) throws ServiceException {
        try {
            return ombx.getTagByName(name);
        } catch (MailServiceException.NoSuchItemException nsie) {
            return null;
        }
    }

    void syncContact(Element elt, int folderId) throws ServiceException {
        int id = (int) elt.getAttributeLong(MailConstants.A_ID);
        Contact cn = null;
        try {
            // make sure that the contact we're delta-syncing actually exists
            cn = ombx.getContactById(sContext, id);
        } catch (MailServiceException.NoSuchItemException nsie) {
            getInitialSync().syncContact(elt, folderId);
            return;
        }

        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);
        int flags = Flag.flagsToBitmask(elt.getAttribute(MailConstants.A_FLAGS, null));
        long tags = Tag.tagsToBitmask(elt.getAttribute(MailConstants.A_TAGS, null));

        Map<String, String> fields = new HashMap<String, String>();
        for (Element eField : elt.listElements())
            fields.put(eField.getAttribute(Element.XMLElement.A_ATTR_NAME), eField.getText());

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION);

        synchronized (ombx) {
            int change_mask = ombx.getChangeMask(sContext, id, MailItem.TYPE_CONTACT);
            if ((change_mask & Change.MODIFIED_CONTENT) == 0 && !fields.isEmpty())
                ombx.modifyContact(sContext, id, fields, true);
            ombx.syncMetadata(sContext, id, MailItem.TYPE_CONTACT, folderId, flags, tags, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_CONTACT, date, mod_content, timestamp, changeId);
        }
        OfflineLog.offline.debug("delta: updated contact (" + id + "): " + cn.getFileAsString());
    }

    void syncMessage(Element elt, int folderId) throws ServiceException {
        int id = (int) elt.getAttributeLong(MailConstants.A_ID);
        Message msg = null;
        try {
            // make sure that the message we're delta-syncing actually exists
            msg = ombx.getMessageById(sContext, id);
        } catch (MailServiceException.NoSuchItemException nsie) {
            getInitialSync().syncMessage(id, folderId);
            return;
        }

        byte color = (byte) elt.getAttributeLong(MailConstants.A_COLOR, MailItem.DEFAULT_COLOR);
        int flags = Flag.flagsToBitmask(elt.getAttribute(MailConstants.A_FLAGS, null));
        long tags = Tag.tagsToBitmask(elt.getAttribute(MailConstants.A_TAGS, null));
        int convId = (int) elt.getAttributeLong(MailConstants.A_CONV_ID);

        int timestamp = (int) elt.getAttributeLong(MailConstants.A_CHANGE_DATE);
        int changeId = (int) elt.getAttributeLong(MailConstants.A_MODIFIED_SEQUENCE);
        int date = (int) (elt.getAttributeLong(MailConstants.A_DATE) / 1000);
        int mod_content = (int) elt.getAttributeLong(MailConstants.A_REVISION);

        // double-check to make sure that it's just a metadata change
//        if (mod_content != msg.getSavedSequence() || date != msg.getDate() / 1000) {
//            // content changed; must re-download body
//            getInitialSync().syncMessage(id, folderId);
//            return;
//        }

        synchronized (ombx) {
            ombx.setConversationId(sContext, id, convId <= 0 ? -id : convId);
            ombx.syncMetadata(sContext, id, MailItem.TYPE_MESSAGE, folderId, flags, tags, color);
            ombx.syncChangeIds(sContext, id, MailItem.TYPE_MESSAGE, date, mod_content, timestamp, changeId);
        }
        OfflineLog.offline.debug("delta: updated message (" + id + "): " + msg.getSubject());
    }
}
