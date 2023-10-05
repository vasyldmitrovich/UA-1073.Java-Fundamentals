package com.softserve.edu05.hw.hw1program;

import java.util.Arrays;
import java.util.Scanner;

public class FiveIntegers {

    private static final int[] myArray = new int[5];

    static void fillArray() {
        System.out.println("Lets fill array with 5 Integers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Input " + (i + 1) + " number:");
            myArray[i] = sc.nextInt();
        }
        System.out.println("You create array - " + Arrays.toString(myArray));
    }

    static void positionOfSecondPositiveNumber() {
        int position = 0;
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                position = i;
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        if (count <= 1) {
            System.out.println("There's no two positive numbers in array");
        } else {
            System.out.println("Second positive number is \"" + myArray[position] + "\". It's position - " + (position + 1));
        }
    }

    static void minimumValAndPosition() {
        int position = 0;
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
                position = i;
            }
        }
        System.out.println("Minimum value \"" + min + "\" at position - " + (position + 1));
    }

    static void productOfEvenNumbers() {
        int product = 1;
        for (int e : myArray) {
            if (e > 0 && e % 2 == 0) {
                product = product * e;
            }
        }
        System.out.println("Product of all entered even numbers - " + product);
    }
}
