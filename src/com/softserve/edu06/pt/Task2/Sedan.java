package com.softserve.edu06.pt.Task2;

public class Sedan extends Car{
    @Override
    public void run() {
        System.out.println("Sedan " + getModel() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getModel() + " stops moving");
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }

}
