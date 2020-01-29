package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Field {


    private static ArrayList<Rabbit> rabbits = new ArrayList<>();

 static Random rd = new Random(); // creating Random object


    public static ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    public static void addRabbit(Rabbit rabbit) {
        rabbits.add(rabbit);
    }

    public static void addRabbits(ArrayList<Rabbit> rabbitArray) {
        for (Rabbit rabbit : rabbitArray) {
            addRabbit(rabbit);
        }
    }

    public static void breed() {
        int rabbitCounter = 0;
        while (rabbitCounter <= rabbits.size())
            for (Rabbit rabbit : rabbits) {
                rabbitCounter++;
                if (rabbit.isAvailable() && rabbit.getGender().equals("male")) {
                    for (Rabbit rabbit1 : rabbits) {
                        if (rabbit1.isAvailable() && rabbit1.getGender().equals("female")) {
                            if (rd.nextBoolean()==true){
                            rabbit1.getPregnant();
                            rabbit.setAvailable(false);
                            rabbitCounter = 0;}

                            break;
                        }
                    }
                }
            }
    }
}
