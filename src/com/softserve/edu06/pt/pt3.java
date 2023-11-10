package com.softserve.edu06.pt;

class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println(toString());
    }
}

class Line {
    protected Point point1;
    protected Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line[" + point1 + ", " + point2 + "]";
    }

    public void print() {
        System.out.println(toString());
    }
}

class ColorLine extends Line {
    protected String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine[" + point1 + ", " + point2 + ", Color: " + color + "]";
    }

    public void print() {
        System.out.println(toString());
    }
}

public class pt3 {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(1, 2), new Point(3, 4));
        lines[1] = new ColorLine(new Point(5, 6), new Point(7, 8), "Red");
        lines[2] = new ColorLine(new Point(9, 10), new Point(11, 12), "Blue");

        for (Line line : lines) {
            line.print();
        }
    }
}
