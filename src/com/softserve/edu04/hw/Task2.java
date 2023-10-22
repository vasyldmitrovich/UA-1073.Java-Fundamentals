package com.softserve.edu04.hw;

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
        int max;

        //Move this logic to some method
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > min) {
            max = c;
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
