package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Currently season:");
        String response = scanner.nextLine();
        System.out.println("response: " + response);
        Season currentlySeason = Season.valueOf(response.toUpperCase());
        System.out.println("Input number of students:");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Number of students is: " + numberOfStudents);
        System.out.println("Season right now is:" + currentlySeason.en);

    }

}
