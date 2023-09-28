package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    static int countOdd = 0;

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int a = sc.nextInt();
        System.out.print("Input a second number: ");
        int b = sc.nextInt();
        System.out.print("Input a third number: ");
        int c = sc.nextInt();

        checkOddNumber(a);
        checkOddNumber(b);
        checkOddNumber(c);

        System.out.printf("Number of odd numbers: %d", getCountOdd());
    }

    public static int getCountOdd() {
        return countOdd;
    }

    public static void checkOddNumber(int number) {
        if (number % 2 == 1) {
            System.out.printf("Number %d is odd.\n", number);
            countOdd++;
        }

    }
}
