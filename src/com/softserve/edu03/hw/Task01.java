package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task01 {


    public static void myTask1(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the triangle parameters to calculate its area");
        int side1 = scn.nextInt();
        int side2 = scn.nextInt();
        int side3 = scn.nextInt();

        double p = (side1+side2+side3)/2.0;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.println("The area of your triangle = " + area);
    }
}
