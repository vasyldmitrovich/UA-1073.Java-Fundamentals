package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class FindInteger {
    public static int[] promptIntegers (int length) {
        int[] integers = new int[length];
        System.out.println("Enter " + length + " integers");

        for (int i = 0; i < length; i++) {
            integers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }

        return integers;
    }

    public static void findSecondPositive (int[] integers) {
        int positiveNum = 0;
        int position = -1;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > 0) {
                positiveNum++;

                if (positiveNum == 2) {
                    position = i;
                    break;
                }
            }
        }

        System.out.println("Position of second positive integer is " + position);
    }

    public static void findMinimumValue (int[] integers) {
        int minimumValue = integers[0];
        int position = -1;

        for (int i = 1; i < integers.length; i++) {
            if (integers[i] < minimumValue) {
                minimumValue = integers[i];
                position = i;
            }
        }
        System.out.println("Minimum value is " + minimumValue);
        System.out.println("Minimum value position is " + position);
    }

    public static void findProductOfEven (int[] integers) {
        int product = 0;

        for (int i = 1; i < integers.length; i++) {
            if (integers[i] % 2 == 0 && integers[i] > 0) {
                product *= integers[i];
            }
        }
        System.out.println("Product of all even elements is " + product);
    }

}
