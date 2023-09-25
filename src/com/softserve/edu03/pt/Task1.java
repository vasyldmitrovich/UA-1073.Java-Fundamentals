package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    public static double getNumber(String prompt){
        double enterNum;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(prompt);
            if(scanner.hasNextDouble()){
                enterNum = scanner.nextDouble();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return enterNum;
    }

    public void simpleUI(){//Why you do not use this UI in main method?
        double a = getNumber("Enter the first number: ");
        double b = getNumber("Enter the second number: ");

        System.out.println();

        printTotal(a, b);
        printAverage(a, b);
    }

    private void printTotal(double a, double b){
        System.out.printf("The sum of %f and %f is %f\n", a, b, getTotal(a, b));
    }

    private void printAverage(double a, double b){
        System.out.printf("The average of %f and %f is %f\n", a, b, getAverage(a, b));
    }

    public double getTotal(double a, double b){
        return a + b;
    }

    public double getAverage(double a, double b){
        return getTotal(a, b) / 2;
    }
}
