package com.softserve.edu06.pt.Task2;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Track " + getModel() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println("Track " + getModel() + " stops moving");
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
