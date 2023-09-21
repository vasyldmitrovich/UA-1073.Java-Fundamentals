package com.softserve.edu01.hw;

// Task 1
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус");

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius; //не знав як записати квадрат

        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);


    }
}


