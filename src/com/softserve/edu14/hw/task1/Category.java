package com.softserve.edu14.hw.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Category {
    PHONE("Phone"),
    COMPUTER("Computer"),
    TV("Tv");

    private String name;

    Category(String name) {
        this.name = name;
    }

    private static final List<Category> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static String randomCategory()  {
        return VALUES.get(RANDOM.nextInt(SIZE)).getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
