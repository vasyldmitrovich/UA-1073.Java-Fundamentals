package com.softserve.edu13.hw.Task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 5, 1);

        printDayOfWeekInfo(birthday);
    }

    public static void printDayOfWeekInfo(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("On " + formattedDate + ", you were born on a " + dayOfWeek);

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeekSixMonthsLater = sixMonthsLater.getDayOfWeek();
        System.out.println("Six months later, on " + sixMonthsLater.format(formatter)
                + ", it will be a " + dayOfWeekSixMonthsLater);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeekTwelveMonthsLater = twelveMonthsLater.getDayOfWeek();
        System.out.println("Twelve months later, on " + twelveMonthsLater.format(formatter)
                + ", it will be a " + dayOfWeekTwelveMonthsLater);
    }
}

