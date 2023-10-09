package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {//Good
        var scanner = new Scanner(System.in);
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter number of month");
        int numberOfMonth = scanner.nextInt();

        if (numberOfMonth >= 1 && numberOfMonth <= 12) {
            System.out.println("This month has " + month[numberOfMonth - 1] + " days");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}
