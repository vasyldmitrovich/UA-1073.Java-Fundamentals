package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner sc = new Scanner(System.in);

    public static void task1() {

        //Task 1.1
        task1_1();

        //Task1.2
        task1_23();

    }

    public static void task1_1() {

        int arrLength = 0;
        while (true) {
            try {
                System.out.print("Input array length: ");
                arrLength = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }
        String[] arr = new String[arrLength];
        inputStringArray(arr);
        System.out.printf("Arrays before sorting: %s\n", Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.printf("Arrays after sorting: %s", Arrays.toString(arr));
    }

    public static void task1_23() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i + i + 1 + 3 * 2 + 3 * i; // init array
        }

        double sum = 0;
        for (int a : arr) {
            System.out.println(a);
            sum += a;
        }

        double avgValue = sum / arr.length;
        System.out.printf("Average value is %f\n", avgValue);


        int value = 0;
        while (true) {
            try {
                System.out.println("Enter a value: ");
                value = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }
        findValue(arr, value);
    }

    public static void inputStringArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input a %d string: ", i + 1);
            arr[i] = sc.nextLine();
        }
    }

    public static void findValue(int[] arr, int a) {//Good
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.printf("Array contains a value %d, index: %d\n", a, i);
                return;
            }
        }
        System.out.printf("Array don`t have this number. Number: %d\n", a);
    }
}
