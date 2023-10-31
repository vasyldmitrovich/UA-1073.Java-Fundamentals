package com.softserve.edu13.hw.task03;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int enYear = 0;
        do {
            System.out.print("Enter year: ");
            try {
                enYear = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The year must be a number!");
            }
        } while (true);
        System.out.println("The year " + enYear + " is " + ((isYearLeap(enYear) ? "" : "not ") + "a leap"));
    }

    private static boolean isYearLeap(int enYear) {
        try {
            LocalDate.of(enYear, 2, 29);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
