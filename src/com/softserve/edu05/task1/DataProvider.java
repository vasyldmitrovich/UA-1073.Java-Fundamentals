package com.softserve.edu05.task1;

public class DataProvider {
    public int getDaysInMonths(int month) {

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < daysInMonths.length; i++) {
            if (i == month-1) {
                return daysInMonths[i];
            }
        }
        return 0;
    }
    public int getFirstFive(int[] numbers) {
        int result = 0;

        if (isNumbersPositive(numbers)) {
            for (int i = 0; i < numbers.length/2; i++) {
                result += numbers[i];
            }
        } else {
            result++;
            for (int i = (numbers.length/2); i < numbers.length; i++) {
                result *= numbers[i];
            }
        }
        return result;
    }
    private boolean isNumbersPositive(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }
        if (count == numbers.length) {
            return true;
        }
        return false;
    }

    public int findSecondPositive(int[] numbers) {
        int count = 0;
        int index = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
                if (count == 2) {
                    index = i;
                }
            }
        }
        return index;
    }

    public int[] findMinimum(int[] numbers) {
        int min = numbers[0];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        return new int[]{min, index};
    }

    public int calculateProduct(int[] numbers) {
        int res = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                res *= numbers[i];
            }
        }
        return res;
    }
}
