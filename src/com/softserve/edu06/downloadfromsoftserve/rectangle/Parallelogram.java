package com.softserve.edu06.downloadfromsoftserve.rectangle;

class Parallelogram extends Rectangle{

    private int angle;

    // add annotation here
    @Override
    public int getArea() {
        return (int) (width * height * Math.sin(angle * Math.PI / 180));
    }
    // getters and setters

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
