package com.softserve.edu04.pt.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//Good
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of day");
        String number = "DAY" + scanner.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(number.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);
    }
}

