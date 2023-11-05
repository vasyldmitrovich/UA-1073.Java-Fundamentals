package com.softserve.edu13.task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.parse("23.09.2004", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(birthday);
    }
}
