package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
    public static Connection connect() {
        Connection conn = null;


        try {
            String
                    url = "jdbc:sqlite:src/main/resources/attendancemanagement.db";
// create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}





