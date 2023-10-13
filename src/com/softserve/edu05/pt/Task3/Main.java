package com.softserve.edu05.pt.Task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
       int[] arrey = new int [10];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = random.nextInt(-100,100);
        }
        biggest(arrey);
        System.out.println("the sum of positive numbers: " + sumOfPositiveNumbers(arrey));
        System.out.println(countTheNegativeNumbers(arrey) + " negative numbers");
        if (countTheNegativeNumbers(arrey) < countThePositiveNumbers(arrey)) {
            System.out.println("There are more positive values in the array.");
        } if (countTheNegativeNumbers(arrey) > countThePositiveNumbers(arrey)) {
            System.out.println("There are more negative values in the array.");
        }if (countTheNegativeNumbers(arrey) == countThePositiveNumbers(arrey)) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
    static void biggest (int[] arrey) {
        System.out.println(Arrays.toString(arrey));
        Arrays.sort(arrey);
        System.out.println("The biggest number is " + arrey[arrey.length-1]);
    }
    static int sumOfPositiveNumbers (int[] arrey) {
        int sum = 0;
        for (int num : arrey) {
            if (num > 0) {
                sum += num;
            }
        } return sum;
    }
    static int countTheNegativeNumbers (int[] arrey) {
        int counternegative = 0;
        for (int num : arrey) {
            if (num<0) {
                counternegative++;
            }
        }
        return counternegative;

    }
    static int countThePositiveNumbers (int[] arrey) {
        int counterpositive = 0;
        for (int num : arrey) {
            if (num>0) {
                counterpositive++;
            }
        } return counterpositive;
    }









}
