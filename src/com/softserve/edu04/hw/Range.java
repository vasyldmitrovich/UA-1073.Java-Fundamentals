package com.softserve.edu04.hw;

import java.util.InputMismatchException;

import static com.softserve.edu04.hw.App.SCANNER;

public class Range {
    private float num1;
    private float num2;
    private float num3;

    public static boolean checkIsInRange (float num, float min, float max) {
        return num <= max && num >= min;
    }

    public static void promptParameters (Range range) {
        try {
            System.out.println("Print first float number");

            float num1 = SCANNER.nextFloat();
            range.setNum1(num1);
            SCANNER.nextLine();

            System.out.println("Print second float number");

            float num2 = SCANNER.nextFloat();
            range.setNum2(num2);
            SCANNER.nextLine();


            System.out.println("Print third float number");

            float num3 = SCANNER.nextFloat();
            range.setNum3(num3);
            SCANNER.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void checkNumbers () {
        float min = -5;
        float max = 5;
        boolean isFirstInRange = Range.checkIsInRange(this.getNum1(), min, max);
        boolean isSecondInRange = Range.checkIsInRange(this.getNum2(), min, max);
        boolean isThirdInRange = Range.checkIsInRange(this.getNum3(), min, max);

        System.out.println("First number " + (isFirstInRange ? "is" : "isn't") + " in range");
        System.out.println("Second number " + (isSecondInRange ? "is" : "isn't") + " in range");
        System.out.println("Third number " + (isThirdInRange ? "is" : "isn't") + " in range");
    }

    public float getNum1 () {
        return num1;
    }

    public void setNum1 (float num1) {
        this.num1 = num1;
    }

    public float getNum2 () {
        return num2;
    }

    public void setNum2 (float num2) {
        this.num2 = num2;
    }

    public float getNum3 () {
        return num3;
    }

    public void setNum3 (float num3) {
        this.num3 = num3;
    }
}
