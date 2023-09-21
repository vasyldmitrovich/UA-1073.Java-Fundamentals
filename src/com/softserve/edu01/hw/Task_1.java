package com.softserve.edu01.hw;

import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of flower bed");
        int radius = scanner.nextInt();
        double perimer = 2* radius * Math.PI;
        double area = Math.PI * (radius * radius);
        System.out.printf("The perimeter of flower bed is %.3f%n", perimer );
        System.out.printf("The area of flower bed is %.3f%n", area );
    }
}
