package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {

    public static void run() {
        System.out.println("Task 1 running ...");
        System.out.print("Enter positive integer number: ");
        Scanner console = new Scanner(System.in);
        int enteredNumber = console.nextInt();
        console.nextLine();
        boolean isPrime = true;
        for (int i = 2; i <= enteredNumber / 2; i++) {
            if (enteredNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.printf("Entered number is " + (isPrime ? "prime" : "not prime"));
    }
}
