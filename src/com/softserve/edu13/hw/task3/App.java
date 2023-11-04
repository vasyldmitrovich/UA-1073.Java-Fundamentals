package com.softserve.edu13.hw.task3;

import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a year: ");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.println(year + " is " + (isLeapYear(year) ? "" : "not ") + "a leap year");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! Try again.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be < 0.");
        }
        return Year.isLeap(year);
    }
}
