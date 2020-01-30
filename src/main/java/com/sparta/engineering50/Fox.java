package com.sparta.engineering50;

import java.util.ArrayList;
import java.util.Random;

public class Fox {
    private int foxAge;
    private String foxGender;
    private String foxState;
    private boolean foxIsAvailable;

    public boolean isFoxIsAvailable() {
        return foxIsAvailable;
    }

    public void setFoxIsAvailable(boolean foxIsAvailable) {
        this.foxIsAvailable = foxIsAvailable;
    }

    public Fox() {
        foxAge = 0;
        foxGender = offSpringGender();
        foxState = "young";

    }

    //Only use it for testing!
    public void setFoxGender(String foxGender) {
        this.foxGender = foxGender;
    }

    public String getFoxGender() {
        return foxGender;
    }

    public void setFoxState(String foxState) {
        this.foxState = foxState;
    }

    public String getFoxState() {
        return foxState;
    }

    public int getFoxAge() {
        return foxAge;
    }

    public void increaseAge() {
        foxAge++;
        if (foxAge == 10) {
            setFoxState("adult");
            //setAvailable(true);
            if (foxGender.equals("male")) {
                Field.addMale(this); //change this - well it should work after field class is done
            } else {
                Field.addFemale(this); //change this - well it should work after field class is done
            }
        } else if (foxAge == 60) {
            setFoxState("dead");
          //  FoxCounter.deadCounterIncrease(); //dont need this
            if(foxGender.equals("male")) {
                FoxCounter.decreaseAliveFoxCounterMale();
            } else {
                FoxCounter.decreaseAliveFoxCounterFemale();
            }
            setFoxIsAvailable(false);
        }
    }

    private String offSpringGender() {
        Random random = new Random();
        boolean result = random.nextBoolean();
        if (result) {
            FoxCounter.increaseMaleCounter();
            return "male";
        } else {
            FoxCounter.increaseFemaleCounter();
            return "female";
        }
    }

    public void getPregnant() {
        if (foxGender.equals("female")) {
            foxState = "pregnant";
        }
        setFoxIsAvailable(false);
    }

    public ArrayList<Fox> giveBirth() {
        ArrayList<Fox> arrayOfFox = new ArrayList<>();
        if (foxState.equals("pregnant")) {
            Random random = new Random();
            int randomNumber = 0;
            while (randomNumber == 0) {
                randomNumber = random.nextInt(11);
            }

            for (int i = randomNumber; i > 0; i--) {
                arrayOfFox.add(new Fox());
            }
            foxState = "adult";
            setFoxIsAvailable(true);

        } else if (getFoxState().equals("adult")){
            setFoxIsAvailable(true);
        }
        return arrayOfFox;
    }


}

