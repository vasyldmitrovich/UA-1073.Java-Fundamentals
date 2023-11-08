package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(12, "TVset"));
        list.add(new HeavyBox(3, "Tablet"));
        list.add(new HeavyBox(5, "Chair"));
        for (var el : list) {
            System.out.println(el);
        }
        list.get(0).setWeight(1);
        list.remove(list.size() - 1);
        System.out.println("=".repeat(20));
        for (var el : list) {
            System.out.println(el);
        }
    }
}

class HeavyBox{
    private int weight;
    private String content;

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HeavyBox " +
                "weight:" + weight +
                ", content: " + content;
    }

}
