package com.softserve.edu06.pt.task2;

public class Truck extends Car {
    public Truck (String model, int yearOfProduction, int maxSpeed) {
        super(model, yearOfProduction, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Truck" + getModel() + "Starts moving");
    }

    @Override
    void stop() {
        System.out.println("Sedan" + getModel() + " Stops");


    }
}
