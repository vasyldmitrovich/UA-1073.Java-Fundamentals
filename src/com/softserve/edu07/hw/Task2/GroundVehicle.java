package com.softserve.edu07.hw.Task2;

abstract class GroundVehicle extends Passengers implements Vehicle {

    abstract void drive();
    public GroundVehicle(int passengers) {
        super(passengers);
    }
}
