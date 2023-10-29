package com.softserve.edu12.pt.task2;

import com.softserve.edu12.pt.task2.exception.*;

import java.util.Arrays;

public class Plant {
    private final int size;
    private final Color color;
    private final Type type;

    public Plant(int size, String color, String type) {
        this.size = verifySize(size);
        this.color = verifyColor(color);
        this.type = verifyType(type);
    }

    private static int verifySize(int size){
        if(size <= 0){
            throw new SizeException("The size of the plant cannot take negative values.");
        }

        return size;
    }

    private static Color verifyColor(String color){
        try {
            return Color.valueOf(color.toUpperCase());
        }
        catch (IllegalArgumentException e){
            throw new ColorException("The plant color you entered is not supported. You can choose from the following colors: " +
                    Arrays.toString(Color.values()));
        }
    }

    private static Type verifyType(String type){
        try {
            return Type.valueOf(type.toUpperCase());
        }
        catch (IllegalArgumentException e){
            throw new TypeException("The plant type you entered is not supported. You can choose from the following types: " +
                    Arrays.toString(Type.values()));
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
