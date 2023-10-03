package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week: ");
        String response = scanner.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.eu);
        System.out.println("Сьогодні" + day.ua);


    }
}
enum DayOfWeek{
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String eu;
    final String ua;

    DayOfWeek(String eu, String ua) {
        this.eu = eu;
        this.ua = ua;
    }

}