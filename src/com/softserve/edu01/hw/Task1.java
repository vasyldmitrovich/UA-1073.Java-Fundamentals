package com.softserve.edu01.hw;

import java.util.Scanner;
class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть радіус: ");
        double r = sc.nextDouble();
        double perimeter = 2 * Math.PI * r;
        System.out.println("Периметр = " + perimeter);
        double area = Math.PI * r * r;
        System.out.println("Площа = " + area);
    }
}
