package com.softserve.edu13.hw.task02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String enDate = "";
        do {
            System.out.print("Enter date in format mm.dd.yy: ");
            enDate = SCANNER.nextLine();
        } while (!isValidDate(enDate, "MM.dd.yy"));
    }

    static boolean isValidDate(String enDate, String pattern) {
        try {
            var formatter = DateTimeFormatter.ofPattern(pattern);
            var parsedDate = LocalDate.parse(enDate, formatter);
            if (parsedDate.format(formatter).equals(enDate)) {
                System.out.println("Entered date is valid!");
                return true;
            }
            System.out.println("No such date in this month/year!");
        } catch (DateTimeParseException e) {
            System.out.println("Entered date is not valid!");
        }
        return false;
    }
}
