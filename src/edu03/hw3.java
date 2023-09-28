package edu03;

import java.util.Scanner;
public class hw3 {
    public static double area;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ведіть три значення ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        area = calculate(x1, x2 ,x3);
        System.out.println("Площа трикутника дорівнює " +area);
    }
    public static double calculate (double x1, double x2, double x3){
        double x = (x1+x2+x3)/2;
        area = Math.sqrt(x * (x - x1) * (x - x2) * (x - x3));
        return area;

    }
}