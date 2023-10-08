package com.softserve.edu06.pt.task03;

public class App {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(3, 4), new Point(6, 8)),
                new Line(2, 6, 8, 10),
                new ColorLine(new Point(3, 7), new Point(2, 8), "red"),
                new ColorLine(5, 6, 3, 4, "green"),
                new ColorLine(new Line(3,5,6,2), "yellow")
        };
        for (var line : lines) {
            line.print();
        }
    }
}
