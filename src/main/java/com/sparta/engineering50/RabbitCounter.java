package com.sparta.engineering50;

public class RabbitCounter {

    private static int aliveRabbitCounterFemale;
    private static int aliveRabbitCounterMale;
    private static int deadCounter;

    public static void increaseMaleCounter() {
        aliveRabbitCounterMale++;
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

}