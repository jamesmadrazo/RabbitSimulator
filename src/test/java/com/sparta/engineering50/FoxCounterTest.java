package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoxCounterTest {
    @Test
    void foxCountersShouldMatchNumberOfFox() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Fox maleFox = new Fox();
        maleFox.setGender("male");
        Fox femaleFox = new Fox();
        femaleFox.setGender("female");
        FoxField.addFox(maleFox); //change this - well it should work after field class is done
        FoxField.addFox(femaleFox); //change this - well it should work after field class is done
        timeSimulator.initialiseTimeSimulator(10);
        Thread.currentThread().join(10000);
        assertEquals(FoxField.getFoxes().size(),(FoxCounter.getFemaleFoxCounter()+FoxCounter.getMaleFoxCounter())); //change this - well it should work after field class is done
    }
}
