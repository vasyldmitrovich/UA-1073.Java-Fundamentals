package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task4 {
    public static void task4() throws Exception {
        Scanner sc = new Scanner(System.in);
        Faculty mif = new Faculty();

        int numOfStudents = 0;
        while (true) {
            try {
                System.out.print("Enter a number of students: ");
                numOfStudents = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }
        mif.setNumberOfStudents(numOfStudents);
        sc.nextLine();


        while (true) {
            try {
                System.out.print("Enter a current season: ");
                String currentSeason = sc.nextLine();
                Season season = Season.valueOf(currentSeason.toUpperCase());
                mif.setCurrentSeason(season);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input! Try again.");
                sc.nextLine();
            }
        }

        System.out.print("Number of students: " + mif.getNumberOfStudents());
        System.out.println(", current season: " + mif.getCurrentSeason().season);

        //All good

    }
}
