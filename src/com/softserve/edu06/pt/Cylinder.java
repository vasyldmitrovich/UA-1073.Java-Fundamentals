package com.softserve.edu06.pt;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {        // Use Circle's getArea()
        return getArea() * height;
    }

    public String toString() {
        return "This is a Cylinder";
    }
}




