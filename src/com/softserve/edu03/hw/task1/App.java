package com.softserve.edu03.hw.task1;

import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Input Side 1: ");
        double firstSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input Side 2: ");
        double secondSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input Side 3: ");
        double thirdSide = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("The area of the triangle is %.2f", calculateArea(firstSide, secondSide, thirdSide));
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
}