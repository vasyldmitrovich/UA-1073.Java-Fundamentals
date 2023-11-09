package com.softserve.edu12.hw.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;
        int previousNumber = start - 1;

        for (int i = 1; i <= 10; i++) {
            try {
                int number = readNumber(previousNumber + 1, end);
                previousNumber = number;
                System.out.println("Entered number " + i + ": " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                i--;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }


    public static int readNumber(int start, int end) throws NumberFormatException, IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Enter a number in the range [" + start + "..." + end + "]: ");
            String input = scanner.nextLine();

            try {
                num = Integer.parseInt(input);

                if (num >= start && num <= end) {
                    return num;
                } else {
                    throw new IllegalArgumentException("Number is not in the specified range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
