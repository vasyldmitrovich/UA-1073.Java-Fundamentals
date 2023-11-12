package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Enter a: ");
                a = Integer.parseInt(scan.nextLine());

                System.out.println("Enter b: ");
                b = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The sides should be number");
                continue;
            }

        }

        int area = 0;
        try {
            area = rectangleArea(a, b);
            System.out.println("Area of rectangle is " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("There was an error: " + e.getMessage());
            return;
        }


    }

    static int rectangleArea(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("sides should not be negative");
        }
        return a * b;

    }
}
