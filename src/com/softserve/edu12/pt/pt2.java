package com.softserve.edu12.pt;

public class pt2 {
    private int size;
    private Color color;
    private Type type;

    public pt2(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public void verifySize() throws SizeException {
        if (size < 1 || size > 100) {
            throw new SizeException("Invalid size. Size should be between 1 and 100.");
        }
    }

    public void verifyColorAndType() throws ColorException, TypeException {
        if (!colorIsValid(color)) {
            throw new ColorException("Invalid color.");
        }
        if (!typeIsValid(type)) {
            throw new TypeException("Invalid type.");
        }
    }

    private boolean colorIsValid(Color color) {
        for (Color validColor : Color.values()) {
            if (validColor == color) {
                return true;
            }
        }
        return false;
    }

    private boolean typeIsValid(Type type) {
        for (Type validType : Type.values()) {
            if (validType == type) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            pt2[] plants = new pt2[5];
            plants[0] = new pt2(10, Color.RED, Type.FLOWER);
            plants[1] = new pt2(20, Color.GREEN, Type.TREE);
            plants[2] = new pt2(5, Color.BLUE, Type.SHRUB);
            for (pt2 plant : plants) {
                plant.verifySize();
                plant.verifyColorAndType();
                System.out.println(plant);
            }
        } catch (SizeException | ColorException | TypeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

enum Color {
    RED, GREEN, BLUE, YELLOW
}

enum Type {
    FLOWER, TREE, SHRUB, GRASS, HERB
}

class SizeException extends Exception {
    public SizeException(String message) {
        super(message);
    }
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

