package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task4 {//Ok
    public static void run() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentsNumber = console.nextInt();
        console.nextLine();
        System.out.println("Enter current season: ");
        String enteredSeason = console.nextLine();
        Season currentSeason = Season.valueOf(enteredSeason.toUpperCase());
        Faculty faculty = new Faculty(studentsNumber, currentSeason);
        faculty.printValues();
    }
}
