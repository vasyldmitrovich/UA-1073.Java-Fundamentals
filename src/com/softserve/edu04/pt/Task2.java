package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void run() {//Good
        Scanner console = new Scanner(System.in);
        String enteredDay = console.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(enteredDay.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);
    }
}
