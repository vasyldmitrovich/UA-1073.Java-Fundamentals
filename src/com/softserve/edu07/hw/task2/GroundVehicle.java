package com.softserve.edu07.hw.task2;

abstract class GroundVehicle extends Passenger implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    abstract void drive();
}
