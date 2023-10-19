package com.softserve.edu06.pt.task3;

import java.util.ArrayList;

public class Task3Edu06Pt {
    public static void task3Edu06Pt(){

        Point point1 = new Point(8, 16);
        Point point2 = new Point(22,30);

        Line lineOne = new Line(new Point(5,33), new Point(13, 48));
        Line[] myLines = {
                new Line(point1,point2),
                lineOne,
                new Line(point2, new Point(7,11)),
                new Colorline(lineOne, "Red"),
                new Colorline(point1, new Point(35, 78), "White")
        };
        for (Line lines : myLines) {
            System.out.println(lines.print());
        }











    }
}
