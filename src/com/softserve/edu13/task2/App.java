package com.softserve.edu13.task2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static void main(String[] args) {
        validate("23");
        validate("23.09.04");
        validate("09.23.04");
    }
    public static void validate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");

        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            System.out.println("Validated! " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Enter a valid parameter!");
        }

    }
}
