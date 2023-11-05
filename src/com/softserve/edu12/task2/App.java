package com.softserve.edu12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(readNumber(1, 10));
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            if (number < start && number > end) {
                throw new IllegalArgumentException();
            }
            return number;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid range!");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Enter a number!");
        }
    }
}
