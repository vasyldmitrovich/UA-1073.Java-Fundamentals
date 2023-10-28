package com.softserve.edu12.pt.task02;

import java.util.ArrayList;
import java.util.Arrays;

public class Plant {
    Type type;
    Color color;
    int size;

    public Plant(String type, String color, int size) {
        this.type = verifyType(type);
        this.color = verifyColor(color);
        this.size = verifySize(size, this.type);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    private static Color verifyColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color + " is mot a valid color, please choose from " + Arrays.toString(Color.values()));
        }
    }

    private static Type verifyType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type + " is mot a valid type, please choose from " + Arrays.toString(Type.values()));
        }
    }

    private static int verifySize(int size, Type type) {
        if ((type == Type.GRASS && size > 0 && size < 100) ||
                (type == Type.BRUSH && size > 30 && size < 150) ||
                (type == Type.TREE && size > 50 && size < 10000)) {
            return size;
        } else {
            throw new SizeException(type + " size can't be " + size + " cm!");
        }

    }
}

enum Color {
    GREEN, RED, BROWN
}

enum Type {
    BRUSH, GRASS, TREE
}

class ColorException extends RuntimeException {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends RuntimeException {
    public TypeException(String message) {
        super(message);
    }
}

class SizeException extends RuntimeException {
    public SizeException(String message) {
        super(message);
    }
}
