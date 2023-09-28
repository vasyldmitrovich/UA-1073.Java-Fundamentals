package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class Task2Edu04 {

    public static void task2Edu04() {
        var scan = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String response = scan.nextLine();
        DayOfTheWeek day = DayOfTheWeek.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);


    }

}

