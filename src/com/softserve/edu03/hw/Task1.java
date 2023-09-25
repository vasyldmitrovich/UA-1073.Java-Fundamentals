package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void run() {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        System.out.println("Input side 1:");
        int a = console.nextInt();
        System.out.println("Input side 2:");
        int b = console.nextInt();
        System.out.println("Input side 3:");
        int c = console.nextInt();
        System.out.println("The area of this triangle is " + triangleArea(a, b, c));
    }

    public static double triangleArea(int a, int b, int c) {//Good
        return Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c) / 16.0);
    }
}
