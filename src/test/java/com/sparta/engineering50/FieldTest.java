package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {
    // These tests pass if you remove the random element for pregnancy but they pass otherwise

    @Test
    public void testGetRabbitsMethod () {
        Rabbit rabbit = new Rabbit();
        Field.addRabbit(rabbit);
        System.out.println(Field.getRabbits().size());
        assertTrue(Field.getRabbits().contains(rabbit));
    }

    @Test
    public void testGetAvailableFemaleRabbitsMethod () {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        assertTrue(Field.getAvailableFemaleRabbits().contains(rabbit));
    }

    @Test
    public void testGetAvailableMaleRabbitsMethod () {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("male");
        for (int i = 0; i <= 3; i++) {
            rabbit.increaseAge();
        }
        assertTrue(Field.getAvailableMaleRabbits().contains(rabbit));
    }


    @Test
    void testThatRabbitsDonNotGetPregnantAllTHeTimeIfRandomised() {
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
        ArrayList<Boolean> isPregnantList = new ArrayList<Boolean>();
        for (int i = 0; i <= 20; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
            Field.breed();
            isPregnantList.add(femaleRabbit.isPregnant());
            femaleRabbit.giveBirth();

        }
        System.out.println(isPregnantList.toString());
        assertTrue(isPregnantList.contains(false));
        assertTrue(isPregnantList.contains(true));
    }

    @Test
    public void testThatOneMaleTwoFemaleResultsInOneFemaleBeingABleToGetPregnant() {
        RabbitCounter.resetCounters();
        Field.getRabbits().clear();
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
        ArrayList<Boolean> isPregnantList = new ArrayList<Boolean>();
        ArrayList<Boolean> isPregnantList1 = new ArrayList<Boolean>();
        for (int i = 0; i <= 20; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
            Field.breed();
            isPregnantList.add(femaleRabbit.isPregnant());
            isPregnantList1.add(femaleRabbit1.isPregnant());
            femaleRabbit.giveBirth();
            femaleRabbit1.giveBirth();
        }
        System.out.println(isPregnantList.toString());
        System.out.println(isPregnantList1.toString());
        assertTrue(isPregnantList.contains(false) && isPregnantList.contains(true));
        assertFalse( isPregnantList1.contains(true));
        assertFalse(maleRabbit.isPregnant());


    }

    @Test
    public void testThatTwoMalesTwoFemaleResultsInBothFemalesPregnantSometimes() {
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

        ArrayList<Boolean> isPregnantList = new ArrayList<Boolean>();
        ArrayList<Boolean> isPregnantList1 = new ArrayList<Boolean>();
        for (int i = 0; i <= 20; i++) {
            maleRabbit.increaseAge();
            femaleRabbit.increaseAge();
            femaleRabbit1.increaseAge();
            Field.breed();
            isPregnantList.add(femaleRabbit.isPregnant());
            isPregnantList1.add(femaleRabbit1.isPregnant());
            femaleRabbit.giveBirth();
            femaleRabbit1.giveBirth();
        }
        System.out.println(isPregnantList.toString());
        System.out.println(isPregnantList1.toString());
        assertTrue(isPregnantList.contains(false) && isPregnantList.contains(true));
        assertTrue( isPregnantList1.contains(false) && isPregnantList1.contains(true));
        assertFalse(maleRabbit.isPregnant());

    }

    @Test
    public void testThatNewRabbitsAreAddedToRabbitArrayByAddRabbitsMethod () {
        Rabbit rabbit = new Rabbit();
        rabbit.setGender("female");
        rabbit.getPregnant();
        ArrayList<Rabbit> newRabbits = rabbit.giveBirth();
        Field.addRabbits(newRabbits);
        assertTrue(Field.getRabbits().size()>0);
    }




}