package com.softserve.edu04.pt.Task2;

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

