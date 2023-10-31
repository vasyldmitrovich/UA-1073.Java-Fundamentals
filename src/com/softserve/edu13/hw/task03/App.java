package com.softserve.edu13.hw.task03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String enYear = "";
        do {
            System.out.print("Enter year in format yyyy: ");
            enYear = SCANNER.nextLine();
            if (enYear.length() == 4 && enYear.matches("\\d{4}")) {
                break;
            }
            System.out.println("Entered year is incorrect, please try again!");
        } while (true);
        System.out.println("The year " + enYear + " is " + ((isYearLeap(enYear) ? "" : "not ") + "a leap"));
    }

    private static boolean isYearLeap(String enYear) {
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        var parsedDate = LocalDate.parse(enYear + "-02-29", formatter);
        if (parsedDate.format(formatter).equals(enYear + "-02-29")) {
            return true;
        }
        return false;
    }
}
