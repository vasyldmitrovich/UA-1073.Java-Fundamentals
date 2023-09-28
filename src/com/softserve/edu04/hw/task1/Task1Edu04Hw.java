package com.softserve.edu04.hw.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1Edu04Hw {
    public static void task1() {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number one: ");
        float number1 = scan.nextFloat();

        System.out.println("Input number two: ");
        float number2 = scan.nextFloat();

        System.out.println("Input number three: ");
        float number3 = scan.nextFloat();

        if (number1 > -5 && number1 < 5) {
            System.out.println("Number " + number1 + " belong to the range [-5, 5].");
        }
        else {
            System.out.println("Number " + number1 + " do not belong to the range [-5, 5].");
        }

        if (number2 > -5 && number2 < 5) {
            System.out.println("Number " + number2 + " belong to the range [-5, 5].");
        }
        else {
            System.out.println("Number " + number2 + " do not belong to the range [-5, 5].");
        }

        if (number3 > -5 && number3 < 5) {
            System.out.println("Number " + number3 + " belong to the range [-5, 5].");
        }
        else {
            System.out.println("Number " + number3 + " do not belong to the range [-5, 5].");
        }
    }
}
