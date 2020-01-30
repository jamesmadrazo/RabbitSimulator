package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class TimeSimulator {
    int count = 0;

    ArrayList<Rabbit> toAdd = new ArrayList<>();

    public void addRabbit(Rabbit rabbit) {
        toAdd.add(rabbit);
    }

    public void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for (Rabbit rabbit : rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public void initialiseTimeSimulator(int seconds) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                synchronized (Field.getRabbits()) {
                    for (Rabbit rabbit : Field.getRabbits()) {
                        rabbit.increaseAge();
                        addRabbits(rabbit.giveBirth());
                    }
                    Field.addRabbits(toAdd); // double adding??
                    toAdd.clear();
                    //System.out.println(Field.getRabbits().size());
                    Field.breed();
                }
                System.out.println("Month: " + count + " Rabbits: " + RabbitCounter.getTotalRabbits()); // Can be removed later
                if (count >= seconds) {
                    timer.cancel();
                    timer.purge();
                }
            }

            ;
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    public int getCount() {
        return count;
    }
}