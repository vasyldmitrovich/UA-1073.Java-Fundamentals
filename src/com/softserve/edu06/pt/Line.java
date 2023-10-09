package com.softserve.edu06.pt;

public class Line {
    private Point startLine;
    private Point endLine;

    public Line(Point startLine, Point endLine) {
        this.startLine = startLine;
        this.endLine = endLine;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public String toString() {
        return "Line: " +
                "a=" + startLine +
                ", b=" + endLine;
    }

    public void print() {
        System.out.println(this);
    }

    public Point getStartLine() {
        return startLine;
    }

    public void setStartLine(Point startLine) {
        this.startLine = startLine;
    }

    public Point getEndLine() {
        return endLine;
    }

    public void setEndLine(Point endLine) {
        this.endLine = endLine;
    }
}
