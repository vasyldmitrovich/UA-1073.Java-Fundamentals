package com.softserve.edu03.pt.task1;

import java.util.Scanner;


public class Calculation {

    public double Summary(double a, double b) {
        return  (a + b);
    }
    public double Average(double a, double b) {
        return ((a + b) / 2.0);
    }

    public static int getNumber(String prompt) {//Good method
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt + " :");

        return scanner.nextInt();

    }

}
