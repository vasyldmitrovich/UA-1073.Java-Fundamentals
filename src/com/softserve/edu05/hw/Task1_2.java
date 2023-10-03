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
        if (isFirstFivePositive(numbers)) {
            System.out.println("The sum of first 5 elements is " + firstFiveSum(numbers));
        } else {
            System.out.println("The product of last 5 elements is " + lastFiveProduct(numbers));
        }
    }

    static boolean isFirstFivePositive(int[] numbers) {
        boolean isPositive = true;
        for (int i = 0; i < 5; i++) {
            isPositive = numbers[i] <= 0 ? false : isPositive;
        }
        return isPositive;
    }

    static int firstFiveSum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += numbers[i];
        }
        return result;
    }

    static int lastFiveProduct(int[] numbers) {
        int result = 1;
        for (int i = 5; i < 10; i++) {
            result *= numbers[i];
        }
        return result;
    }
}
