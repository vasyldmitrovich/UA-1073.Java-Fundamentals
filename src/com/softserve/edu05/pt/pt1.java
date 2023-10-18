package com.softserve.edu05.pt;

import java.util.Arrays;

public class pt1 {
    public static void main(String[] args) {

        String[] x = {"banana", "apple", "cherry", "date", "blueberry"};
        Arrays.sort(x);
        for (String str : x) {
            System.out.println(str);
        }
        int result = 0;
        int[] as = {12, 23, 34, 42, 51};
        for (int number : as) {
            result += number;
        }
        System.out.println("Average number of array: " + result / 5);
    }
}


