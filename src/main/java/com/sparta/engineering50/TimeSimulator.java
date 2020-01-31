package com.sparta.engineering50;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

public class TimeSimulator {
    int count = 0;
    int total;
    Statement statement = null;
    ResultSet results = null;

    public void initialiseTimeSimulator(int seconds) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                synchronized (this) {
                    count++;
                    Rabbit.increaseAge();
                    Rabbit.giveBirth();
                    Field.breed();
                }

                try {
                    statement = Database.connection.createStatement();
                    results = statement.executeQuery("SELECT COUNT(ID) FROM rabbit");

                    results.next();
                    total = results.getInt(1);

                } catch (SQLException ex) {
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                } finally {
                    try { if (results != null) results.close(); } catch (Exception e) {};
                    try { if (statement != null) statement.close(); } catch (Exception e) {};
                }

                System.out.println("Month: " + count + " Rabbits: " + total); // Can be removed later
                if (count >= seconds) {
                    timer.cancel();
                    timer.purge();
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    public int getCount() {
        return count;
    }
}