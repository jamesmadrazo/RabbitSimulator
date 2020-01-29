package com.sparta.engineering50;

public class App {
    public static void main(String[] args) throws InterruptedException {
        TimeSimulator timeSimulator = new TimeSimulator();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        timeSimulator.initialiseTimeSimulator(10);
        Thread.currentThread().join(10000);
        System.out.println(Field.getAvailableMales().size());
        System.out.println(Field.getAvailableFemales().size());
    }
}
