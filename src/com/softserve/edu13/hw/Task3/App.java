package com.softserve.edu13.hw.Task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leapYear = findLeapYear(year);

        if(leapYear) {
            System.out.println(year + " - this year is leap.");
        } else {
            System.out.println(year + " - this year isn`t leap.");
        }

    }

    public static boolean findLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
