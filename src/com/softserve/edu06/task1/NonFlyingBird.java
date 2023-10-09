package com.softserve.edu06.task1;

public class NonFlyingBird extends Bird {
    NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
