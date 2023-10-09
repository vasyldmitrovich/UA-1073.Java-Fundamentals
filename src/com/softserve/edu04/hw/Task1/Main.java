package com.softserve.edu04.hw.task1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double min = -5;
        double max = 5;
        int counter = 0;
        System.out.println("Input first number");
        double n1 = scanner.nextDouble();
        System.out.println("Input second number");
        double n2 = scanner.nextDouble();
        System.out.println("Input third number");
        double n3 = scanner.nextDouble();
        //Good

        if (n1>=min && n1<=max) {
            counter ++;
        }
        if (n2>=min && n2<=max) {
            counter ++;
        }
        if (n3>=min && n3<=max) {
            counter ++;
        }
        System.out.println(counter + " of this number belong to the range [-5, 5]");
    }
}
