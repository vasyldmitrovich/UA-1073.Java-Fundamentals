package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine (int x0, int y0, int x1, int y1, String color) {
        super(x0, y0, x1, y1);
        this.color = color;
    }

    public ColorLine (Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public ColorLine(Line line, String color ) {
        super(line.getStart(), line.getEnd());
        this.color = color;
    }

    @Override
    public String toString () {
        return super.toString() + " of " + color + " color";
    }
}
