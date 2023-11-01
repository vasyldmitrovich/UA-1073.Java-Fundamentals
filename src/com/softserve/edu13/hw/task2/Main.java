package com.softserve.edu13.hw.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    private static final String PATTERN = "MM.dd.yy";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);
    public static void main(String[] args) {
        String date1 = "01.01.2000";
        String date2 = "12.05.23";
        String date3 = "13.01.23";
        String date4 = "11.11.23";

        System.out.println("Format pattern: " + PATTERN);
        checkDates(date1, date2, date3, date4);
    }

    private static void checkDates(String... dates){
        for(String date : dates){
            System.out.println("Date " + date + " is valid: " + validate(date));
        }
    }

    private static boolean validate(String date){
        try{
            LocalDate.parse(date, FORMATTER);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
