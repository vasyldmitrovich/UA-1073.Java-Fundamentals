package com.softserve.edu06.pt.task3;

public class Point {
     private int x;
     private int y;

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
