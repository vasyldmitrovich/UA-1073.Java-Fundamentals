package com.softserve.edu12.pt.Task1;

public class squareRectangle {
    public static int rectangleArea (int a, int b) {
        if (a<0 || b <0) {
            throw new IllegalArgumentException("sides can`t be negative");
        } return a*b;
    }
}
