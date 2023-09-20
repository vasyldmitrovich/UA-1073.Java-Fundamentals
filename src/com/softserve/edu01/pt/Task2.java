package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = scanner.nextInt();
        System.out.println("Input second number:");
        int b = scanner.nextInt();
        System.out.println("Input third number:");
        int c = scanner.nextInt();
        System.out.println("Average is " + (a+b+c)/3.);
    }
}
