package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    static int countOdd = 0;

    public static void task1() {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        while (true) {
            try {
                System.out.print("Input a first number: ");
                a = sc.nextInt();
                System.out.print("Input a second number: ");
                b = sc.nextInt();
                System.out.print("Input a third number: ");
                c = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }

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
            countOdd++;//Good
        }

    }
}
