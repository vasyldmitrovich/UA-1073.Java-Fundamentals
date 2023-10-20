package com.softserve.edu06.pt.Task3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
              new Line(new Point(1,2), new Point(3,4)),
                new Line(1,2,3,4),
                new ColorLine(new Line(1,2,3,4), "red"),
                new ColorLine(-1,-2,-3,5, "blue"),
                new ColorLine(1,10,-3,4, "green"),
        };
        for (var line: lines ) {
line.print();
        }
    }
}
