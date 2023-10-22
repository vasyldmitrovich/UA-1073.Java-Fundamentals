package com.softserve.edu03.hw;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int calculateArea()
    {
       return (this.sideA + this.sideB + this.sideC)/2;
    }
}
