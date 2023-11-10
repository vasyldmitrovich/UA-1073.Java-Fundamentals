package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            System.out.println("Number of days in month: " + daysInMonth[month]);
        } else {
            System.out.println("Invalid month number.");
        }
        scanner.close();
    }
}
