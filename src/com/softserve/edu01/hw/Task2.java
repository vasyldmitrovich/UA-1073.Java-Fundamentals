package com.softserve.edu01.hw;

import com.softserve.common_tools.CommonTools;

public class Task2 {
    private static final int COUNT_NUM = 3;

    public void exec(){
        System.out.println("Task #2");
        int sum = calculateSum();

        try {
            double average = div(sum);
            System.out.printf("The average value is: %.4f%n", average);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n");
    }

    private int calculateSum(){
        int sum = 0;

        for(int i = 0; i < COUNT_NUM; ++i){
            try{
                sum += CommonTools.readLineAndConvertToNumber(
                        String.format("Enter number #%d: ", i + 1), Integer.class);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Try again\n");
            }
        }

        return sum;
    }

    private double div(int a){
        if(Task2.COUNT_NUM == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double)a / COUNT_NUM;
    }
}
