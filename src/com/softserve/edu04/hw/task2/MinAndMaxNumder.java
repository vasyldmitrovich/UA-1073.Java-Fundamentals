package com.softserve.edu04.hw.task2;

public class MinAndMaxNumder {

//Метод мінімального числа
    public static int findMinNumber (int a, int b, int c) {

        int minimalNumber = a;

        if (b < minimalNumber) {
            minimalNumber = b;
        }

        if (c < minimalNumber) {
            minimalNumber = c;
        }

        return minimalNumber;
    }

//метод максимального числа
    public static int findMaxNumber (int a, int b, int c) {
        int maximalNumber = a;

        if (b > maximalNumber) {
            maximalNumber = b;
        }
        if (c > maximalNumber) {
            maximalNumber = c;
        }
        return maximalNumber;

    }
}
