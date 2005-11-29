/*
 * ***** BEGIN LICENSE BLOCK *****
 * Version: ZPL 1.1
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.1 ("License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.zimbra.com/license
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 * 
 * The Original Code is: Zimbra Collaboration Suite Web Client
 * 
 * The Initial Developer of the Original Code is Zimbra, Inc.
 * Portions created by Zimbra are Copyright (C) 2005 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * ***** END LICENSE BLOCK *****
 */
function ZmChatList(appCtxt) {
	ZmList.call(this, ZmItem.CHAT, appCtxt);
};

ZmChatList.prototype = new ZmList;
ZmChatList.prototype.constructor = ZmChatList;

ZmChatList.prototype.toString = 
function() {
	return "ZmChatList";
};

// ZmList.prototype.add(chat);
// ZmList.prototype.remove(chat);

ZmChatList.prototype.addChat =
function(chat) {
	this.add(chat); // , this._sortIndex(item));
	this._eventNotify(ZmEvent.E_CREATE, [chat]);
};

ZmChatList.prototype.removeChat =
function(chat) {
	this.remove(chat); // , this._sortIndex(item));
	this._eventNotify(ZmEvent.E_DELETE, [chat]);
};

ZmChatList.prototype.getChatByRosterItem =
function(item) {
    return this.getById(ZmChat.idFromRosterItem(item));
};
