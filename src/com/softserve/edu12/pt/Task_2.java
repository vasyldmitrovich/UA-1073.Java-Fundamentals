package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = promtPlant();
        }
        for (var plant: plants){
            System.out.println(plant);
        }
    }

    private static Plant promtPlant() {
        while (true) {
            try {
                System.out.println("Input the plant type: ");
                String type = scanner.nextLine();
                System.out.println("Input the plant color: ");
                String color = scanner.nextLine();
                System.out.println("Input the plant size: ");
                int size = Integer.parseInt(scanner.nextLine());
                var plant = new Plant(size, color, type);
                System.out.println("Plant has been successfully created: " + plant);
                return plant;
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }catch (ColorException | TypeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

enum Color {GREEN, RED, BROWN}
enum Type {BUSH, GRASS, TREE}

class ColorException extends RuntimeException{
    public ColorException(String message){
        super(message);
    }
}

class TypeException extends RuntimeException{
    public TypeException(String message){
        super(message);
    }
}

class Plant{
    private int size;
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
        this.color = verifyColor(color);
        this.type = verifyType(type);
    }

    private static Color verifyColor(String color){
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException(color + "is not valid, use one of " + Arrays.toString(Color.values()));
        }
    }
    private static Type verifyType(String type){
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException(type + "is not valid, use one of " + Arrays.toString(Type.values()));
        }
    }
}
