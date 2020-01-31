package com.sparta.engineering50;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Field {
    private static ArrayList<Rabbit> rabbits = new ArrayList<>();

    public static ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }


    public static void breed() {
        Statement statement = null;
        Statement st2 = null;
        Statement st3 = null;
        ResultSet male = null;
        ResultSet female = null;

        try {
            statement = Database.connection.createStatement();
            st2 = Database.connection.createStatement();
            st3 = Database.connection.createStatement();

            male = statement.executeQuery("SELECT ID FROM rabbit WHERE Gender = 'male' AND Available = 'yes'");
            female = st2.executeQuery("SELECT ID FROM rabbit WHERE Gender = 'female' AND Available = 'yes'");

            while(male.next() && female.next()) {
                st3.executeUpdate("UPDATE rabbit SET Available = 'no' WHERE ID = " + male.getInt("ID"));
                st3.closeOnCompletion();
                st3.executeUpdate("UPDATE rabbit SET Pregnant = 'yes', Available = 'no' WHERE ID = " + female.getInt("ID"));
                st3.closeOnCompletion();
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { if (st3 != null) st3.close(); } catch (Exception e) {};
            try { if (statement != null) statement.close(); } catch (Exception e) {};
            try { if (male != null) male.close(); } catch (Exception e) {};
            try { if (female != null) female.close(); } catch (Exception e) {};
        }
    }
}
