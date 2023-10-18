package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(15, "Test1"));
        boxes.add(new HeavyBox(23, "Kyiv"));
        boxes.add(new HeavyBox(10, "IT"));
        boxes.add(new HeavyBox(2, "London"));

        printElements(boxes, "Create elements");

        boxes.get(0).setWeight(1);
        printElements(boxes, "Change the weight of the first box by 1. ");

        boxes.remove(boxes.size() - 1);
        printElements(boxes, "Remove the last box. ");

        boxes.clear();
    }

    private static void printElements(List<HeavyBox> list, String message){
        System.out.println(message);
        for (var box : list) {
            System.out.println(box);
        }
        System.out.println();
    }
}
