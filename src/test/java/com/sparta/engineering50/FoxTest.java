package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FoxTest {
    Fox fox = new Fox();

    @Test
    public void ageShouldBeZero() {
        assertEquals(0, fox.getFoxAge());
    }

    @Test
    public void stateShouldBeYoung() {
        assertEquals("young", fox.getFoxState());
    }

    @Test
    public void genderShouldBeMaleOrFemale() {
        String[] genders = new String[]{"male", "female"};
        boolean isGender = false;
        for (String s : genders) {
            if (s.equals(fox.getFoxGender())) {
                isGender = true;
                break;
            }
        }
        assertTrue(isGender);
    }

    @Test
    public void stateShouldChangeToAdultAfterTenMonths() {
        Fox fox = new Fox();
        for (int i = 0; i <= 10; i++) {
            fox.increaseAge();
        }
        assertEquals("adult", fox.getFoxState());
    }

    @Test
    public void testIfFoxDiedAfter60Months() {
        Fox fox = new Fox();
        for (int i = 0; i <= 60; i++) {
            fox.increaseAge();
        }
        assertEquals("dead", fox.getFoxState());
    }

    //this is not accounting for fox being adult yet, as fox are not aged yet
    //we will account for only adult getting pregnant in breeding
    @Test
    public void testIfFemaleFoxGotPregnant() {
        Fox fox = new Fox();
        fox.setFoxGender("female");
        fox.getPregnant();
        assertEquals("pregnant", fox.getFoxState());
    }

    @Test
    public void testIfMaleFoxGotPregnant() {
        Fox fox = new Fox();
        fox.setFoxGender("male");
        for (int i = 0; i <= 10; i++) {
            fox.increaseAge();
        }
        fox.getPregnant();
        assertEquals("adult", fox.getFoxState());
    }

    @Test
    public void testIfFemaleFoxGaveBirthItIsAdultAfterward() {
        Fox fox = new Fox();
        fox.setFoxGender("female");
        fox.getPregnant();
        fox.giveBirth();
        assertEquals("adult", fox.getFoxState());
    }

    @Test
    public void testThatFoxGivesBirth() {
        Fox fox = new Fox();
        fox.setFoxState("pregnant");
        ArrayList<Fox> arrayOfFox = new ArrayList<>();
        arrayOfFox = fox.giveBirth();
        assertTrue(arrayOfFox.size() > 0);
    }
}
