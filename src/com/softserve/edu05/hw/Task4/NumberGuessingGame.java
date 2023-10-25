package com.softserve.edu05.hw.Task4;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int minNumber = 1; // Minimum value for the random number
        int maxNumber = 100; // Maximum value for the random number
        int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < minNumber || userGuess > maxNumber) {
                System.out.println("Please enter a number between " + minNumber + " and " + maxNumber + ".");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            }
        } while (userGuess != randomNumber);

        System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
        scanner.close();
    }
}
