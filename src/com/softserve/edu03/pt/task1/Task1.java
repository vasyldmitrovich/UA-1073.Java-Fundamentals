package com.softserve.edu03.pt.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    public static void task1() {

        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        double number1 = getNumber("Input first number: ");
        double number2 = getNumber("Input second number: ");
        double total = getTotal(number1, number2);
        double average = getAverage(number1, number2);

        System.out.println("Sum of " + number1 + " and " + number2 + " is " + total);
        System.out.println("Average of " + number1 + " and " + number2 + " is " + average);


    }

    public static double getTotal(double number1, double number2) {
        return number1 + number2;
    }

    public static double getAverage(double number1, double number2) {
        return (number1 + number2) / 2;

    }

    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }


}