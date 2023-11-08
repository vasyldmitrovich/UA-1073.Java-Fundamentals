package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task4 {
    private static final LocalDate birthday = LocalDate.of(2002, 11, 2);

    public static void main (String[] args) {
        printDayOfWeek(birthday);
        printDayAfter6Months(birthday);
        printDayAfterYear(birthday);
    }

    public static void printDayOfWeek (LocalDate date) {
        System.out.println(date.getDayOfWeek());
    }

    public static void printDayAfter6Months(LocalDate date) {
        System.out.println(date.plusMonths(6).getDayOfWeek());
    }
    public static void printDayAfterYear(LocalDate date) {
        System.out.println(date.plusYears(1).getDayOfWeek());
    }
}
