package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter the current season (Spring, Summer, Autumn, Winter): ");
        String seasonInput = scanner.next();

        Season currentSeason = Season.valueOf(seasonInput.toUpperCase());

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getSeasonName());
    }
}