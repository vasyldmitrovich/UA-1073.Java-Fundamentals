package com.softserve.edu06.hw.hw1;

public abstract class Bird {
    private String feathers;
    private String layEggs;

    public String getFeathers() {
        return feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public abstract String fly();

}
