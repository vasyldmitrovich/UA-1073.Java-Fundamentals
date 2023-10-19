package com.softserve.edu06.pt.task3;

public class Line {
    private Point point1;
    private Point point2;

    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public String print() {
        return this.toString();
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    @Override
    public String toString() {
        return "Line (" + getPoint1() + ", " + getPoint2() + ")";
    }
}
