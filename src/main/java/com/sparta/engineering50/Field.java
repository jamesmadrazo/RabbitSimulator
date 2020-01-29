package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Field {
    private static ArrayList<Rabbit> rabbits = new ArrayList<>();
    private static ArrayList<Rabbit> availableMales = new ArrayList<>();
    private static ArrayList<Rabbit> availableFemales = new ArrayList<>();

    public static ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    public static void addRabbit(Rabbit rabbit) {
        rabbits.add(rabbit);
    }

    public static void addMale(Rabbit rabbit) {
        availableMales.add(rabbit);
    }

    public static void addFemale(Rabbit rabbit) {
        availableFemales.add(rabbit);
    }

    public static ArrayList<Rabbit> getAvailableMales() {
        return availableMales;
    }

    public static ArrayList<Rabbit> getAvailableFemales() {
        return availableFemales;
    }

    public static void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for (Rabbit rabbit : rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public static void breed() {
        Random random = new Random();
        int loopLength = 0;
        loopLength = Math.min(availableMales.size(), availableFemales.size());
        for (int i = 0; i < loopLength ; i++) {
            availableMales.get(i).getPregnant();
            if (random.nextBoolean()) {
                availableFemales.get(i).getPregnant();
            }
        }
    }

//    public static void breed() {
//        int rabbitCounter = 0;
//        while (rabbitCounter < rabbits.size())
//            for (Rabbit rabbit : rabbits) {
//                rabbitCounter++;
//                if (rabbit.isAvailable() && rabbit.getGender().equals("male")) {
//                    for (Rabbit rabbit1 : rabbits) {
//                        if (rabbit1.isAvailable() && rabbit1.getGender().equals("female")) {
//                            rabbit1.getPregnant();
//                            rabbit.setAvailable(false);
//                            rabbitCounter = 0;
//                            break;
//                        }
//                    }
//                }
//            }
//    }
}
