package com.softserve.edu06.pt;

public class ColorLine extends Line {
    private String color;

    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }

    public ColorLine(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }


    public ColorLine(Line line, String color){
        this(line.getStartLine(), line.getEndLine(), color);
    }

    @Override
    public String toString() {
        return "Color" + super.toString() + ", color=" + color;
    }
}
