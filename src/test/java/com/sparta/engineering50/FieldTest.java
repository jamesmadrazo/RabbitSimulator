package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {
    @Test
    void testThatRabbitsCanGetPregnant() {
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
        }
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        Field.breed();
        assertEquals("pregnant", femaleRabbit.getState());
    }

    @Test
    public void testThatOneMaleTwoFemaleResultsInOneFemalePregnant() {
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Rabbit femaleRabbit1 = new Rabbit();
        femaleRabbit1.setGender("female");

        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
        }
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        Field.addRabbit(femaleRabbit1);
        System.out.println(Field.getRabbits().size());
        Field.breed();

        assertNotEquals("pregnant", maleRabbit.getState());
        assertEquals("pregnant", femaleRabbit.getState());
        assertNotEquals("pregnant", femaleRabbit1.getState());

    }

    @Test
    public void testThatTwoMalesTwoFemaleResultsInTwoFemalePregnant() {
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit maleRabbit1 = new Rabbit();
        maleRabbit1.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Rabbit femaleRabbit1 = new Rabbit();
        femaleRabbit1.setGender("female");

        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            maleRabbit1.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
        }
        Field.addRabbit(maleRabbit);
        Field.addRabbit(maleRabbit1);
        Field.addRabbit(femaleRabbit);
        Field.addRabbit(femaleRabbit1);

        Field.breed();

        assertNotEquals("pregnant", maleRabbit.getState());
        assertNotEquals("pregnant", maleRabbit.getState());
        assertEquals("pregnant", femaleRabbit.getState());
        assertEquals("pregnant", femaleRabbit1.getState());

    }

    @Test
    public void testThatNewRabbitsAreAddedToRabbitArray () {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        ArrayList<Rabbit> newRabbits = rabbit.giveBirth();
        Field.addRabbits(newRabbits);
        assertTrue(Field.getRabbits().size()>0);
    }
}
