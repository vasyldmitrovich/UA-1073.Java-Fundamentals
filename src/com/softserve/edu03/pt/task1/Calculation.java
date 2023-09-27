package com.softserve.edu03.pt.task1;
import java.util.Scanner;
public class Calculation {

    public double Summary(double a, double b) {
        return (double) (a + b);
    }
    public double Average(double a, double b) {
        return (double) ((a + b) / 2.0);
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt + " :");
        int num = scanner.nextInt();

        return num;

    }

}
