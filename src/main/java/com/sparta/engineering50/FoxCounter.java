package com.sparta.engineering50;

public class FoxCounter {

    private static int aliveFoxCounterFemale;
    private static int aliveFoxCounterMale;
    private static int deadCounter;

    public static void increaseMaleCounter() {
        aliveFoxCounterMale++;
    }

    public static void decreaseAliveFoxCounterMale() {
        aliveFoxCounterMale--;
    }

    public static void decreaseAliveFoxCounterFemale() {
        aliveFoxCounterFemale--;
    }

    public static void increaseFemaleCounter() {
        aliveFoxCounterFemale++;
    }

    public static int getFemaleFoxCounter() {
        return aliveFoxCounterFemale;
    }

    public static int getMaleFoxCounter() {
        return aliveFoxCounterMale;
    }

    public static void deadCounterIncrease() {
         deadCounter++;
     }

    public static int getDeadCounter() {
        return deadCounter;
    }

    public static int getTotalFoxes() {
      return deadCounter+aliveFoxCounterMale+ aliveFoxCounterFemale;
    }

}
