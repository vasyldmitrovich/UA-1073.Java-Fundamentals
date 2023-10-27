package com.softserve.edu03.hw;

import java.util.InputMismatchException;

import static com.softserve.edu03.hw.App.SCANNER;

public class MinNumber {
    private int num1;
    private int num2;
    private int num3;

    public MinNumber () {
        this(0, 0, 0);
    }

    public MinNumber (int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    /**
     * Prompts the user to input three numbers and sets them as the values of the
     * respective fields in the provided MinNumber object.
     *
     * @param obj A MinNumber object to store the input values.
     */

    public static void promptParameters (MinNumber obj) {
        System.out.println("Input the first number: ");
        obj.setNum1(getNumber());

        System.out.println("Input the second number: ");
        obj.setNum2(getNumber());

        System.out.println("Input the third number: ");
        obj.setNum3(getNumber());
    }

    private static int getNumber () {
        boolean validNumber = false;
        int num = 0;

        do {
            try {
                num = SCANNER.nextInt();
                SCANNER.nextLine();
                validNumber = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                SCANNER.nextLine();
            }
        } while (!validNumber);

        return num;
    }

    /**
     * Calculates and returns the minimum of three integers contained in the provided
     * MinNumber object.
     *
     * @param obj A MinNumber object containing three integer values.
     * @return The minimum of the three integers.
     */

    public static int getMinNumber (MinNumber obj) {
        int num1 = obj.getNum1();
        int num2 = obj.getNum2();
        int num3 = obj.getNum3();

        int min = num1;

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }
        ;

        return min;
    }

    public int getNum1 () {
        return num1;
    }

    public void setNum1 (int num1) {
        this.num1 = num1;
    }

    public int getNum2 () {
        return num2;
    }

    public void setNum2 (int num2) {
        this.num2 = num2;
    }

    public int getNum3 () {
        return num3;
    }

    public void setNum3 (int num3) {
        this.num3 = num3;
    }
}
