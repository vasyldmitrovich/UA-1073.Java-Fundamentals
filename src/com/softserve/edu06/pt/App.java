package com.softserve.edu06.pt;

import com.softserve.edu06.pt.pt2.Car;
import com.softserve.edu06.pt.pt2.Sedan;
import com.softserve.edu06.pt.pt2.Truck;
import com.softserve.edu06.pt.pt3.Colorline;
import com.softserve.edu06.pt.pt3.Line;
import com.softserve.edu06.pt.pt3.Point;

class App {

    static void pt2() {
        Truck firstTruck = new Truck("MAN", 140, 2018);
        Car[] cars = {
                new Sedan(),
                firstTruck,
                new Sedan("Audi", 240, 2023),
                new Sedan("Nissan", 180, 2021),
                new Truck("Mercedes", 130, 2012)
        };
        ((Sedan) cars[0]).setModel("Hyndai");
        ((Sedan) cars[0]).setMaxSpeed(120);
        ((Sedan) cars[0]).setYearOfProduction(2022);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(" ----------------------------------------- ");
        for (Car car : cars) {
            car.run();
        }

        System.out.println(" ----------------------------------------- ");
        for (var car : cars) {
            car.stop();
        }
    }

    static void pt3() {
        Point point1 = new Point(41, 6);
        Point point2 = new Point(45,10);

        Line firstLine = new Line(new Point(1,50), new Point(45, 35));
        Line[] myLines = {
                new Line(point1,point2),
                firstLine,
                new Line(point2, new Point(3,4)),
                new Colorline(firstLine, "black"),
                new Colorline(point1, new Point(8, 18), "yellow")
        };
        for (Line lines : myLines) {
            System.out.println(lines.print()); // here is requested method
        }
    }

    public static void main(String[] args) {

        // Pt 1 - in package   src/com/softserve/edu06/pt/pt1

        // Pt 2 - Cars. Was too much code for main? so i encapsulate is static method in this class

        pt2();

        // Pt 3 - Lines. Was too much code for main? so i encapsulate is static method in this class

        pt3();


    }
}
