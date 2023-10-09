package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird{

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Penguin: " + super.toString();
    }
}
