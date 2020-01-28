package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {
    @Test
    void testThatRabbitsCanGetPregnant() {
        Field field = new Field();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
        }
        field.addRabbit(maleRabbit);
        field.addRabbit(femaleRabbit);
        field.breed();
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

        Field field = new Field();
        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
        }
        field.addRabbit(maleRabbit);
        field.addRabbit(femaleRabbit);
        field.addRabbit(femaleRabbit1);
        System.out.println(field.getRabbits().size());
        field.breed();

        assertFalse(maleRabbit.getState().equals("pregnant"));
        assertTrue(femaleRabbit.getState().equals("pregnant"));
        assertFalse(femaleRabbit1.getState().equals("pregnant"));

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

        Field field = new Field();
        for (int i = 0; i <= 3; i++) {
            maleRabbit.increaseAge();
            maleRabbit1.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
        }
        field.addRabbit(maleRabbit);
        field.addRabbit(maleRabbit1);
        field.addRabbit(femaleRabbit);
        field.addRabbit(femaleRabbit1);

        field.breed();

        assertFalse(maleRabbit.getState().equals("pregnant"));
        assertFalse(maleRabbit.getState().equals("pregnant"));
        assertTrue(femaleRabbit.getState().equals("pregnant"));
        assertTrue(femaleRabbit1.getState().equals("pregnant"));

    }

    @Test
    public void testThatNewRabbitsAreAddedToRabbitArray () {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        ArrayList<Rabbit> newRabbits = rabbit.giveBirth();
        Field field = new Field();
        field.addRabbits(newRabbits);
        assertTrue(field.getRabbits().size()>0);
    }
}
