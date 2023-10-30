package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox> boxList = new ArrayList<>();

        boxList.add(new HeavyBox(13,"bottles"));
        boxList.add(new HeavyBox(20,"books"));
        boxList.add(new HeavyBox(15,"salt"));

        System.out.println(boxList);

        if (!boxList.isEmpty()) {
            HeavyBox firstBox = boxList.get(0);
            firstBox.setWeight(firstBox.getWeight() + 1);
        }

        if (!boxList.isEmpty()) {
            boxList.remove(boxList.size() - 1);
        }
        System.out.println(boxList);

        boxList.clear();
        System.out.println(boxList);
    }
}
