package com.softserve.edu06.downloadfromsoftserve.castingobj;

public class Shape {
    private double side;
    private String name;

    public Shape(double side, String name) {
        this.side = side;
        this.name = name;
    }

    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        Shape shape = new Square(6.3, "NewSquare");
        System.out.println("Square area: " + shape.getArea());
       if (shape instanceof Square) {
            Square square = (Square) shape;
            System.out.println("Square area: " + square.getArea());
      }
    }
}
