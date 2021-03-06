package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RabbitCounterTest {
    @Test
    void rabbitCountersShouldMatchNumberOfRabbits() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        RabbitCounter.resetCounters();
        Field.getRabbits().clear();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        timeSimulator.initialiseTimeSimulator(10);
        Thread.currentThread().join(10000);
        assertEquals(Field.getRabbits().size(),(RabbitCounter.getFemaleRabbitCounter()+RabbitCounter.getMaleRabbitCounter()+RabbitCounter.getDeadCounter()));
    }
}
