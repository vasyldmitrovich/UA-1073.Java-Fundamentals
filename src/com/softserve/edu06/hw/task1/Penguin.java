package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyIngBird {
    public Penguin() {
        super("Black and White", true);
    }


    @Override
    public String toString() {
        return "Hi, i`m Penguin. I have " + getFeathers() + " feathers. I " + (canIayEggs() ? "can " : "not can") + "lay eggs";
    }
}
