package com.sparta.engineering50;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class Rabbit {
    private int age;
    private String gender;
    private String state;
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Rabbit() {
        age = 0;
        gender = offSpringGender();
        state = "young";
    }

    //Only use it for testing!
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public int getAge() {
        return age;
    }

    public static void increaseAge() {
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = Database.connection.createStatement();
            statement.executeUpdate("UPDATE rabbit SET Age = Age + 1");
            statement.executeUpdate("UPDATE rabbit SET Available = 'yes' WHERE Age = 3");
            statement.executeUpdate("UPDATE rabbit SET Available = 'no', Dead = 'yes' WHERE Age = 60");
            statement.executeUpdate("UPDATE rabbit SET Available = 'yes' WHERE Age >= 3 AND Gender = 'male'");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (statement != null) statement.close(); } catch (Exception e) {};
        }
    }

    public static String offSpringGender() {
        Random random = new Random();
        boolean result = random.nextBoolean();
        if (result) {
            return "male";
        } else {
            return "female";
        }
    }

    public static void giveBirth() {
        Statement statement = null;
        Statement statement2 = null;
        ResultSet rs = null;
        String sql;

        try {
            statement = Database.connection.createStatement();
            statement2 = Database.connection.createStatement();
            rs = statement.executeQuery("SELECT ID FROM rabbit WHERE Pregnant = 'yes'");

            while (rs.next()) {

                Random random = new Random();
                int randomNumber = 0;
                while (randomNumber == 0) {
                    randomNumber = random.nextInt(15);
                }

                for (int i = randomNumber; i > 0; i--) {
                    sql = "INSERT INTO rabbit (Age, Gender, Available, Pregnant, Dead) VALUES (0, /" + offSpringGender() + "/, 'no', 'no', 'no')";
                    sql = sql.replace("/", "'");
                    statement2.executeUpdate(sql);
                }

                sql = "UPDATE rabbit SET Available = 'yes', Pregnant = 'no' WHERE ID = " + rs.getInt("ID");
//                statement.executeUpdate(sql);
            }

        } catch (SQLException ex) {
            System.out.println("HERE!!!");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (statement != null) statement.close(); } catch (Exception e) {};
        }
    }
}

