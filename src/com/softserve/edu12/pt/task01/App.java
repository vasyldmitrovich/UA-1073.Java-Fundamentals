package com.softserve.edu12.pt.task01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter side a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter side b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Rectangle area is " + rectangleArea(a, b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("The sides should be numbers!");
            } catch (IllegalArgumentException e) {
                System.out.println("There was an error: " + e.getMessage());
            }
        }
    }

    public static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("side can't be negative!");
        }
        return a * b;
    }
}
