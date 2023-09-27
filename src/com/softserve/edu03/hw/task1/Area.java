package com.softserve.edu03.hw.task1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Обчислення площі трикутника");
        System.out.print("Введіть сторону А: ");
        double sideA = scanner.nextDouble();

        System.out.print("Введіть сторону В: ");
        double sideB = scanner.nextDouble();

        System.out.print("Введіть сторону С: ");
        double sideC = scanner.nextDouble();

        double area = calculateArea(sideA, sideB, sideC);
        if (Double.isNaN(area)) {
            System.out.println("Помилка. Площа не може бути обчислена з такими сторонами трикутника");
        } else {
            System.out.println("Площа трикутника: " + area);
        }

        scanner.close();
    }

    public static double calculateArea(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            double s = (sideA + sideB + sideC) / 2.0;

            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));// за формулою Герона.

        } else {

            return Double.NaN;
        }
    }
}

