package com.sparta.engineering50;

import java.util.ArrayList;

public class Field {
    private ArrayList<Rabbit> rabbits = new ArrayList<>();

    public ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    //method for testing
    public void addRabbit(Rabbit rabbit) {
        rabbits.add(rabbit);
    }

    public void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for(Rabbit rabbit:rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public void breed() {
        int rabbitCounter = 0;
        while (rabbitCounter <= rabbits.size())
            for (Rabbit rabbit:rabbits) {
                rabbitCounter++;
                if (rabbit.isAvailable() && rabbit.getGender().equals("male")) {
                    for (Rabbit rabbit1 : rabbits) {
                        if (rabbit1.isAvailable() && rabbit1.getGender().equals("female")) {
                            rabbit1.getPregnant();
                            rabbit.setAvailable(false);
                            rabbitCounter = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
