package com.softserve.edu06.hw;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Птаха яка вміє літати.");
    }
}

