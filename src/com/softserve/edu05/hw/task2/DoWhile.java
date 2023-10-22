package com.softserve.edu05.hw.task2;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {//Ok
    public static void task2Edu05Hw() {

        var scan = new Scanner(System.in);
        String answer;
        double num1;
        double num2;
        double suma;

        do {
            System.out.println("Input first number: ");
            num1 = scan.nextDouble();
            System.out.println("Input second number: ");
            num2 = scan.nextDouble();
            suma = num1 + num2;
            System.out.println("Your product is: " + suma);
            System.out.println("Want to calculate more? \nYes or No? ");
            answer = scan.next().toUpperCase(Locale.ROOT);


        } while (answer.equalsIgnoreCase("yes"));


    }
}
