package com.softserve.edu07.task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying...It has " + getPassengers() + " passengers");
    }

    @Override
    public void land() {
        System.out.println("Plane has flight " + maxDistance + " km");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
