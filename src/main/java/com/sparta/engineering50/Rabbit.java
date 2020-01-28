package com.sparta.engineering50.java;

import java.util.Random;

public class Rabbit {
    private int age;
    private String gender;
    private String state;


    public Rabbit() {
        age = 0;
        gender = offSpringGender();
        state = "young";

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

    public int increaseAge() {
        age++;
        if (age == 3) {
            setState("adult");
        } else if (age == 60) {
            setState("dead");
        }
        return age;
    }

    private String offSpringGender() {
        Random random = new Random();
        Boolean result = random.nextBoolean();
        if (result) {
            return "male";
        } else {
            return "female";

        }

    }
}

