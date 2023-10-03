package com.softserve.edu05.hw;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1_3 {
    public static void run() {
        int[] numbers = new int[5];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers");
        for (int i = 0; i < 5; i++) {
            numbers[i] = console.nextInt();
            console.nextLine();
        }
        int spi = secondPositiveIndex(numbers);
        System.out.println(spi >= 0 ? ("Second positive index is " + spi) : spi == -1 ? "Only 1 positive!" : "No positive!");
        int mvi = minValueIndex(numbers);
        System.out.println("Minimum value is " + numbers[mvi] + " at index " + mvi);
        System.out.println("The product of even numbers is " + evenProduct(numbers));
    }

    static int secondPositiveIndex(int[] numbers) {
        int result = -2;
        for (int i = 0; i < numbers.length; i++) {
            result = numbers[i] > 0 && result == -1 ? i : result;
            result = numbers[i] > 0 && result == -2 ? -1 : result;
        }
        return result;
    }

    static int minValueIndex(int[] numbers) {
        int minValue = numbers[0];
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int evenProduct(int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i] != 0 && numbers[i] % 2 == 0 ? numbers[i] : 1;
        }
        return result;
    }
}
