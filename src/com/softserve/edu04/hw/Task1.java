package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        Scanner sc = new Scanner(System.in);

        float a;
        float b;
        float c;
        while (true) {
            try {
                System.out.print("Input the first number: ");
                a = sc.nextFloat();
                System.out.print("Input the second number: ");
                b = sc.nextFloat();
                System.out.print("Input the third number: ");
                c = sc.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                sc.nextLine();
            }
        }

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
