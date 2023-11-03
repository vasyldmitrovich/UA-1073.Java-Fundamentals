package com.softserve.edu12.hw.task1;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        var scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a first number: ");
                double a = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter a second number: ");
                double b = Double.parseDouble(scanner.nextLine());

                double dividing = div(a, b);
                System.out.printf("Result of dividing: %.3f", dividing);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input. Please, try again.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + " Try again.");
            }
        }
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Dividing by zero.");
        }
        return a / b;
    }
}
