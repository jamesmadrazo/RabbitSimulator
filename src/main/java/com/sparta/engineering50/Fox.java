package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Fox {
    private int age;
    private String gender;
    private boolean isPregnant;

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public Fox() {
        age = 0;
        gender = offSpringGender();
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

    public void increaseAge() {
        age++;
        if (age == 10) {
            if (gender.equals("male")) {
                FoxField.addMale(this);
            } else {
                FoxField.addFemale(this);
            }
        } else if (age == 60) {
            //FoxCounter.deadCounterIncrease();
            if(gender.equals("male")) {
                //FoxCounter.decreaseAliveFoxCounterMale();
                FoxField.getAvailableMaleFoxes().remove(this);
            } else {
                //FoxCounter.decreaseAliveFoxCounterFemale();
                FoxField.getAvailableFemaleFoxes().remove(this);
            }
        }
    }

    private String offSpringGender() {
        Random random = new Random();
        boolean result = random.nextBoolean();
        if (result) {
            RabbitCounter.increaseMaleCounter();
            return "male";
        } else {
            RabbitCounter.increaseFemaleCounter();
            return "female";
        }
    }

    public void getPregnant() {
        if (gender.equals("female")) {
            isPregnant = true;
        }
    }

    public ArrayList<Fox> giveBirth() {
        ArrayList<Fox> arrayOfFoxes = new ArrayList<>();
        if (isPregnant) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(11);
            }
            for (int i = randomNumber; i > 0; i--) {
                arrayOfFoxes.add(new Fox());
            }
            isPregnant = false;
        }
        return arrayOfFoxes;
    }
}

