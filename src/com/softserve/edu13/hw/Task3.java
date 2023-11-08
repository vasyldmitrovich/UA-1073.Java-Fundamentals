package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task3 {
    public static void main (String[] args) {
        System.out.println(isLeapYear(LocalDate.now()));
        System.out.println(isLeapYear(LocalDate.of(2020, 1,1)));
    }

    public static boolean isLeapYear(LocalDate date) {
        return date.isLeapYear();
    }
}
