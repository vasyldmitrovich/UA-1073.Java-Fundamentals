package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "I`m Swallow. I have " + getFeathers() + " feathers. I " + (isLayEggs() ? "can " : "not can") + "lay eggs";



    }
}
