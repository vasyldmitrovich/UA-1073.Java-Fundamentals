package com.softserve.edu06.downloadfromsoftserve.inheritance;
//slide 15
public class Square extends Point {
    private double side;

    public Square(int x, int y, double side) {
        super(x,y);
        this.side = side;
    }
    void print() {
        super.print();
        System.out.print(" " + side);
    }
}

class SquareTest{
    public static void main(String[] args) {
        Square square = new Square(74,38,26);
    }
}