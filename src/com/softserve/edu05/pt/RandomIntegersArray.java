package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomIntegersArray {

    private static final int[] myArray = new int[10];
    private static Random random = new Random();

    static void fillTheArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                I create an array. Lets fill it with numbers.
                Lets input range of generation.\s
                Will be cool result if you will set symmetric numbers, like - 127 and 127.
                Input LOWEST number (negative value is welcome):""");
        int min = sc.nextInt();
        System.out.println("Please input HIGHEST number");
        int max = sc.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(max - min) + min;
        }
        System.out.println("So, you fill my array " + Arrays.toString(myArray));
    }

    static void sumOfPositiveNumbers() {
        int sum = 0;
        for (int a : myArray) {
            if (a > 0) sum += a;
        }
        System.out.println("Sum of positive numbers in our array - " + sum);
    }

    private static int calcNegative() {
        int count = 0;
        for (int a : myArray) {
            if (a < 0) count++;
        }
        return count;
    }

    private static int calcPositive() {
        int count = 0;
        for (int a : myArray) {
            if (a > 0) count++;
        }
        return count;
    }

    static void numberOfNegativeNumbers() {
        System.out.println("Number of negative numbers in our array - " + calcNegative());
    }

    static void numberOfPositiveNumbers() {
        System.out.println("Number of positive numbers in our array - " + calcPositive());
    }

    static void negativeOrPositive() {
        if (calcPositive() > calcNegative()) {
            System.out.println("There are more positive values in the array.");
        } else if (calcNegative() > calcPositive()) {
            System.out.println("There are more negative values in the array.");
        } else System.out.println("There are an equal number of positive and negative values in the array.");
    }
}
