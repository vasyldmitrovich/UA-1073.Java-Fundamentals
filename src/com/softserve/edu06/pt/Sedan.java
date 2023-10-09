package com.softserve.edu06.pt;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    public Sedan() {
        super();
    }

    @Override
    public String toString() {
        return "Sedan" + super.toString();
    }

    @Override
    public void run() {
        System.out.println("Sedan " + getModel() + " is running!");

    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getModel() + " is stopped.");

    }
}
