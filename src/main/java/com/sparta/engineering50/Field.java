package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Field {
    private static ArrayList<Rabbit> rabbits = new ArrayList<>();
    private static ArrayList<Rabbit> availableMaleRabbits = new ArrayList<>();
    private static ArrayList<Rabbit> availableFemaleRabbits = new ArrayList<>();

    public static ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    public static void addRabbit(Rabbit rabbit) {
        rabbits.add(rabbit);
    }

    public static void addMale(Rabbit rabbit) {
        availableMaleRabbits.add(rabbit);
    }

    public static void addFemale(Rabbit rabbit) {
        availableFemaleRabbits.add(rabbit);
    }

    public static ArrayList<Rabbit> getAvailableMaleRabbits() {
        return availableMaleRabbits;
    }

    public static ArrayList<Rabbit> getAvailableFemaleRabbits() {
        return availableFemaleRabbits;
    }

    public static void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for (Rabbit rabbit : rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public static void breed() {
        Random random = new Random();
        int loopLength = 0;
        loopLength = Math.min(availableMaleRabbits.size(), availableFemaleRabbits.size());
        for (int i = 0; i < loopLength; i++) {
            availableMaleRabbits.get(i).getPregnant();
            if (random.nextBoolean()) {
                availableFemaleRabbits.get(i).getPregnant();
            }
        }
    }
}
