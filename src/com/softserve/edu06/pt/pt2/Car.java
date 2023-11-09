package com.softserve.edu06.pt.pt2;

public abstract class Car {

    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    //If you will be using this fields add getters and setters
    //accepted, thank you


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

    public abstract void run();

    public abstract void stop();

}
