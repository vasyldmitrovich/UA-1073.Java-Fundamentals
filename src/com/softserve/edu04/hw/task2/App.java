package com.softserve.edu04.hw.task2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        inputAndCheck();
    }
    public static void inputAndCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Input number 3: ");
        int num3 = scanner.nextInt();
        outputMaxAndMin(num1, num2, num3);
    }

    public static void outputMaxAndMin(int num1, int num2, int num3) {
//        int max = 0;
//        int min = 0;
//        if (num1 > num2 && num1 > num3) {
//            max = num1;
//        } else if (num2 > num1 && num2 > num3) {
//            max = num2;
//        } else if (num3 > num1 && num3 > num2) {
//            max = num3;
//        }
//        if (num1 < num2 && num1 < num3) {
//            min = num1;
//        } else if (num2 < num1 && num2 < num3) {
//            min = num2;
//        } else if (num3 < num1 && num3 < num2) {
//            min = num3;
//        }
        int[] nums = new int[] {num1, num2, num3};

        System.out.println("Max: " + Arrays.stream(nums).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(nums).min().getAsInt());
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);
    }
}
