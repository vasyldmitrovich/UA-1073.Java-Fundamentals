package com.softserve.edu06.pt.task2;

public class Truck extends Car{
    public Truck(int yearOfProduction, String model, int maxSpeed) {
        super(yearOfProduction, model, maxSpeed);
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
        return "Truck{ " +
                "yearOfProduction=" + getYearOfProduction() +
                ", model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
