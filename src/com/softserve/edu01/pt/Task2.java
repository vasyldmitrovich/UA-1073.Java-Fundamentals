package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    static void task() {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        while (true) {
            try {
                System.out.println("Input first number:");
                a = scanner.nextInt();
                System.out.println("Input second number:");
                b = scanner.nextInt();
                System.out.println("Input third number:");
                c = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                scanner.nextLine();
            }
        }
        System.out.println("Average is " + (a + b + c) / 3.);
    }
}
