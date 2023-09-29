package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input second number:");
        int num2 = scanner.nextInt();
        System.out.println("Input third number:");
        int num3 = scanner.nextInt();

        int min = -5;
        int max = 5;

        if (num1 >= min && num1 <= max) {
            System.out.println("First number is belong to range [-5, 5].");
        } else {
            System.out.println("First number is NOT belong to range [-5, 5].");
        }

        if (num2 >= min && num2 <= max) {
            System.out.println("Second number is belong to range [-5, 5].");
        } else {
            System.out.println("Second number is NOT belong to range [-5, 5].");
        }

        if (num3 >= min && num3 <= max) {
            System.out.println("Third number is belong to range [-5, 5].");
        } else {
            System.out.println("Third number is NOT belong to range [-5, 5].");
        }
    }
}
