package com.softserve.edu12.hw.task1;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Division by zero is forbidden");
        }
    }

    public static double div (double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return num1 / num2;
    }
}