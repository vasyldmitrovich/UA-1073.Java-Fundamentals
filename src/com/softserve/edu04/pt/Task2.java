package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void task2() throws Exception {
        Scanner sc = new Scanner(System.in);

        int numDay;
        while (true) {
            try {
                System.out.print("Enter a number of the day of the week: ");
                numDay = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }

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
