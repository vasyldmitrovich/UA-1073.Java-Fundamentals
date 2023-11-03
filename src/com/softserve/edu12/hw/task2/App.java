package com.softserve.edu12.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        int start;
        int end;
        while (true) {
            try {
                System.out.print("Enter the start of the range: ");
                start = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter the end of the range: ");
                end = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }

        for (int i = 0; i < 10; ) {
            try {
                int result = readNumber(start, end);
                numList.add(result);
                start = result;
                i++;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + " Try again.");
            }
        }

        System.out.println("Entered 10 numbers: " + numList);
    }

    public static int readNumber(int start, int end) {
        System.out.print("Enter a number: ");

        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }
        if (number < start || number > end) {
            throw new RuntimeException("This number is not in the range [%d, %d]".formatted(start, end));
        }
        return number;
    }
}
