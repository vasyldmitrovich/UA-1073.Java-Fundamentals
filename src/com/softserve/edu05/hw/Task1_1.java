package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_1 {
    public static void run() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = console.nextInt();
        console.nextLine();
        System.out.println("In this month " + getMonthDays(monthNumber) + " days");
    }

    static int getMonthDays(int monthNumber) {
        int[] monthDaysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthDaysCount[monthNumber - 1];
    }
}
