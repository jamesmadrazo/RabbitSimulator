package com.sparta.engineering50;

import java.util.ArrayList;
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
            availableFemaleFoxes.get(i).getPregnant();
        }
    }

    public static int randomNumberOfPrey(){
        Random random = new Random();
        int totalSum = 0;
        for(int i = 0; i < FoxField.getFoxes().size(); i++){
            totalSum+= random.nextInt(21);
        }
        return totalSum;
    }

    public static void hunt() {
        Random random = new Random();
        int numberOfPrey = randomNumberOfPrey();
        int position;
        if (numberOfPrey > Field.getRabbits().size()){
            numberOfPrey = Field.getRabbits().size();
            position = 0;
        } else {
            position = random.nextInt(Field.getRabbits().size()-numberOfPrey);
        }
        for (int i = position; i < position + numberOfPrey ; i++){
            Field.getRabbits().get(position).die();
        }

    }
}
