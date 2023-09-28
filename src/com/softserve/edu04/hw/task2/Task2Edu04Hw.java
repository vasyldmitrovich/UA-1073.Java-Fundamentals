package com.softserve.edu04.hw.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2Edu04Hw {
    public static void task2() {

        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number one: ");
        int number1 = scan.nextInt();

        System.out.println("Input number two: ");
        int number2 = scan.nextInt();

        System.out.println("Input number three: ");
        int number3 = scan.nextInt();

        System.out.println("Minimal number for your numbers is: " + MinAndMaxNumder.findMinNumber(number1, number2, number3));
        System.out.println("Maximal number for your numbers is: " + MinAndMaxNumder.findMaxNumber(number1, number2, number3));


    }
}
