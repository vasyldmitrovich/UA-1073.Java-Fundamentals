package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first side");
        int f1 = scanner.nextInt();
        System.out.println("Write the second side");
        int s2 = scanner.nextInt();
        System.out.println("Write the third side");
        int t3 = scanner.nextInt();
        int s = (f1 + s2 + t3) / 2;
        float form = (float) Math.sqrt(s * (s - f1) * (s - s2) * (s - t3));
        System.out.println("the area is: " + form);
    }
}