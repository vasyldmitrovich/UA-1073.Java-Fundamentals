package com.softserve.edu07.hw.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public GroundVehicle() {
    }

    public abstract void drive();
}
