package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class FiveNumber {
    public static void task1_3Edu05Hw () {
        var scan = new Scanner(System.in);
        int[] number = new int[5];

        System.out.println("Input five numbers");
        for (int i = 0; i < 5; i++) {
            number[i] = scan.nextInt();
        }

        int secPositIndex = -1;
        int minNumber = number[0];
        int minIndex = 0;
        int prodOfEven = 1;

        for(int i = 0; i < 5; i++) {
            if (number[i] > 0) {
                if (secPositIndex == -1) {
                    secPositIndex = number[i] + 1;
                }
            }

            if (number[i] < minNumber) {
                minNumber = number[i];
                minIndex = i + 1;
            }
            if (number[i] % 2 == 0 && number[i] !=0) {
                prodOfEven *= number[i];
            }
        }
        System.out.println("Position of the second positive number: " + secPositIndex);
        System.out.println("Minimum value: " + minNumber + ", position: " + minIndex);
        System.out.println("Product of even numbers : " + prodOfEven);
    }
}
