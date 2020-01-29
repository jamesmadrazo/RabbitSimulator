package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit {
    private int age;
    private String gender;
    private String state;
    private boolean isAvailable;
    private boolean rabbitCooldown;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Rabbit() {
        age = 0;
        gender = offSpringGender();
        state = "young";

    }

    //Only use it for testing!
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public int getAge() {
        return age;
    }

    public void increaseAge() {
        age++;
        if (age == 3) {
            setState("adult");
            setAvailable(true);
        } else if (age == 60) {
            setState("dead");
            setAvailable(false);
        }
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
            state = "pregnant";
        } else {
            rabbitCooldown = true;
        }
        setAvailable(false);
    }

    public ArrayList<Rabbit> giveBirth() {
        ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
        if (state.equals("pregnant")) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(15);
            }

            for (int i = randomNumber; i > 0; i--) {
                arrayOfRabbits.add(new Rabbit());
            }

        }
        if (rabbitCooldown) {
            rabbitCooldown = false;
        } else {
            state = "adult";
            setAvailable(true);
        }
        return arrayOfRabbits;
    }


}

