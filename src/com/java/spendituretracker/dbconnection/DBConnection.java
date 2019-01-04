/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.dbconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Calcey
 */
public final class DBConnection implements DBConnectionInf{
    
    private static Connection connection;
    
    private DBConnection(){
    }
    
    
    public static Connection GetConnection() throws SQLException, ClassNotFoundException{
        if(connection == null){
            connection = getConnection();
        }
        return  connection;
    }
    
    
    
    private static Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection conn;
        Class.forName("com.mysql.jdbc.Driver");
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "root");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3308/spenditure_tracker",connectionProps);
        System.out.println("Connected to database");
        return conn;
    }
}
