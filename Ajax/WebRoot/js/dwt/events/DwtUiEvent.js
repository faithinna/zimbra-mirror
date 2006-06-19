/*
 * Copyright (C) 2006, The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


function DwtUiEvent(init) {
	if (arguments.length == 0) return;
	DwtEvent.call(this, true);
	this.reset();
}

DwtUiEvent.prototype = new DwtEvent;
DwtUiEvent.prototype.constructor = DwtUiEvent;

DwtUiEvent.prototype.toString = 
function() {
	return "DwtUiEvent";
}

DwtUiEvent.prototype.reset =
function() {
	this.dwtObj = null
	this.altKey = false;
	this.ctrlKey = false;
	this.metaKey = false;
	this.shiftKey = false;
	this.target = null;
	this.type = null;
	this.docX = -1;
	this.docY = -1;
	this.elementX = -1;
	this.elementY = -1;
	this.ersatz = false; // True means this event was manufactured
	this._stopPropagation = false;
	this._returnValue = true;
}

DwtUiEvent.getEvent =
function(ev) {
	return (ev) ? ev : ((window.event) ? window.event : null);
}

DwtUiEvent.getTarget =
function(ev)  {
	ev = DwtUiEvent.getEvent(ev);
	if (ev && ev.target) {
		// if text node (like on Safari) return parent
		return ev.target.nodeType == 3 ? ev.target.parentNode : ev.target;
	} else if (ev && ev.srcElement) {
		return ev.srcElement;
	} else {
		return null;
	}
}

/**
* Returns the first element with a value for the given property, working its way up the element chain.
*
* @param ev		a UI event
* @param prop	the name of a property
* @returns		an element
*/
DwtUiEvent.getTargetWithProp =
function(ev, prop)  {
	var htmlEl = DwtUiEvent.getTarget(ev);
	while (htmlEl) {
		if (Dwt.getAttr(htmlEl, prop) != null) {
			return htmlEl;
		}
		htmlEl = htmlEl.parentNode;
	}
	return null;
}

/**
* Returns the first element with values for all of the given properties, working its way up the element chain.
*
* @param ev		a UI event
* @param props	a list of property names
* @returns		an element
*/
DwtUiEvent.getTargetWithProps =
function(ev, props)  {
	var htmlEl = DwtUiEvent.getTarget(ev);
	while (htmlEl) {
		var okay = true;
		for (var i in props) {
			var val = Dwt.getAttr(htmlEl, props[i]);
			if (val == null) {
				htmlEl = htmlEl.parentNode;
				okay = false;
				break;
			}
		}
		if (okay)
			return htmlEl;
	}
	return null;
}

DwtUiEvent.getDwtObjFromEvent =
function(ev) {
	var htmlEl = DwtUiEvent.getTargetWithProp(ev, "dwtObj");
	return htmlEl ? Dwt.getObjectFromElement(htmlEl) : null;
}

DwtUiEvent.getDwtObjWithProp =
function(ev, prop) {
	var htmlEl = DwtUiEvent.getTargetWithProps(ev, ["dwtObj", prop]);
	return htmlEl ? Dwt.getObjectFromElement(htmlEl) : null;
}

DwtUiEvent.copy = 
function(dest, src) {
	dest.altKey = src.altKey;
	dest.ctrlKey = src.ctrlKey;
	dest.metaKey = src.metaKey;
	dest.shiftKey = src.shiftKey;
	dest.target = src.target;
	dest.type = src.type;
	dest.dwtObj = src.dwtObj;
	dest.docX = src.docX;
	dest.docY = src.docY;
	dest.elementX = src.elementX;
	dest.elementY = src.elementY;
	dest.ersatz = src.ersatz;
	dest._stopPropagation = src._stopPropagation;
	dest._returnValue = src._returnValue;
}

DwtUiEvent.prototype.setFromDhtmlEvent =
function(ev) {
	ev = DwtUiEvent.getEvent(ev);
	if (!ev) return;
	this.altKey = ev.altKey;
	this.ctrlKey = ev.ctrlKey;
	this.metaKey = ev.metaKey;
	this.shiftKey = ev.shiftKey;
	this.type = ev.type;
	this.target = DwtUiEvent.getTarget(ev);
	var target = this.target;
	while (target != null) {
		if (target.dwtObj != null) {
			this.dwtObj = Dwt.getObjectFromElement(target);
			break;
		}
		target = target.parentNode;
	}

	// Compute document coordinates
	if (ev.pageX != null) {
		this.docX = ev.pageX;
		this.docY = ev.pageY;
	} else if (ev.clientX != null) {
		this.docX = ev.clientX + document.body.scrollLeft - document.body.clientLeft;
		this.docY = ev.clientY + document.body.scrollTop - document.body.clientTop;
		if (document.body.parentElement) {
				var bodParent = document.body.parentElement;
				this.docX += bodParent.scrollLeft - bodParent.clientLeft;
				this.docY += bodParent.scrollTop - bodParent.clientTop;
		}
	}
	// Compute Element coordinates
	if (ev.offsetX != null) {
		this.elementX = ev.offsetX;
		this.elementY = ev.offsetY;
	} else if (ev.layerX != null) {
		this.elementX = ev.layerX;
		this.elementY = ev.layerY;
	} else { // fail hard for others
		this.elementX = Dwt.DEFAULT;
		this.elementY = Dwt.DEFAULT;
	}
	
	this.ersatz = false;
	return ev;
}

DwtUiEvent.prototype.setToDhtmlEvent =
function(ev) {
	DwtUiEvent.setBehaviour(ev, this._stopPropagation, this._returnValue);	
}

DwtUiEvent.setBehaviour =
function(ev, stopPropagation, allowDefault) {
	var dhtmlEv = DwtUiEvent.getEvent(ev);
	DwtUiEvent.setDhtmlBehaviour(dhtmlEv, stopPropagation, allowDefault);
};

DwtUiEvent.setDhtmlBehaviour =
function(dhtmlEv, stopPropagation, allowDefault) {
	dhtmlEv = dhtmlEv || window.event;

	// stopPropagation is referring to the function found in Mozilla's event object
	if (dhtmlEv.stopPropagation != null) {
		if (stopPropagation)
			dhtmlEv.stopPropagation();
		if (!allowDefault)
			dhtmlEv.preventDefault();
	} else {
		// IE only..
		dhtmlEv.returnValue = allowDefault;
		dhtmlEv.cancelBubble = stopPropagation;
	}
};
