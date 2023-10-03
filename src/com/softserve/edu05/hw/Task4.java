package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void task4() {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rnd.nextInt(0, 11);
        System.out.print("Try guess the number: ");
        int guessNumber = Integer.parseInt(sc.nextLine());

        if (randomNumber == guessNumber) {
            System.out.println("You are Vanga:)");
        } else {
            while (randomNumber != guessNumber) {
                if (guessNumber > randomNumber) {
                    System.out.println("Too high, try again.");
                    guessNumber = Integer.parseInt(sc.nextLine());
                } else if (guessNumber < randomNumber) {
                    System.out.println("Too low, try again.");
                    guessNumber = Integer.parseInt(sc.nextLine());
                }
            }
            System.out.println("Finally, you guess the number:)!");
        }

    }
}
