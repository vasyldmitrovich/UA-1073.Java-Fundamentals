package com.softserve.edu12.pt;

import java.util.Arrays;

class Plant {
    private Type type;
    private int size;
    private Color color;

    public Plant(Type type, int size, Color color) {
        this.type = type;
        this.size = size;
        this.color = color;
        System.out.println("New plant created");
    }

    public static int verifySize(int size, Type type) {
        if (size < type.getMin()) {
            throw new PlantSizeException("Error. Size of '" + type + "' cannot be less than " + type.getMin());
        } else if (size > type.getMax()){
            throw new PlantSizeException("Error. Size of '" + type + "' cannot be bigger than " + type.getMax());
        } else {
            return size;
        }
    }

    public static Color verifyColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("'" + color +
                    "' is not valid color, please chose on of: " +
                    Arrays.toString(Color.values()));
        }
    }

    public static Type verifyType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("'" + type +
                    "' is not valid type, please chose on of: " +
                    Arrays.toString(Type.values()));
        }
    }

    public static void verifyColorAndType(String type, String color) {
        try {
            Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("'" + type +
                    "' is not valid type, please chose on of: " +
                    Arrays.toString(Type.values()));
        } try {
            Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e){
            throw new ColorException("'" + color +
                    "' is not valid color, please chose on of: " +
                    Arrays.toString(Color.values()));
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
