package com.softserve.edu06.pt;

public class App {
    public static void main (String[] args) {//All tasks is good
        // task2
        Car[] cars = {
                new Sedan("BMW X6", 2020, 200),
                new Truck("MAN", 2015, 110),
        };

        for (Car car : cars) {
            car.run();
        }
        for (Car car : cars) {
            car.stop();
        }
        for (Car car : cars) {
            System.out.println(car);
        }

        // Task 3
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new Line(1, 2, 3, 4),
                new ColorLine(new Line(1, 2, 3, 4), "red"),
                new ColorLine(1, 2, 5, 9, "blue"),
                new ColorLine(new Point(5, 1), new Point(1, 5), "blue"),
        };

        for (Line line : lines) {
            line.print();
        }
    }
}
