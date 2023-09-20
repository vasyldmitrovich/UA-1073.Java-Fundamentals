package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {
    public void exec(){
        Scanner scanner = new Scanner(System.in);
        double numA;
        double numB;

        System.out.println("Task #3");

        System.out.print("Enter a: ");
        numA = scanner.nextDouble();

        System.out.print("Enter b: ");
        numB = scanner.nextDouble();

        System.out.printf("%.3f + %.3f = %.3f\n", numA, numB, numA + numB);
        System.out.printf("%.3f - %.3f = %.3f\n", numA, numB, numA - numB);
        System.out.printf("%.3f * %.3f = %.3f\n", numA, numB, numA * numB);
        System.out.printf("%.3f / %.3f = %.3f\n", numA, numB, numA / numB);

        System.out.println("\n\n");
    }
}
