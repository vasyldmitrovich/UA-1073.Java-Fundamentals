package com.softserve.edu01.hw;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int P = (int) (2 * Math.PI * r);
        int S = (int) (Math.PI * Math.pow(r, 2));

        System.out.println("Периметр кола " + P + "\nПлоща кола " + S);
    }
}
