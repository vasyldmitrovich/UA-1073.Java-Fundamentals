package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1
        String[] stringArray = {"toyota", "lexus", "bmw", "volkswagen", "audi"};
        Arrays.sort(stringArray);

        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        //2
        int[] intArray = {10, 20, 30, 40, 50};
        double average = calculateAverage(intArray);

        System.out.println("Average Value of the Int Array: " + average);

        //3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the arrays: ");
        int searchValue = scanner.nextInt();

        boolean containsInIntArray = containsValue(intArray, searchValue);
        boolean containsInStringArray = containsValue(stringArray, Integer.toString(searchValue));

        System.out.println("Value " + searchValue + " in Int Array: " + containsInIntArray);
        System.out.println("Value " + searchValue + " in String Array: " + containsInStringArray);

        scanner.close();
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static boolean containsValue(String[] arr, String value) {
        for (String str : arr) {
            if (str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}