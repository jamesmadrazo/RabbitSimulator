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

        Fox maleFox = new Fox();
        maleFox.setGender("male");
        //FoxCounter.increaseMaleCounter();
        Fox femaleFox = new Fox();
        femaleRabbit.setGender("female");
       // FoxCounter.increaseFemaleCounter(); //
        FoxField.addFox(maleFox);
        FoxField.addFox(femaleFox);
            timeSimulator.initialiseTimeSimulator(UserInput.getUserI());



        //Thread.currentThread().join(10000);
    }


}
