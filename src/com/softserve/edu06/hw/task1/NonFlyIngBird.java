package com.softserve.edu06.hw.task1;

public class NonFlyIngBird extends Bird {
    public NonFlyIngBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(" do not can fly");
    }
}
