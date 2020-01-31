package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Fox extends Animal {

    public Fox() {
        super();
        if (getGender().equals("male")) {
            FoxCounter.increaseMaleCounter();
        } else {
            FoxCounter.increaseFemaleCounter();
        }
    }

    public Fox(String gender) {
        super();
        if (gender.equals("male")) {
            FoxCounter.increaseMaleCounter();
        } else {
            FoxCounter.increaseFemaleCounter();
        }
    }


    public void die(){
        FoxCounter.deadCounterIncrease();
        if(gender.equals("male")) {
            FoxCounter.decreaseAliveFoxCounterMale();
            FoxField.getAvailableMaleFoxes().remove(this);
        } else {
            FoxCounter.decreaseAliveFoxCounterFemale();
            FoxField.getAvailableFemaleFoxes().remove(this);
        }
        FoxField.getFoxes().remove(this);
    }


    public void increaseAge() {
        incrementAge();
        if (getAge() == 10) {
            if (getGender().equals("male")) {
                FoxField.addMale(this);
            } else {
                FoxField.addFemale(this);
            }
        } else if (getAge() == 60) {
            die();
        }

    }


    public ArrayList<Fox> giveBirth() {
        ArrayList<Fox> arrayOfFoxes = new ArrayList<>();
        if (isPregnant()) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(11);
            }
            for (int i = randomNumber; i > 0; i--) {
                arrayOfFoxes.add(new Fox());
            }
            setPregnant(false);
        }
        return arrayOfFoxes;
    }
}

