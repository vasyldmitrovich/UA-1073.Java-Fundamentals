package com.softserve.edu07.hw.task2;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
