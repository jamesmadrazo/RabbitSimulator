package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit extends Animal {

    public Rabbit() {
        super();
        if (getGender().equals("male")) {
            RabbitCounter.increaseMaleCounter();
        } else {
            RabbitCounter.increaseFemaleCounter();
        }
    }

    public Rabbit(String gender) {
        super();
        this.setGender(gender);
        if (gender.equals("male")) {
            RabbitCounter.increaseMaleCounter();
        } else {
            RabbitCounter.increaseFemaleCounter();
        }
    }

    public void die(){
        RabbitCounter.deadCounterIncrease();
        if(super.getGender().equals("male")) {
            RabbitCounter.decreaseAliveRabbitCounterMale();
            Field.getAvailableMaleRabbits().remove(this);
        } else {
            RabbitCounter.decreaseAliveRabbitCounterFemale();
            Field.getAvailableFemaleRabbits().remove(this);
        }
        Field.getRabbits().remove(this);
    }


    public void increaseAge() {
        super.incrementAge();
        if (super.getAge() == 3) {
            if (super.getGender().equals("male")) {
                Field.addMale(this);
            } else {
                Field.addFemale(this);
            }
        } else if (super.getAge() == 60) {
            die();
        }

    }

    public ArrayList<Rabbit> giveBirth() {
        ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
        if (super.isPregnant()) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(15);
            }
            for (int i = randomNumber; i > 0; i--) {
                arrayOfRabbits.add(new Rabbit());
            }
            super.setPregnant(false);
        }
        return arrayOfRabbits;
    }
}

