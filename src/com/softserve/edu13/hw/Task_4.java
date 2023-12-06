package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task_4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2001,9,13);
        System.out.println("My birthday " + birthday);
        infoBirthday(birthday);
    }

    public static void infoBirthday(LocalDate birthday){
        System.out.println("Day of the week on my birthday " + birthday.getDayOfWeek());

        LocalDate sixMountAfter = birthday.plusMonths(6);
        System.out.println("After six mount " + sixMountAfter.getDayOfWeek());

        LocalDate oneYearAfter = birthday.plusMonths(12);
        System.out.println("After one year " + oneYearAfter.getDayOfWeek());
    }
}
