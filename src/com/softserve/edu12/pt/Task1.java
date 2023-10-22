package com.softserve.edu12.pt;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        var sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Input a:");
                int a = Integer.parseInt(sc.nextLine());

                System.out.println("Input b:");
                int b = Integer.parseInt(sc.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("Area is: " + area);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Sizes should be numbers");
            } catch (IllegalArgumentException e) {
                System.out.println("There was an error: " + e.getMessage());
            }
        }
    }

    public static int rectangleArea (int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides should not be negative");
        }

        return a * b;
    }
}
