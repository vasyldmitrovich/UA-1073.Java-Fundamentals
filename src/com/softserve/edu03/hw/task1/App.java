package com.softserve.edu03.hw.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    //Move code from this main method in class edu03.hw.App.java and here call methods from this class
    public static void main(String[] args) {
        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid data!");
        }



    }

    public static double calculateArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
}
