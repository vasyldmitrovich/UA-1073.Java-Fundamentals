package com.softserve.edu06.pt.task02;

public class App {
    public static void main(String[] args) {
        Car[] cars = {
                new Sedan("Toyota Avensis", 180, 2005),
                new Sedan("Mersedes C200", 220, 2008),
                new Truck("MAN TGA", 140, 2004),
                new Truck("DAF XF", 130, 2006)
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
