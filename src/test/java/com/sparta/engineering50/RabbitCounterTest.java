package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RabbitCounterTest {
    @Test
    void rabbitCountersShouldMatchNumberOfRabbits() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        timeSimulator.initialiseTimeSimulator(30);
        Thread.currentThread().join(30000);
        assertEquals(Field.getRabbits().size(),(RabbitCounter.getFemaleRabbitCounter()+RabbitCounter.getMaleRabbitCounter()+RabbitCounter.getDeadCounter()));
    }
}
