package com.softserve.edu09.pt.task1;

public class HeavyBox {
    private int weight;
    private String contets;

    public HeavyBox(int weight, String contets) {
        this.weight = weight;
        this.contets = contets;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContets() {
        return contets;
    }

    public void setContets(String contets) {
        this.contets = contets;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contets='" + contets + '\'' +
                '}';
    }
}
