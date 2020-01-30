package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FoxFieldTest {
    // These tests pass if you remove the random element for pregnancy but they pass otherwise
    @Test
    void testThatFoxesCanGetPregnant() {
        Fox maleFox = new Fox();
        maleFox.setGender("male");
        Fox femaleFox = new Fox();
        femaleFox.setGender("female");
        for (int i = 0; i <= 10; i++) {
            maleFox.increaseAge();
            femaleFox.increaseAge();
        }
        FoxField.addFox(maleFox);
        FoxField.addFox(femaleFox);
        FoxField.breed();
        assertTrue(femaleFox.isPregnant());
    }

    @Test
    public void testThatOneMaleTwoFemaleResultsInOneFemalePregnant() {
        Fox maleFox = new Fox();
        maleFox.setGender("male");
        Fox femaleFox = new Fox();
        femaleFox.setGender("female");
        Fox femaleFox1 = new Fox();
        femaleFox1.setGender("female");

        for (int i = 0; i <= 10; i++) {
            maleFox.increaseAge();
            femaleFox.increaseAge();
            femaleFox1.increaseAge();
        }
        FoxField.addFox(maleFox);
        FoxField.addFox(femaleFox);
        FoxField.addFox(femaleFox1);
        System.out.println(FoxField.getFoxes().size());
        FoxField.breed();

        assertFalse(maleFox.isPregnant());
        assertTrue(femaleFox.isPregnant());
        assertFalse(femaleFox1.isPregnant());

    }

    @Test
    public void testThatTwoMalesTwoFemaleResultsInTwoFemalePregnant() {
        Fox maleFox = new Fox();
        maleFox.setGender("male");
        Fox maleFox1 = new Fox();
        maleFox1.setGender("male");
        Fox femaleFox = new Fox();
        femaleFox.setGender("female");
        Fox femaleFox1 = new Fox();
        femaleFox1.setGender("female");

        for (int i = 0; i <= 10; i++) {
            maleFox.increaseAge();
            maleFox1.increaseAge();
            femaleFox.increaseAge();
            femaleFox1.increaseAge();
        }
        FoxField.addFox(maleFox);
        FoxField.addFox(maleFox1);
        FoxField.addFox(femaleFox);
        FoxField.addFox(femaleFox1);

        FoxField.breed();

        assertFalse(maleFox.isPregnant());
        assertFalse(maleFox1.isPregnant());
        assertTrue(femaleFox.isPregnant());
        assertTrue(femaleFox1.isPregnant());

    }

    @Test
    public void testThatNewFoxesAreAddedToFoxArray () {
        Fox fox = new Fox();
        fox.setGender("female");
        fox.getPregnant();
        ArrayList<Fox> newFoxes = fox.giveBirth();
        FoxField.addFoxes(newFoxes);
        assertTrue(FoxField.getFoxes().size()>0);
    }
}
