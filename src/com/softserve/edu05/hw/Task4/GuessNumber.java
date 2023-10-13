package com.softserve.edu05.hw.Task4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int randomNumber;
    static int guess;
    static boolean isCorrect;
    public static int createRandomNumber() {
        Random random = new Random();
        return randomNumber = random.nextInt(0, 6);


    }

    public static int askNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to guess the number from 0 to 6");
        guess = scanner.nextInt();
        scanner.nextLine();
        return guess;
    }

    public static boolean chechIfCorrect(int clientGuess, int newRandomNumber) {
        do {
            if (guess > randomNumber) {
                System.out.println("Too high, try again");
                askNumber();
                isCorrect = false;
            }
            if (guess < randomNumber) {
                System.out.println("Too low, try again");
                askNumber();
                isCorrect = false;
            } if (guess == randomNumber) {
                System.out.println("Correct");
                isCorrect = true;
            }
        } while (!isCorrect);
        return isCorrect;
    }

}
