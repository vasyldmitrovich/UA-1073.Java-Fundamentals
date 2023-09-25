package com.softserve.edu03.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void task1 () {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the side of the triangle");
        double sideTriniagle = scan.nextDouble();

        System.out.println("Enter the height of the triangle");
        double heightTriangle = scan.nextDouble();

        double areaTriniagle = (sideTriniagle * heightTriangle) * 0.5;
        System.out.println("Area of your triangle: " + areaTriniagle);

    }



}



