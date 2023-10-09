package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void run() {//Nice
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers:");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        int minimal = num1 < num2 ? num1 : num2;
        int maximal = num1 > num2 ? num1 : num2;
        minimal = num3 < minimal ? num3 : minimal;
        maximal = num3 > maximal ? num3 : maximal;
        System.out.println("Minimal number is " + minimal);
        System.out.println("Maximal number is " + maximal);
    }
}
