package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FoxField {
    private static ArrayList<Fox> foxes = new ArrayList<>();
    private static ArrayList<Fox> availableMaleFoxes = new ArrayList<>();
    private static ArrayList<Fox> availableFemaleFoxes = new ArrayList<>();

    public static ArrayList<Fox> getFoxes() {
        return foxes;
    }

    public static void addFox(Fox fox) {
        foxes.add(fox);
    }

    public static void addMale(Fox fox) {
        availableMaleFoxes.add(fox);
    }

    public static void addFemale(Fox fox) {
        availableFemaleFoxes.add(fox);
    }

    public static ArrayList<Fox> getAvailableMaleFoxes() {
        return availableMaleFoxes;
    }

    public static ArrayList<Fox> getAvailableFemaleFoxes() {
        return availableFemaleFoxes;
    }

    public static void addFoxes(ArrayList<Fox> foxArray) {
        for (Fox fox : foxArray) {
            addFox(fox);
        }
    }

    public static void breed() {
        Random random = new Random();
        int loopLength = 0;
        loopLength = Math.min(availableMaleFoxes.size(), availableFemaleFoxes.size());
        for (int i = 0; i < loopLength; i++) {
            availableMaleFoxes.get(i).getPregnant();
            if (random.nextBoolean()) {
                availableFemaleFoxes.get(i).getPregnant();
            }
        }
    }

    public static void hunt(int numberOfPrey) {
        Random random = new Random();
        int position;
        if (numberOfPrey > Field.getRabbits().size()){
            numberOfPrey = Field.getRabbits().size();
            position = 0;
        } else {
            position = random.nextInt(Field.getRabbits().size()-numberOfPrey);
        }
        //int position = 0;
        //Field.getRabbits().subList(position, position + numberOfPrey).clear();
        for (int i = position; i < position + numberOfPrey ; i++){
            Field.getRabbits().get(position).die();
        }
        System.out.println(Field.getRabbits().toString());
        System.out.println(Field.getRabbits().size());

    }
}
