package com.softserve.edu12.hw;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        try {
            for (int i = 1; i <= 10; i++) {
                int number = readNumber(start, end);
                System.out.println("Number " + i + ": " + number);
                start = number + 1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int readNumber(int start, int end) throws InputMismatchException, NumberOutOfRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in the range [" + start + "..." + end + "]: ");

        try {
            int number = scanner.nextInt();

            if (number <= start || number >= end) {
                throw new NumberOutOfRangeException("Error: Number is out of range.");
            }

            return number;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Error: Invalid input. Please enter an integer.");
        } finally {
            scanner.nextLine();
        }
    }

    private static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }
}
