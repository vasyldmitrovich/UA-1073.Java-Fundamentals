package com.softserve.edu05.task4;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        guessNumber();
    }
    public static int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generateRandomNumber();

        int guess;

        System.out.println("Guess the number");
        while ((guess = scanner.nextInt()) != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again");
            }
        }
        System.out.println("The number was " + randomNumber + ". You guessed it!");
        return guess;
    }
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
