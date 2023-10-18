package com.softserve.edu06.hw.task1;

public class Penguin extends NonFlyingBird{
    public Penguin(){
        super("Black and white", true);
    }

    @Override
    public String toString(){
        return "I'm a penguin with " +
                getFeathers() +
                " feathers and I " +
                (canLayEggs() ? "can" : "can`t") +
                " lay eggs.";
    }
}
