package com.softserve.edu04.hw.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть перше число");
        double num1 = scanner.nextDouble();
        System.out.println("Введіть друге число");
        double num2 = scanner.nextDouble();
        System.out.println("Введіть третє число");
        double num3 = scanner.nextDouble();

        //Move this logic to some method and call this method here
        if (-5 <= num1 && num1 <= 5 && -5 <= num2 && num2 <= 5 && -5 <= num3 && num3 <= 5) {
            System.out.println("Числа належать проміжку [-5, 5].");
        } else {
            System.out.println("Є число, або числа, які не належать проміжку [-5, 5].");
        }
    }

}
