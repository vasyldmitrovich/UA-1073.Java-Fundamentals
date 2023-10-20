package com.softserve.edu05.hw;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int numberOfTries = 0;
        int yourNumber;
        int minNumber = 1;
        int maxNumber = 10;
        int randomNumber = rnd.nextInt(maxNumber - minNumber + 1) + minNumber;

        do {
            System.out.println("Guess the number from 0 to 10");
            yourNumber = scanner.nextInt();
            numberOfTries++;

            if (yourNumber < randomNumber) {
                System.out.println("Too low, try again. ");
            } else if (yourNumber > randomNumber) {
                System.out.println("Too high, try again. ");
            }
        } while (yourNumber != randomNumber);

        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
        System.out.println("It took you " + numberOfTries + " tries.");
    }
}
