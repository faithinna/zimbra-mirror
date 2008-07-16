/*
 * ***** BEGIN LICENSE BLOCK *****
 * 
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2006, 2007 Zimbra, Inc.
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
package org.jivesoftware.util;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.sql.*;

import org.jivesoftware.database.DbConnectionManager;

/**
 * Retrieves and stores Jive properties. Properties are stored in the database.
 *
 * @author Matt Tucker
 */
class JiveProperties implements PropertyProvider {

    private static final String LOAD_PROPERTIES = "SELECT name, propValue FROM jiveProperty";
    private static final String INSERT_PROPERTY = "INSERT INTO jiveProperty(name, propValue) VALUES(?,?)";
    private static final String UPDATE_PROPERTY = "UPDATE jiveProperty SET propValue=? WHERE name=?";
    private static final String DELETE_PROPERTY = "DELETE FROM jiveProperty WHERE name LIKE ?";

    private static JiveProperties instance;

    private Map<String, String> properties;

    /**
     * Returns a singleton instance of JiveProperties.
     *
     * @return an instance of JiveProperties.
     */
    public static synchronized JiveProperties getInstance() {
        if (instance == null) {
            instance = new JiveProperties();
        }
        return instance;
    }

    private JiveProperties() {
        init();
    }

    /**
     * For internal use only. This method allows for the reloading of all properties from the
     * values in the datatabase. This is required since it's quite possible during the setup
     * process that a database connection will not be available till after this class is
     * initialized. Thus, if there are existing properties in the database we will want to reload
     * this class after the setup process has been completed.
     */
    private void init() {
        if (properties == null) {
            properties = new ConcurrentHashMap<String, String>();
        }
        else {
            properties.clear();
        }

        loadProperties();
    }

    private int size() {
        return properties.size();
    }

    private void clear() {
        throw new UnsupportedOperationException();
    }

    private boolean isEmpty() {
        return properties.isEmpty();
    }

    private boolean containsKey(Object key) {
        return properties.containsKey(key);
    }

    private boolean containsValue(Object value) {
        return properties.containsValue(value);
    }

    private Collection<String> values() {
        return Collections.unmodifiableCollection(properties.values());
    }

    private void putAll(Map<? extends String, ? extends String> t) {
        for (Map.Entry<? extends String, ? extends String> entry : t.entrySet() ) {
            put(entry.getKey(), entry.getValue());
        }
    }

    private Set<Map.Entry<String, String>> entrySet() {
        return Collections.unmodifiableSet(properties.entrySet());
    }

    private Set<String> keySet() {
        return Collections.unmodifiableSet(properties.keySet());
    }

    public synchronized String get(String key) {
        return properties.get(key);
    }

    /**
     * Return all children property names of a parent property as a Collection
     * of String objects. For example, given the properties <tt>X.Y.A</tt>,
     * <tt>X.Y.B</tt>, and <tt>X.Y.C</tt>, then the child properties of
     * <tt>X.Y</tt> are <tt>X.Y.A</tt>, <tt>X.Y.B</tt>, and <tt>X.Y.C</tt>. The method
     * is not recursive; ie, it does not return children of children.
     *
     * @param parentKey the name of the parent property.
     * @return all child property names for the given parent.
     */
    private Collection<String> getChildrenNames(String parentKey) {
        Collection<String> results = new HashSet<String>();
        for (String key : properties.keySet()) {
            if (key.startsWith(parentKey + ".")) {
                if (key.equals(parentKey)) {
                    continue;
                }
                int dotIndex = key.indexOf(".", parentKey.length()+1);
                if (dotIndex < 1) {
                    if (!results.contains(key)) {
                        results.add(key);
                    }
                }
                else {
                    String name = parentKey + key.substring(parentKey.length(), dotIndex);
                    results.add(name);
                }
            }
        }
        return results;
    }

    /**
     * Returns all property names as a Collection of String values.
     *
     * @return all property names.
     */
    private Collection<String> getPropertyNames() {
        return properties.keySet();
    }
    
    public synchronized String remove(String key) {
        return remove(key); 
    }

    public synchronized String remove(Object key) {
        String value = properties.remove(key);
        // Also remove any children.
        Collection<String> propNames = getPropertyNames();
        for (String name : propNames) {
            if (name.startsWith((String)key)) {
                properties.remove(name);
            }
        }
        deleteProperty((String)key);

        // Generate event.
        PropertyEventDispatcher.dispatchEvent((String)key,
                PropertyEventDispatcher.EventType.property_deleted, Collections.emptyMap());

        return value;
    }

    public synchronized String put(String key, String value) {
        if (key == null || value == null) {
            throw new NullPointerException("Key or value cannot be null. Key=" +
                    key + ", value=" + value);
        }
        if (!(key instanceof String) || !(value instanceof String)) {
            throw new IllegalArgumentException("Key and value must be of type String.");
        }
        if (key.endsWith(".")) {
            key = key.substring(0, key.length()-1);
        }
        key = key.trim();
        if (properties.containsKey(key)) {
            if (!properties.get(key).equals(value)) {
                updateProperty(key, value);
            }
        }
        else {
            insertProperty(key, value);
        }

        String result = properties.put((String)key, (String)value);

        // Generate event.
        Map<String, String> params = new HashMap<String, String>();
        params.put("value", value);
        PropertyEventDispatcher.dispatchEvent(key, PropertyEventDispatcher.EventType.property_set,
                params);

        return result;
    }

    private void insertProperty(String name, String value) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DbConnectionManager.getConnection();
            pstmt = con.prepareStatement(INSERT_PROPERTY);
            pstmt.setString(1, name);
            pstmt.setString(2, value);
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            Log.error(e);
        }
        finally {
            try { if (pstmt != null) { pstmt.close(); } }
            catch (Exception e) { Log.error(e); }
            try { if (con != null) { con.close(); } }
            catch (Exception e) { Log.error(e); }
        }
    }

    private void updateProperty(String name, String value) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DbConnectionManager.getConnection();
            pstmt = con.prepareStatement(UPDATE_PROPERTY);
            pstmt.setString(1, value);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            Log.error(e);
        }
        finally {
            try { if (pstmt != null) { pstmt.close(); } }
            catch (Exception e) { Log.error(e); }
            try { if (con != null) { con.close(); } }
            catch (Exception e) { Log.error(e); }
        }
    }

    private void deleteProperty(String name) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DbConnectionManager.getConnection();
            pstmt = con.prepareStatement(DELETE_PROPERTY);
            pstmt.setString(1, name + "%");
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            Log.error(e);
        }
        finally {
            try { if (pstmt != null) { pstmt.close(); } }
            catch (Exception e) { Log.error(e); }
            try { if (con != null) { con.close(); } }
            catch (Exception e) { Log.error(e); }
        }
    }

    private void loadProperties() {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DbConnectionManager.getConnection();
            pstmt = con.prepareStatement(LOAD_PROPERTIES);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                String value = rs.getString(2);
                properties.put(name, value);
            }
            rs.close();
        }
        catch (Exception e) {
            Log.error(e);
        }
        finally {
            try { if (pstmt != null) { pstmt.close(); } }
            catch (Exception e) { Log.error(e); }
            try { if (con != null) { con.close(); } }
            catch (Exception e) { Log.error(e); }
        }
    }
}