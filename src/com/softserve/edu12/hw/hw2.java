package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[10];
            int start = 1;
            int end = 100;

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = readNumber(start, end);
                start = numbers[i] + 1;
            }

            System.out.println("Entered numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int readNumber(int start, int end) throws InputMismatchException, NumberNotInRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in the range [" + start + "..." + end + "]: ");

        try {
            int number = scanner.nextInt();

            if (number < start || number > end) {
                throw new NumberNotInRangeException("Number is not in the specified range.");
            }

            return number;
        } catch (InputMismatchException e) {
            scanner.next();
            throw new InputMismatchException("Invalid input. Please enter a valid integer.");
        }
    }
}

class NumberNotInRangeException extends Exception {
    public NumberNotInRangeException(String message) {
        super(message);
    }
}

