package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first double number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second double number: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid double numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static double div(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

