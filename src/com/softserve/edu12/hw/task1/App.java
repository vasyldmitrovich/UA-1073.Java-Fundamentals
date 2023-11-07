package com.softserve.edu12.hw.task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Input first double number: ");
                double a = scanner.nextDouble();
                System.out.println("Input secong double number: ");
                double b = scanner.nextDouble();
                double res = Dividing(a, b);
                System.out.println(res);
                break;
            }catch (Exception e){
                System.out.println("The error is " + e.getMessage());
            }
        }
    }

    static double Dividing(double a, double b){
        if (a<0 || b<0){
            throw new IllegalArgumentException("Numbers cannt be negative");
        }
        return a/b;
    }
}
