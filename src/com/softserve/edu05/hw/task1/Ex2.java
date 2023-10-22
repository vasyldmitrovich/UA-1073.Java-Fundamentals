package com.softserve.edu05.hw.task1;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {//Good
    public static void main(String[] args) {

        var nums = new Random().ints(10, -1, 10).toArray();
        System.out.println(Arrays.toString(nums));

        boolean areFirstFiveNumb = checkFirstFiveNum(nums);


        if (areFirstFiveNumb) {
            int sum = sumFirsFiveNum(nums);
            System.out.println("The sum of first positive numbers is: " + sum);
        } else {
            int prod = prodLastFive(nums);
            System.out.println("The product of the last five is: " + prod);
        }

    }

    public static boolean checkFirstFiveNum(int[] nums) {
        boolean areFirstFiveNumb = true;
        for (int i = 0; i < 5; i++) {
            if (nums[i] <= 0) {
                areFirstFiveNumb = false;
                break;
            }
        }
        return areFirstFiveNumb;
    }

    public static int sumFirsFiveNum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int prodLastFive(int[] nums) {
        int prod = 1;
        for (int i = 5; i < nums.length; i++) {
            prod *= nums[i];
        }
        return prod;
    }

}