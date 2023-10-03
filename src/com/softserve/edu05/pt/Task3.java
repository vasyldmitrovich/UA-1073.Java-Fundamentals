package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void run() {
        int[] numbers = new int[10];
        int maxNumber = Integer.MIN_VALUE;
        long sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = rnd.nextInt();
            maxNumber = numbers[i] > maxNumber ? numbers[i] : maxNumber;
            if (numbers[i] < 0) {
                countNegative++;
            }
            if (numbers[i] > 0) {
                countPositive++;
                sumPositive += numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The biggest number in array is " + maxNumber);
        System.out.println("The sum of positive numbers is " + sumPositive);
        System.out.println("The count of negative numbers is " + countNegative);
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array");
        } else if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}
