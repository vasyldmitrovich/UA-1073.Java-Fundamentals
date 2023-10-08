package com.softserve.edu07.hw.task2.ground;

import com.softserve.edu07.hw.task2.abstract_element.GroundVehicle;

public class Car extends GroundVehicle {
    private String model;

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
    public void drive() {
        System.out.printf("A %s car is driving down the road.%n", model);
    }
}
