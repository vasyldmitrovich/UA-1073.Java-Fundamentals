package com.softserve.edu06.pt.task03;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public ColorLine(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    public ColorLine(Line line, String color) {
        super(line.getPoint1(), line.getPoint2());
        this.color = color;
    }

    @Override
    public String toString() {
        return "Line of color " + color + " from " + getPoint1() + " to " + getPoint2();
    }
}
