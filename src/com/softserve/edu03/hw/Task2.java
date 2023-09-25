package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    //Change name of this method to some like task2()
    public static void task2(String... args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = scanner.nextInt();

        System.out.print("Input the second number: ");
        int b = scanner.nextInt();

        System.out.print("Input the third number: ");
        int c = scanner.nextInt();

        System.out.format("The smallest number is %d\n", findTheSmallestNumber(a, b, c));
    }

    //Ok
    static int findTheSmallestNumber(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
