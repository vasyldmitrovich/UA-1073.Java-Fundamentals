package com.softserve.edu13.hw.task3;

import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = scanner.nextInt();
        leapYear(year);
    }
    static void leapYear (int year){
        int daysYear = Year.of(year).length();
        if (daysYear > 365){
            System.out.println( year +" is leap year");
        }else {
            System.out.println( year +" isnt leap year");
        }
    }
}
