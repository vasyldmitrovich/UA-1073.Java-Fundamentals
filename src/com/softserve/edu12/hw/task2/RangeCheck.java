package com.softserve.edu12.hw.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start - 1;

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print("Enter number a" + i + " (where a" + i + " > " + previousNumber + "): ");
                int number = readNumber(previousNumber, end);

                if (number <= previousNumber) {
                    System.out.println("The number is less than the previous one.");
                    i--;
                } else {
                    previousNumber = number;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                i--;
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                i--;
            }
        }
    }

    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            if (number < start || number > end) {
                throw new Exception("The number is out of range [" + start + "..." + end + "]");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Input is not a integer.");
        } finally {
            scanner.nextLine();
        }
        return number;
    }
}
