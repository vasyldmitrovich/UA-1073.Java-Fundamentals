package com.softserve.edu05.hw.task2;

import java.util.Scanner;

public class SumCalc {//Ok
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;

        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to perform the operation again? (y/n): ");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Program terminated.");
    }
}
