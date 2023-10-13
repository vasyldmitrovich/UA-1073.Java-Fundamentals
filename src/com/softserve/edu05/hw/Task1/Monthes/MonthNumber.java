package com.softserve.edu05.hw.Task1.Monthes;

import java.util.Scanner;

public class MonthNumber {
    static int monthNumberInput = 0;

    public static int inputNumberOfMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the month number");
        monthNumberInput = scanner.nextInt() - 1;
        return monthNumberInput;
    }

    static int[] month = new int[12];

    public static void newArrey() {
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;
    }

    public static void reternDays() {
        System.out.println("In month number " + (monthNumberInput + 1) + " - " + month[monthNumberInput] + " days.");
    }
}

