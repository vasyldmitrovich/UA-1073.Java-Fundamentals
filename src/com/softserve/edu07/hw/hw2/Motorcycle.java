package com.softserve.edu07.hw.hw2;

class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    void drive() {
        System.out.println("Bus is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
