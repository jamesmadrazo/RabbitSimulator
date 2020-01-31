package com.sparta.engineering50;

public class RabbitCounter {

    private static int aliveRabbitCounterFemale = 0;
    private static int aliveRabbitCounterMale = 0;
    private static int deadCounter = 0;

    public static void increaseMaleCounter() {
        aliveRabbitCounterMale++;
    }

    public static void decreaseAliveRabbitCounterMale() {
        aliveRabbitCounterMale--;
    }

    public static void decreaseAliveRabbitCounterFemale() {
        aliveRabbitCounterFemale--;
    }

    public static void increaseFemaleCounter() {
        aliveRabbitCounterFemale++;
    }

    public static int getFemaleRabbitCounter() {
        return aliveRabbitCounterFemale;
    }

    public static int getMaleRabbitCounter() {
        return aliveRabbitCounterMale;
    }

    public static void deadCounterIncrease() {
        deadCounter++;
    }

    public static int getDeadCounter() {
        return deadCounter;
    }

    public static int getTotalRabbits() {
        return deadCounter+aliveRabbitCounterMale+aliveRabbitCounterFemale;
    }

}