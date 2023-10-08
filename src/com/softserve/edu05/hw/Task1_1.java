package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month number: ");
        int month = scanner.nextInt();
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(monthDays[month]);
    }
}
