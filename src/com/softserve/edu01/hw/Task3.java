package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of your first call:");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call:");
        double t1 = scanner.nextDouble();
        System.out.println("Enter the cost of your first call:");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call:");
        double t2 = scanner.nextDouble();
        System.out.println("Enter the cost of your first call:");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call:");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("So, the cost of the first call is: " + cost1);
        System.out.println("The cost of the second call is: " + cost2);
        System.out.println("The cost of the third call is: " + cost3);
        System.out.println("The total cost of calls is: " + totalCost);


    }
}

