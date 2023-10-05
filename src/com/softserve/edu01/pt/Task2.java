package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    static void average () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int first = scanner.nextInt();
        System.out.println("Input second number");
        int second = scanner.nextInt();
        System.out.println("Input third number");
        int third = scanner.nextInt();
        System.out.printf("Average is %.7f",
                (first + second + third)/3.0);
    }
}
