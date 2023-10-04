package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {
    public static int[] getRandomArray(int length ) {
        int[] numbers = new Random().ints(length, 0, 100).toArray();
        return numbers;
    }

    public static int findMaxNumber (int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }

    public static int findSumOfPositive (int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static int findAmountOfNegative (int[] numbers) {
        int amount =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                amount++;
            }
        }
        return amount;
    }

    public static void compareNumbers (int[] numbers) {
        int positive =0;
        int negative =0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negative++;
            } else if (numbers[i] > 0) {
                positive++;
            }
        }
        if (positive > negative) {
            System.out.println("There are more positive values in the array");
        } else if (positive < negative) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("\"There are an equal number of positive and negative values in the array.");
        }
    }


    public static void outputInfo (int[] numbers) {
        System.out.println("Array is "+ Arrays.toString(numbers));
        System.out.println("Biggest number in array is " + RandomIntArray.findMaxNumber(numbers));
        System.out.println("The sum of positive integers is " + RandomIntArray.findSumOfPositive(numbers));
        System.out.println("The amount of negative numbers " + RandomIntArray.findAmountOfNegative(numbers));
        RandomIntArray.compareNumbers(numbers);
    }
}
