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
        for (Rabbit rabbit : rabbits) {
            if (rabbit.isAvailable() && rabbit.getGender().equals("male")) {
                rabbit.setAvailable(false);
                for (Rabbit rabbit1 : rabbits) {
                    if (rabbit1.isAvailable() && rabbit1.getGender().equals("female")) {
                        rabbit1.getPregnant();
                    }
                }
            }
        }
    }
}
