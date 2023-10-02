package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost per minute: ");
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double c3 = sc.nextDouble();
        System.out.println("Enter the time duration: ");
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double t3 = sc.nextDouble();
        System.out.printf("Cost per 1st call: %.2f\n", (c1*t1));
        System.out.printf("Cost per 2nd call: %.2f\n", (c2*t2));
        System.out.printf("Cost per 3rd call: %.2f\n", (c3*t3));
        System.out.printf("Total cost: $%.2f\n", (c1*t1)+(c2*t2)+(c3*t3));

    }

}
