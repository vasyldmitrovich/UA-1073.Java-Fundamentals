package com.softserve.edu06.hw.task1;

public abstract class Bird {
    private boolean layEggs;
    private String feathers;

    public Bird (boolean layEggs, String feathers) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

    public abstract void fly();

    public boolean isLayingEggs () {
        return layEggs;
    }

    public void setLayEggs (boolean layEggs) {
        this.layEggs = layEggs;
    }

    public String getFeathers () {
        return feathers;
    }

    public void setFeathers (String feathers) {
        this.feathers = feathers;
    }

    @Override
    public String toString () {
        return "I'm a bird, I " +
                (isLayingEggs() ? "can" : "can't") + " lay eggs, I have " + getFeathers();
    }
}
