package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of the day of the week (1-7): ");
        int dayNumber = scanner.nextInt();


        String[] englishDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] spanishDays = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            String englishDay = englishDays[dayNumber - 1];
            String spanishDay = spanishDays[dayNumber - 1];

            System.out.println("In English: " + englishDay);
            System.out.println("In Spanish: " + spanishDay);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}

