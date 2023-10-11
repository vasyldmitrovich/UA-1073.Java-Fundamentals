package com.softserve.edu07.hw.task2.groundVehicle;

import com.softserve.edu07.hw.task2.Passengers;
import com.softserve.edu07.hw.task2.Vehicle;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle (int passengers) {
        super(passengers);
    }

    abstract void drive ();
}
