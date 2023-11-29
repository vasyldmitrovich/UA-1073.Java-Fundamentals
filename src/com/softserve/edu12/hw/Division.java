package com.softserve.edu12.hw;

public class Division {

    public static void main(String[] args) {
        try {
            double dividend = Double.parseDouble(args[0]);
            double divisor = Double.parseDouble(args[1]);

            double result = div(dividend, divisor);
            System.out.println("The result of dividing " + dividend + " by " + divisor + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid double numbers");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static double div(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return dividend / divisor;
    }
}