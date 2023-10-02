package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();
        int sq = 2;
        int sqq = 2;
        System.out.printf("Perimeter of circle is: %.2f\n", 2 * Math.PI * radius);
        System.out.printf("Area of circle is: %.2f\n", Math.PI * Math.pow(sq, sqq));



    }
}
