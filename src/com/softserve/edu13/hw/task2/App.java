package com.softserve.edu13.hw.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the date according to format 'mm.dd.yy': ");
            String date = scanner.nextLine();
            System.out.println("Date " + date + " is " + (validateDate(date) ? "" : "in") + "valid.");
        }
    }

    public static boolean validateDate(String date) {
        var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
