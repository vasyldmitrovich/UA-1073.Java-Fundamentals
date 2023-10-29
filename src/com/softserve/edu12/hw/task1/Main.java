package com.softserve.edu12.hw.task1;

import com.softserve.common_tools.CommonTools;

public class Main {
    public static void main(String[] args) {
        double a = CommonTools.readLineAndConvertToNumber("Enter the quotient: ", Double.class);
        double b = CommonTools.readLineAndConvertToNumber("Enter the divisor: ", Double.class);

        try{
            double result = div(a, b);
            System.out.printf("Result = %.4f%n", result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
