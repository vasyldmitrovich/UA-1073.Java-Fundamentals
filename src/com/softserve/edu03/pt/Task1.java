package com.softserve.edu03.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void run() {
        Locale.setDefault(Locale.ROOT);
        int a = getNumber("Enter the first number: ");
        int b = getNumber("Enter the second number: ");
        System.out.println("The sum of " + a + " and " + b + " is " + getTotal(a, b));
        System.out.println("The average of " + a + " and " + b + " is " + getAverage(a, b));
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextInt();
    }
}
