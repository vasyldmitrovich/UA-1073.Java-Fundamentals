package com.softserve.edu13.hw.task3;

import java.util.Scanner;

public class LeapYears {

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Enter year please... :");
        int year = scan.nextInt();
        boolean orLeapYear = isLeapYear(year);

        if (orLeapYear) {
            System.out.println(year + "--> is a leap year");
        } else {
            System.out.println(year + "--> is not leap year.");
        }

    }


}

