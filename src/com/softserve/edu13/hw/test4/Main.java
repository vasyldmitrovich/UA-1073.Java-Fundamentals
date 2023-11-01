package com.softserve.edu13.hw.test4;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2003, Month.JANUARY, 1);
        printDate(date);
    }

    private static void printDate(LocalDate date){
        LocalDate afterSixMonth = date.plusMonths(6);
        LocalDate afterTwelveMonth = date.plusMonths(12);

        System.out.printf("Date of birth: %s. Day of the week: %s.%n", date, date.getDayOfWeek());
        System.out.printf("Date in 6 months: %s. Day of the week: %s.%n", afterSixMonth, afterSixMonth.getDayOfWeek());
        System.out.printf("Date in 12 months: %s. Day of the week: %s.%n", afterTwelveMonth, afterTwelveMonth.getDayOfWeek());
    }
}
