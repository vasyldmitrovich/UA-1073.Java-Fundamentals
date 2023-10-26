package com.softserve.edu07.hw.Task2;

public class Helicopter extends FlyingVehicle{
private int weight;
private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

 /*   public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }  no getters and setters on diagram, but fields are private...
    */

    @Override
    void fly() {
        System.out.println("Helicopter can fly");
    }

    @Override
    void land() {
        System.out.println("Helicopter can be on land");
    }
}
