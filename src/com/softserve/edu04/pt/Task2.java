package com.softserve.edu04.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Input day of week:");
        String response = scanner.nextLine();
        DaysOfWeek day = DaysOfWeek.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

    }
}
enum DaysOfWeek {//Separate classes in different files
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String en;
    final String ua;

    DaysOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}