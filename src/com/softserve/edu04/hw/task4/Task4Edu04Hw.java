package com.softserve.edu04.hw.task4;
import java.util.Locale;
import java.util.Scanner;

public class Task4Edu04Hw {
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input season: ");
        String season = scanner.nextLine();
        Season whichSeason = Season.valueOf(season.toUpperCase());
        System.out.println("Input number of students:");
        int numOfStud = scanner.nextInt();
        System.out.println("Number students is: " + numOfStud);
        System.out.println("Season is:" + whichSeason.season);


    }
}