package com.softserve.edu13.hw.task04;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1977, 07,25);
        birthdayInfo(birthday);
    }

    static void birthdayInfo(LocalDate birthday) {
        System.out.println("My birthday is " + birthday + ", " + birthday.getDayOfWeek());
        System.out.println("After 6 months it was " + birthday.plusMonths(6) + ", " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println("After 12 months it was " + birthday.plusYears(1) + ", " + birthday.plusYears(1).getDayOfWeek());
    }
}
