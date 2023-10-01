package com.softserve.edu05.hw;

import java.util.Arrays;

import static com.softserve.edu05.hw.App.SCANNER;

public class IntegerOperations {
    public static int[] promptIntegers (int length) {
        int[] integers = new int[length];
        System.out.println("Enter " + length + " integers");

        for (int i = 0; i < length; i++) {
            integers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }

        return integers;
    }

    public static int getSumInArray (int[] integers) {
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        return sum;
    }

    public static int getProductInArray (int[] integers) {
        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            sum *= integers[i];
        }
        return sum;
    }

    public static void performOperations (int[] integers) {
        boolean firstFivePositive = true;
        int[] newArr = Arrays.copyOfRange(integers, 0, 4);

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] < 0) {
                firstFivePositive = false;
                break;
            }
        }

        if (firstFivePositive) {
            int sum = IntegerOperations.getSumInArray(newArr);
            System.out.println("Sum of first 5 elements is " + sum);
        } else {
            int product = IntegerOperations.getProductInArray(newArr);
            System.out.println("Product of first 5 elements is " + product);
        }
    }
}
