package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//середнє арифметичне
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        double number1 ;
        double number2 ;
        double number3 ;
        System.out.println("Введіть перше число");
        number1 = scan.nextDouble();
        System.out.println("Введіть друге число");
        number2 = scan.nextDouble();
        System.out.println("Введіть третє число");
        number3 = scan.nextDouble();
        double average = (number1 + number2 + number3) / 3;

        System.out.printf("Середнє арифметичне = %.3f" , average);


    }
}
