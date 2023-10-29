package com.softserve.edu01.pt;

import com.softserve.common_tools.CommonTools;

public class Task1 {
    public void calculatePerimeterAndSquareFlowerBed(){
        System.out.println("Task #1");

        double radius = CommonTools.readLineAndConvertToNumber("Enter radius: ", Double.class);
        double perimeter = 2 * Math.PI * radius;
        double square = Math.PI * Math.pow(radius, 2);

        System.out.printf("Perimeter = %.4f%n", perimeter);
        System.out.printf("Square = %.4f%n", square);

        System.out.println("\n\n");
    }
}
