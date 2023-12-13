/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author w18002720
 */
public class sqliteDB {

    private Connection conn;

    public sqliteDB() {
        conn = null;
    }
    // connect to database
    public boolean Connect(String filename) {
        try {
            String url = "jdbc:sqlite:" + filename;
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to " + filename + " has been established.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to " + filename);
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean RunSQL(String sql) {
        if (conn == null) {
            System.out.println("There is no database loaded. Cannot run SQL.");
            return false;
        }
        try {
            Statement sqlStatement = conn.createStatement();
            sqlStatement.execute(sql);
        } catch (SQLException e) {
            System.out.println("Failed to execute " + sql);
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
    //Creates a PreparedStatement object for sending parameterized SQL statements to the database.
    /*
    @param 
    */
    public PreparedStatement prepareStatement(String sql) throws SQLException {

        PreparedStatement sqlstatement = null;
        try {
            sqlstatement = conn.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Failed to execute " + sql);
            System.out.println(e.getMessage());
        }
        return sqlstatement;
    }

    public ResultSet RunSQLQuery(String sql) {
        ResultSet rs;
        if (conn == null) {
            System.out.println("There is no database loaded. Cannot run SQL.");
            return null;
        }
        try {
            Statement sqlStatement = conn.createStatement();
            rs = sqlStatement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Failed to execute " + sql);
            System.out.println(e.getMessage());
            return null;
        }
        return rs;
    }

}
