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

function ZmMimePart() {
	
	ZmModel.call(this, true);
	
	this.children = new AjxVector();
	this.node = new Object();
}

ZmMimePart.prototype = new ZmModel;
ZmMimePart.prototype.constructor = ZmMimePart;

ZmMimePart.prototype.toString = 
function() {
	return "ZmMimePart";
}

ZmMimePart.createFromDom =
function(node, args) {
	var mimePart = new ZmMimePart();
	mimePart._loadFromDom(node, args.attachments, args.bodyParts);
	return mimePart;
}

ZmMimePart.prototype.getContent = 
function() {
	return this.node.content;
}

ZmMimePart.prototype.setContent = 
function(content) {
	this.node.content = content;
}

ZmMimePart.prototype.getContentDisposition =
function() {
	return this.node.cd;
}

ZmMimePart.prototype.getContentType =
function() {
	return this.node.ct;
}

ZmMimePart.prototype.setContentType =
function(ct) {
	this.node.ct = ct;
}

ZmMimePart.prototype.setIsBody = 
function(isBody) {
	this.node.body = isBody;
}

ZmMimePart.prototype.getFilename =
function() {
	return this.node.filename;
}

ZmMimePart.prototype._loadFromDom =
function(partNode, attachments, bodyParts) {
	for (var i = 0; i < partNode.length; i++) {
		this.node = partNode[i];
		
		if (this.node.content)
			this._loaded = true;
		
		if (this.node.cd == "attachment" || 
			this.node.ct == ZmMimeTable.MSG_RFC822 ||
			this.node.filename != null)
		{
			attachments.push(this.node);
		}
		
		if (this.node.body)
			bodyParts.push(this.node);
		
		if (this.node.mp) {
			var params = {attachments: attachments, bodyParts: bodyParts};
			this.children.add(ZmMimePart.createFromDom(this.node.mp, params));
		}
	}
}
