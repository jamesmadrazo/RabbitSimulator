package com.sparta.engineering50;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class RabbitTest {
    Rabbit rabbit = new Rabbit();

    @Test
    public void ageShouldBeZero() {
        assertEquals(0, rabbit.getAge());
    }

    @Test
    public void stateShouldBeYoung() {
        assertEquals("young", rabbit.getState());
    }

    @Test
    public void genderShouldBeMaleOrFemale() {
        String[] genders = new String[]{"male", "female"};
        boolean isGender = false;
        for (String s : genders) {
            if (s.equals(rabbit.getGender())) {
                isGender = true;
            }
        }
        assertTrue(isGender);
    }

    @Test
    public void stateShouldChangeToAdultAfterThreeMonths() {
        Rabbit rabbit1 = new Rabbit();
        for (int i = 0; i <= 3; i++) {
            rabbit1.increaseAge();
        }
        assertEquals("adult", rabbit1.getState());
    }

    @Test
    public void testIfRabbitDiedAfter60Months() {
        Rabbit rabbit2 = new Rabbit();
        for (int i = 0; i <= 60; i++) {
            rabbit2.increaseAge();
        }
        assertEquals("dead", rabbit2.getState());
    }

    //this is not accounting for rabbits being adult yet, as rabbits are not aged yet
    //we will account for only adult getting pregnant in breeding
    @Test
    public void testIfFemaleRabbitGotPregnant() {
        Rabbit rabbit3 = new Rabbit();
        rabbit3.setGender("female");
        rabbit3.getPregnant();
        assertEquals("pregnant", rabbit3.getState());
    }

    @Test
    public void testIfMaleRabbitGotPregnant() {
        Rabbit rabbit3 = new Rabbit();
        rabbit3.setGender("male");
        rabbit3.getPregnant();
        assertEquals("young", rabbit3.getState());
    }

    @Test
    public void testIfFemaleRabbitGaveBirthItIsAdultAfterward() {
        Rabbit rabbit3 = new Rabbit();
        rabbit3.setGender("female");
        rabbit3.getPregnant();
        rabbit3.giveBirth();
        assertEquals("adult", rabbit3.getState());
    }

    @Test
    public void testThatRabbitGivesBirth() {
        Rabbit rabbit = new Rabbit();
        rabbit.setState("pregnant");
        ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
        arrayOfRabbits = rabbit.giveBirth();
        assertTrue(arrayOfRabbits.size() > 0);
    }


}
