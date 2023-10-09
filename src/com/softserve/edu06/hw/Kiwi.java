package com.softserve.edu06.hw;

public class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi: " + super.toString();
    }
}
