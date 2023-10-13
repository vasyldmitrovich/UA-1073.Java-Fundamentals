package com.softserve.edu05.hw.Task1.TenInteger;

import java.util.Arrays;
import java.util.Scanner;

public class TenInteger {

    static Scanner SCANNER = new Scanner(System.in);
    static int[] nums = new int[10];

    static int[] newArrey() {
        System.out.println("Input 10 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = SCANNER.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    static boolean arePositive = true;
    static int sum = 0;
    static int prod = 1;

    static boolean posiitveOrNot(int[] nums) {
        for (int i = 0; i < 5; i++) {
            if (nums[i] <= 0) {
                arePositive = false;
                break;
            }
        }
        return arePositive;
    }

    static int ifPositive(int[] nums) {
        if (arePositive) {
            sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += nums[i];
            }
            System.out.println("The sum of first 5 numbers is " + sum);
        } return sum;
    }

    static int ifNotPositive(int[] nums) {
        if (!arePositive) {
            prod = 1;
            for (int i = 5; i < nums.length; i++) {
                prod *= nums[i];
            }
            System.out.println("The product of last 5 numbers is " + prod);
        }
        return prod;
    }
}

