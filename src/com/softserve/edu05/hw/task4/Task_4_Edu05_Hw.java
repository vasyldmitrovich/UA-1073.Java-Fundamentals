package com.softserve.edu05.hw.task4;

import java.util.Scanner;
import java.util.Random;

public class Task_4_Edu05_Hw {
    public static void task4Edu05Hw() {

        Random rando = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = rando.nextInt(5) +1;
        int inputNumber;

        do {
            System.out.println("Guess a number from 1 to 5.\uD83D\uDE09");
            inputNumber = scan.nextInt();
            scan.nextLine();

            if (inputNumber > randomNumber) {
                System.out.println("Your number is bigger than the guessed one");
            } else if (inputNumber < randomNumber) {
                System.out.println("Your number is less than the guessed one");
            }

        } while (inputNumber != randomNumber);
        System.out.println("You won. Your number is: " + randomNumber);
        scan.close();


    }
}
