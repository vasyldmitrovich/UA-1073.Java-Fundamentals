package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    private double a;
    private double b;
    private double c;

    public static Task1 createTriangle(){
        double a = getNumber("Input Side a: ");
        double b = getNumber("Input Side b: ");
        double c = getNumber("Input Side c: ");

        return new Task1(a, b, c);
    }

    private static double getNumber(String prompt){
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

    private Task1(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        double p = halfMeter();

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    private double halfMeter(){
        return (a + b + c) / 2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
