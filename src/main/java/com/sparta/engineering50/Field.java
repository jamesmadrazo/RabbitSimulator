package com.sparta.engineering50;

import java.util.ArrayList;

public class Field {
    private ArrayList<Rabbit> rabbits = new ArrayList<Rabbit>();

    public ArrayList<Rabbit> getRabbits() {
        return rabbits;
    }

    public void createRabbit() {
        rabbits.add(new Rabbit());
    }
}
