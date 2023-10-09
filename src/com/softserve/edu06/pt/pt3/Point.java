package com.softserve.edu06.pt.pt3;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String print() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
}
