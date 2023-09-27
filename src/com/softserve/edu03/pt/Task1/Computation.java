package com.softserve.edu03.pt.Task1;

import java.util.Scanner;

public class Computation {//Good

    public int sum(int a, int b) {
        return a + b;
    }

    public int average(int a, int b) {
        return (a + b) / 2;
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt + " :");
        int num = scanner.nextInt();

        return num;
    }
}
