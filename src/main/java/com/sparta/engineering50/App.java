package com.sparta.engineering50;

public class App {
    public static void main(String[] args) {
      //  Output.returnDeathCounter();
        //Output.returnRabbitCounter();


        System.out.println("Enter number of months");
        UserInput.getUserInput();
        TimeSimulator timeSimulator = new TimeSimulator();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        timeSimulator.initialiseTimeSimulator(UserInput.getUserI());
        //Thread.currentThread().join(10000);

    }}