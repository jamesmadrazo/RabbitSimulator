package com.sparta.engineering50;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeSimulatorTest {
    @Test
    void checkTimerRuns() throws InterruptedException {
        TimeSimulator timeSim = new TimeSimulator();
        timeSim.initialiseTimeSimulator(6);
        Thread.currentThread().join(6000);
        assertEquals(6, timeSim.getCount());
    }
    /*@Test
    void checkFieldTickWorks() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Field.getRabbits().clear();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        timeSimulator.initialiseTimeSimulator(10);
        Thread.currentThread().join(10000);
        assertTrue(Field.getRabbits().size()>10);
    }*/
}