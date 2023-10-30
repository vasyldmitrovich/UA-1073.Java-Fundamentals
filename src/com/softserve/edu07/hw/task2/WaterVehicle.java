package com.softserve.edu07.hw.task2;

abstract class WaterVehicle extends Passenger implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
