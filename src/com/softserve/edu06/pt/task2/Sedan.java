package com.softserve.edu06.pt.task2;

public class Sedan extends Car {
    public Sedan(int yearOfProduction, String model, int maxSpeed) {
        super(yearOfProduction, model, maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " starts moving");
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stops moving");
    }

    @Override
    public String toString() {
        return "Sedan{ " +
                "yearOfProduction= " + getYearOfProduction() +
                ", model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}
