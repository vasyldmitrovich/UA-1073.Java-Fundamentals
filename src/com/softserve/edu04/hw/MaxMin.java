package com.softserve.edu04.hw;

import java.util.Scanner;

import static com.softserve.edu04.hw.App.SCANNER;

public class MaxMin {
    int num1;
    int num2;
    int num3;

    public int getMax() {
        int max = Math.max(num1, num2);

        return Math.max(max, num3);
    }

    public int getMin() {
        int min = Math.min(num1, num2);

        return Math.min(min, num3);
    }

    public void checkMaxMin () {
        int max= this.getMax();
        int min = this.getMin();
        System.out.println("The min value is " + min);
        System.out.println("The max value is " + max);
    }

    public static void promptParameters(MaxMin maxMin) {
        System.out.println("Print first number");

        int num1 = SCANNER.nextInt();
        maxMin.setNum1(num1);
        SCANNER.nextLine();

        System.out.println("Print second number");

        int num2 = SCANNER.nextInt();
        maxMin.setNum2(num2);
        SCANNER.nextLine();

        System.out.println("Print third number");
        int num3 = SCANNER.nextInt();
        maxMin.setNum3(num3);
        SCANNER.nextLine();
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
