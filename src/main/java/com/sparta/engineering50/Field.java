package com.sparta.engineering50;

import java.util.ArrayList;

public class Field {
    public static ArrayList<Rabbit> rabbits = new ArrayList<Rabbit>();

    public static ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    public void createRabbit() {
        rabbits.add(new Rabbit());

    }

   /* public void deletingRabbit() {
        rabbits.add(new Rabbit());
    }*/
}
