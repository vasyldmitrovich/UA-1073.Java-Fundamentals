package com.softserve.edu03.hw.Task1;

public class Form {

    //Write name of method a little more comfortable, for example public static double area(
    public double pResult(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt((p*((p - a)*(p - b)*(p - c))));
        return result;
    }
}