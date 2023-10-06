package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void task1_1() {//Nice to see method like that
        System.out.print("Input the month: ");
        int month = Integer.parseInt(scanner.nextLine());
        getDayInMonth(month);

    }

    public static int getDayInMonth(int month) {
        int[] dayInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (month <= 0 || month > 12) {
            System.out.print("Wrong input! Input the number again: ");
            month = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("This month have " + dayInMonth[month - 1] + " days.");
        return dayInMonth[month - 1];
    }
}
