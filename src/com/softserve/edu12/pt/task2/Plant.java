package com.softserve.edu12.pt.task2;

import java.util.Arrays;

public class Plant {
    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 120;
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = validateSize(size);
        this.color = validateColor(color);
        this.type = validateType(type);
    }

    @Override
    public String toString() {
        return "Plant: " +
                "size=" + size +
                ", color=" + color +
                ", type=" + type;
    }

    private Color validateColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Color " + color + " is not valid. " +
                    "Try one of these: " + Arrays.toString(Color.values()));
        }
    }

    private Type validateType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Type " + type + " is not valid. " +
                    "Try one of these: " + Arrays.toString(Type.values()));
        }
    }

    private int validateSize(int size) {
        if (size <= MIN_SIZE) {
            throw new IllegalArgumentException("Plant size is too small.");
        } else if (size >= MAX_SIZE) {
            throw new IllegalArgumentException("Plant size is too large");
        }
        return size;
    }
}
