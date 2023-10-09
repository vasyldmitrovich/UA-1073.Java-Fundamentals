package com.softserve.edu06.task1;

public class Kiwi extends NonFlyingBird {

    Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Kiwi \nFeathers: " + getFeathers() + ". Can lay eggs: " + isLayEggs());
    }
}
