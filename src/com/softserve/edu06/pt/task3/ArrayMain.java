package com.softserve.edu06.pt.task3;

public class ArrayMain {
    public static void main(String[] args) {
        Line[] lines = {
             new Line(new Point(1,2), new Point(3, 4 )),
                new Line(1,2,3,4),
                new ColorLine(new Line(1,2,3,4), "RED"),
                new ColorLine(new Line(1,10,3,-4), "BLUE"),

        };
        for (var line : lines){
            line.print();
        }
    }
}
