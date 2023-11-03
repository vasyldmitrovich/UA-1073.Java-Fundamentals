package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_3 {
    public static void task1_3() {
        Scanner sc = new Scanner(System.in);
        //int[] arr = new int[]{3, 5, 7, -1, 9};
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter the " + (i + 1) + " element: ");
                    arr[i] = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number! Try again.");
                }
            }
        }

        findSecondPositiveNumber(arr);

        findMinValue(arr);

        calculateTheProduct(arr);
    }

    public static void findMinValue(int[] arr) {//Good
        int min = arr[0];
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIdx = i;
            }
        }
        System.out.println("The minimum value is " + arr[minIdx] + ", index: " + minIdx);
    }

    public static void findSecondPositiveNumber(int[] arr) {
        int countPositiveNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                countPositiveNumber++;
            }
            if (countPositiveNumber == 2) {
                System.out.println("The second positive number is: " + arr[i]);
                return;
            }
        }
        System.out.println("The second positive number don`t exist.");
    }

    public static void calculateTheProduct(int[] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                result *= arr[i];
            }
        }
        if (result != 1) {
            System.out.println("Multiply all even numbers: " + result);
        } else {
            System.out.println("No even numbers.");
        }
    }
}
