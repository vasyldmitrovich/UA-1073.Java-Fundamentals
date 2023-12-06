package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_2 {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        var date1 = LocalDate.now();
        String date1Str = LocalDate.now().format(formatter);
        System.out.println(date1Str);
    }

}
