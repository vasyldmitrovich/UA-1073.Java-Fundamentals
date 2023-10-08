package com.softserve.edu07.hw.task2.ground;

import com.softserve.edu07.hw.task2.abstract_element.GroundVehicle;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.printf("The motorcycle can accelerate to its maximum speed: %d km/h.%n", maxSpeed);
    }
}
