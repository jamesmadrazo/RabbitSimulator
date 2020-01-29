package com.sparta.engineering50;

import java.util.ArrayList;

public class Field {
    private static ArrayList<Rabbit> rabbits = new ArrayList<>();

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
        int malePosition = -1;
        int femalePosition = -1;
        int count = 0;

        while(count < rabbits.size()) {
            if (rabbits.get(count).isAvailable() && rabbits.get(count).getGender().equals("male") && malePosition == -1) {
                malePosition = count;
                count = 0;
            }

            if (rabbits.get(count).isAvailable() && rabbits.get(count).getGender().equals("female") && femalePosition == -1) {
                femalePosition = count;
                count = 0;
            }

            if (malePosition != -1 && femalePosition != -1) {
                rabbits.get(femalePosition).getPregnant();
                rabbits.get(malePosition).setAvailable(false);
                malePosition = -1;
                femalePosition = -1;
                count = 0;
            }
            count++;
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
