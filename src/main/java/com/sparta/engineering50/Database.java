package com.sparta.engineering50;

import java.sql.*;

public class Database {
    static Connection connection = null;
    static boolean connectionEstablished = false;

    public static void connectToDb() {
        try {
            String url = "jdbc:mysql://localhost:3306/rabbitsimulator";
            String user = "root";
            String password = "password";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
            connectionEstablished = true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void clearDatabase() {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM rabbit");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void createInitialRabbits() {

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO rabbit (Age, Gender, Available, Pregnant, Dead) VALUES (0, 'male', 'no', 'no', 'no')");
            statement.executeUpdate("INSERT INTO rabbit (Age, Gender, Available, Pregnant, Dead) VALUES (0, 'female', 'no', 'no', 'no')");

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { if (statement != null) statement.close(); } catch (Exception e) {};
        }
    }
}
