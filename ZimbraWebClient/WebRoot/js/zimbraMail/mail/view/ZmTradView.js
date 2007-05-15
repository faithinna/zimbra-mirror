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
 * The Original Code is: Zimbra Collaboration Suite Web Client
 * 
 * The Initial Developer of the Original Code is Zimbra, Inc.
 * Portions created by Zimbra are Copyright (C) 2005, 2006 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * ***** END LICENSE BLOCK *****
 */

function ZmTradView(parent, className, posStyle, controller, dropTgt) {

	className = className || "ZmTradView";
	ZmDoublePaneView.call(this, parent, className, posStyle, ZmController.TRAD_VIEW, controller, dropTgt);
}

ZmTradView.prototype = new ZmDoublePaneView;
ZmTradView.prototype.constructor = ZmTradView;

ZmTradView.prototype.toString = 
function() {
	return "ZmTradView";
};

ZmTradView.prototype.setItem =
function(msgs) {
	ZmDoublePaneView.prototype.setItem.call(this, msgs);

	this._mailListView.set(msgs, ZmItem.F_DATE);

	// XXX: for now always show the first msg 
	//      (whether user clicked inbox or paginated)
	var list = this._mailListView.getList();
	var selectedItem = list ? list.get(0) : null
	if (selectedItem) {
		this._mailListView.setSelection(selectedItem, false, true);
	}
};
