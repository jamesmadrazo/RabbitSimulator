package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public abstract class Animal {
    private int age = 0;
    private String gender;
    private boolean isPregnant;

    public Animal() {
        this.gender = offSpringGender();
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }


    //Only use it for testing!
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void incrementAge() {
        age++;
    }

    private String offSpringGender() {
        Random random = new Random();
        boolean result = random.nextBoolean();
        if (result) {
            return "male";
        } else {
            return "female";
        }
    }

    public void getPregnant() {
        if (gender.equals("female")) {
            isPregnant = true;
        }
    }

}
