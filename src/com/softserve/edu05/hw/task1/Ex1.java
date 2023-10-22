package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class Ex1 {//Good

    public static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number of month:");

        int month = scanner.nextInt();

        if (!validMonthNum(month)) {
            System.out.println("Input number from 1 to 12");

            return;
        }

        int days = obtainDaysInMonth(month);

        System.out.println("This month: " + month + ", has: " + days + " days.");
    }

    public static boolean validMonthNum(int month) {
        return month >= 1 && month <= 12;
    }


    public static int obtainDaysInMonth(int month) {
        return DAYS_IN_MONTH[month - 1];
    }

}
