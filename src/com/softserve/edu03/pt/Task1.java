package com.softserve.edu03.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    //The same mistake
    public static void task1(String... args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = getNumber(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int secondNumber = getNumber(scanner.nextLine());

        System.out.println("The sum of %d and %d is %d".formatted(firstNumber, secondNumber, getTotal(firstNumber, secondNumber)));
        System.out.println("The average of %d and %d is %.2f".formatted(firstNumber, secondNumber, getAverage(firstNumber, secondNumber)));

    }
//Ok
    static double getAverage(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2.0;
    }

    static int getTotal(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int getNumber(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(prompt);
            } catch (Exception e) {
                System.err.print("Wrong number! Enter the number again: ");
                Scanner sc = new Scanner(System.in);
                prompt = sc.nextLine();
            }
        }
    }
}
