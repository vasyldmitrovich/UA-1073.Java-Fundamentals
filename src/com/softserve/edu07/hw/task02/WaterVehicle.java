package com.softserve.edu07.hw.task02;

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
