package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = -5;
        int max = 5;
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if (min < a && a < max) {
            System.out.println(a);
        }
        if (min < b && b < max) {
            System.out.println(b);
        }
        if (min < c && c < max) {
            System.out.println(c);
        }

    }
}
