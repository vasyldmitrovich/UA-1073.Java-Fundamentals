package com.softserve.edu01.hw;

import com.softserve.common_tools.CommonTools;

public class Task3 {
    public void exec(){
        System.out.println("Task #3");

        double numA = CommonTools.readLineAndConvertToNumber("Enter a: ", Double.class);
        double numB = CommonTools.readLineAndConvertToNumber("Enter b: ", Double.class);

        System.out.printf("%.3f + %.3f = %.3f%n", numA, numB, numA + numB);
        System.out.printf("%.3f - %.3f = %.3f%n", numA, numB, numA - numB);
        System.out.printf("%.3f * %.3f = %.3f%n", numA, numB, numA * numB);

        try{
            System.out.printf("%.3f / %.3f = %.3f%n", numA, numB, div(numA, numB));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n");
    }

    private double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
