package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void t1(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf ("Input Side 1:");
        double a = scanner.nextDouble();

        System.out.printf("Input Side 2: ");
        double b = scanner.nextDouble();

        System.out.printf("Input Side 3: ");
        double c = scanner.nextDouble();


        double S = Math.sqrt(((a + b + c) / 2.0) * (((a + b + c) / 2.0) - a) * (((a + b + c) / 2.0) - b) * (((a + b + c) / 2.0) - c));
        System.out.printf("The area of the triangle: %.2f", S);

    }
}
