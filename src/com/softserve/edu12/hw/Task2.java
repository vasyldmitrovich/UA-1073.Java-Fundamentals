package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(start, end);
            start = numbers[i] + 1;
        }

        System.out.println("Led numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter an integer that falls within the interval (" + start + "..." + end + "): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > start && number < end) {
                    return number;
                } else {
                    throw new IllegalArgumentException("The leading number is not in the interval");
                }
            } else {
                throw new IllegalArgumentException("The derived number is not an integer");

            }
        }
    }
}


