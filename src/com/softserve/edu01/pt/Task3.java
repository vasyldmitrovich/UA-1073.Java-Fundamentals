package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task3 {
    static void task() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Input first number:");
        a = scanner.nextInt();
        System.out.println("Input second number:");
        b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
