package com.softserve.edu12.hw.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final int N = 10;
        int[] numbers = new int[N];

        try {
            for (int i = 0; i < N; i++) {
                int startRange = (i > 0) ? numbers[i - 1] : 1;
                int endRange = 100;

                numbers[i] = readNumber(startRange, endRange);

                if (i > 0 && numbers[i] <= numbers[i - 1]) {
                    System.out.println("Please enter a number greater than the previous one.");
                    i--;
                }
            }

            System.out.println("Entered numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int readNumber(int start, int end) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Enter a number in the range [%d...%d]: ", start, end);
            int number = scanner.nextInt();

            if (number < start || number > end) {
                throw new IllegalArgumentException("Number is out of range.");
            }

            return number;
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
        }
    }
}
