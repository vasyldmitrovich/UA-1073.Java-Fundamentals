package com.softserve.edu12.hw.Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;

        try {
            System.out.println("Enter the first number: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number: ");
            num2 = Double.parseDouble(scanner.nextLine());

            double result = div(num1, num2);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
