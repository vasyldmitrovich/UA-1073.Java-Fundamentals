package com.softserve.edu07.hw.task2.groundVehicle;

import com.softserve.edu07.hw.task2.groundVehicle.GroundVehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle (int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed () {
        return maxSpeed;
    }

    public void setMaxSpeed (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive () {
        System.out.println("Drive motorcycle");
    }
}
