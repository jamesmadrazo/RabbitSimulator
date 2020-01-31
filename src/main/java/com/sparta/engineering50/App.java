package com.sparta.engineering50;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter number of months");
        UserInput.provideUserInput();
        InitializeSimulator.beginSimulation(UserInput.getUserInput());
    }


}
