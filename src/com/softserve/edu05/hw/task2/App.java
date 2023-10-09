package com.softserve.edu05.hw.task2;

import java.util.Scanner;

public class App {//Ok
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char Again;

        do {
            System.out.print("Input first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Input second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to do in again? (Yes - ('Y' 'y') or No - ('N' 'n')): ");
            Again = scanner.next().charAt(0);
        } while (Again == 'Y' || Again == 'y');

        System.out.println("Programm exit.");
    }
}
