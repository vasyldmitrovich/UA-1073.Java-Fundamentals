package com.softserve.edu13.hw.Task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Year {
    static Scanner SCANNER = new Scanner(System.in);
    public  static int promptYear () {
        System.out.println("Input year");
        int year = Integer.parseInt(SCANNER.nextLine());
        LocalDate localDate = LocalDate.of(year , Month.DECEMBER, 31);
        return localDate.getDayOfYear();
    }
    public static boolean isLeap(int d) {
        if (d == 366) {
            System.out.println("This year is leap");
            return true;
        } else {
            System.out.println("This year not is leap");
            return false;
        }
    }
    public static void answer () {
        isLeap(promptYear());
    }
}
