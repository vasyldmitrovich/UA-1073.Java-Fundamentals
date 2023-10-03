package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void task3() {
        int[] arr = new int[10];
        Random rnd = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-20, 21);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The biggest number in the array is: " + getBiggestNumber(arr));

        System.out.println("The sum of positive numbers is: " + getSumOfPositiveNumbers(arr));

        System.out.println("The count of negative numbers is: " + getCountOfNegativeNumbers(arr));

        determineNumbersInArray(arr);
    }

    public static int getBiggestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int getSumOfPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int getCountOfNegativeNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static void determineNumbersInArray(int[] arr) {
        int countNegative = 0;
        int countPositive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        if (countPositive > countNegative) {
            System.out.println("There are more positive values in the array.");
        } else if (countPositive < countNegative) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

}
