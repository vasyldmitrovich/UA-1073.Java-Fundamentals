package com.softserve.edu12.hw.Task1;

import java.util.Scanner;

public class Div {
   static Scanner SCANNER = new Scanner(System.in);

    public static void prompt () {
        while (true) {
            try {
                System.out.println("input first number");
                double a = Double.parseDouble(SCANNER.nextLine());
                System.out.println("input second number");
                double b = Double.parseDouble(SCANNER.nextLine());
                double res = div(a, b);
                System.out.println("Result: " + res);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: input number");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static double div (double a, double b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Number can`t be null");
        }
        return a/b;
    }
}
