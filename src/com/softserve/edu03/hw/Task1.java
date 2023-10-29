package com.softserve.edu03.hw;

import com.softserve.common_tools.CommonTools;

public class Task1 {
    private double a;
    private double b;
    private double c;

    public static Task1 createTriangle(){
        double a = CommonTools.readLineAndConvertToNumber("Input Side a: ", Double.class);
        double b = CommonTools.readLineAndConvertToNumber("Input Side b: ", Double.class);
        double c = CommonTools.readLineAndConvertToNumber("Input Side c: ", Double.class);

        return new Task1(a, b, c);
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
