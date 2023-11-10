package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;

        do {
            System.out.print("Enter your guess (1-100): ");
            userGuess = scanner.nextInt();

            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }

        } while (userGuess != randomNumber);

        scanner.close();
    }
}

