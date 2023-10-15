package com.softserve.edu07.task2;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving and has " + getPassengers()
                + " passengers on board and max speed of " + maxSpeed + " km/h");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
