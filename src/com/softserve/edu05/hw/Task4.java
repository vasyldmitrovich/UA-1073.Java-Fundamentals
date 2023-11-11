package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

    public class Task4{
        public static void main(String[] args) {

            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;


            Scanner scanner = new Scanner(System.in);
            int userGuess;

            System.out.println("Guess the number between 1 and 10:");
            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();


                if (userGuess < randomNumber) {
                    System.out.println("Too low, try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number: " + randomNumber);
                }
            } while (userGuess != randomNumber);
        }
    }


