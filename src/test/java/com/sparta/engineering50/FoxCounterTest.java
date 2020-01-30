package com.sparta.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoxCounterTest {
    @Test
    void foxCountersShouldMatchNumberOfFox() throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Fox maleFox = new Fox();
        maleFox.setFoxGender("male");
        Fox femaleFox = new Fox();
        femaleFox.setFoxGender("female");
        Field.addFox(maleFox); //change this - well it should work after field class is done
        Field.addFox(femaleFox); //change this - well it should work after field class is done
        timeSimulator.initialiseTimeSimulator(300);
        Thread.currentThread().join();
        assertEquals(Field.getFox().size(),(FoxCounter.getFemaleFoxCounter()+FoxCounter.getMaleFoxCounter())); //change this - well it should work after field class is done
    }
}
