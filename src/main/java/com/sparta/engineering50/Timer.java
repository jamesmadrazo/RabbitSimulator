package com.sparta.engineering50;

import java.util.ArrayList;

public class Timer {
    //  private final int rabbitDead = 60;
    //private int months = 0;

    Rabbit rabbit = new Rabbit();

    public static void ageRabbits(ArrayList<Rabbit> rabbits) {
        for (Rabbit rabbit : rabbits) {
            rabbit.increaseAge();
            if (rabbit.getState().equals("dead")) {
                RabbitCounter.deadCounterIncrease();
                //  rabbits.remove()
            }
        }
    }
}
   /*

    Rabbit rabbit = new Rabbit();
    Random rand = new Random();
    int n = rand.nextInt(14) + 1;
    int x = rand.nextInt(n) +1;
    int y = n-x;

    public int ifstam(int n, int x){
        if (n + x >
    }
    private void babies() {

        for (int i = 0; i < n; i++) {
            Field.rabbits.add(new Rabbit());

        }

        for (int i = 0; i < x; i++) {
            Field.rabbits.add(new Rabbit());

        }

    }
*/


