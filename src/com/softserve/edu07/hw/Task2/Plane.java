package com.softserve.edu07.hw.Task2;

public class Plane extends FlyingVehicle{
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
    void fly() {
        System.out.println("Plane can fly");
    }

    @Override
    void land() {
        System.out.println("Plane can be on land");
    }
}
