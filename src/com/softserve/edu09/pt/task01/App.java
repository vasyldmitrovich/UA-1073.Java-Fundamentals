package com.softserve.edu09.pt.task01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(24, "LCD TV"));
        list.add(new HeavyBox(18, "Microwave owen"));
        list.add(new HeavyBox(98, "Fridge"));
        list.add(new HeavyBox(6, "Hair dryer"));
        list.add(new HeavyBox(48, "Washing machine"));
        printAllHeavyBoxList(list);
        printDelimiterMessage("Setting weight of the first element to 1, removing the last element");
        list.get(0).setWeight(1);
        list.remove(list.size() - 1);
        printAllHeavyBoxList(list);
        printDelimiterMessage("Removing all boxes in the list");
        list.clear();
        printAllHeavyBoxList(list);
    }

    public static void printAllHeavyBoxList(List<HeavyBox> list) {
        if (list.isEmpty()) {
            System.out.println("This list is empty");
            return;
        }
        for (HeavyBox element : list) {
            System.out.println(element);
        }
    }

    public static void printDelimiterMessage (String message) {
        System.out.println("=".repeat(message.length()));
        System.out.println(message);
        System.out.println("=".repeat(message.length()));
    }
}
