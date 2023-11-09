package com.softserve.edu06.pt.pt2;

public class Truck extends Car {

    private String model;
    private int maxSpeed;
    private int yearOfProduction;//you could use fields from abstract class, write this fields in each class is not good
// thank you, yeah it's simplified code))
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void run() {
        System.out.println(getModel() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " stops");
    }

    @Override
    public String toString() {
        return "Truck" +
                "  " + getModel() + ", maxSpeed " + getMaxSpeed() +
                ", yearOfProduction " + getYearOfProduction();
    }
}
