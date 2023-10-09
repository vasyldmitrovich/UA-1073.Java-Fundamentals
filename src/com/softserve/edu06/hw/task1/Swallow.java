package com.softserve.edu06.hw.task1;

public class Swallow extends FlyingBird{
    public Swallow() {
        super("Blue", true);
    }

    @Override
    public String toString(){
        return "I'm a shadow with " +
                getFeathers() +
                " feathers and I " +
                (canLayEggs() ? "can" : "can`t") +
                " lay eggs.";
    }
}
