package com.softserve.edu05.hw.hw1program;

import java.util.Scanner;

public class DayInMonth {

    private static final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static void days() {
        System.out.println("Hello, i will tell you number of days in chosen month.\nInput month number");
        int a = new Scanner(System.in).nextInt();
        System.out.println("In month with number \"" + a + "\" - " + daysInMonth[a - 1] + " days");
    }
}
