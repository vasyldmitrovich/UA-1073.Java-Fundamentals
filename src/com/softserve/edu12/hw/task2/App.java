package com.softserve.edu12.hw.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int previousNumber = start - 1;

        for (int i = 1; i <= 10; i++) {
            int number = readNumber(previousNumber + 1, end);
            System.out.println("Your number: " + number);
            previousNumber = number;
        }
    }
    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Input number in range [" + start + "..." + end + "]: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number >= start && number <= end) {
                    return number;
                } else {
                    System.out.println("This number not in range");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: you must input number");
            }
        }
    }
}

