package com.softserve.edu13.hw.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int yearInt1 = 2028;
        int yearInt2 = 4572;
        int yearInt3 = 4115;

        LocalDate date1 = LocalDate.of(2042, 1, 1);
        LocalDate date2 = LocalDate.of(3334, 1, 1);
        LocalDate date3 = LocalDate.of(2024, 1, 1);
        LocalDate date4 = LocalDate.of(9642, 1, 1);

        printValidate(yearInt1, yearInt2, yearInt3);
        printValidate(date1, date2, date3, date4);
    }

    private static void printValidate(Integer... values) {
        for (var year : values) {
            System.out.println("The year " + year + " is a leap year: " + isLeapYear(year));
        }
    }

    private static void printValidate(LocalDate... values) {
        for (var date : values) {
            System.out.println("The date " + date + " is located in a leap year: " + isLeapYear(date));
        }
    }

    private static boolean isLeapYear(int year) {
        return isLeapYear(LocalDate.of(year, 1, 1));
    }

    private static boolean isLeapYear(LocalDate date) {
        return date.isLeapYear();
    }

}
