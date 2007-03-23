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
 * Portions created by Zimbra are Copyright (C) 2005 Zimbra, Inc.
 * All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.im.interop.yahoo;

/**
 * 
 */
public class YahooBuddy {
    YahooBuddy(String name) {
        mName = name;
    }
    public String getName() { return mName; }
    public boolean ignore() { return mIgnore; }
    public YahooStatus getStatus() { return mStatus; }
    
    void setIgnore(boolean truthines) { mIgnore = truthines; }
    void setStatus(YahooStatus status) {
        mStatus = status;
    }
    
    public String toString() {
        return "Buddy("+mName+(mIgnore?", IGNORED":"")+")";
    }
    
    private YahooStatus mStatus = YahooStatus.OFFLINE;
    private String mName;
    private boolean mIgnore = false;
}
