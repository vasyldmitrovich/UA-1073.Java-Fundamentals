package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++) {
            try {
                readNumber(1, 100);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
                i--;
            }
        }
    }

    public static int readNumber (int start, int end) {
        System.out.println("Enter integer: ");
        String input = SCANNER.nextLine();

        int number = Integer.parseInt(input);

        if (number < start || number > end) {
            throw new IllegalArgumentException("Number is out of the specified range.");
        }

        return number;
    }
}
