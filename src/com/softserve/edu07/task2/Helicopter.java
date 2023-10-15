package com.softserve.edu07.task2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying...It has " + getPassengers() + " passengers");
    }

    @Override
    public void land() {
        System.out.println("Helicopter was on the height of " + maxHeight + " km");
    }

}
