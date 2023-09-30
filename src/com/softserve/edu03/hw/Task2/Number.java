package com.softserve.edu03.hw.Task2;

public class Number {
    private int a;
    private int b;
    private int c;
    private int min;

    //constructors
    public Number() {
        this (0,0,0, 0);
    }

    public Number(int a, int b, int c, int min) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.min = min;

    }

    //methods

    //getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
