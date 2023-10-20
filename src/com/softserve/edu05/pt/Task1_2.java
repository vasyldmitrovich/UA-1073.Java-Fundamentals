package com.softserve.edu05.pt;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 9, 4, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double result = sum / numbers.length;
        System.out.println(result);
    }
}
