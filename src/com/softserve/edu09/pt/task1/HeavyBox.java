package com.softserve.edu09.pt.task1;

import java.util.ArrayList;

public class HeavyBox {

    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return ".Box " +
                "weight = " + weight + " kg." +
                " Contents box: " + contents + ".";
    }
}