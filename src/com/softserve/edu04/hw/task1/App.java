package com.softserve.edu04.hw.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            inputAndCheck();
        } catch (InputMismatchException e) {
            System.out.println("Enter data of type float!");
        }

    }//Nice

    public static void inputAndCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Input number 2: ");
        float num2 = scanner.nextFloat();
        System.out.print("Input number 3: ");
        float num3 = scanner.nextFloat();
        checkIfInRange(num1, num2, num3);//Good
    }

    public static void checkIfInRange(float num1, float num2, float num3) {
        if (num1 >= -5 && num1 <= 5
            && num2 >= -5 && num2 <= 5
            && num3 >= -5 && num3 <= 5) {
            System.out.println("Numbers are in range [-5; 5]");
        } else {
            System.out.println("Numbers are not in range [-5; 5]");
        }
    }
}
