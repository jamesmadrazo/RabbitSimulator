package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RabbitTest {
    Rabbit rabbit = new Rabbit();

    @Test
    public void ageShouldBeZero() {
        assertEquals(0, rabbit.getAge());
    }

    @Test
    public void newRabbitShouldNotBeInAvailableRabbitsBecauseYoung() {
        boolean found = false;
        rabbit.setGender("female");
        for (Rabbit fieldRabbit:Field.getAvailableFemaleRabbits()){
            if (rabbit == fieldRabbit) {
                found = true;
                break;
            }
        }
        assertFalse(found);
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
    public void adultRabbitShouldNotBeInAvailableRabbitsBecauseAvailable() {
        boolean found = false;
        rabbit.setGender("female");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        for (Rabbit fieldRabbit:Field.getAvailableFemaleRabbits()){
            if (rabbit == fieldRabbit) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void oldRabbitShouldNotBeInAvailableRabbitsBecauseDead() {
        boolean found = false;
        rabbit.setGender("female");
        for (Rabbit fieldRabbit:Field.getAvailableFemaleRabbits()){
            if (rabbit == fieldRabbit) {
                found = true;
                break;
            }
        }
        assertFalse(found);
    }

    //this is not accounting for rabbits being adult yet, as rabbits are not aged yet
    //we will account for only adult getting pregnant in breeding
    @Test
    public void testIfFemaleRabbitGotPregnant() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        assertTrue(rabbit.isPregnant());
    }

    @Test
    public void testIfMaleRabbitGotPregnant() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("male");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        rabbit.getPregnant();
        assertFalse(rabbit.isPregnant());
    }

    @Test
    public void testIfFemaleRabbitGaveBirthItIsAvailableAfterward() {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        rabbit.getPregnant();
        rabbit.giveBirth();
        boolean found = false;
        for (Rabbit fieldRabbit:Field.getAvailableFemaleRabbits()){
            if (rabbit == fieldRabbit) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testThatRabbitGivesBirth() {
        Rabbit rabbit = new Rabbit();
        rabbit.setPregnant(true);
        ArrayList<Rabbit> arrayOfRabbits = new ArrayList<>();
        arrayOfRabbits = rabbit.giveBirth();
        assertTrue(arrayOfRabbits.size() > 0);
    }

    @Test
    public void checkingARabbitCanDie(){
        Rabbit rabbit = new Rabbit();
        rabbit.die();

    }
}
