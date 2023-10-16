package com.softserve.edu03.pt;

import java.util.Scanner;

public class pt1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = getNumber("Enter the first number: ", scanner);
        double num2 = getNumber("Enter the second number: ", scanner);

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        double number = 0.0;
        boolean validInput = false;

        do {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        } while (!validInput);

        return number;
    }
}

