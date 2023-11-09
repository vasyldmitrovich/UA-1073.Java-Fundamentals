package com.softserve.edu12.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Input a:");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Input b:");
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The sides should not be numbers");
            }
        }
        int area = 0;
        try {
            area = rectangleArea(a, b);
            System.out.println("Area of the rectangle is: " + area);
        } catch (IllegalAccessException e) {
            System.out.println("There was an error: " +
                    e.getMessage());
        }
    }

    static int rectangleArea(int a, int b) throws IllegalAccessException {
        if (a < 0 || b < 0) {
            throw new IllegalAccessException(
                    "sides should not be negative");
        }
        return  a * b;
    }
}
