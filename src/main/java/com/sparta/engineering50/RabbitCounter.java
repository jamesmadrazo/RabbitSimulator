package com.sparta.engineering50;

public class RabbitCounter {

    private static int aliveRabbitCounterFemale;
    private static int aliveRabbitCounterMale;
    private static int deadCounter;

    public static void resetCounters() {
        aliveRabbitCounterFemale = 0;
        aliveRabbitCounterMale = 0;
        deadCounter = 0;
    }

    public static void increaseMaleCounter() {
        aliveRabbitCounterMale++;
    }

    public static void decreaseMaleCounter() {aliveRabbitCounterMale--;};

    public static void decreaseAliveRabbitCounterMale() {
        aliveRabbitCounterMale--;
    }

    public static void decreaseAliveRabbitCounterFemale() {
        aliveRabbitCounterFemale--;
    }

    public static void increaseFemaleCounter() {
        aliveRabbitCounterFemale++;
    }

    public static void decreaseFemaleCounter() {aliveRabbitCounterFemale--;}

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