package com.sparta.engineering50.java;

import java.util.Scanner;

public class UserInput {
    int userInput;

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        return  userInput;
    }}

