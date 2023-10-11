package com.softserve.edu07.hw.task2.groundVehicle;

import com.softserve.edu07.hw.task2.groundVehicle.GroundVehicle;

public class Car extends GroundVehicle {
    private String model;

    public Car (int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    @Override
    void drive () {
        System.out.println("Drive car");
    }
}
