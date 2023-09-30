package com.softserve.edu03.hw.Task1;

public class Triangle {
    private int a;
    private int b;
    private int c;


    //constructors
    public Triangle() {
        this (0, 0, 0);
    }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //methods

    public double countP () {
        return (a + b + c) / (double) 2;
    }
    public double getAreaInSquare() {
       return countP()*((countP() - getA()) * (countP() - getB()) * (countP() - getC())) ;
    }
    public double squareRootOfResult () {
        return Math.sqrt(getAreaInSquare());
    }
    public  void printResult() {
        System.out.println("The area of the triangle is %.2f".formatted(squareRootOfResult()));
    }



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
}
