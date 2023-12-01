package com.softserve.edu12.pt;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Input b: ");
                int b = Integer.parseInt(scanner.nextLine());
                int area = rectangleArea(a, b);
                System.out.println("Area of the rectangle is " + area);
            } catch (NumberFormatException e) {
                System.out.println("The sides should be numbers");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("There was an error: " + e.getMessage());
            }
            return;
        }
    }
    static int rectangleArea(int a, int b){
        if (a < 0 || b < 0 ){
            throw new IllegalArgumentException(
                    "sides should not be negative");
        }
        return a*b;
    }
}
