/*
 * ***** BEGIN LICENSE BLOCK *****
 *
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2007, 2008 Zimbra, Inc.
 *
 * The contents of this file are subject to the Yahoo! Public License
 * Version 1.0 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 *
 * ***** END LICENSE BLOCK *****
 */
package com.zimbra.cs.offline.util.yauth;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * Implementation of Yahoo "Raw Auth" aka "Token Login v2"
 * See http://twiki.corp.yahoo.com/view/Membership/OpenTokenLogin
 */
public class RawAuth implements Auth {
    private final String appId;
    private String cookie;
    private String wssId;
    private long expiration;

    private static final String BASE_URI = "https://login.yahoo.com/WSLogin/V1";
    private static final String GET_AUTH_TOKEN = "get_auth_token";
    private static final String GET_AUTH = "get_auth";

    private static final String LOGIN = "login";
    private static final String PASSWD = "passwd";
    private static final String APPID = "appid";
    private static final String TOKEN = "token";

    private static final String AUTH_TOKEN = "AuthToken";
    private static final String COOKIE = "Cookie";
    private static final String WSSID = "WSSID";
    private static final String EXPIRATION = "Expiration";
    private static final String ERROR = "Error";
    private static final String ERROR_DESCRIPTION = "ErrorDescription";

    public static String getToken(String appId, String user, String pass)
            throws AuthenticationException, IOException {
        Response res = doGet(GET_AUTH_TOKEN, new NameValuePair(APPID, appId),
            new NameValuePair(LOGIN, user), new NameValuePair(PASSWD, pass));
        return res.getRequiredValue(AUTH_TOKEN);
    }

    public static RawAuth authenticate(String appId, String token)
            throws AuthenticationException, IOException {
        RawAuth auth = new RawAuth(appId);
        auth.authenticate(token);
        return auth;
    }

    private RawAuth(String appId) {
        this.appId = appId;
    }
    
    public String getAppId() {
        return appId;
    }

    public String getCookie() {
        return cookie;
    }
    
    public String getWSSID() {
        return wssId;
    }

    public long getExpiration() {
        return expiration;
    }

    public void authenticate(String token)
            throws AuthenticationException, IOException {
        Response res = doGet(GET_AUTH, new NameValuePair(APPID, appId),
                                       new NameValuePair(TOKEN, token));
        cookie = res.getRequiredValue(COOKIE);
        wssId = res.getRequiredValue(WSSID);
        String s = res.getRequiredValue(EXPIRATION);
        try {
            expiration = System.currentTimeMillis() + Long.parseLong(s);
        } catch (NumberFormatException e) {
            throw badResponse(GET_AUTH_TOKEN,
                "Invalid integer value for field '" + EXPIRATION + "'");
        }
    }

    private static Response doGet(String action, NameValuePair... params)
            throws AuthenticationException, IOException {
        String uri = BASE_URI + '/' + action;
        GetMethod get = new GetMethod(uri);
        get.setQueryString(params);
        // XXX Should we share a single HttpClient() instance?
        int code = new HttpClient().executeMethod(get);
        Response res = new Response(uri, get);
        switch (code) {
        case 200:
            return res;
        case 403:
            throw new AuthenticationException(
                "Request '" + action + "' failed: " + res.getErrorMessage());
        default:
            throw badResponse(action, "Unexpected response code: " + code);
        }
    }

    private static class Response {
        final String action;
        final List<String> names = new ArrayList<String>(5);
        final List<String> values = new ArrayList<String>(5);

        Response(String action, HttpMethod method) throws IOException {
            this.action = action;
            String body = method.getResponseBodyAsString();
            for (String line : body.split("\\r?\\n")) {
                int i = line.indexOf('=');
                if (i != -1) {
                    names.add(line.substring(0, i));
                    values.add(line.substring(i + 1));
                }
            }
        }

        String getRequiredValue(String name) throws IOException {
            String value = getValue(name);
            if (value == null) {
                throw badResponse(action, "Missing required '" + name + "' field");
            }
            return value;
        }
        
        String getValue(String name) {
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).equalsIgnoreCase(name)) {
                    return values.get(i);
                }
            }
            return null;
        }

        String getErrorMessage() {
            String error = getValue(ERROR);
            String description = getValue(ERROR_DESCRIPTION);
            if (error != null) {
                return description != null ? error + ": " + description : error;
            }
            return description != null ? description : "Unknown error";
        }
    }

    private static IOException badResponse(String action, String msg) {
        return new IOException(
            "Unexpected '" + action + "' response: " + msg);
    }
}
