package com.softserve.edu07.additional;

import java.text.DecimalFormat;

public class Calculator {

    public double getTotalArea(Shape shape) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(shape.getTotalArea()));
    }

    public double getTotalArea(Shape... objects) {
        double sum = 0;
        for (Shape shape : objects) {
            sum += shape.getTotalArea();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(sum));
    }

}

abstract class Shape {
    abstract double getTotalArea();
}

class Triangle extends Shape {
    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    @Override
    public double getTotalArea() {
        return getTriangleBase() * getTriangleHeight() / 2;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    @Override
    public double getTotalArea() {
        return Math.pow(getSide(), 2);
    }
}

class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public double getTotalArea() {
        return getHeight() * getWidth();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getTotalArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
