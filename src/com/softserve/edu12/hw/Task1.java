package com.softserve.edu12.hw;

import java.awt.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String [] args){
        var scanner =  new Scanner(System.in);
        System.out.println("Input divided a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Input divisor b:");
        double b = Double.parseDouble(scanner.nextLine());
        double share = div(a, b);
        System.out.printf("Division of two numbers is" + share);
    }

    static double div(double a, double b) {
       if (b == 0) {
           throw new IllegalArgumentException(
                   "divisor b should not be null");
       }
       return a/b;
    }
}
