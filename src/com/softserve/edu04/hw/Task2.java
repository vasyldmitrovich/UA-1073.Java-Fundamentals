package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void task2() {//Good
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = sc.nextInt();
        System.out.print("Input the second number: ");
        int b = sc.nextInt();
        System.out.print("Input the third number: ");
        int c = sc.nextInt();
        System.out.println("Minimum value: " + minValue(a, b, c));
        System.out.println("Maximum value: " + maxValue(a, b, c));

    }

    public static int minValue(int a, int b, int c) {
        return Math.min(Math.min(a,b), c);
    }

    public static int maxValue(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }
}
