package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CounterTest {
    RabbitCounter rabbitcounter = new RabbitCounter();


    @Test
    public void doesMaleCounterIncrease() {
        rabbitcounter.increaseMaleCounter();
        assertEquals(1, rabbitcounter.getMaleRabbitCounter());
    }

    @Test
    public void doesFemaleCounterIncrease() {
        rabbitcounter.increaseFemaleCounter();
        assertEquals(1, rabbitcounter.getFemaleRabbitCounter());
    }

}

