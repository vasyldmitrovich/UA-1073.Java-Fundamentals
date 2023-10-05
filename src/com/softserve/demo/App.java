package com.softserve.demo;

import java.util.Arrays;
import java.util.Scanner;


public class App {
    static int maxNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] data = askClientsForArrayOfInts();
        int max = maxNumber(data);
        report(max);
    }

    static void report(int max) {
        System.out.println("The maximum element of your numbers is " +
                max);
    }

    static int[] askClientsForArrayOfInts() {
        System.out.println("Input integer numbers, separated with spaces");
        var scanner = new Scanner(System.in);
        var line = scanner.nextLine();
        String[] fragments = line.split(" ");
        int[] res = new int[fragments.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(fragments[i]);
        }
        return res;
    }
}
