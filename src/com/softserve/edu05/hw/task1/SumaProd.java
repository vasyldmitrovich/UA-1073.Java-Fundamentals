package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class SumaProd {//Good
    public static void task1_2Edu05Hw() {

        var scan = new Scanner(System.in);

        int[] number = new int[10];
        System.out.println("Input 10 pozitive integers : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("Resultat is: " + resultat(number));
    }

    public static int resultat(int[] arr) {
        boolean integerPositive = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                //kon
            } else {
                integerPositive = false;
                break;
            }
        }
        int result = 0;
        if (integerPositive) {
            for (int i = 0; i < 5; i++) {
                result += arr[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < arr.length; i++) {
                result *= arr[i];
            }
        }

        return result;
    }
}