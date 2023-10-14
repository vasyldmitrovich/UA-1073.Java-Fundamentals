package com.softserve.edu04.pt;

import java.util.Scanner;

public class PTask_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week (1-7): ");
        int dayNumber = scanner.nextInt();
        String dayNameEnglish = getDayNameEnglish(dayNumber);
        String dayNameUkrainian = getDayNameUkrainian(dayNumber);
        System.out.println("Day of the week in English: " + dayNameEnglish);
        System.out.println("День тижня українською: " + dayNameUkrainian);
    }

    public static String getDayNameEnglish(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday ";
            case 7:
                return "Sunday";
            default:
                return "Invalid day number";
        }


    }

    public static String getDayNameUkrainian(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Понеділок";
            case 2:
                return "Вівторок";
            case 3:
                return "Середа";
            case 4:
                return "Четвер";
            case 5:
                return "П'ятниця";
            case 6:
                return "Субота";
            case 7:
                return "Неділя";
            default:
                return "Недійсний номер дня";
        }
    }
}

