package com.softserve.edu03.hw.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        System.out.println("Input first number ");
        number.setA(scanner.nextInt());
        System.out.println("Input second number ");
        number.setB(scanner.nextInt());
        System.out.println("Input third number ");
        number.setC(scanner.nextInt());
        if (number.getA()<number.getB()) {
            number.setMin(number.getA());
        } if (number.getB()<number.getA()) {
            number.setMin(number.getB());
        } if (number.getC()<number.getB()) {
            number.setMin(number.getC());
        }
        System.out.println("The smallest number is " + number.getMin());
    }
}
