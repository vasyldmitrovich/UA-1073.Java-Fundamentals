package com.softserve.edu06.downloadfromsoftserve.castingobj;

public class Square extends Shape {
    private double side;

    public Square(double side, String name) {
        super(side, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public static void main(String[] args) {
        Square square = new Square(6.3, "NewSquare");
        System.out.println("Square area: " + square.getArea());
        Shape shape = (Shape) square;
        System.out.println("Shape area: " + shape.getArea());
    }
}