package com.softserve.edu13.hw.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        System.out.println(validateDate("10.25.23"));
        System.out.println(validateDate("25.10.23"));

    }


    public static boolean validateDate(String date) {
        var formatter = DateTimeFormatter.ofPattern("MM.dd.yy"); {
            try {
                LocalDate.parse(date, formatter);
                return true;
            } catch (Exception e) {
                return false;
            }

        }
    }
}
/* var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        var date1 = LocalDate.now();
        String date1Str = date1.format(formatter);
        System.out.println(date1Str);
        LocalDate date2 = LocalDate.parse(date1Str, formatter);
        System.out.println(date2.equals(date1));
        System.out.println(LocalDate.parse("11.01.23", formatter));*/