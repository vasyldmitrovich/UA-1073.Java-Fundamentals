package com.softserve.edu12.hw.task01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter value of a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter value of b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("The result of a / b = " + div(a, b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Value of a and b should be a number!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Value of b can't be 0!");
        }
        return a/b;
    }
}
