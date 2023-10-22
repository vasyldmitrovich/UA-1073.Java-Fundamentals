package com.softserve.edu05.hw.Task1.FiveInteger;

import java.util.Arrays;
import java.util.Scanner;

public class FiveInteger {//Very nice
    public static int[] createNewArrey() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Input 5 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int secondPositive(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                counter++;
                if (counter == 2) {
                    System.out.println("Position of second positive number is " + nums[i]);

                }
            }
        }
        return counter;
    }
    public static int foundMin(int[] nums) {
        int min = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        System.out.println("Minimum value is " + min + " on " + index + " position");
    return min; }

    public static int ptodFrEven(int[] nums) {
       int prodForEven=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] != 0) {
                prodForEven *= nums[i];
            }
        }
        System.out.println("The product of all entered even numbers: " + prodForEven);
    return prodForEven;
    }
    }


