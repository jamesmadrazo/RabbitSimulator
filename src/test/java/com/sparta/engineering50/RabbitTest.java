package com.sparta.engineering50;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RabbitTest {
    Rabbit rabbit = new Rabbit();
    @Test
    public void ageShouldBeZero() {
        assertEquals( 0, rabbit.getAge());
    }
    @Test
    public void stateShouldBeYoung() {
        assertEquals("young",rabbit.getState());
    }
    @Test
    public void genderShouldBeMaleOrFemale() {
        String[] genders = new String[]{"male","female"};
        boolean isGender = false;
        for (String s:genders){
            if (s.equals(rabbit.getGender())) {
                isGender = true;
            }
        }
        assertTrue(isGender);
    }
    @Test
    public void stateShouldChangeToAdultAfterThreeMonths() {
        Rabbit rabbit1 = new Rabbit();
        for(int i=0; i<4; i++) {
            rabbit1.increaseAge();
        }
        assertEquals("adult", rabbit1.getState());
    }
    @Test
    public void rabbitMaleCounterShouldBeOne() {
        RabbitCounter.increaseMaleCounter();
        assertEquals(1, RabbitCounter.getMaleRabbitCounter());
    }
    @Test
    public void rabbitFemaleCounterShouldBeOne() {
        RabbitCounter.increaseFemaleCounter();
        assertEquals(1,RabbitCounter.getFemaleRabbitCounter());
    }
}
