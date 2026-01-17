package com.harshit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetail {
    private static final String UNAME = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/TruckMngt";
    private static final String PASS = "Harshit@1";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, UNAME, PASS);
    }
}
