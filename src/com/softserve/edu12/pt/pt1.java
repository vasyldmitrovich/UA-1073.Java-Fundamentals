package com.softserve.edu12.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        try {
            int a = getNumericInput("Enter the length (a) of the rectangle: ");
            int b = getNumericInput("Enter the width (b) of the rectangle: ");
            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Side lengths must be non-negative.");
        }
        return a * b;
    }

    private static int getNumericInput(String prompt) {
        System.out.print(prompt);
        var scanner = new Scanner(System.in);

        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Error: Please enter a valid numeric value. " + prompt);
            }
        }
    }
}

