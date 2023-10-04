package com.softserve.edu05.hw.task1;

public class task1_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, 5, -6, -7, -8, -9, -10};
        int sum = 0;

        int sumOfFirstFivePositive = 0;
        int productOfLastFiveNonPositive = 1;
        int countPositive = 0;
        int countNonPositive = 0;

        for (int i = 0; i < 10; i++) {
            if (nums[i] > 0 && countPositive < 5) {
                sumOfFirstFivePositive += nums[i];
                countPositive++;
            } else if (nums[i] <= 0 && countNonPositive < 5) {
                productOfLastFiveNonPositive *= nums[i];
                countNonPositive++;
            }
        }

        if (countPositive == 5) {
            System.out.println("Sum of the first five positive numbers: " + sumOfFirstFivePositive);
        } else {
            System.out.println("Product of the last five non-positive numbers: " + productOfLastFiveNonPositive);
        }
    }
}
