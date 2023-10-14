package com.softserve.edu07.hw.task02;

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter fly");
    }

    @Override
    void land() {
        System.out.println("Helicopter land");
    }
}
