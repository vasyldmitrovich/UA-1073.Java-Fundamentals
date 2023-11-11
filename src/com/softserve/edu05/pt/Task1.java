package com.softserve.edu05.pt;
import java.util.Arrays;
import java.util.Scanner;



public class Task1 {
    public static void main(String[] args) {
        // Task 1
        String[] stringArray = {"dog", "cat", "elephant", "lion", "tiger"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        // Task 2
        int[] intArray = {8, 12, 18, 24, 30};
        double average = calculateAverage(intArray);
        System.out.println("Average Value of Int Array: " + average);

        // Task 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to check in the array: ");
        int valueToCheck = scanner.nextInt();
        boolean containsValue = containsValue(intArray, valueToCheck);
        System.out.println("Array contains " + valueToCheck + ": " + containsValue);
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    private static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}

