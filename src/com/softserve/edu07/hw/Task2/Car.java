package com.softserve.edu07.hw.Task2;

public class Car extends GroundVehicle{
    public String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("Car can drive");
    }
}
