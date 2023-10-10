package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-9, 10);
        }

        int biggestInArray = biggestNumb(arr);
        int sumPosNumb = sumPositiveNum(arr);
        int countNegNum = countNegativeNum(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("The biggest number in the array: " + biggestInArray + ".");
        System.out.println("The sum of positive numbers: " + sumPosNumb + ".");
        System.out.println("Count the number of negative numbers is: " + countNegNum + ".");

        if (countNegNum > arr.length /2) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegNum > arr.length /2) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }

    }

    public static int biggestNumb(int[] arr) {
        int maxNum = arr[0];
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    public static int sumPositiveNum(int[] arr)  {
        int sum = 0;
        for (int pos : arr) {
            if (pos > 0) {
                sum += pos;
            }
        }
        return sum;
    }

    public static int countNegativeNum(int[] arr) {
        int countN = 0;
        for (int neg : arr) {
            if (neg < 0) {
                countN ++;
            }
        }
        return countN;
    }
}
