package com.theatmo;

import com.theatmo.CustomException.ConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    /**
     * Creates a connection for the database
     *
     */
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "@Rajkumar2805");

        } catch (Exception exception) {
            throw new ConnectionException("Connection failed");
        }
        return connection;
    }
}
