package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task4 {
    public static void task4() throws Exception {
        Scanner sc = new Scanner(System.in);
        Faculty mif = new Faculty();

        System.out.print("Enter a number of students: ");
        int numOfStudents = sc.nextInt();
        mif.setNumberOfStudents(numOfStudents);
        sc.nextLine();

        System.out.print("Enter a current season: ");
        String currentSeason = sc.nextLine();
        Season season = Season.valueOf(currentSeason.toUpperCase());
        mif.setCurrentSeason(season);

        System.out.print("Number of students: " + mif.getNumberOfStudents());
        System.out.println(", current season: " + mif.getCurrentSeason().season);

        //All good

    }
}
