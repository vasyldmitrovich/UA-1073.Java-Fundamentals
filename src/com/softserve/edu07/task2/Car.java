package com.softserve.edu07.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car of model " + model + " is driving... " );
    }
}
