package com.softserve.edu07.hw.task2.flying;

import com.softserve.edu07.hw.task2.abstract_element.FlyingVehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.printf("The aircraft is in the air and can cover a maximum distance of %d km.%n", maxDistance);
    }

    @Override
    public void land() {
        System.out.println("The aircraft is located at the airfield.");
    }
}
