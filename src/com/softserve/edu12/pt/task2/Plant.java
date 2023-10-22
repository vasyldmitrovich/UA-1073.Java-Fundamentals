package com.softserve.edu12.pt.task2;

import java.util.Arrays;

public class Plant {
    private static final int MIN_SIZE = 0;
    private static final int MAX_SIZE = 100;
    private int size;
    private Color color;
    private Type type;

    public Plant (int size, String color, String type) {
        this.size = verifySize(size);
        this.color = verifyColor(color);
        this.type = verifyType(type);
    }

    private static int verifySize (int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            throw new SizeException("Size is invalid. Min size is " + MIN_SIZE + " and max size is " + MAX_SIZE);
        }

        return size;
    }

    private static Color verifyColor (String color) {

        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color + " is invalid. Use one of " + Arrays.toString((Color.values())));
        }
    }

    private static Type verifyType (String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type + " is invalid. Use one of " + Arrays.toString(Type.values()));
        }
    }

    @Override
    public String toString () {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public int getSize () {
        return size;
    }

    public void setSize (int size) {
        this.size = size;
    }

    public Color getColor () {
        return color;
    }

    public void setColor (Color color) {
        this.color = color;
    }

    public Type getType () {
        return type;
    }

    public void setType (Type type) {
        this.type = type;
    }
}
