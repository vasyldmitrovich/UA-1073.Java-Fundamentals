package com.softserve.edu06.pt;

public class Task2 {
    public static void task2() {
        Car[] cars = new Car[]{
                new Sedan("BMW X5", 210, 2015),
                new Truck("MAN", 110, 2007),
                new Truck("KAMAZ", 130, 2011),
                new Sedan("AUDI Q5", 180, 2007),
        };

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
