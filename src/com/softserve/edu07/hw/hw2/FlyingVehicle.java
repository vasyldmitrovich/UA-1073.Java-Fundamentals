package com.softserve.edu07.hw.hw2;

abstract class FlyingVehicle extends Passengers implements Vehicle{

    FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();
}
