package com.database;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.DynaProperty;

public class DatabaseProvider<T extends DatabaseObject> {
    private static DatabaseProvider databaseProvider;

    private static String connectionString = "";
    private static String password = "";
    private static String username = "";

    private static boolean initialized = true;

    public DatabaseProvider(){ }



    public static void initDatabaseProvider() {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        }
        catch(SQLException e){
            initialized = false;
            e.printStackTrace();
        }

        connectionString = "jdbc:sqlserver://localhost:1433;DatabaseName=CS442";
        username = "sa";
        password = "secret";
    }

    public List<T> performSimpleSelectQuery(String table, String columns, String where, Class targetObj) throws SQLException {
        if(!initialized) return null;
        List<T> results = new ArrayList<T>();
        Constructor ct;
        DatabaseObject dbo;
        try {
            ct = targetObj.getConstructor(null);
            dbo = (DatabaseObject)ct.newInstance(null);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

        String[] cols = columns.split(",");
        String[] properties = new String[cols.length];
        for(int i = 0; i < cols.length; i++){
            cols[i] = cols[i].trim();
            properties[i] = dbo.getMappingFromColumnName(cols[i]);
        }
        Connection conn = DriverManager.getConnection(connectionString, username, password);
        PreparedStatement pst = conn.prepareStatement("SELECT " + columns + " FROM " + table + (where.equals("") ? "" : " WHERE " + where));
        pst.execute();
        ResultSet rs = pst.getResultSet();
        while(rs.next()){
            try {
                dbo = (DatabaseObject)ct.newInstance(null);
                for(int i = 0; i < cols.length; i++){
                    BeanUtils.setProperty(dbo, properties[i], rs.getObject(cols[i]));
                }
                results.add((T)dbo);
            }
            catch(Exception e){
                e.printStackTrace();
                rs.close();
                pst.close();
                conn.close();
                return null;
            }
        }
        rs.close();
        pst.close();
        conn.close();
        return results;

    }

    public int performInsert(String columns, String values, String table) throws SQLException {
        String sqlInsert = "INSERT INTO " + table + " (" + columns + ") VALUES (" + values + ")"; 
        Connection conn = DriverManager.getConnection(connectionString, username, password);
        PreparedStatement pst = conn.prepareStatement(sqlInsert);
        int toReturn = 0;
        try {
            toReturn = pst.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
            pst.close();
            conn.close();
            return toReturn;
        }
        pst.close();
        conn.close();
        return toReturn;
    }

}
