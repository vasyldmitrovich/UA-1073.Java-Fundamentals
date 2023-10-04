package com.softserve.edu06.hw.task1;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public boolean canLayEggs() {
        return layEggs;
    }
}
