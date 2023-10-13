package com.softserve.edu07.hw.Task2;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    abstract void fly();
    abstract void land();

    public FlyingVehicle(int passengers) {
        super(passengers);
    }
}
