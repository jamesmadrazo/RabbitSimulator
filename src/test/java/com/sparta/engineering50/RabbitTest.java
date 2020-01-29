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
                break;
            }
        }
        assertTrue(isGender);
    }

    @Test
    public void stateShouldChangeToAdultAfterThreeMonths() {
        Rabbit rabbit = new Rabbit();
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        assertEquals("adult", rabbit.getState());
    }

    @Test
    public void testIfRabbitDiedAfter60Months() {
        Rabbit rabbit = new Rabbit();
        for (int i = 0; i <= 60; i++) {
            rabbit.increaseAge();
        }
        assertEquals("dead", rabbit.getState());
    }

    //this is not accounting for rabbits being adult yet, as rabbits are not aged yet
    //we will account for only adult getting pregnant in breeding
    @Test
    public void testIfFemaleRabbitGotPregnant() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        assertEquals("pregnant", rabbit.getState());
    }

    @Test
    public void testIfMaleRabbitGotPregnant() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("male");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        rabbit.getPregnant();
        assertEquals("adult", rabbit.getState());
    }

    @Test
    public void testIfFemaleRabbitGaveBirthItIsAdultAfterward() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        rabbit.giveBirth();
        assertEquals("adult", rabbit.getState());
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
