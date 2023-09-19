package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");

        int number1 = sc.nextInt();
        System.out.println("input second number");
        int number2 = sc.nextInt();
        System.out.println("input third number");
        int number3 = sc.nextInt();

        double average = (number1 + number2 + number3) / 3.0;
        String result = String.format("%f", average);
        System.out.println(result);

    }
}
