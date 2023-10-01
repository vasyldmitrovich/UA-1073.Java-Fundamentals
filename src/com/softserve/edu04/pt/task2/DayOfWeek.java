package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input day of week");
        String response = scanner.nextLine();
        Day day = Day.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

    }
}

enum Day {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок");

    final String en;
    final String ua;

    Day(String en, String ua){
        this.en = en;
        this.ua = ua;
    }


}
