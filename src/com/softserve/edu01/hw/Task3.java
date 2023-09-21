package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner console = new Scanner(System.in);
        System.out.println("Input cost per minute:");
        double c1 = console.nextDouble();
        double c2 = console.nextDouble();
        double c3 = console.nextDouble();
        System.out.println("Input call length:");
        double t1 = console.nextDouble();
        double t2 = console.nextDouble();
        double t3 = console.nextDouble();
        System.out.println("Call 1: " + (c1 * t1));
        System.out.println("Call 2: " + (c2 * t2));
        System.out.println("Call 3: " + (c3 * t3));
        System.out.println("Total: " + (c1 * t1 + c2 * t2 + c3 * t3));
    }
}
