package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть три числа з похідною точкою:");
            float number1 = scanner.nextFloat();
            float number2 = scanner.nextFloat();
            float number3 = scanner.nextFloat();

            boolean allInRange = (number1 >= -5 && number1 <= 5) &&
                    (number2 >= -5 && number2 <= 5) &&
                    (number3 >= -5 && number3 <= 5);

            if (allInRange) {
                System.out.println("Усі три числа належать до діапазону [-5, 5]");
            } else {
                System.out.println("Не всі числа належать до діапазону [-5, 5]");
            }
            scanner.close();
        }
    }


