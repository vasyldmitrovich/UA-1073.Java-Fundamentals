package com.softserve.edu13.hw.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        var date = LocalDate.now();
        String dateStr = date.format(formatter);
        System.out.println(dateStr);
        LocalDate date2 = LocalDate.parse(dateStr, formatter);
        System.out.println(date2.equals(date));
        System.out.println(LocalDate.parse("10.11.2023",formatter));
    }
}
