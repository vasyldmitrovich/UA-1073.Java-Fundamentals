package com.softserve.edu06.pt.task02;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }
    @Override
    void run() {
        System.out.println("Truck " + getModel() + " starts moving");
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " stops moving");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
