package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private int weight;
    private String content;

    public HeavyBox (int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public static void main (String[] args) {
        List<HeavyBox> list = new ArrayList<>();

        list.add(new HeavyBox(12, "TVSet"));
        list.add(new HeavyBox(2, "Tablet"));
        list.add(new HeavyBox(5, "Chair"));

        for (var item : list) {
            System.out.println(item);
        }

        list.get(0).setWeight((1));
        list.remove(list.size() - 1);

        System.out.println("=".repeat(20));
        for (var item : list) {
            System.out.println(item);
        }
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public String getContent () {
        return content;
    }

    public void setContent (String content) {
        this.content = content;
    }

    @Override
    public String toString () {
        return "HeavyBox{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}
