package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class MonthDay {
    public static void task1Edu05Hw () {

        var scan = new Scanner(System.in);

        int [] dayInMoth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Input number of moth: ");
        int numMoth = scan.nextInt();

        if (numMoth >= 1 && numMoth <= 12) {
            int dayInput = dayInMoth[numMoth - 1];
            System.out.println("It is moth has " + dayInput + " days.");
        } else {
            System.out.println("Your input is wrong");
        }
    }
}
