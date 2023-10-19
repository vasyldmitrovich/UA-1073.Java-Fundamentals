package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird {
    public Swallow() {
        super("Black and White", true);
    }

    @Override
    public String toString() {
        return "Hi, i`m Swallow. I have " + getFeathers() + " feathers. I " + (canIayEggs() ? "can " : "not can") + "lay eggs";



    }
}
