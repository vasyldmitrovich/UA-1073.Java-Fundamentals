package com.softserve.edu12.hw.task02;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            while (true) {
                try {
                    a[i] = readNumber(1, 100);
                    if (i > 0 && a[i] <= a[i - 1]) {
                        throw new IllegalArgumentException("Entered number should be greater than previous!");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter integer number from %d to %d in ascending order: ", start, end);
        int result = 0;
        try {
            result = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Entered value is not a integer number!");
        }
        if (result <= start || result >= end) {
            throw new IllegalArgumentException("Entered number is out of range!");
        }
        return result;
    }
}
