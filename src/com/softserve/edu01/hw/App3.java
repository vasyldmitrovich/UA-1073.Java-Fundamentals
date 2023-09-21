package com.softserve.edu01.hw;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть вартість хвилини першого дзвінка: ");
        double c1 = scanner.nextDouble();

        System.out.print("Введіть вартість хвилини другого дзвінка: ");
        double c2 = scanner.nextDouble();

        System.out.print("Введіть вартість хвилини третього дзвінка: ");
        double c3 = scanner.nextDouble();

        System.out.print("Введіть тривалість першого дзвінка: ");
        double t1 = scanner.nextDouble();

        System.out.print("Введіть тривалість другого дзвінка: ");
        double t2 = scanner.nextDouble();

        System.out.print("Введіть тривалість третього дзвінка: ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double TotalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of the first call: $" + cost1);
        System.out.println("Cost of the second call: $" + cost2);
        System.out.println("Cost of the third call: $" + cost3);
        System.out.println("Total cost of all calls: $" + TotalCost);


    }
}
