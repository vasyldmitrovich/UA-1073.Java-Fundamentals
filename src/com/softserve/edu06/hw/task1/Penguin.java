package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyIngBird {
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }


    @Override
    public String toString() {
        return "I`m Penguin. I have " + getFeathers() + " feathers. I " + (isLayEggs() ? "can " : "not can") + "lay eggs";
    }
}
