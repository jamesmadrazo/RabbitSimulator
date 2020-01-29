package com.sparta.engineering50;

import java.util.Scanner;

public class UserInput {
    private static int userInput;


    public static int getUserInput() {

        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        return userInput;
    }
    public static int getUserI(){

        return userInput;
    }
}

