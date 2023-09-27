package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private Season season;

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        this.numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter season: ");
        this.season = Season.valueOf(scanner.nextLine().toUpperCase());
    }
    public void getData() {
        System.out.println("Number of students: " + this.numberOfStudents);
        System.out.println("Season: " + this.season.getEngName());
    }
}
