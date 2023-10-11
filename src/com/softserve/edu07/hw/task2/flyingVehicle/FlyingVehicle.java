package com.softserve.edu07.hw.task2.flyingVehicle;

import com.softserve.edu07.hw.task2.Passengers;
import com.softserve.edu07.hw.task2.*;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle (int passengers) {
        super(passengers);
    }

    abstract void fly();
    abstract void land();
}
