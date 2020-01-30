package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class TimeSimulator {
    int count = 0;

    ArrayList<Rabbit> rabbitsToAdd = new ArrayList<>();
    ArrayList<Fox> foxesToAdd = new ArrayList<>();

    public void addRabbit(Rabbit rabbit) {
        rabbitsToAdd.add(rabbit);
    }

    public void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for (Rabbit rabbit : rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public void addFox(Fox fox) {
        foxesToAdd.add(fox);
    }

    public void addFoxes(ArrayList<Fox> foxArray) {
        for (Fox fox : foxArray) {
            addFox(fox);
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
                    Field.addRabbits(rabbitsToAdd); // double adding??
                    rabbitsToAdd.clear();
                    for (Fox fox: FoxField.getFoxes()) {
                        fox.increaseAge();
                        addFoxes(fox.giveBirth());
                    }
                    FoxField.addFoxes(foxesToAdd);
                    foxesToAdd.clear();
                    //System.out.println(Field.getRabbits().size());
                    Field.breed();


                }
                System.out.println("Month: " + count + " Rabbits: " + RabbitCounter.getTotalRabbits() + " Foxes: " + (FoxCounter.getFemaleFoxCounter()+FoxCounter.getMaleFoxCounter())); // Can be removed later
                    if (count % 12 == 0) {
                        FoxField.breed();
                    }
                    int NumberOfRabbits = RabbitCounter.getMaleRabbitCounter()+RabbitCounter.getFemaleRabbitCounter();
                    System.out.println("Month: " + count + " Rabbits: " + NumberOfRabbits + " Foxes: " + FoxField.getFoxes().size()); // Can be removed later
                    System.out.println();
                    FoxField.hunt();
                }

                if (count >= seconds) {
                    timer.cancel();
                    timer.purge();
                    System.out.println("Number of male rabbits alive: " + RabbitCounter.getMaleRabbitCounter());
                    System.out.println("Number of female rabbits alive: " + RabbitCounter.getFemaleRabbitCounter());
                    System.out.println("Number of male foxes alive: " + FoxCounter.getMaleFoxCounter());
                    System.out.println("Number of female foxes alive: " + FoxCounter.getFemaleFoxCounter());
                    System.out.println("Number of rabbits that have died: " + RabbitCounter.getDeadCounter());
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