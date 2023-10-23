package com.softserve.edu06.hw;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayInfo() {
        System.out.println("Feathers: " + feathers);
        System.out.println("Lays Eggs: " + layEggs);
    }
}