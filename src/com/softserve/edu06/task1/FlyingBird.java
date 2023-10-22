package com.softserve.edu06.task1;

public class FlyingBird extends Bird {//Ok
    FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

}
