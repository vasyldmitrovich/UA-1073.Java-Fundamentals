package com.softserve.edu06.hw.Task1;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly.");
    }
}
