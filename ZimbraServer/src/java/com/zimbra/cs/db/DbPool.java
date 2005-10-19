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

/*
 * Created on Apr 7, 2004
 */
package com.zimbra.cs.db;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDriver;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool.impl.GenericObjectPool;

import com.zimbra.cs.localconfig.LC;
import com.zimbra.cs.service.ServiceException;
import com.zimbra.cs.service.util.ZimbraPerf;
import com.zimbra.cs.util.SystemUtil;
import com.zimbra.cs.util.ValueCounter;
import com.zimbra.cs.util.ZimbraLog;

/**
 * @author schemers
 */
public class DbPool {

    private static int sConnectionPoolSize = 100;
    private static Log sLog = LogFactory.getLog(DbPool.class);
    private static PoolingDriver sPoolingDriver;
    private static String sRootUrl = null;
    private static String sLoggerRootUrl = null;    
    private static GenericObjectPool sConnectionPool;
    private static ValueCounter sConnectionStackCounter = new ValueCounter();
    
	public static class Connection {
		private java.sql.Connection mConnection;
        private Throwable mStackTrace;

		private Connection(java.sql.Connection conn)  { mConnection = conn; }

		public java.sql.Connection getConnection()  { return mConnection; }

		public void setTransactionIsolation(int level) throws ServiceException {
            try {
            	mConnection.setTransactionIsolation(level);
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("setting database connection isolation level", e);
            }
		}

        /**
         * Disable foreign key constraint checking for this Connection.  Used by the mailbox restore code
         * so that it can do a LOAD DATA INFILE without hitting foreign key constraint troubles.
         *   
         * @throws ServiceException
         */
        public void disableForeignKeyConstraints() throws ServiceException {
            PreparedStatement stmt = null;
            try {
                stmt = mConnection.prepareStatement("SET FOREIGN_KEY_CHECKS=0");                
                stmt.execute();
            } catch (SQLException e) {
                throw ServiceException.FAILURE("disabling foreign key constraints", e);
            } finally {
                DbPool.closeStatement(stmt);
            }
        }

		public PreparedStatement prepareStatement(String sql) throws ServiceException {
            ZimbraPerf.incrementPrepareCount();
            try {
            	return mConnection.prepareStatement(sql);
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("preparing database statement", e);
            }
		}
		public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws ServiceException {
            try {
            	return mConnection.prepareStatement(sql, autoGeneratedKeys);
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("preparing database statement", e);
            }
		}

		public void close() throws ServiceException {
            try {
                mConnection.close();
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("closing database connection", e);
            } finally {
                // Connection is being returned to the pool.  Decrement its stack
                // trace counter.
                if (ZimbraLog.sqltrace.isDebugEnabled()) {
                    synchronized(sConnectionStackCounter) {
                        sConnectionStackCounter.decrement(SystemUtil.getStackTrace(mStackTrace));
                    }
                }
            }
		}

		public void rollback() throws ServiceException {
            try {
                mConnection.rollback();
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("rolling back database transaction", e);
            }
		}
		
		public void commit() throws ServiceException {
			try {
				mConnection.commit();
            } catch (SQLException e) {
            	throw ServiceException.FAILURE("committing database transaction", e);
            }
		}
        
        /**
         * Sets the stack trace used for detecting connection leaks.
         */
        private void setStackTrace(Throwable t) {
            mStackTrace = t;
        }
	}

