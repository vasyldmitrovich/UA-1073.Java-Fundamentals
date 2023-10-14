package com.softserve.edu07.hw.hw2;

class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    @Override
    void drive() {
        System.out.println("Car is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
