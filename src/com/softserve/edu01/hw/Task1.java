package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    static double calculatePerimeter (int radius) {
        return radius * Math.PI * 2;
    }

    static double calculateArea (int radius) {
        return Math.PI * Math.sqrt(radius);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the flower bed");

        while (true) {
            try {
                int radius = Integer.parseInt(scanner.nextLine());
                double perimeter = calculatePerimeter(radius);
                double area = calculateArea(radius);

                System.out.printf("Perimeter is %s%n", perimeter);
                System.out.printf("Area is %s%n", area);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                //                System.out.println(e.getMessage());
            }
        }

    }
}
