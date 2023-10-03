package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_1 {
    public static void run() {
        int[] monthDaysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner console = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNumber = console.nextInt();
        console.nextLine();
        System.out.println("In this month " + monthDaysCount[monthNumber - 1] + " days");
    }
}
