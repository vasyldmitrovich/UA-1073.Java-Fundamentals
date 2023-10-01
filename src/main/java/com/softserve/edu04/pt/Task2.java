package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void printDay(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: №");
        int readDay = scanner.nextInt();

        DayWeek day = switch (readDay) {
            case 1 -> DayWeek.MONDAY;
            case 2 -> DayWeek.TUESDAY;
            case 3 -> DayWeek.WEDNESDAY;
            case 4 -> DayWeek.THURSDAY;
            case 5 -> DayWeek.FRIDAY;
            case 6 -> DayWeek.SATURDAY;
            case 7 -> DayWeek.SUNDAY;
            default -> DayWeek.NONE;
        };

        if(day == DayWeek.NONE){
            System.out.println("The data you entered is not correct.");
            return;
        }

        System.out.printf("You have chosen a day - %s.\nВи обрали день - %s.\n", day.en, day.ua);
    }
}

enum DayWeek{
    NONE("N/A", "N/A"),
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    public final String en;
    public final String ua;

    DayWeek(String en, String ua){
        this.en = en;
        this.ua = ua;
    }
}