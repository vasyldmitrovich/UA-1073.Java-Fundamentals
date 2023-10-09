package com.softserve.edu06.task1;

public class Eagle extends FlyingBird {

    Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle \nFeathers: " + getFeathers() + ". Can lay eggs: " + isLayEggs());
    }
}
