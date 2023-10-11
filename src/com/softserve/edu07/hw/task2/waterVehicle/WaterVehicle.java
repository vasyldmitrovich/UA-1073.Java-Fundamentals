package com.softserve.edu07.hw.task2.waterVehicle;

import com.softserve.edu07.hw.task2.Passengers;
import com.softserve.edu07.hw.task2.Vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle (int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
