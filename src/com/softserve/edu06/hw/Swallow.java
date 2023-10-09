package com.softserve.edu06.hw;

public class Swallow extends FlyingBird{
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Swallow: " + super.toString();
    }
}
