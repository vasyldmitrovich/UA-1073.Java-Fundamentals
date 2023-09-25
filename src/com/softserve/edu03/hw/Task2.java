package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void run() {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        System.out.println("Input the first number:");
        int a = console.nextInt();
        System.out.println("Input the second number:");
        int b = console.nextInt();
        System.out.println("Input the third number:");
        int c = console.nextInt();
        System.out.println("The minimal value is " + minOfThreeValues(a, b, c));
    }

    public static int minOfThreeValues(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
