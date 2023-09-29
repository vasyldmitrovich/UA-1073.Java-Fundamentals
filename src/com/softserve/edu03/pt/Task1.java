package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter your second number:");
        double number2 = scanner.nextDouble();

        double getTotalSum = number1 + number2;
        double getAverage = getTotalSum / 2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + getTotalSum);
        System.out.println("The average of " + number1 + " and " + number2 + " is " + getAverage);
    }

}
