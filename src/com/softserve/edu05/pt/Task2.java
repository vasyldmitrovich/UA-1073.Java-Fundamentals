package com.softserve.edu05.pt;


import java.util.Scanner;

public class Task2 {
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Enter a number: ");
                number = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
                continue;
            }
            if (isPrimeNumber(number)) {
                System.out.println("Is a prime number");
            } else {
                System.out.println("Is not prime number");
            }
        }

    }

    public static boolean isPrimeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
