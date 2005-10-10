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
 * The Original Code is: Zimbra Collaboration Suite.
 * 
 * The Initial Developer of the Original Code is Zimbra, Inc.
 * Portions created by Zimbra are Copyright (C) 2005 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * ***** END LICENSE BLOCK *****
 */

function DwtXFormDialog(xformDef, xmodelDef, parent, className, title, standardButtons, extraButtons, zIndex, mode, loc) {
	if (arguments.length == 0) return;
	className = className || "DwtXFormDialog";
	DwtDialog.call(this, parent, className, title, standardButtons, extraButtons, zIndex, mode, loc);
	
	this._xform = new XForm(xformDef, new XModel(xmodelDef), null, this);
	this._xform.addListener(DwtEvent.XFORMS_FORM_DIRTY_CHANGE, new AjxListener(this, this._handleXFormDirty));
	
	this.setView(this._xform);
	
	this.setButtonListener(DwtDialog.OK_BUTTON, new AjxListener(this, this._handleOkButton));
	this.setButtonListener(DwtDialog.CANCEL_BUTTON, new AjxListener(this, this._handleCancelButton));
}
DwtXFormDialog.prototype = new DwtDialog;
DwtXFormDialog.prototype.constructor = DwtXFormDialog;

// Data

DwtXFormDialog.prototype._xform;
DwtXFormDialog.prototype._xformInitialized = false;

// Public methods

DwtXFormDialog.prototype.setInstance = function(instance) { 
	this._xform.setInstance(instance);
}
DwtXFormDialog.prototype.getInstance = function() {
	return this._xform.getInstance();
}

DwtXFormDialog.prototype.popup = function(loc) {
	// initialize form items
	if (!this._xformInitialized) {
		this._xform.initializeItems();
		this._xform.draw();
		this._xformInitialized = true;
	}
	
	// make sure that form represents current data and show
	this._xform.setIsDirty(true);
	this._xform.refresh();
	this.setButtonEnabled(DwtDialog.OK_BUTTON, false);
	DwtDialog.prototype.popup.call(this, loc);
}

// Protected methods

DwtXFormDialog.prototype._handleXFormDirty = function(event) {
	this.setButtonEnabled(DwtDialog.OK_BUTTON, true);
}

DwtXFormDialog.prototype._handleOkButton = function(event) {
	this.popdown();
	this.setInstance(null);
}

DwtXFormDialog.prototype._handleCancelButton = DwtXFormDialog.prototype._handleOkButton;
