package com.softserve.edu03.pt.Task1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Computation takeNum1 = new Computation();
        int num1 = takeNum1.getNumber("First number");

        Computation takeNum2 = new Computation();
        int num2 = takeNum2.getNumber("Second number");

        Computation computation1 = new Computation();
        int sumResult = computation1.sum(num1, num2);
        System.out.println("Sum result: " + sumResult);

        Computation comutation1 = new Computation();
        int avgResult = computation1.average(num1, num2);
        System.out.println("Avg result: " + avgResult);
    }
}
