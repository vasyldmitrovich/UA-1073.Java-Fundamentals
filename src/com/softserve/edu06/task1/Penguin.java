package com.softserve.edu06.task1;

public class Penguin extends NonFlyingBird {

    Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin \nFeathers: " + getFeathers() + ". Can lay eggs: " + isLayEggs());
    }
}
