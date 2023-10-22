package com.softserve.edu06.hw.task1;

public class Kiwi extends NonFlyingBird{
    public Kiwi(){
        super("Brown", true);
    }

    @Override
    public String toString(){
        return "I'm a kiwi with " +
                getFeathers() +
                " feathers and I " +
                (canLayEggs() ? "can" : "can`t") +
                " lay eggs.";
    }
}
