package com.softserve.edu04.hw.Task2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n1 = scanner.nextInt();
        System.out.println("Input number");
        int n2 = scanner.nextInt();
        System.out.println("Input number");
        int n3 = scanner.nextInt();
        int min = n1;
        int max = n1;
        if (n2 < n1) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println( "Minimum value - " + min);
        if (n2 > n1) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        System.out.println( "Maximum value - " + max);
    }

}
