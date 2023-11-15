package com.softserve.edu13.hw.Task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDateBirthday = LocalDate.of(1998, 07, 20);
        System.out.println(localDateBirthday.getDayOfWeek());
        Calculate.after6Month(localDateBirthday);
        Calculate.after12Month(localDateBirthday);
    }

}
