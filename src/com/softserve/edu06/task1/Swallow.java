package com.softserve.edu06.task1;

public class Swallow extends FlyingBird {

    Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Swallow \nFeathers: " + getFeathers() + ". Can lay eggs: " + isLayEggs());
    }
}
