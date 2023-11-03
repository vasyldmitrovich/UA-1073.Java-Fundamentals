package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void task2() {//Good
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        while (true) {
            try {
                System.out.print("Input the first number: ");
                a = sc.nextInt();
                System.out.print("Input the second number: ");
                b = sc.nextInt();
                System.out.print("Input the third number: ");
                c = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }
        System.out.println("Minimum value: " + minValue(a, b, c));
        System.out.println("Maximum value: " + maxValue(a, b, c));

    }

    public static int minValue(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int maxValue(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
