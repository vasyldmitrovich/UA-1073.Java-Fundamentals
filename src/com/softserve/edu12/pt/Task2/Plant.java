package com.softserve.edu12.pt.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    static Scanner SCANNER = new Scanner(System.in);

    private int size;
    private Color color;
    private Type type;

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
        this.color = verifyColor(color);
        this.type = verifyType(type);
    }

    public static Plant promptPlant() {
        while (true) {
            try {
                System.out.println("Input the plant type");
                String type = SCANNER.nextLine();
                System.out.println("Input the plant color");
                String color = SCANNER.nextLine();
                System.out.println("Input the plant size");
                int size = Integer.parseInt(SCANNER.nextLine());
                verifySize(size);
                Plant plant = new Plant(size, color, type);
                System.out.println("Your plant has been successfully created: " + plant);
                return plant;
            } catch (NumberFormatException e) {
                System.out.println("size should be a number");
            } catch (ColorExeption | TypeExeption | SizeExeption e ) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static int verifySize ( int size) {
            if ( size<0) {
                throw new SizeExeption("Too low");
            } else if (size > 50 ) {
                throw new SizeExeption("Too height");
            }return size;
        }

    private static Color verifyColor(String color) {
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorExeption("this color:'" + color + "' is invalid, use one of this: " + Arrays.toString(Color.values()));
        }
    }

    private static Type verifyType(String type) {
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeExeption("this type:'" + type + "' is invalid, use one of this: " + Arrays.toString(Type.values()));
        }
    }


}
