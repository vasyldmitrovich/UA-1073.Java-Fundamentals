package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        float a = sc.nextFloat();
        System.out.print("Input the second number: ");
        float b = sc.nextFloat();
        System.out.print("Input the third number: ");
        float c = sc.nextFloat();

        if (checkEligibility(a, b, c)) {//Good
            System.out.println("Numbers are belong to the range [-5, 5].");
        } else {
            System.out.println("Numbers are NOT belong to the range [-5, 5].");
        }
    }

    public static boolean checkEligibility(float a, float b, float c) {
        return (-5 <= a && a <= 5) && (-5 <= b && b <= 5) && (-5 <= c && c <= 5);
    }
}
