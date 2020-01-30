package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FoxTest {
    Fox fox = new Fox();

    @Test
    public void ageShouldBeZero() {
        assertEquals(0, fox.getAge());
    }

    @Test
    public void newFoxShouldNotBeInAvailableFoxesBecauseYoung() {
        boolean found = false;
        fox.setGender("female");
        for (Fox foxFieldRabbit:FoxField.getAvailableFemaleFoxes()){
            if (fox == foxFieldRabbit) {
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
            if (s.equals(fox.getGender())) {
                isGender = true;
                break;
            }
        }
        assertTrue(isGender);
    }

    @Test

    public void adultFoxShouldNotBeInAvailableFoxesBecauseAvailable() {
        boolean found = false;
        fox.setGender("female");
        for (int i = 0; i <= 10; i++) {
            fox.increaseAge();
        }
        for (Fox foxFieldRabbit:FoxField.getAvailableFemaleFoxes()){
            if (fox == foxFieldRabbit) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void oldFoxShouldNotBeInAvailableFoxesBecauseDead() {
        boolean found = false;
        fox.setGender("female");
        for (Fox foxFieldRabbit:FoxField.getAvailableFemaleFoxes()){
            if (fox == foxFieldRabbit) {
                found = true;
                break;
            }
        }
        assertFalse(found);
    }

    //this is not accounting for rabbits being adult yet, as rabbits are not aged yet
    @Test
    public void testIfFemaleFoxGotPregnant() {
        Fox fox = new Fox();
        fox.setGender("female");
        fox.getPregnant();
        assertTrue(fox.isPregnant());
    }

    @Test
    public void testIfMaleFoxGotPregnant() {
        Fox fox = new Fox();
        fox.setGender("male");
        for (int i = 0; i <= 10; i++) {
            fox.increaseAge();
        }
        fox.getPregnant();
        assertFalse(fox.isPregnant());
    }

    @Test
    public void testIfFemaleFoxGaveBirthItIsAvailableAfterward() {
        Fox fox = new Fox();
        fox.setGender("female");
        for (int i = 0; i <= 10; i++) {
            fox.increaseAge();
        }
        fox.getPregnant();
        fox.giveBirth();
        boolean found = false;
        for (Fox foxFieldRabbit:FoxField.getAvailableFemaleFoxes()){
            if (fox == foxFieldRabbit) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void testThatFoxGivesBirth() {
        Fox fox = new Fox();
        fox.setPregnant(true);
        ArrayList<Fox> arrayOfFoxes = new ArrayList<>();
        arrayOfFoxes = fox.giveBirth();
        assertTrue(arrayOfFoxes.size() > 0);
    }
}
