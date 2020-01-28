package com.sparta.engineering50;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    /*@Test
    public void genderShouldBeMaleOrFemale() {
        assertEquals("male", rabbit.getGender()) || assertEquals("Female", rabbit.getGender());
    }*/
    @Test
    public void stateShouldChangeToAdultAfterThreeMonths() {
        Rabbit rabbit1 = new Rabbit();
        for(int i=0; i<4; i++) {
            rabbit1.increaseAge();
        }
        assertEquals("adult", rabbit1.getState());
    }
}
