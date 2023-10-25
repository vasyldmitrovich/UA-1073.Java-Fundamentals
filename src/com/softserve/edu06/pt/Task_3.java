package com.softserve.edu06.pt;

public class Task_3 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new Line(1, 2, 3, 4),
                new ColorLine(new Line(1, 2, 3, 4), "RED"),
                new ColorLine(1, 10, 3, -4, "BLUE"),
                new ColorLine(new Point(11, 22), new Point(3, 4), "GREEN"),
        };

        for (var line : lines) {
            line.print();
        }

    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    private Point start;
    private Point end;

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }


    @Override
    public String toString() {
        return "Line from " + start +
                " to " + end;
    }

    public void print(){
        System.out.println(toString());
    }
}

class ColorLine extends Line {
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
        return super.toString() + " of " + color + " color";
    }
}
