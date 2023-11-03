package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1Edu09Pt {
    public static void task1() {

        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(5, "TV"));
        list.add(new HeavyBox(9, "Bike"));
        list.add(new HeavyBox(1, "Package of documents"));

        int count = 0;
        for (var element : list) {
            count++;
            System.out.print(count);
            System.out.println(element);
        }
        System.out.println("-".repeat(35));

        list.get(0).setWeight(1);
        list.remove(list.size() - 1);

        int count1 = 0;
        for (var element : list) {
            count1++;
            System.out.print(count1);
            System.out.println(element);
        }
        System.out.println("-".repeat(35));
    }
}

