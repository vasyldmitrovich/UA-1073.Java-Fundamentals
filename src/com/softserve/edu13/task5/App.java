package com.softserve.edu13.task5;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        printDays(LocalDate.of(2023, 11, 1));
    }
    public static void printDays(LocalDate date) {
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("After 6 month: " + date.plusMonths(6).getDayOfWeek());
        System.out.println("After 12 month: " + date.plusMonths(12).getDayOfWeek());

    }
}
