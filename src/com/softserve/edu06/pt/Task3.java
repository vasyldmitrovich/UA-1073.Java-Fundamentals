package com.softserve.edu06.pt;

public class Task3 {
    public static void task3() {
        Line[] lines = new Line[]{
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(5, 6, 7, 8, "Green"),
                new Line(4, 7, -1, -4),
                new ColorLine(new Line(1, 3, 5, 7), "Red"),
                new ColorLine(new Point(5, 4), new Point(3, 7), "Purple")
        };

        printLines(lines);

    }

    public static void printLines(Line[] lines) {//Good
        for (Line line : lines) {
            line.print();
        }
    }
}
