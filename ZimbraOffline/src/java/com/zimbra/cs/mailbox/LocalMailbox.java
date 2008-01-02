package com.zimbra.cs.mailbox;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import com.zimbra.common.service.ServiceException;
import com.zimbra.common.util.Constants;
import com.zimbra.common.util.Pair;
import com.zimbra.cs.account.DataSource;
import com.zimbra.cs.account.Identity;
import com.zimbra.cs.account.Provisioning;
import com.zimbra.cs.account.Provisioning.DataSourceBy;
import com.zimbra.cs.account.Provisioning.IdentityBy;
import com.zimbra.cs.account.offline.OfflineProvisioning;
import com.zimbra.cs.datasource.DataSourceManager;
import com.zimbra.cs.mime.Mime.FixedMimeMessage;
import com.zimbra.cs.offline.OfflineLog;
import com.zimbra.cs.offline.OfflineSyncManager;
import com.zimbra.cs.offline.common.OfflineConstants;
import com.zimbra.cs.service.util.ItemId;
import com.zimbra.cs.session.PendingModifications;
import com.zimbra.cs.session.PendingModifications.Change;

public class LocalMailbox extends Mailbox {

	public static final String OUTBOX_PATH = "Outbox";
    public static final int ID_FOLDER_OUTBOX = 254;
    //public static final String IMPORT_ROOT_PATH = "IMPORT_ROOT";
    //public static final int ID_FOLDER_IMPORT_ROOT = 253;
    
    LocalMailbox(MailboxData data) throws ServiceException {
        super(data);
    }
    
    @Override
    public MailSender getMailSender() {
        return new OfflineMailSender();
    }
    
    @Override
    synchronized void initialize() throws ServiceException {
        super.initialize();

        // create a system outbox folder
        Folder userRoot = getFolderById(ID_FOLDER_USER_ROOT);
        Folder.create(ID_FOLDER_OUTBOX, this, userRoot, OUTBOX_PATH, Folder.FOLDER_IS_IMMUTABLE, MailItem.TYPE_MESSAGE, 0, MailItem.DEFAULT_COLOR, null);
        //Folder.create(ID_FOLDER_IMPORT_ROOT, this, userRoot, IMPORT_ROOT_PATH, Folder.FOLDER_IS_IMMUTABLE, MailItem.TYPE_UNKNOWN, 0, MailItem.DEFAULT_COLOR, null); //root for all data sources
    }
    
    @Override
    void snapshotCounts() throws ServiceException {
        // do the normal persisting of folder/tag counts
        super.snapshotCounts();

        boolean outboxed = false;
        
        PendingModifications pms = getPendingModifications();
        if (pms == null || !pms.hasNotifications())
            return;

        if (pms.created != null) {
            for (MailItem item : pms.created.values()) {
                if (item.getFolderId() == ID_FOLDER_OUTBOX)
                	outboxed = true;
            }
        }

        if (pms.modified != null) {
            for (Change change : pms.modified.values()) {
                if (!(change.what instanceof MailItem))
                    continue;
                MailItem item = (MailItem) change.what;
                if (item.getFolderId() == ID_FOLDER_OUTBOX) {
                	outboxed = true;
                }
            }
        }
        
        if (outboxed)
        	OutboxTracker.invalidate(this);
    }
    
    /** Tracks messages that we've called SendMsg on but never got back a
     *  response.  This should help avoid duplicate sends when the connection
     *  goes away in the process of a SendMsg.<p>
     *  
     *  key: a String of the form <tt>account-id:message-id</tt><p>
     *  value: a Pair containing the content change ID and the "send UID"
     *         used when the message was previously sent. */
    private static final Map<Integer, Pair<Integer, String>> sSendUIDs = new HashMap<Integer, Pair<Integer, String>>();

