package com.sparta.engineering50;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter number of months");
        UserInput.getUserInput();
        TimeSimulator timeSimulator = new TimeSimulator();
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setGender("male");
        Rabbit femaleRabbit = new Rabbit();
        femaleRabbit.setGender("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);
        Fox fox = new Fox();
        fox.setGender("male");
        Fox fox2 = new Fox();
        fox2.setGender("female");
        FoxField.addFox(fox);
        FoxField.addFox(fox2);
        timeSimulator.initialiseTimeSimulator(UserInput.getUserI());
        //Thread.currentThread().join(10000);
    }
}
