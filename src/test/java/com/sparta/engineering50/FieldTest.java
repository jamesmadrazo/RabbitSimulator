package com.sparta.engineering50;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
