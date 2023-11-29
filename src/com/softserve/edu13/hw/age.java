package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class age {
    public static boolean isDateValid(String dateString) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("mm.dd.yy");
            dateFormat.setLenient(false);
            dateFormat.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
