package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit {
    private int age;
    private String gender;
    private boolean isPregnant;

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public Rabbit() {
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
        if (age == 3) {
            if (gender.equals("male")) {
                Field.addMale(this);
            } else {
                Field.addFemale(this);
            }
        } else if (age == 60) {
            RabbitCounter.deadCounterIncrease();
            if(gender.equals("male")) {
                RabbitCounter.decreaseAliveRabbitCounterMale();
                Field.getAvailableMaleRabbits().remove(this);
            } else {
                RabbitCounter.decreaseAliveRabbitCounterFemale();
                Field.getAvailableFemaleRabbits().remove(this);
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

    public ArrayList<Rabbit> giveBirth() {
        ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
        if (isPregnant) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(15);
            }
            for (int i = randomNumber; i > 0; i--) {
                arrayOfRabbits.add(new Rabbit());
            }
            isPregnant = false;
        }
        return arrayOfRabbits;
    }
}

