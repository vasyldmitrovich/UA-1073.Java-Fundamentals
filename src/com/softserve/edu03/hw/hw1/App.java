package com.softserve.edu03.hw.hw1;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        double a = scanner.nextDouble();
        System.out.println("Input Side 2: ");
        double b = scanner.nextDouble();
        System.out.println("Input Side 3: ");
        double c = scanner.nextDouble();
        System.out.println("The area of triangle is: " + getArea(a, b, c));
    }

    private static double getArea(double a, double b, double c){
        double p = (a + b + c) /2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
