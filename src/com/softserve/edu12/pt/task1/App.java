package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Input a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Input b: ");
                b = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("The sides should be numbers ");
                continue;
            }
            break;
        }
        int area = 0;
        try {
            area = rectangleArea(a,b);
            System.out.println("Area of the rectangle is " + area);

        } catch (IllegalArgumentException e) {
            System.out.println("There was an error: " + e.getMessage() );
        }

    }
    static int rectangleArea(int a, int b){
        if(a<0 || b<0){
            throw new IllegalArgumentException(
                    "sides should not be negative");
        }
        return a*b;

    }
}
