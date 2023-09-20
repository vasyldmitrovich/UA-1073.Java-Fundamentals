package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task1 {
    public void calculatePerimeterAndSquareFlowerBed(){
        Scanner scanner = new Scanner(System.in);
        double radius;
        double perimeter;
        double square;

        System.out.println("Task #1");

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        perimeter = 2 * Math.PI * radius;
        square = Math.PI * Math.pow(radius, 2);

        System.out.printf("Perimeter = %.4f\n", perimeter);
        System.out.printf("Square = %.4f\n", square);

        System.out.println("\n\n");
    }
}
