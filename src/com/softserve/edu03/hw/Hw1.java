package com.softserve.edu03.hw;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Hw1 {

    //All is good
    static void area (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will calculate area of triangle. \n" +
                "Input Side 1:");
        int l1 = scanner.nextInt();
        System.out.println("Input Side 2:");
        int l2 = scanner.nextInt();
        System.out.println("Input Side 3:");
        int l3 = scanner.nextInt();
        System.out.println("The area of the triangle is " + area(l1, l2, l3));

    }

    private static double area (int l1, int l2, int l3) {
        return  0.25 * sqrt((l1 + l2 - l3) * (l1 - l2 + l3) * (l2 + l3 - l1) * (l1 + l2 + l3));
    }



}
