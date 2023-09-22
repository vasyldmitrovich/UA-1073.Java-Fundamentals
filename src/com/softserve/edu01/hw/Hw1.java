package com.softserve.edu01.hw;

import java.util.Scanner;

public class Hw1 {

    public static void flowerBed () {
        System.out.println("Hello, please input radius of flower bed");
        double radius = new Scanner(System.in).nextDouble();
        System.out.println("Perimeter of flower bad - "
                + 2 * Math.PI * radius + " and the area - "
                + Math.PI * Math.pow(radius, 2));
    }
}
