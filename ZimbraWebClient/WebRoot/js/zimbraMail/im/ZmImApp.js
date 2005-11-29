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

function ZmImApp(appCtxt, container) {
	ZmApp.call(this, ZmZimbraMail.IM_APP, appCtxt, container);
	//this._appCtxt.getSettings().addChangeListener(new AjxListener(this, this._settingsChangeListener));
	this._active = false;
};

ZmImApp.prototype = new ZmApp;
ZmImApp.prototype.constructor = ZmImApp;

ZmImApp.prototype.toString = 
function() {
	return "ZmImApp";
};

ZmImApp.prototype.launch =
function(callback) {
    var clc = this.getChatListController();
    clc.show();
	if (callback)
		callback.run();
//    alert("lauunched!");		
};

ZmImApp.prototype.activate =
function(active) {
//    alert("wheee!");
};

ZmImApp.prototype.getChatListController =
function() {
	if (!this._chatListController)
		this._chatListController = new ZmChatListController(this._appCtxt, this._container, this);
	return this._chatListController;
};

ZmImApp.prototype.getChatList =
function() {
	if (!this._chatList)
		this._chatList = new ZmChatList(this._appCtxt);
	return this._chatList;
};

ZmImApp.prototype.getRosterItemList =
function() {
	if (!this._rosterItemList) {
		this._rosterItemList = new ZmRosterItemList(this._appCtxt);
        	//TODO: load dummy data
	}
	return this._rosterItemList;
};
