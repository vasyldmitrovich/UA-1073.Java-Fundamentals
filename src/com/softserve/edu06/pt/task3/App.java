package com.softserve.edu06.pt.task3;

public class App {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1,2), new Point(3,4)),
                new Line(1,2,3,4),
                new ColorLine(new Line(1,2,3,4),"Blue"),
                new ColorLine(new Line(3,4,12,2),"Red"),
                new ColorLine(new Point(1,2), new Point(3,4),"Red")
        };
        for (var line:lines) {
            line.print();
        }
    }
}
