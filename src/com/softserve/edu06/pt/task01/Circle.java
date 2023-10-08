package com.softserve.edu06.pt.task01;

public class Circle {
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and Setters
    // Return the area of this Circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

