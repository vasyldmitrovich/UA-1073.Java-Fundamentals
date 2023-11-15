package com.softserve.edu13.hw.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println(validateDate("30.10.23"));
        System.out.println(validateDate("10.21.23"));
        System.out.println(validateDate("11.32.23"));
    }
    static  boolean validateDate (String date) {
        var formatter= DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(date,formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
