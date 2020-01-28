package com.sparta.engineering50;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeSimulatorTest {
    @Test
    void checkTimerRuns() throws InterruptedException {
        TimeSimulator timeSim = new TimeSimulator();
        timeSim.initialiseTimeSimulator(6);
        Thread.sleep(6000);
        assertEquals(6, timeSim.getCount());
    }
    @Test
    void checkFieldTickWorks() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        Field.addRabbit(new Rabbit());
        timeSimulator.initialiseTimeSimulator(60);
        Thread.sleep(60000);
        System.out.println(Field.getRabbits().size());
        assertTrue(Field.getRabbits().size()>8);
    }
}
