package com.softserve.edu06.downloadfromsoftserve.inheritance;
//slide 27
public class Cylinder extends Circle {

    private double height;
    // Constructors
    public Cylinder() {
        super();  // invoke superclass' constructor Circle()
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        // invoke superclass' constructor Circle(radius)
        super(radius);
        this.height = height;
    }
    // Return the volume of this Cylinder
    public double getVolume() {
        // Use Circle's getArea()
        return getArea() * height;
    }
    // Describe itself
    public String toString() {
        return "This is a Cylinder";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