    private void sendPendingMessages(boolean isOnRequest) throws ServiceException {
    	OperationContext context = new OperationContext(this);

    	for (Iterator<Integer> iterator = OutboxTracker.iterator(this, isOnRequest ? 0 : 5 * Constants.MILLIS_PER_MINUTE); iterator.hasNext(); ) {
        	int id = iterator.next();
        	
            Message msg = getMessageById(context, id);
            Session session = null;
            //the client could send datasourceId as identityId
            DataSource ds = Provisioning.getInstance().get(getAccount(), DataSourceBy.id, msg.getDraftIdentityId());
            if (ds == null)
            	ds = OfflineProvisioning.getOfflineInstance().getDataSource(getAccount());
            if (ds != null) {
            	session = LocalJMSession.getSession(ds);
            } else {
            	session = LocalJMSession.getSession(getAccount());
            }
            if (session == null) { 
            	OutboxTracker.recordFailure(this, id);
            	//TODO: bounce back to Inbox
        		OfflineLog.offline.info("SMTP configuration not valid: " + msg.getSubject());
        		continue;
            }
            Identity identity = Provisioning.getInstance().get(getAccount(), IdentityBy.id, msg.getDraftIdentityId());

            try {
                // try to avoid repeated sends of the same message by tracking "send UIDs" on SendMsg requests
                Pair<Integer, String> sendRecord = sSendUIDs.get(id);
                String sendUID = sendRecord == null || sendRecord.getFirst() != msg.getSavedSequence() ? UUID.randomUUID().toString() : sendRecord.getSecond();
                sSendUIDs.put(id, new Pair<Integer, String>(msg.getSavedSequence(), sendUID));

                MimeMessage mm = ((FixedMimeMessage) msg.getMimeMessage()).setSession(session);

                new MailSender().sendMimeMessage(context, this, true, mm, null, null, new ItemId(msg.getDraftOrigId(), getAccountId()),
                                                 msg.getDraftReplyType(), identity, false, false);
              	OfflineLog.offline.debug("smtp: sent pending mail (" + id + "): " + msg.getSubject());
                
                // remove the draft from the outbox
                delete(context, id, MailItem.TYPE_MESSAGE);
                OutboxTracker.remove(this, id);
                OfflineLog.offline.debug("smtp: deleted pending draft (" + id + ')');

                // the draft is now gone, so remove it from the "send UID" hash and the list of items to push
                sSendUIDs.remove(id);
            } catch (ServiceException x) {
            	if (x.getCause() instanceof MessagingException) {
            		OutboxTracker.recordFailure(this, id);
	        		OfflineLog.offline.info("SMTP send failure: " + msg.getSubject());
            	} else {
            		throw x;
            	}
            }
        }
    }
    
    public long getSyncFrequency(DataSource ds) {
        long syncFreq = ds.getTimeInterval(OfflineProvisioning.A_zimbraDataSourceSyncFreq, OfflineConstants.DEFAULT_SYNC_FREQ);
        return syncFreq > 0 ? syncFreq : OfflineConstants.DEFAULT_SYNC_FREQ;
    }
    
    public boolean isAutoSyncDisabled(DataSource ds) {
    	return ds.getTimeInterval(OfflineProvisioning.A_zimbraDataSourceSyncFreq, OfflineConstants.DEFAULT_SYNC_FREQ) <= 0;
    }
    
    
    private void syncAllLocalDataSources(boolean isOnRequest) throws ServiceException {
    	OfflineProvisioning prov = OfflineProvisioning.getOfflineInstance();
		List<DataSource> dataSources = prov.getAllDataSources(getAccount());
		OfflineSyncManager syncMan = OfflineSyncManager.getInstance();
		for (DataSource ds : dataSources) {
	    	if (!isOnRequest) {
		    	if (isAutoSyncDisabled(ds) || !syncMan.reauthOK(ds))
		    		continue;
		    	
		    	long now = System.currentTimeMillis();
		    	long syncFreq = ds.getTimeInterval(OfflineProvisioning.A_zimbraDataSourceSyncFreq, OfflineConstants.DEFAULT_SYNC_FREQ);
		    	if (now - syncMan.getLastTryTime(ds.getName()) < syncFreq)
		    		continue;
		    }
			
			try {
				syncMan.syncStart(ds.getName());
				DataSourceManager.importData(getAccount(), ds);
				syncMan.syncComplete(ds.getName());
			} catch (Exception x) {
				syncMan.processSyncException(ds, x);
			}
		}
    }
	
	private boolean mSyncRunning;
	
    private boolean lockMailboxToSync() {
    	if (!mSyncRunning) {
	    	synchronized (this) {
	    		if (!mSyncRunning) {
	    			mSyncRunning = true;
	    			return true;
	    		}
	    	}
    	}
    	return false;
    }
    
    private void unlockMailbox() {
    	assert mSyncRunning == true;
    	mSyncRunning = false;
    }
    
    public void sync(boolean isOnRequest) {
		if (lockMailboxToSync()) {
			try {
				sendPendingMessages(isOnRequest);
				syncAllLocalDataSources(isOnRequest);
			} catch (Exception x) {
				OfflineLog.offline.error("exception encountered during sync", x);
			} finally {
				unlockMailbox();
			}
        } else if (isOnRequest) {
        	OfflineLog.offline.debug("sync already in progress");
        }
    }
}
