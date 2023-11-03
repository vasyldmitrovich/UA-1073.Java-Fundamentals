package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.print("Enter a first side: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter a second side: ");
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again!");
            }
        }
        try {
            System.out.println("Area of rectangle: " + squareRectangle(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Error while calculate area: " + e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("The values of 'a' and 'b' should be positive");
        }
        return a * b;
    }
}
