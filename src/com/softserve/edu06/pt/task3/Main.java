package com.softserve.edu06.pt.task3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(5, -7), new Point(4, 9)),
                new ColorLine(new Point(15, 6), new Point(7, 5), "green"),
                new Line(new Point(7, -7), new Point(6, -2)),
                new Line(new Point(6, 3), new Point(4, 4)),
                new ColorLine(new Point(5, 9), new Point(5, 3), "red")
        };

        printLinesInfo(lines);
    }

    private static void printLinesInfo(Line[] lines){
        System.out.println("Information about the lines: ");
        for (Line line : lines){
            line.print();
        }
    }
}
