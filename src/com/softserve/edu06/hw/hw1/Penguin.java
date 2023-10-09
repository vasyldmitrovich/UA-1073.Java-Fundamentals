package com.softserve.edu06.hw.hw1;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        setFeathers("penguinFeathers");
        setLayEggs("can't");
    }

    @Override
    public String fly() {
        return "PENGUINS can't fly. Lets Swim with Penguins.";
    }

    @Override
    public String toString() {
        return "Penguin have " + getFeathers() + " feathers and " + getLayEggs() +
                " lay eggs.";
    }
}
