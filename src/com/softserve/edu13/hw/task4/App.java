package com.softserve.edu13.hw.task4;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 4, 13);
        printInfo(birthday);
    }

    public static void printInfo(LocalDate localDate) {
        System.out.println("The day of the week is " + localDate.getDayOfWeek());

        LocalDate afterSixMonth = localDate.plusMonths(6);
        System.out.println("The day of the week after 6 month is " + afterSixMonth.getDayOfWeek());

        LocalDate afterTwelveMonth = localDate.plusMonths(12);
        System.out.println("The day of the week after 12 month is " + afterTwelveMonth.getDayOfWeek());
    }
}
