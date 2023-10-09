package com.softserve.edu06.pt.task2;

public class App {
    public static void main(String[] args) {
        Car[] cars = {new Sedan(1970,"VAZ 2107",130),
        new Truck(2015,"MAN",110)};
        for (var car: cars ) {
            car.run();
        }
        for (var car:cars) {
            car.stop();
        }
        for (var car:cars) {
            System.out.println(car);
        }
    }
}
