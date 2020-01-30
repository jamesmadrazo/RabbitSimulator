package com.sparta.engineering50;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter number of months");
        UserInput.getUserInput();
        TimeSimulator timeSimulator = new TimeSimulator();
        Rabbit maleRabbit = new Rabbit("male");
        Rabbit femaleRabbit = new Rabbit("female");
        Field.addRabbit(maleRabbit);
        Field.addRabbit(femaleRabbit);

        Fox maleFox = new Fox("male");
        Fox femaleFox = new Fox("female");
        FoxField.addFox(maleFox);
        FoxField.addFox(femaleFox);
        timeSimulator.initialiseTimeSimulator(UserInput.getUserI());
    }


}
