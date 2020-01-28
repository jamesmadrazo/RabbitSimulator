package com.sparta.engineering50;

public class Output {

    public static void returnDeathCounter() {
        System.out.println("Dead rabbit counter: " + RabbitCounter.getDeadCounter());
    }

    public static void returnRabbitCounter() {

        for (int y = 0; y < Field.getRabbits().size() - 1; y++) {
            if (Field.getRabbits().get(y).getGender().equals("male")) {
                RabbitCounter.increaseMaleCounter();
            } else {
                RabbitCounter.increaseFemaleCounter();
            }
        }
        System.out.println("Female rabbit counter: " + RabbitCounter.getFemaleRabbitCounter());
        System.out.println("Male rabbit counter: " + RabbitCounter.getMaleRabbitCounter());
    }
}
