package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class pt3 {
    static final public int min = -100;
    static final public int max = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int[] as = new int[10];
        int a = 0;
        for (int i = 0; i < as.length; i++) {
            as[i] = (int) Math.floor(random.nextInt((max - min) - 1));
            a++;
            System.out.println(a + " number = " + as[i]);
        }
        Arrays.sort(as);
        int maxs = as[9];
        System.out.println("The biggest number in arrays: " + maxs);
        int sumOfPositives = 0;
        for (int number : as) {
            if (number > 0) {
                sumOfPositives += number;
            }
        }
        System.out.println("Sum of positive numbers: " + sumOfPositives);
    }
}