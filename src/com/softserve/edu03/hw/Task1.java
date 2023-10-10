package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main() {//Good
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Input Side 2: ");
        double number2 = scanner.nextDouble();
        System.out.println("Input Side 3: ");
        double number3 = scanner.nextDouble();

        double area = areaTriangle(number1, number2, number3);

        System.out.println("The area of the tringle is: " + area);
    }
    public static double areaTriangle(double num1, double num2, double num3) {
        double p = (num1 + num2 + num3) / 2;
        double area = Math.sqrt(p * (p - num1) * (p - num2) * (p - num3));
        return area;
    }
}

