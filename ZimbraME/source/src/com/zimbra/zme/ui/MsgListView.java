/*
 * ***** BEGIN LICENSE BLOCK *****
 * Version: ZPL 1.2
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.2 ("License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.zimbra.com/license
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 * 
 * The Original Code is: Zimbra Collaboration Suite J2ME Client
 * 
 * The Initial Developer of the Original Code is Zimbra, Inc.
 * Portions created by Zimbra are Copyright (C) 2004, 2005, 2006, 2007 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.zme.ui;

import java.util.Enumeration;
import java.util.Vector;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

import com.zimbra.zme.ZimbraME;
import com.zimbra.zme.Util;
import com.zimbra.zme.client.Mailbox;

import de.enough.polish.ui.FramedForm;
import de.enough.polish.ui.Style;
import de.enough.polish.ui.UiAccess;
import de.enough.polish.util.Locale;

public class MsgListView extends MailListView {
	
	private static final Command MORE_ACTIONS = new Command(Locale.get("mailList.MoreActions"), Command.ITEM, 1);
	private static final Command BACK = new Command(Locale.get("main.Back"), Command.BACK, 1);
	
	private Command mReplyCmd;
	private Command mReplyAllCmd;
	private Command mForwardCmd;
	private Command mViewDetailsCmd;
	private Command mShowFragmentCmd;
	private Command mShowAttachmentsCmd;
	private String mConvId;
	private View mCallingView;
	private StringItem mSubjStringItem;
	private FramedForm mDetailsForm;
	private boolean mGettingMore;
	private String mSavedTitle;

	
	//#ifdef polish.usePolishGui
		public MsgListView(String title,
							ZimbraME midlet,
							Style style) {
			super(title, midlet, style);
			init();
		}
	//#else
		public MsgListView(String title,
						   ZimbraME midlet) {
			super(title, midlet);
			init();
		}
	//#endif
	
	public void setConvId(String convId) {
		mConvId = convId;
	}
	
	public void setSubject(String subject) {
		mSubjStringItem.setText((subject != null) ? subject : "");
	}
	
	public void retrieveConv(String convId,
							 String subject,
							 View callingView) {
		mConvId = convId;
		mCallingView = callingView;
		mResults.mNewSet = true;
		setSubject(subject);
		// Just call load since it will load the conv
		load();
	}
	
	public void load() {
		if (mConvId != null) {
			mMidlet.mMbox.searchConv(mConvId, true, null, DEF_RESULT_SIZE, this, mResults, this);		
			//Show the work in progress dialog
			Dialogs.popupWipDialog(mMidlet, this, Locale.get("msgList.RetrievingConv"));
		}
	}

	public MsgItem createMsgItem() {
		//#style MsgItem
		MsgItem m = new MsgItem(mMidlet, this);
		return m;
	}
	
	/* This method is called by MailItem subclasses when they are requesting more data 
	 * be added to the list*/
	public void getMore(MailItem lastItem) {
		if (mMoreHits && !mGettingMore) {
			mGettingMore = true;
			mResults.mNewSet = false;				
			mMidlet.mMbox.searchConv(mConvId, true, lastItem, DEF_RESULT_SIZE, this, mResults, this);		
			
			//#style MsgListViewHeaderBusy
			UiAccess.setStyle(mHeader);
			
			mSavedTitle = mHeader.getText();
			mHeader.setText(Locale.get("mailList.Fetching"));
		}
	}

	public void handleResponse(Object op,
							   Object resp) {
		//SearchConv response

		//#debug
		System.out.println("MsgListItem.handleResponse");
		FramedForm f = null;
		//#if true
			//# f = (FramedForm)mView;
		//#endif

		if (op == Mailbox.SEARCHCONV) {
			//#style MsgListViewHeader
			UiAccess.setStyle(mHeader);
			
			if (mGettingMore)
				mHeader.setText(mSavedTitle);
	
			mGettingMore = false;
		}
		
		if (resp instanceof Mailbox) {
			//#debug 
			System.out.println("MsgListView.handleResponse: search successful");
			//Clear out the current list if it is a new set of data
			if (mResults.mNewSet) {
				f.deleteAll();
				f.append(mSubjStringItem);
			}

			mMoreHits = mResults.mMore;
			
			Vector results = mResults.mResults;
			if (results.size() > 0) {
				for (Enumeration e = results.elements() ; e.hasMoreElements() ;)
				    f.append((MailItem)e.nextElement());
				if (!mResults.mNewSet) {
					//#if true
						//# f.focus((Item)mResults.mResults.elementAt(0));
					//#endif
				}
				
				/* On a SearchConvResp, we may the situation where the conversation transitions
				 * from a unread to read state due to the only unread message being opened as 
				 * a result of the SearchConvResp. We need to handle that as best we can.
				 * Specificallly this means that if there are no more hits (i.e. we have the full
				 * set of results) we iterate through the results and adjust the conversation
				 * based on the state of that result set read/unread (see updateParent)*/
				if (!mMoreHits) {
					updateParent(mMidlet.getInboxView(), UNREAD_CHANGED, mConvId);	
					updateParent(mMidlet.getSearchView(), UNREAD_CHANGED, mConvId);
				}
			} else {
				f.append(mNoDataItem);
				if (f.getTicker() != null)
					f.getTicker().setString("");
			}
			mMidlet.mDisplay.setCurrent(mView);
		} else {
			/* Note we pass in mCallingView because we essentially want the conversation 
			 * view (convItem) that was clicked on to show up vs. the msgList view which
			 * will not have correct data*/
			mMidlet.handleResponseError(resp, mCallingView);
		}
	}

	public void commandAction(Command cmd, 
							  Displayable d) {
		if (d == mView) {
			if (cmd == BACK) {
				mView.deleteAll();
				mMidlet.setTopViewCurrent();
			} else if (cmd == mReplyCmd || cmd == mReplyAllCmd) {
				doReply((cmd == mReplyCmd) ? false : true);
			} else if (cmd == mForwardCmd) {
				doForward();
			} else if (cmd == mViewDetailsCmd) {
				showDetails();
			} else if (cmd == mShowAttachmentsCmd) {
				showAttachments();
			} else {
				// Delegate the command handling up to the parent
				super.commandAction(cmd, d);
			}
		} else  if (d == mDetailsForm) {
			mMidlet.mDisplay.setCurrent(mView);
		} else if (d == Dialogs.mWipD) {
			mMidlet.mMbox.cancelOp();
			mMidlet.mDisplay.setCurrent(mView);
		} else {
			super.commandAction(cmd, d);
		}
	}

	public void action(Object source, Object data) {
		if (source == mMidlet.mSettings) {
			showTicker(mMidlet.mSettings.getShowMsgTicker());
			if (mShowTicker) {
				Item item = null;
				//#if true
					//# item = mView.getCurrentItem();
				//#endif
				if (item != null) {
					if (item instanceof MailItem) {
						MailItem m = (MailItem)item;
						mTicker.setString((m.mFragment != null) ? m.mFragment : "");
					}
				} else { //Empty list
					mTicker.setString("");
				}
			}
		} else {
			super.action(source, data);
		}
	}

	protected  boolean confirmDeletes() {
		return !(mMidlet.mSettings.getDelWOConf() && mMidlet.mSettings.getDelWOCMsg());
	}
	
	protected void keyPressed(int keyCode,
						   	  int gameAction,
						   	  Item item) {
		if (gameAction == Canvas.LEFT && keyCode != Canvas.KEY_NUM4)
			mMidlet.setTopViewCurrent();
		else if (keyCode == Canvas.KEY_NUM4 || keyCode == Canvas.KEY_NUM5)
			doReply((keyCode == Canvas.KEY_NUM4) ? false : true);
		else if (keyCode == Canvas.KEY_NUM6)
			showDetails();
		else 
			super.keyPressed(keyCode, gameAction, item);
	}
	
	protected void itemStateChanged(MailItem item,
            					 	int what) {
		if (what == DELETED) {
			// If last item in list (test for two because the first item is the subject item)
			if (mView.size() == 2) {
				mView.deleteAll();
				ConvListView clv = (ConvListView)mMidlet.getTopView();
				clv.convDeleted(((MsgItem)item).mCId);
				mMidlet.setTopViewCurrent();
			} else {
				deleteItem(item);
			}
		} else if (what != MSG_LOADED) {
			updateList((ConvListView)mMidlet.getTopView(), item, what);
		}
		
		//#if true
			//# if (mView.getCurrentItem() == item) {
				//# itemHasFocus(item);
			//# }
		//#endif
	}

	protected void itemHasFocus(MailItem item) {
		
		MsgItem msgItem = (MsgItem)item;
		
		if (mShowTicker)
			mView.getTicker().setString((msgItem.mFragment != null) ? msgItem.mFragment : "");
		
		if ((msgItem.mFlags & MailItem.FLAGGED) == MailItem.FLAGGED)
			UiAccess.setCommandLabel(mView, mToggleFlagCmd, Locale.get("mailList.Unflag"));
		else 
			UiAccess.setCommandLabel(mView, mToggleFlagCmd, Locale.get("mailList.Flag"));

		if ((msgItem.mFlags & MailItem.UNREAD) == MailItem.UNREAD)
			UiAccess.setCommandLabel(mView, mToggleUnreadCmd, Locale.get("mailList.MarkRead"));
		else 
			UiAccess.setCommandLabel(mView, mToggleUnreadCmd, Locale.get("mailList.MarkUnread"));
		
		MsgItem mi = (MsgItem)item;	
		if (!mi.mLoaded) {
			//#style DisabledFourMenuItem
			UiAccess.setAccessible(mView, mReplyCmd, false);
			//#style DisabledFiveMenuItem
			UiAccess.setAccessible(mView, mReplyAllCmd, false);
			//#style DisabledMenuItem
			UiAccess.setAccessible(mView, mForwardCmd, false);
			//#style DisabledSixMenuItem
			UiAccess.setAccessible(mView, mViewDetailsCmd, false);
			//#style DisabledNineMenuItem
			UiAccess.setAccessible(mView, mShowFragmentCmd, false);
			//#style DisabledMenuItem
			UiAccess.setAccessible(mView, mShowAttachmentsCmd, false);
		} else {
			//#style FourMenuItem
			UiAccess.setAccessible(mView, mReplyCmd, true);
			//#style FiveMenuItem
			UiAccess.setAccessible(mView, mReplyAllCmd, true);
			//#style MenuItem
			UiAccess.setAccessible(mView, mForwardCmd, true);
			//#style SixMenuItem
			UiAccess.setAccessible(mView, mViewDetailsCmd, true);
			//#style NineMenuItem
			UiAccess.setAccessible(mView, mShowFragmentCmd, false);
			
			if (msgItem.mAttachments == null) {
				//#style DisabledMenuItem
				UiAccess.setAccessible(mView, mShowAttachmentsCmd, false);
			} else {
				//#style MenuItem
				UiAccess.setAccessible(mView, mShowAttachmentsCmd, true);
			}
				
			
		}
	}

	private void updateList(ConvListView convListView,
							MailItem item,
							int what) {
		MsgItem m = (MsgItem)item;
		boolean isSet = (what == FLAG_CHANGED) ? item.getFlagged() : item.getUnread();
		int size;
		ConvItem c = null;
		if (isSet) {
			size = convListView.mView.size();
			/* The msg has been flagged/marked unread etc, then find the respective conversation in the
			 * conversation list and set its state appropriately */
			for (int i = 0; i < size; i++) {
				//#ifdef polish.usePolishGui
					//# c = (ConvItem)((FramedForm)convListView.mView).get(i);
				//#endif
				if (c.mId.compareTo(m.mCId) == 0) {
					if (what == FLAG_CHANGED)
						c.setFlagged(true, false);
					else if (what == UNREAD_CHANGED)
						c.setUnread(true, false);
					break;
				}
			}
		} else if (!mMoreHits){
			/* The msg has been unflagged/marked read etc. If there are no more results, then see if all other 
			 * msgs in the list view are also in the same state. If so, then we need to toggle the
			 * conversation's state*/
			updateParent(convListView, what, m.mCId);		
		}
	}

	private void updateParent(ConvListView convListView,
							  int what,
							  String cId) {
		/* The msg has been unflagged/marked read etc. If there are no more results, then see if all other 
		 * msgs in the list view are also in the same state. If so, then we need to toggle the
		 * conversation's state*/
		FramedForm f = null;
		//#if true
			//# f = (FramedForm)mView;
		//#endif
		int mySize = f.size();
		MsgItem m1 = null;
		boolean changeParent = true;
		
		// Start at i=1 to skip over the subject field
		for (int i = 1; i < mySize; i++) {
			//#ifdef polish.usePolishGui
				//# m1 = (MsgItem)f.get(i);
			//#endif
			if (what == FLAG_CHANGED && m1.getFlagged() 
				|| what == UNREAD_CHANGED && m1.getUnread()) {
				changeParent = false;
				break;
			}
		}
			
		if (changeParent) {
			ConvItem c = null;
			int size = convListView.mView.size();
			
			// Deal with a view that only has the "empty" or "no results" item
			if (size == 1 && (!(((Object)convListView.mView.get(0)) instanceof ConvItem)))
				return;
			
			for (int i = 0; i < size; i++) {
				//#ifdef polish.usePolishGui
					//# c = (ConvItem)((FramedForm)convListView.mView).get(i);
				//#endif

				if (c.mId.compareTo(cId) == 0) {
					if (what == FLAG_CHANGED)
						c.setFlagged(false, false);
					else if (what == UNREAD_CHANGED)
						c.setUnread(false, false);
					break;
				}
			}
		}
	}
		
	
	private void init() {
		FramedForm f = null;
		//#if true
			//# f = (FramedForm)mView;
		//#endif
		mMidlet.mSettings.addListener(this);
	
		//#style MsgListViewHeader
		mHeader = new StringItem(null, "ZimbraME");
		f.append(Graphics.TOP, mHeader);
		
		mMidlet.mSettings.addListener(this);
		
		//#style MsgListSubject
		mSubjStringItem = new StringItem(null, null);
		showTicker(mMidlet.mSettings.getShowMsgTicker());
		setupMenu();
	}
	
	private void setupMenu() {
		mReplyCmd = new Command(Locale.get("mailList.Reply"), Command.ITEM, 1);
		mReplyAllCmd = new Command(Locale.get("mailList.ReplyAll"), Command.ITEM, 1);
		mForwardCmd = new Command(Locale.get("mailList.Forward"), Command.ITEM, 1);
		mViewDetailsCmd = new Command(Locale.get("main.ViewDetails"), Command.ITEM, 1);
		mShowFragmentCmd = new Command(Locale.get("mailList.Fragment"), Command.ITEM, 1);
		mShowAttachmentsCmd = new Command(Locale.get("mailList.ShowAttachements"), Command.ITEM, 1);

		//#if polish.hasCommandKeyEvents || (polish.key.LeftSoftKey:defined && polish.key.RightSoftKey:defined)
			//#define tmp.hasCmdKeyEvts
		//#endif
	
		FramedForm f = null;
		//#if true
			//# f = (FramedForm)mView;
		//#endif

		//#ifdef tmp.hasCmdKeyEvts
			//#style FourMenuItem
			f.addCommand(mReplyCmd);
		//#else
			f.addCommand(mReplyCmd);
		//#endif

		//#ifdef tmp.hasCmdKeyEvts
			//#style FiveMenuItem
			f.addCommand(mReplyAllCmd);
		//#else
			f.addCommand(mReplyAllCmd);
		//#endif

		f.addCommand(mForwardCmd);

		f.addCommand(MORE_ACTIONS);

		
		//#ifdef tmp.hasCmdKeyEvts
			//#style ThreeMenuItem
			f.addSubCommand(mToggleUnreadCmd, MORE_ACTIONS);
		//#else
			f.addSubCommand(mToggleUnreadCmd, MORE_ACTIONS);
		//#endif
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style StarMenuItem
			f.addSubCommand(mToggleFlagCmd, MORE_ACTIONS);
		//#else
			f.addSubCommand(mToggleFlagCmd, MORE_ACTIONS);
		//#endif
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style EightMenuItem
			f.addSubCommand(JUNK, MORE_ACTIONS);
		//#else
			f.addSubCommand(JUNK, MORE_ACTIONS);
		//#endif
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style SevenMenuItem
			f.addSubCommand(DELETE, MORE_ACTIONS);
		//#else
			f.addSubCommand(DELETE, MORE_ACTIONS);
		//#endif
			
		//#ifdef tmp.hasCmdKeyEvts
			//#style SixMenuItem
			f.addSubCommand(mViewDetailsCmd, MORE_ACTIONS);
		//#else
			f.addSubCommand(mViewDetailsCmd, MORE_ACTIONS);
		//#endif
			
		f.addSubCommand(mShowAttachmentsCmd, MORE_ACTIONS);

		f.addCommand(ZimbraME.GOTO);
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style ZeroMenuItem
			f.addSubCommand(ZimbraME.GOTO_INBOX, ZimbraME.GOTO);
		//#else
			f.addSubCommand(ZimbraME.GOTO_INBOX, ZimbraME.GOTO);
		//#endif
		
		f.addSubCommand(ZimbraME.GOTO_SENT, ZimbraME.GOTO);
		f.addSubCommand(ZimbraME.GOTO_SETTINGS, ZimbraME.GOTO);
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style NineMenuItem
			f.addSubCommand(mShowFragmentCmd, ZimbraME.GOTO);
		//#else
			f.addSubCommand(mShowFragmentCmd, ZimbraME.GOTO);
		//#endif
	
	
		//#ifdef tmp.hasCmdKeyEvts
			//#style OneMenuItem
			f.addCommand(ZimbraME.SEARCH);
		//#else
			f.addCommand(ZimbraME.SEARCH);
		//#endif
		
		//#ifdef tmp.hasCmdKeyEvts
			//#style TwoMenuItem
			f.addCommand(COMPOSE);
		//#else
			f.addCommand(COMPOSE);
		//#endif
			
		
		f.addCommand(BACK);
			
		//#undefine tmp.hasCmdKeyEvts
	}

	private void doReply(boolean replyAll) {
		MsgItem m = null;
		//#if true
			//# m = (MsgItem)mView.getCurrentItem();
		//#endif
		ComposeView cv = mMidlet.createComposeView();
		cv.setNext(mView);
		cv.reply(m, (!replyAll) ? false : true);
		cv.setCurrent();		
	}

	private void doForward() {
		MsgItem m = null;
		//#if true
			//# m = (MsgItem)mView.getCurrentItem();
		//#endif
		ComposeView cv = mMidlet.createComposeView();
		cv.setNext(mView);
		cv.forward(m);
		cv.setCurrent();		
	}

	private void showAttachments() {
		MsgItem m = null;
		//#if true
			//# m = (MsgItem)mView.getCurrentItem();
		//#endif
		mMidlet.gotoAttachmentListView(mView, m.mAttachments);		
	}
	
	private void showDetails() {
		if (mDetailsForm == null) {
			//#style MsgListView
			mDetailsForm = new FramedForm(null);
			//#style MsgListViewHeader
			StringItem s = new StringItem(null, Locale.get("msgList.MessageDetails"));
			mDetailsForm.append(Graphics.TOP, s);
			
			mDetailsForm.addCommand(BACK);
			mDetailsForm.setCommandListener(this);
		}
		
		MsgItem m = null;
		
		//#if true
			//# m = (MsgItem)mView.getCurrentItem();
		//#endif
		
		mDetailsForm.deleteAll();
		StringBuffer sb = new StringBuffer();

		if (m.mFromAddr != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("From:");
			
			if (m.mFrom != null && m.mFrom.length() > 0)
				sb.append(m.mFrom).append(" <").append(m.mFromAddr).append(">");
			else 
				sb.append(m.mFromAddr);
			
			//#style MsgDetailsText
			mDetailsForm.append(sb.toString());
		}
		
		if (m.mSenderAddr != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("From:");

			sb.setLength(0);
			if (m.mSender != null && m.mSender.length() > 0)
				sb.append(m.mSender).append(" <").append(m.mSenderAddr).append(">");
			else 
				sb.append(m.mFromAddr);
			
			//#style MsgDetailsText
			mDetailsForm.append(sb.toString());
		}
		
		if (m.mReplyToAddr != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("Reply To:");

			sb.setLength(0);
			if (m.mReplyTo != null && m.mReplyTo.length() > 0)
				sb.append(m.mReplyTo).append(" <").append(m.mReplyToAddr).append(">");
			else 
				sb.append(m.mFromAddr);

			//#style MsgDetailsText
			mDetailsForm.append(sb.toString());
		}
	
		String[] addrs = m.getToRecipientsAddr();
		String[] dispNames = m.getToRecipients();
		int numAddrs = m.getNumToRecipients();
		if (addrs != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("To:");
			for (int i = 0; i < numAddrs; i++) {
				sb.setLength(0);
				if (dispNames[i].length() > 0)
					sb.append(dispNames[i]).append(" <").append(addrs[i]).append(">");
				else 
					sb.append(addrs[i]);

				//#style MsgDetailsText
				mDetailsForm.append(sb.toString());
			}
		}

		addrs = m.getCcRecipientsAddr();
		dispNames = m.getCcRecipients();
		numAddrs = m.getNumCcRecipients();
		if (addrs != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("Cc:");
			for (int i = 0; i < numAddrs; i++) {
				sb.setLength(0);
				if (dispNames[i].length() > 0)
					sb.append(dispNames[i]).append(" <").append(addrs[i]).append(">");
				else 
					sb.append(addrs[i]);

				//#style MsgDetailsText
				mDetailsForm.append(sb.toString());
			}
		}
		
		if (m.mDateStr != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("Date:");
			//#style MsgDetailsText
			mDetailsForm.append(Util.getFullDateTime(m.getReceivedDateAsCalendar(), true));		
		}

		if (m.mSubject != null) {
			//#style MsgDetailsLabel
			mDetailsForm.append("Subject:");
			//#style MsgDetailsText
			mDetailsForm.append(m.mSubject);
		}
		
		
		mMidlet.mDisplay.setCurrent(mDetailsForm);
	}
}
