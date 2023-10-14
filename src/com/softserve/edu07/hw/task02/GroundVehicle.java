package com.softserve.edu07.hw.task02;

abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
