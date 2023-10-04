package com.softserve.edu05.pt.task3;

public class Method {
    public static void maxMasNumber(int[] mas) {
        int maxNumber = 0;
        for (int i = 0; i < mas.length; i++) {
            if (maxNumber < mas[i]) {
                maxNumber = mas[i];
            }
        }
        System.out.println("Max number: " + maxNumber);
    }

    public static void sumPositivNums(int[] mas) {
        long sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                sum += mas[i];
            }
        }
        System.out.println("Sum of positiv numbers: " + sum);
    }

    public static void numerosityNegativeNums(int[] mas) {
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                counter++;
            }
        }
        System.out.println("Number of negative numbers: " + counter);
    }

    public static void positiveVsNegative(int[] mas) {
        int negativeCounter = 0;
        int positiveCounter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0){
                positiveCounter++;
            }else negativeCounter++;
        }
        if (positiveCounter > negativeCounter){
            System.out.println("There are more positive values in the array." );
        } else if (negativeCounter > positiveCounter) {
            System.out.println("There are more negative values in the array.");
        }else System.out.println("There are an equal number of positive and negative values in the array.");
    }
}
