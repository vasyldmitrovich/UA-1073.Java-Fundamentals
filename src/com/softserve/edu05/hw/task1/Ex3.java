package com.softserve.edu05.hw.task1;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        var nums = new Random(42).ints(10, -1, 10).toArray();

        System.out.println(Arrays.toString(nums));

        int positiveNumberMet = 0;
        for (int i = 0; i < nums.length; i++) { // Видалено зайву крапку з комою
            if (nums[i] > 0) {
                positiveNumberMet++;
                if (positiveNumberMet == 2) {
                    System.out.println("The index of the 2nd positive number is " + i);
                    break;
                }
            }
        }
    }
}
