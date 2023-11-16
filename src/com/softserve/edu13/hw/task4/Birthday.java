package com.softserve.edu13.hw.task4;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 11, 15);

        infoBirthday(birthday);
    }

    public static void infoBirthday(LocalDate birthday) {
        System.out.println("Day of the week on my birthday " + birthday.getDayOfWeek());

        LocalDate sixMountAfter = birthday.plusMonths(6);
        System.out.println("After six mount " + sixMountAfter.getDayOfWeek());

        LocalDate oneYearAfter = birthday.plusMonths(12);
        System.out.println("After one year " + oneYearAfter.getDayOfWeek());
    }

}





