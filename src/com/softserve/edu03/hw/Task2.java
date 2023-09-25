package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number ");
        int a = scan.nextInt();

        System.out.println("Input second number ");
        int b = scan.nextInt();

        System.out.println("Input third number ");
        int c = scan.nextInt();

        int min = a;
        if (b < a) {
            min = b;
            if (c < b) {
                min = c;
            }
        }
        System.out.println("The smallest number: " + min);

    }

}
