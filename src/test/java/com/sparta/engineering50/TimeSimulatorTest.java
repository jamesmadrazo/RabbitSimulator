package com.sparta.engineering50;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeSimulatorTest {
    @Test
    void checkTimerRuns() throws InterruptedException {
        TimeSimulator timeSim = new TimeSimulator();
        timeSim.initialiseTimeSimulator(6);
        Thread.sleep(6000);
        assertEquals(6, timeSim.getCount());
    }
}
