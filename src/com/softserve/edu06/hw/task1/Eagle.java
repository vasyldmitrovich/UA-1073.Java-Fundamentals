package com.softserve.edu06.hw.task1;

public class Eagle extends FlyingBird{
    public Eagle(){
        super("Golden", true);
    }

    @Override
    public String toString(){
        return "I'm an eagle with " +
                getFeathers() +
                " feathers and I " +
                (canLayEggs() ? "can" : "can`t") +
                " lay eggs.";
    }
}
