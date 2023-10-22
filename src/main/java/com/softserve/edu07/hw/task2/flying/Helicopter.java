package com.softserve.edu07.hw.task2.flying;

import com.softserve.edu07.hw.task2.abstract_element.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int weight, int maxWeight) {
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        System.out.printf("The helicopter can rise to a maximum height of %d meters.%n", maxWeight);
        System.out.printf("The helicopter is now at an altitude of %d meters.%n", weight);
    }

    @Override
    public void land() {
        System.out.println("The helicopter is parked on the ground.");
    }
}
