package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_2 {
    public static void run() {
        int[] numbers = new int[10];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers");
        for (int i = 0; i < 10; i++) {
            numbers[i] = console.nextInt();
            console.nextLine();
        }
        boolean isPositive = true;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            isPositive = numbers[i] <= 0 ? false : isPositive;
            result += numbers[i];
        }
        if (isPositive) {
            System.out.println("The sum of first 5 elements is " + result);
        } else {
            result = 1;
            for (int i = 5; i < 10; i++) {
                result *= numbers[i];
            }
            System.out.println("The product of last 5 elements is " + result);
        }
    }
}
