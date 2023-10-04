package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class AverageNumber {
    int[] numbers;

    public static int[] getNumberArray(int length) {
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            int randomNumber = new Random().nextInt(0, 100);
            numbers[i] = randomNumber;
        }

        return numbers;
    }

    public static int getAverage(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}
