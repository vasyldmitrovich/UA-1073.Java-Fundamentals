package com.softserve.edu13.hw.Task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 11, 7);
        analyzeBirthday(birthday);
    }

    public static void analyzeBirthday(LocalDate birthday) {
        System.out.println("Day of the week for birthday: " + birthday.getDayOfWeek());

        LocalDate sixMonthsLater = birthday.plusMonths(6);
        System.out.println("Day of the week 6 months later: " + sixMonthsLater.getDayOfWeek());

        LocalDate oneYearLater = birthday.plusMonths(12);
        System.out.println("Day of the week 12 months later: " + oneYearLater.getDayOfWeek());
    }
}

