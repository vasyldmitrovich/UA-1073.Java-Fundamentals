package com.softserve.edu05.pt.task3;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfRandom {
    public static void task3Edu05Pt() {

        int[] randomArray = genRandom(10);
        System.out.println(" ");
        System.out.println("Arrays random is: " + Arrays.toString(randomArray));

        int maxNumber = findMaxNumber(randomArray);
        System.out.println("The largest number is: " + maxNumber);

        int positiveSum = positivSum(randomArray);
        System.out.println("Suma positive numbers is: " + positiveSum);

        int negativInt = negativNumber(randomArray);
        System.out.println("Negative numbers is: " + negativInt);

        String result = compPositvAndNegativ(randomArray);
        System.out.println(result);

    }

    public static int[] genRandom(int size) {
        int[] randomArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(40) - 20;
        }
        return randomArray;
    }

    public static int findMaxNumber(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int positivSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int negativNumber(int[] arr) {
        int negativNum = 0;
        for (int num : arr) {
            if (0 > num) {
                negativNum++;
            }
        }
        return negativNum;
    }

    public static String compPositvAndNegativ(int[] arr) {

        int positCount = 0;
        int negatCount = 0;
        for (int num : arr) {
            if (num > 0) {
                positCount++;
            } else if (num < 0) {
                negatCount++;
            }
        }
        if (positCount > negatCount) {
            return "There are more positive numbers: They are " + positCount + ".";
        } else if (positCount < negatCount) {
            return "There are more negative numbers: They are " + negatCount + ".";
        } else {
            return "Positive and negative numbers equally, them by " + negatCount + ".";
        }
    }
}



