package com.softserve.edu13.hw;

import java.util.Scanner;

public class Task_3 {
    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        for (int i = 0; i < 100; i++) {
            int yearToCheck = scanner.nextInt();
            if (isLeapYear(yearToCheck)) {
                System.out.println(yearToCheck + " is a leap year.");
            } else {
                System.out.println(yearToCheck + " is not a leap year.");
            }
        }
    }
}
