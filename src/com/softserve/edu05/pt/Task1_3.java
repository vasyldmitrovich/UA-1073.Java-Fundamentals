package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 5, 6, 8, 7, 12, 15, 10, 3, 13};
        System.out.println("Input your number: ");
        int input = scanner.nextInt();
        boolean is3present = contains (nums, input);
        System.out.println(is3present ? input + " Is found" : input + " Not found");
    }
    static boolean contains(int[] nums, int el) {
        for (int num : nums) {
            if (num == el) {
                return true;
            }
        }
        return false;
    }
}
