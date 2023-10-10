package com.softserve.edu05.hw;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(20);

        int min = 0;
        int max = 20;
        int randomNumb = random.nextInt(max - min + 1) + min;
        int answerUser;

        System.out.println("Guess the number from " + min + " to " + max + ".");

        do {
            System.out.println("Input your number:");
            answerUser = scanner.nextInt();
            scanner.nextLine();

            if (answerUser < randomNumb) {
                System.out.println("Too low, try again.");
            } else if (answerUser > randomNumb) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulation, you correctly guesses the random number! The random number was " + randomNumb);
            }
        } while (answerUser != randomNumb);




    }
}
