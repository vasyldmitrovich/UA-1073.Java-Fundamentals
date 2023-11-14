package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DayValidator {

    static void validateToFormat() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println("Hello, lets check date.");
        String input = "";
        while (true) {
            try {
                System.out.println("Input date:");
                input = sc.nextLine();
                LocalDate date = LocalDate.parse(input, formatter);
                System.out.println("Date " + date + " is valid.");
                break;
            } catch (Exception e) {
                System.out.println("Date " + input + " isn't valid. Let's try again. (Use format mm.dd.yy)");
            }
        }
    }
}
