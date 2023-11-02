package com.softserve.edu09.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(12, "TV"));
        list.add(new HeavyBox(25, "Tablet"));
        list.add(new HeavyBox(5, "Chair"));

        for (var x: list) {
            System.out.println(x);
        }

        list.get(0).setWeight(1);
        list.remove(list.size()-1);
        System.out.println("-".repeat(40));

        for (var x: list) {
            System.out.println(x);
        }

    }
}
