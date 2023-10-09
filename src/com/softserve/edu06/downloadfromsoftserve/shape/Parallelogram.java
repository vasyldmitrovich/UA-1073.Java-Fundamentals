package com.softserve.edu06.downloadfromsoftserve.shape;

public class Parallelogram extends Shape {

    private int width;
    private int height;
    private int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return (width * height * Math.sin(angle * Math.PI / 180));
    }
}
