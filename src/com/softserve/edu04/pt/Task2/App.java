package com.softserve.edu04.pt.Task2;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Enter day of the week:" );
        String responce = sc.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(responce.toUpperCase());
        System.out.println("Today is day: " + day.en);
        System.out.println("Сьогодні день: " + day.ua);
    }


}

enum DayOfWeek{
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday","Четвер"),
    FRIDAY("Friday", "Пятниця"),
    SUTURDAY("Suturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String en;
    final String ua;

    DayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}