package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    @Test
    void checkDatabaseConnection() {
        Database.connectToDb();
        assertTrue(Database.connectionEstablished);
    }

    @Test
    void testThatDataIsInserted() {
        Statement statement = null;
        ResultSet results = null;

        Database.connectToDb();
        Database.clearDatabase();
        Database.createInitialRabbits();

        try {
            statement = Database.connection.createStatement();
            results = statement.executeQuery("SELECT COUNT(ID) FROM rabbit");

            results.next();

            int count = results.getInt(1);

            assertEquals(2, count);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { if (results != null) results.close(); } catch (Exception e) {};
            try { if (statement != null) statement.close(); } catch (Exception e) {};
        }
    }
}
