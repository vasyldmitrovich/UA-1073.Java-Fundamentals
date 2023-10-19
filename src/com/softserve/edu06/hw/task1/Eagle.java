package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird {
    public Eagle() {
        super("Gray", true);
    }

    @Override
    public String toString() {
        return "Hi, i`m Eagle. I have " + getFeathers() + " feathers. I "
                + (canIayEggs() ? "can " : "not can") + " lay eggs";
    }
}
