package com.softserve.edu04.hw;

import java.util.InputMismatchException;

import static com.softserve.edu04.hw.App.SCANNER;

public class MaxMin {
    int num1;
    int num2;
    int num3;

    public static void promptParameters (MaxMin maxMin) {
        System.out.println("Print first number");

        int num1 = getInt();
        maxMin.setNum1(num1);

        System.out.println("Print second number");

        int num2 = getInt();
        maxMin.setNum2(num2);

        System.out.println("Print third number");
        int num3 = getInt();
        maxMin.setNum3(num3);

    }

    public static int getInt () {
        boolean isValid = false;
        int res = 0;

        do {
            try {
                res = SCANNER.nextInt();
                SCANNER.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                SCANNER.nextLine();
            }
        } while (!isValid);

        return res;
    }

    public int getMax () {
        int max = Math.max(num1, num2);

        return Math.max(max, num3);
    }

    public int getMin () {
        int min = Math.min(num1, num2);

        return Math.min(min, num3);
    }

    public void checkMaxMin () {
        int max = this.getMax();
        int min = this.getMin();
        System.out.println("The min value is " + min);
        System.out.println("The max value is " + max);
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
