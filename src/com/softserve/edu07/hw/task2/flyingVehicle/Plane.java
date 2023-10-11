package com.softserve.edu07.hw.task2.flyingVehicle;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane (int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly () {
        System.out.println("Fly plane");
    }

    @Override
    void land () {
        System.out.println("Land plane");
    }
}
