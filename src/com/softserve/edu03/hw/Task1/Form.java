package com.softserve.edu03.hw.Task1;

public class Form {
    public double pResult(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt((p*((p - a)*(p - b)*(p - c))));
        return result;
    }
}
