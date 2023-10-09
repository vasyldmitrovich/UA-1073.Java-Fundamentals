package com.softserve.edu06.pt.pt3;

public class Colorline extends Line{
    private String color;
    private Line line;


    public Colorline(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public Colorline(Line line, String color) {
        super(line.getPoint1(), line.getPoint2());
        this.color = color;

    }

    @Override
    public String print() {
        return this.toString();
    }

    @Override
    public String toString() {
        return super.toString() + " of " + color + " color.";
    }

}

