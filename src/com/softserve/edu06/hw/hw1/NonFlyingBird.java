package com.softserve.edu06.hw.hw1;

public class NonFlyingBird extends Bird{

    @Override
    public String fly() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "I am NonFlyingBird and i can't fly.";
    }
}
