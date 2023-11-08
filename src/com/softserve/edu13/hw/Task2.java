package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main (String[] args) {
        System.out.println(formatDate(LocalDate.now()));
    }

    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
    }
}
