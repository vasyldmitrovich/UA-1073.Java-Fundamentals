package com.softserve.edu03.hw;

import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Input the first number: " + a);
        System.out.println("Input the second number: " + b);
        System.out.println("Input the third number: " + c);
        int[] x = {a, b, c};
        int min = Arrays.stream(x).min().getAsInt();
        System.out.println("min. number is: " + min);
    }
}

