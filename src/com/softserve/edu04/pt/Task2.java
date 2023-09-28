package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void task2() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the day of the week: ");
        int numDay = sc.nextInt();

        DayOfTheWeek day = switch (numDay) {
            case 1 -> DayOfTheWeek.MONDAY;
            case 2 -> DayOfTheWeek.TUESDAY;
            case 3 -> DayOfTheWeek.WEDNESDAY;
            case 4 -> DayOfTheWeek.THURSDAY;
            case 5 -> DayOfTheWeek.FRIDAY;
            case 6 -> DayOfTheWeek.SATURDAY;
            case 7 -> DayOfTheWeek.SUNDAY;
            default -> throw new Exception("Wrong day number!");
        };

        System.out.println("Today is " + day.getDay() + ".");
    }
}
