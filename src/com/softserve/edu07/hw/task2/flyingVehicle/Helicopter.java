package com.softserve.edu07.hw.task2.flyingVehicle;

import com.softserve.edu07.hw.task2.flyingVehicle.FlyingVehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter (int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getMaxHeight () {
        return maxHeight;
    }

    public void setMaxHeight (int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    void fly () {
        System.out.println("Fly helicopter");
    }

    @Override
    void land () {
        System.out.println("Land helicopter");
    }
}