    /**
     * Initializes the connection pool.
     */
    static {
        String drivers = System.getProperty("jdbc.drivers");
        if (drivers == null)
            System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");
        
        String myAddress = LC.mysql_bind_address.value();
        String myPort = LC.mysql_port.value();
        sRootUrl = "jdbc:mysql://" + myAddress + ":" + myPort + "/";     
        String url = sRootUrl + "zimbra";
        sLoggerRootUrl = "jdbc:mysql://" + LC.logger_mysql_bind_address.value() + ":" + LC.logger_mysql_port.value() + "/";        

        Properties props = getZimbraDbProps();
        // TODO: need to tune these
        String maxActive = (String)props.get("maxActive");
        if (maxActive != null) {
            try {
                sConnectionPoolSize = Integer.parseInt(maxActive);
            } catch (NumberFormatException nfe) {
                sLog.warn("exception parsing maxActive", nfe);
            }
        }
        ZimbraLog.misc.info("Setting mysql connection pool size to " + sConnectionPoolSize);

        sConnectionPool = new GenericObjectPool(
            null, sConnectionPoolSize, GenericObjectPool.WHEN_EXHAUSTED_BLOCK, -1, sConnectionPoolSize);
        ConnectionFactory cfac = new DriverManagerConnectionFactory(url, props);
        
        boolean defAutoCommit = false;
        boolean defReadOnly = false;
        
        // I don't think we need PreparedStatement pooling as it appears
        // the lastest mysql driver does it internally. Need to investigate.
        new PoolableConnectionFactory(cfac, sConnectionPool, null, null, defReadOnly, defAutoCommit);
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	Class.forName("org.apache.commons.dbcp.PoolingDriver");
            sPoolingDriver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
            sPoolingDriver.registerPool("zimbra", sConnectionPool);
        } catch (ClassNotFoundException e) {
            sLog.fatal("can't init Pool", e);
            System.exit(1);
        } catch (SQLException e) {
            sLog.fatal("can't init Pool", e);
            System.exit(1);
        }
    };

    private static Properties getZimbraDbProps() {
        Properties props = new Properties();
        
        props.put("cacheResultSetMetadata", "true");
        props.put("cachePrepStmts", "true");
        props.put("prepStmtCacheSize", "25");        
        props.put("autoReconnect", "true");
        props.put("useUnicode", "true");
        props.put("characterEncoding", "UTF-8");
        props.put("dumpQueriesOnException", "true");

        //props.put("characterEncoding", "UnicodeBig");

        //props.put("cacheCallableStmts", "true");

        //props.put("prepStmtCacheSqlLmiit", "256");

        //props.put("connectTimeout", "0"); // connect timeout in msecs
        //props.put("initialTimeout", "2"); // time to wait between re-connects
        //props.put("maxReconnects", "3""); // max number of reconnects to attempt

        // Set/override MySQL Connector/J connection properties from
        // localconfig.  Localconfig keys with "zimbra_mysql_connector_"
        // prefix are used.
        String prefix = "zimbra_mysql_connector_";
        int prefixLen = prefix.length();
        String[] keys = LC.getAllKeys();
        for (int i = 0; i < keys.length; i++) {
        	String key = keys[i];
            if (key.startsWith(prefix)) {
            	String prop = key.substring(prefixLen);
                if (prop.length() > 0 && !prop.equalsIgnoreCase("logger")) {
                	String val = LC.get(key);
                    sLog.info("Setting mysql connector property: " + prop + "=" + val);
                    props.put(prop, val);
                }
            }
        }

        if (ZimbraLog.sqltrace.isDebugEnabled() || ZimbraLog.perf.isDebugEnabled()) {
            props.put("profileSQL", "true");
            props.put("logger", MySqlTraceLogger.class.getName());
        }
        if (ZimbraLog.perf.isDebugEnabled()) {
            props.put("slowQueryThresholdMillis", "300");
            props.put("logSlowQueries", "true");
            // xxx bburtin: for some reason, using explainSlowQueries causes the subsequent
            // call to executeQuery() after an EXPLAIN to hang.  Filed MySQL bug# 12229
	    // for this issue.  See http://bugs.mysql.com/bug.php?id=12229 for more info.
            // props.put("explainSlowQueries", "true");
        }
        
        // These properties cannot be set with "zimbra_mysql_connector_" keys.
        props.put("user", LC.zimbra_mysql_user.value());
        props.put("password", LC.zimbra_mysql_password.value());

        return props;
    }
    
    /**
     * return a connection to use for the zimbra database.
     * @param 
     * @return
     * @throws ServiceException
     */
    public static Connection getConnection() throws ServiceException {
        java.sql.Connection conn = null;

        try {
	        String url = "jdbc:apache:commons:dbcp:zimbra";
	        conn = DriverManager.getConnection(url);
	        
	        if (conn.getAutoCommit() != false)
	            conn.setAutoCommit(false);
	
	        // We want READ COMMITTED transaction isolation level for duplicate
	        // handling code in BucketBlobStore.newBlobInfo().
	        conn.setTransactionIsolation(java.sql.Connection.TRANSACTION_READ_COMMITTED);
        } catch (SQLException e) {
        	throw ServiceException.FAILURE("getting database connection", e);
        }

        // If the connection pool is overutilized, warn about potential leaks
        int numActive = sConnectionPool.getNumActive();
        int maxActive = sConnectionPool.getMaxActive();
        if (numActive > maxActive * 0.75) {
            String stackTraceMsg =
                "Turn on debug logging for zimbra.sqltrace to see stack " +
                "traces of connections not returned to the pool.";
            if (ZimbraLog.sqltrace.isDebugEnabled()) {
                StringBuffer buf = new StringBuffer();
                synchronized (sConnectionStackCounter) {
                    Iterator i = sConnectionStackCounter.iterator();
                    while (i.hasNext()) {
                        String stackTrace = (String) i.next();
                        int count = sConnectionStackCounter.getCount(stackTrace);
                        if (count == 0) {
                            i.remove();
                        } else {
                            buf.append(count + " connections allocated at " + stackTrace + "\n");
                        }
                    }
                }
                stackTraceMsg = buf.toString();
            }
            ZimbraLog.sqltrace.warn("Connection pool is 75% utilized.  " + numActive +
                "connections out of a maximum of " + maxActive + " in use.  "+ stackTraceMsg);
        }
        
        Connection zimbraConn = new Connection(conn);
        
        // If we're debugging, update the counter with the current stack trace
        if (ZimbraLog.sqltrace.isDebugEnabled()) {
            Throwable t = new Throwable();
            zimbraConn.setStackTrace(t);
            
            synchronized (sConnectionStackCounter) {
                sConnectionStackCounter.increment(SystemUtil.getStackTrace(t));
            }
        }
        
        return zimbraConn;
    }
    
    /**
     * Returns a new database connection for maintenance operations, such as
     * restore. Does not specify the name of the default database. This
     * connection is created outside the context of the database connection
     * pool.
     */
    public static Connection getMaintenanceConnection() throws ServiceException {
        try {
            String user = LC.zimbra_mysql_user.value();
            String pwd = LC.zimbra_mysql_password.value();
            java.sql.Connection conn = DriverManager.getConnection(sRootUrl + "?user=" + user + "&password=" + pwd);
            return new Connection(conn);
        } catch (SQLException e) {
            throw ServiceException.FAILURE("getting database maintenance connection", e);
        }
    }
    
    /**
     * Returns a new database connection for logger use.
     * Does not specify the name of the default database. This
     * connection is created outside the context of the database connection
     * pool.
     */
    public static Connection getLoggerConnection() throws ServiceException {
        try {
            String user = LC.zimbra_mysql_user.value();
            String pwd = LC.zimbra_logger_mysql_password.value();
            java.sql.Connection conn = DriverManager.getConnection(sLoggerRootUrl + "?user=" + user + "&password=" + pwd);
            return new Connection(conn);
        } catch (SQLException e) {
            throw ServiceException.FAILURE("getting database logger connection", e);
        }
    }
/**
     * closes the specified connection (if not null), and catches any
     * exceptions on close, and logs them.
     * @param conn
     */
    public static void quietClose(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (ServiceException e) {
                if (sLog.isWarnEnabled())
                    sLog.warn("quietClose caught exception", e);
            }
        }
    }
    
    /**
     * Does a rollback the specified connection (if not null), and catches any
     * exceptions and logs them.
     * @param conn
     */
    public static void quietRollback(Connection conn) {
        if (conn != null) {
            try {
                conn.rollback();
            } catch (ServiceException e) {
                if (sLog.isWarnEnabled())
                    sLog.warn("quietRollback caught exception", e);
            }
        }
    }

    /**
     * Closes a statement and wraps any resulting exception in a ServiceException.
     * @param stmt
     * @throws ServiceException
     */
    public static void closeStatement(Statement stmt) throws ServiceException {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw ServiceException.FAILURE("closing statement", e);
            }
        }
    }

    /**
     * Closes a ResultSet and wraps any resulting exception in a ServiceException.
     * @param rs
     * @throws ServiceException
     */
    public static void closeResults(ResultSet rs) throws ServiceException {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw ServiceException.FAILURE("closing statement", e);
            }
        }
    }
}
