package com.softserve.edu12.pt.task2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        this.size = size;
        this.color = verifyColor(color);
        this.type = verifyType(type);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    private static Color verifyColor(String color){
        try {
            return Color.valueOf(color.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new ColorExeption(color + " isnt valid, use one of this " + Arrays.toString(Color.values()));
        }
    }
    private static Type verifyType(String type){
        try {
            return Type.valueOf(type.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new TypeExeption(type + " isnt valid, use one of this " + Arrays.toString(Type.values()));
        }
    }
    public static Plant promtPlant(){
        while (true) {
            try {
                var scanner = new Scanner(System.in);
                System.out.println("Input the plant type:");
                String type = scanner.nextLine();
                System.out.println("Input the plant color:");
                String color = scanner.nextLine();
                System.out.println("Input the plant size:");
                int size = Integer.parseInt(scanner.nextLine());
                return new Plant(size, color, type);
            }catch (NumberFormatException e){
                System.out.println("Size should be a number");
            }catch (ColorExeption | TypeExeption e){
                System.out.println(e.getMessage());
            }
        }
    }
}
