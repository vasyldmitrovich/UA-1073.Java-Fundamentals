package com.softserve.edu01.hw;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        System.out.println("Ведіть радіус та натисніть -ENTER-");
        double radius = scan.nextDouble();
        double perimetr = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.printf("Периметр вашого кола  %.2f", perimetr);
        System.out.println(" ");
        System.out.printf("Площа вашого кола =  %.2f ",  area);


    }

}
