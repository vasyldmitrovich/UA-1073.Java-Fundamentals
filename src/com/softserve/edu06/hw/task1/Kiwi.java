package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyIngBird {

    public Kiwi() {
        super("Black and Gray", true);
    }

    @Override
    public String toString() {
        return "Hi, i`m Kiwi. I have " + getFeathers() + " feathers. I " + (canIayEggs() ? "can " : "not can") + "lay eggs";
    }
}
