package com.softserve.edu12.pt.Task2;

import java.util.Arrays;

import com.softserve.edu12.pt.Task2.Color;
import com.softserve.edu12.pt.Task2.Type;

public class Plant {
    int size;
    Color color;
    Type type;

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public Plant(int size, String color, String type) {
        this.size = size;
        this.color = verifyColor(color.toUpperCase());
        this.type = verifyType(type);
    }

    private static Color verifyColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color + " is not valid, use one of "
                    + Arrays.toString(Color.values()));
        }
    }

    private static Type verifyType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type + " is not valid, use one of "
                    + Arrays.toString(Type.values()));
        }
    }
}