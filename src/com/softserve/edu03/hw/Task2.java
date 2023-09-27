package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = scanner.nextInt();
        System.out.println("Input the second number: ");
        int b = scanner.nextInt();
        System.out.println("Input the third number: ");
        int c = scanner.nextInt();
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The smallest number is " + min);
    }
}
