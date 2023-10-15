package com.softserve.edu06.pt.task3;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.end = end;
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public Point getStart() {
        return start;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public String toString() {
        return "Line from {" + start +
                " to " + end +  '}';
    }

    public void print(){
        System.out.println(toString());
    }

}
