package com.softserve.edu06.pt.pt2;

public class Truck extends Car {

    private String model;
    private int maxSpeed;
    private int yearOfProduction;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Truck" +
                "  " + getModel() + ", maxSpeed " + getMaxSpeed() +
                ", yearOfProduction " + getYearOfProduction();
    }
}
