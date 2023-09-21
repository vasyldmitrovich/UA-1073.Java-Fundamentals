package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I can help you calculate your perimeter and area of flower bed.");
        System.out.println("Please, enter your radius of flower bed:");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Your perimeter is: %f%n", perimeter);
        System.out.printf("Your area is: %f", area);

    }
}
