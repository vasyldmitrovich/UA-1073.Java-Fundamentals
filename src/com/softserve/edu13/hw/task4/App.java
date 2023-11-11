package com.softserve.edu13.hw.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 2, 10);

        printDayOfWeekInfo(birthday);
    }
    public static void printDayOfWeekInfo(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        String formattedDate = date.format(formatter);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Birthday: " + formattedDate);
        System.out.println("Day of week: " + dayOfWeek);

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeekSixMonthsLater = sixMonthsLater.getDayOfWeek();
        System.out.println("After 6 months: " + dayOfWeekSixMonthsLater);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeekTwelveMonthsLater = twelveMonthsLater.getDayOfWeek();
        System.out.println("After 12 months: " + dayOfWeekTwelveMonthsLater);
    }
}