package com.softserve.edu06.pt.task3;

public class ColorLine extends Line {
    String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public ColorLine(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    public ColorLine(Line line, String color) {
        super(line.getStart(), line.getEnd());
        this.color = color;
    }

    @Override
    public String toString() {
        return "Line of color " + color +
                " from " + getStart() +
                " to " + getEnd() +  '}';
    }
}
