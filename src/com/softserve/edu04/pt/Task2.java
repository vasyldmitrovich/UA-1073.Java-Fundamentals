package com.softserve.edu04.pt;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number (1-7): ");
        int dayNumber = scanner.nextInt();

        String[] daysInUkrainian = {
                "Понеділок",
                "Вівторок",
                "Середа",
                "Четвер",
                "П'ятниця",
                "Субота",
                "Неділя"
        };

        String[] daysInEnglish = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayInUkrainian = daysInUkrainian[dayNumber - 1];
            String dayInEnglish = daysInEnglish[dayNumber - 1];

            System.out.println("Name day in Ukrainian: " + dayInUkrainian);
            System.out.println("Name day in English: " + dayInEnglish);
        } else {
            System.out.println("Wrong day number");
        }

        scanner.close();
    }
}

