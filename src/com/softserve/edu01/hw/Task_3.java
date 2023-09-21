package com.softserve.edu01.hw;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task_3 {
    public static void task3() {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost for first country through the point");
        double c1 = scanner.nextDouble();
        System.out.println("Enter duration in minute");
        double t1 = scanner.nextDouble();
        System.out.printf("Total cost is %.2f%n", c1 * t1);

        System.out.println("Enter cost for second country through the point");
        double c2 = scanner.nextDouble();
        System.out.println("Enter duration in minute");
        double t2 = scanner.nextDouble();
        System.out.printf("Total cost is %.2f%n", c2 * t2);

        System.out.println("Enter cost for third country through the point");
        double c3 = scanner.nextDouble();
        System.out.println("Enter duration in minute");
        double t3 = scanner.nextDouble();
        System.out.printf("Total cost is %.2f%n", c3 * t3);

        System.out.println("The cost for all calls is " + ( (c1*t1) + (c2*t2) + (c3*t3) ) );
    }
}
