package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_2 {
    public static void task1_2() {
        Scanner sc = new Scanner(System.in);
        //int[] arr = new int[]{3, 5, 7, -1, 9, 13, 15, 48, 19, 2};If you have been tested your method, after that delete this line
        int[] arr = new int[10];
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
        System.out.println("Result is: " + solveTask(arr));
    }

    public static int solveTask(int[] arr) {
        boolean positive = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                continue;
            } else {
                positive = false;
                break;
            }
        }
        int result = 0;
        if (positive) {
            for (int i = 0; i < 5; i++) {
                result += arr[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < arr.length; i++) {
                result *= arr[i];
            }
        }

        return result;
    }
}
