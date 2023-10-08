package com.softserve.edu03.hw.hw2;
//done
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Number: ");
        double a = scanner.nextDouble();
        System.out.println("Input Second Number: ");
        double b = scanner.nextDouble();
        System.out.println("Input Thhird Number: ");
        double c = scanner.nextDouble();
        double min = a;

        System.out.println("The smallest number is: " + getSmallestNumber(a, b, c, min));
    }

    private static double getSmallestNumber(double a, double b, double c, double min){
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        return a;
    }

}

