package com.softserve.edu06.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan ("BMW X5", 220, 2019),
                new Truck ("MAN", 160, 2014)
        };
        for (var car: cars ) {
            car.run();
        }
        for (var car: cars ) {
            car.stop();
        }
        for (var car: cars ) {
            System.out.println(car);
        }
    }
}
