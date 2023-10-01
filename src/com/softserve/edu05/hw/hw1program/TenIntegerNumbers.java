package com.softserve.edu05.hw.hw1program;

import java.util.Arrays;
import java.util.Scanner;

class TenIntegerNumbers {

    private static final int[] myArray = new int[10];

    static void fillArray() {
        System.out.println("Lets fill array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Input " + (i + 1) + " number:");
            myArray[i] = sc.nextInt();
        }
        System.out.println("You create array - " + Arrays.toString(myArray));
    }

    private static int sum5FirstElements() {
        int sum5 = 0;
        for (int i = 0; i < (myArray.length / 2); i++) {
            sum5 += myArray[i];
        }
        return sum5;
    }


    private static int product5LastElements() {
        int product = 1;
        for (int i = (myArray.length / 2); i < myArray.length; i++) {
            product = product * myArray[i];
        }
        return product;
    }


    static void sumOrProduct() {
        boolean first5NumbPositive = true;
        for (int i = 0; i < (myArray.length / 2); i++) {
            if (myArray[i] < 0) {
                first5NumbPositive = false;
                break;
            }
        }
        if (first5NumbPositive) {
            System.out.println("First 5 elements positive. " +
                    "Sum of first 5 elements - " + sum5FirstElements());
        } else {
            System.out.println("Not all first 5 elements positive. " +
                    "Product of last 5 elements - " + product5LastElements());
        }
    }
}
