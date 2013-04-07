package com.database;

import java.sql.*;

public class DatabaseConnection {
	
	public static Connection getConnection() throws Exception{
		 Connection conn = null;
		 
	        try {
	 
	            String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=CS442";//user=sa;Password=secret";
	          String user = "sa";
	          String pass = "secret";
	            conn = DriverManager.getConnection(dbURL, user, pass);
	            if (conn != null) {
	               return conn;
	            }
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
			return null;
	}
	
	public static void closeConnection(Connection conn) throws Exception {
		try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}

}
