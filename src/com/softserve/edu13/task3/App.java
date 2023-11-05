package com.softserve.edu13.task3;

import java.time.Year;

public class App {
    public static void main(String[] args) {
        System.out.println(isLeap(1995));
        System.out.println(isLeap(1990));
        System.out.println(isLeap(2012));
        System.out.println(isLeap(2024));
    }

    public static boolean isLeap(int year) {
        return Year.isLeap(year);
    }
}
