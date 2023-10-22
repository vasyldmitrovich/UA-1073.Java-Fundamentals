package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(3, "content1"));
        list.add(new HeavyBox(5, "content2"));
        list.add(new HeavyBox(7, "content3"));
        list.add(new HeavyBox(9, "content4"));
        list.add(new HeavyBox(11, "content5"));

        System.out.println("List before changes:");
        printHeavyBoxList(list);

        list.get(0).setWeight(1);
        list.remove(list.size() - 1);

        System.out.println("\nList after changes:");
        printHeavyBoxList(list);

        list.clear();

        System.out.println("\nList after removing all boxes:");
        printHeavyBoxList(list);
    }

    public static void printHeavyBoxList(List<HeavyBox> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (var item : list) {
                System.out.println(item);
            }
        }
    }
}
