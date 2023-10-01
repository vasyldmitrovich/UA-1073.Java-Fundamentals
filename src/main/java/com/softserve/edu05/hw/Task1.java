package com.softserve.edu05.hw;

import com.softserve.edu05.CommonTools;

import java.util.Arrays;

public class Task1 {
    private static final int[] DAYS_IN_MONTH = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final int MIN_NUM_MONTH = 1;
    private static final int MAX_NUM_MONTH = 12;
    private static final String RANGE = String.format("[%d-%d]", MIN_NUM_MONTH, MAX_NUM_MONTH);

    public static void daysInMonth(){
        int numMonth;

        while (true){
            numMonth = CommonTools.readLineAndConvertToNumber(String.format("Enter the month number %s: ", RANGE), Integer.class);

            if(numMonth >= MIN_NUM_MONTH && numMonth <= MAX_NUM_MONTH){
                break;
            }
            System.out.printf("The number you entered is outside the range %s. Please try again.%n", RANGE);
        }

        System.out.printf("The month you choose has %d days.%n", DAYS_IN_MONTH[numMonth - 1]);
    }

    public static int calculateResult(int[] array){
        return checkFirstHalfNum(array)
                ? sumFirstHalf(array)
                : productSecondHalf(array);
    }

    private static boolean checkFirstHalfNum(int[] array){
        for(int i = 0; i < array.length / 2; ++i){
            if(array[i] <= 0){
                return false;
            }
        }

        return true;
    }

    private static int sumFirstHalf(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length / 2; ++i){
            sum += array[i];
        }

        return sum;
    }

    private static int productSecondHalf(int[] array){
        int product = 1;

        for (int i = array.length / 2; i < array.length; ++i){
            product *= array[i];
        }

        return product;
    }

    public static void getArrayInfo(int[] array){
        int position = posSecondPositiveNum(array);
        int minIndex = searchIndexMinNum(array);
        int product = productEvenNums(array);

        System.out.printf("Array: %s%n", Arrays.toString(array));
        System.out.printf("Position of the second positive number: %s%n",
                position >= 0
                ? String.valueOf(position)
                : "Missing from the array.");
        System.out.printf("The minimum value and its position in the array: value - %d, position - %d%n", array[minIndex], minIndex);
        System.out.printf("The product of all entered even numbers: %d%n", product);
    }

    private static int posSecondPositiveNum(int[] array){
        int countPositive = 0;

        for(int i = 0; i < array.length; ++i){
            if(array[i] > 0){
                ++countPositive;
            }

            if(countPositive == 2){
                return i;
            }
        }

        return -1;
    }

    private static int searchIndexMinNum(int[] array){
        int indexMin = 0;

        for(int i = 1; i < array.length; ++i){
            if(array[indexMin] > array[i]){
                indexMin = i;
            }
        }

        return indexMin;
    }

    private static int productEvenNums(int[] array){
        int product = 1;

        for(int el : array){
            if(el != 0 && el %2 == 0){
                product *= el;
            }
        }

        return product;
    }
}
