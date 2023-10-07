package com.softserve.edu05.pt.task3;

public class Method {
    public static int maxMasNumber(int[] mas) {
        int maxNumber = 0;
        for (int i = 0; i < mas.length; i++) {
            if (maxNumber < mas[i]) {
                maxNumber = mas[i];
            }
        }
        System.out.println("Max number: " + maxNumber);
        return maxNumber;
    }

    public static long sumPositivNums(int[] mas) {
        long sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                sum += mas[i];
            }
        }
        System.out.println("Sum of positiv numbers: " + sum);
        return sum;
    }

    public static int numerosityNegativeNums(int[] mas) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                counter++;
            }
        }
        System.out.println("Number of negative numbers: " + counter);
        return counter;
    }

    public static String positiveVsNegative(int[] mas) {
        int negativeCounter = 0;
        int positiveCounter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0){
                positiveCounter++;
            }else negativeCounter++;
        }
        if (positiveCounter > negativeCounter) {
            return "There are more positive values in the array.";
        } else if (negativeCounter > positiveCounter) {
            return "There are more negative values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
}
