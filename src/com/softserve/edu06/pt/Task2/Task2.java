package com.softserve.edu06.pt.Task2;

public class Task2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Volkswagen", 210, 2017),
                new Truck("Cat", 160, 2015)
        };

        for (var car : cars) {
            car.run();
        }
        for (var car : cars) {
            car.stop();
        }
        for (var car : cars) {
            System.out.println(car);
        }
    }

}