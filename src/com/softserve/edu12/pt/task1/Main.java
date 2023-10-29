package com.softserve.edu12.pt.task1;

import com.softserve.common_tools.CommonTools;

public class Main {
    public static void main(String[] args) {
        int a = CommonTools.readLineAndConvertToNumber("Enter the first side: ", Integer.class);
        int b = CommonTools.readLineAndConvertToNumber("Enter the second party: ", Integer.class);

        try{
            int area = rectangleArea(a, b);
            System.out.printf("Area of the rectangle is %s%n", area);
        }
        catch (IllegalArgumentException e){
            System.out.printf("An error has occurred: %s%n", e.getMessage());
        }
    }

    private static int rectangleArea(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("One of the entered parameters is negative.");
        }

        return a * b;
    }
}
