package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

class ArraysForHW {

    private static final int[] firstArray = new int[5];
    private static final int[] secondArray = new int[6];

    private static void scanNumbToArray(int a, Scanner sc, int[] arr) {
        System.out.println("Input " + a + " integer:");
        arr[a - 1] = sc.nextInt();
    }

    static void createAndSortArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets create Array with length 5 and i will sort it.");
        for (int i = 0; i < firstArray.length; i++) {
            scanNumbToArray(i + 1, sc, firstArray);
        }
        System.out.println("You create " + Arrays.toString(firstArray));
        int temp;
        for (int i = 0; i < firstArray.length - 1; i++) {
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[i] < firstArray[j]) {
                    temp = firstArray[i];
                    firstArray[i] = firstArray[j];
                    firstArray[j] = temp;
                }
            }
        }
        System.out.println("And i sort it to " + Arrays.toString(firstArray));

    }

    static void averageOfArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets create Array with length 6 and i will calculate average for U");
        for (int i = 0; i < secondArray.length; i++) {
            scanNumbToArray(i + 1, sc, secondArray);
        }
        int sum = 0;
        for (int i : secondArray) {
            sum += i;
        }
        System.out.println("So, you input " + Arrays.toString(secondArray) + "\nAverage: " + sum * 1.0 / secondArray.length);
    }

    static void coincidenceCheck() {
        System.out.println("Lets check if any previous array contains next integer:");
        int s = new Scanner(System.in).nextInt();
        boolean find = false;
        for (int k : firstArray) {
            if (k == s) {
                find = true;
                break;
            }
        }
        for (int j : secondArray) {
            if (j == s) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Yep. Previous arrays contains " + s);
        } else {
            System.out.println("Nope.There's no " + s + " in previous arrays.");
        }


    }
}
