package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    //Give another name for this method. You already have main method in class App.java
    public static void task1(String... args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side 1: ");
        int a = scanner.nextInt();

        System.out.print("Input Side 2: ");
        int b = scanner.nextInt();

        System.out.print("Input Side 3: ");
        int c = scanner.nextInt();

        System.out.format("The area of the triangle is %.2f\n", calculateTriangleArea(a, b, c));
    }

    //Good
    static double calculateTriangleArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
