package com.sparta.engineering50;

import java.util.Scanner;

public class UserInput {

    private static int userInput;

    public static void provideUserInput() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
    }

    public static int getUserInput(){
        return userInput;
    }
}

