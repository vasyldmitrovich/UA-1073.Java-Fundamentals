package com.softserve.edu04.hw.task2;


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

    public static void outputMaxAndMin(int num1, int num2, int num3) {//Cool
        int max;
        int min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num3) {
            min = num3;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
