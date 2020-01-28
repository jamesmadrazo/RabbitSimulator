package com.sparta.engineering50;

public class RabbitCounter {

    static int rabbitCounterFemale;
    static int rabbitCounterMale;
    static int deadCounter;

    public RabbitCounter() {
     //rabbitCounterFemale++;
       // rabbitCounterMale++;
    }

    public static void increaseMaleCounter() {
        rabbitCounterMale++;
        // return rabbitCounterMale;
    }

    public static void increaseFemaleCounter() {
        rabbitCounterFemale++;
        //  return rabbitCounterFemale;
    }

    public static int getFemaleRabbitCounter() {

        return rabbitCounterFemale;
    }

    public static int getMaleRabbitCounter() {
        return rabbitCounterMale;
    }

    public
     static void deadCounterIncrease() {
        deadCounter++;
    }

    public static int getDeadCounter(){
       return deadCounter;
    }

}