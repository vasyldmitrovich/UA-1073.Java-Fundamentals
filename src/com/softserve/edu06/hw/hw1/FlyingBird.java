package com.softserve.edu06.hw.hw1;

public class FlyingBird extends Bird{

    @Override
    public String fly() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "I am FlyingBird and i can fly.";
    }
}
