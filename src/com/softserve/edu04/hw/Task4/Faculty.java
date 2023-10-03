package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of students");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input the current season");
        String seasonResponse = scanner.nextLine();
        Season season = Season.valueOf(seasonResponse.toUpperCase());
        System.out.println("This is " + number + " of students at " + season.en);
    }
}
