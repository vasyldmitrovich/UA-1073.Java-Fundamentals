package com.softserve.edu07.hw.task2;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public WaterVehicle() {
    }

    public abstract void isSailing();
}
