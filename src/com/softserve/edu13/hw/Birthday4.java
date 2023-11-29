package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Birthday4 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 10, 25);
        birthday = LocalDate.of(2000, 02, 02);
        System.out.println(birthday);
        System.out.println(getDayOfWeek(birthday.plusMonths(6)));
        System.out.println(getDayOfWeek(birthday.plusMonths(12)));
    }
    private static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().name();
    }
}