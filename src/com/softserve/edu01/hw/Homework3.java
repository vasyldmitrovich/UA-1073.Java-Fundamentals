package com.softserve.edu01.hw;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First cost per minute");
        int c1 = scanner.nextInt();
        System.out.println("Second cost per minute");
        int c2 = scanner.nextInt();
        System.out.println("Third cost per minute");
        int c3 = scanner.nextInt();

        System.out.println("First duration");
        int t1 = scanner.nextInt();
        System.out.println("Second duration");
        int t2 = scanner.nextInt();
        System.out.println("Third duration");
        int t3 = scanner.nextInt();

        int total1 = c1 * t1;
        int total2 = c2 * t2;
        int total3 = c3 * t3;

        System.out.println("Total cost of first call "+ total1);
        System.out.println("Total cost of second call "+ total2);
        System.out.println("Total cost of third call "+ total3);

    }
}
