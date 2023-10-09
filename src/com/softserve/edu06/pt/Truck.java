package com.softserve.edu06.pt;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public Truck() {
        super();
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }

    @Override
    public void run() {
        System.out.println("Truck " + getModel() + " is running!");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + getModel() + " is stopped.");
    }
}
