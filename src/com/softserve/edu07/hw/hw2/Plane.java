package com.softserve.edu07.hw.hw2;

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    @Override
    void fly() {
        System.out.println("Plane fly's");
    }

    @Override
    void land() {
        System.out.println("Plane start landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
