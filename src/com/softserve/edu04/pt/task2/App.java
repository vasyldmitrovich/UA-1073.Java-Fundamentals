package com.softserve.edu04.pt.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week");
        int answer = scanner.nextInt();
        switch (answer) {
            case 1 -> {
                DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
                System.out.println(dayOfWeek.MONDAY.getEn() + " " + dayOfWeek.MONDAY.getUa());
            }
            case 2 -> {
                DayOfWeek dayOfWeek = DayOfWeek.TUESDAY;
                System.out.println(dayOfWeek.TUESDAY.getEn() + " " + dayOfWeek.TUESDAY.getUa());
            }
            case 3 -> {
                DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;
                System.out.println(dayOfWeek.WEDNESDAY.getEn() + " " + dayOfWeek.WEDNESDAY.getUa());
            }
            case 4 -> {
                DayOfWeek dayOfWeek = DayOfWeek.THURSAY;
                System.out.println(dayOfWeek.MONDAY.getEn() + " " + dayOfWeek.MONDAY.getUa());
            }
            case 5 -> {
                DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
                System.out.println(dayOfWeek.FRIDAY.getEn() + " " + dayOfWeek.FRIDAY.getUa());
            }
            case 6 -> {
                DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
                System.out.println(dayOfWeek.SATURDAY.getEn() + " " + dayOfWeek.SATURDAY.getUa());
            }
            case 7 -> {
                DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
                System.out.println(dayOfWeek.SUNDAY.getEn() + " " + dayOfWeek.SUNDAY.getUa());
            }

        }

    }
}