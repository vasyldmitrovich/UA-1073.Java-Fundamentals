package com.softserve.edu05.hw.task1;
import java.util.Arrays;
import java.util.Random;
public class Ex2 {
        public static void main(String[] args) {
            var nums = new Random(42).ints(10, -1, 10).toArray();

            System.out.println(Arrays.toString(nums));

            boolean areFirstFivePositive = true;
            int sum = 0;
            int prod = 1;

            for (int i = 0; i < 5; i++) {
                if (nums[i] <= 0) {
                    areFirstFivePositive = false;
                    break;
                }
                sum += nums[i];
            }

            if (areFirstFivePositive) {
                System.out.println("The sum of the first five numbers is " + sum);
            } else {
                for (int i = 5; i < nums.length; i++) {
                    prod *= nums[i];
                }
                System.out.println("The product of the last five is " + prod);
            }
        }
    }


