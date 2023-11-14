package com.softserve.edu12.pt.task2;

import java.util.Scanner;

public class App2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Plant[] plants = new Plant[4];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = promptPlant();

        }
        for(var plant : plants){
            System.out.println(plant);
        }

    }

    private static Plant promptPlant() {
        while (true) {
            try {
                System.out.println("Input the plant type:");
                String type = scanner.nextLine();
                System.out.println("Input the plant color:");
                String color = scanner.nextLine();
                System.out.println("Input the plant size:");
                int size = Integer.parseInt(scanner.nextLine());

                return new Plant(size, color, type);
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            } catch (ColorException | TypeException e ){
                System.out.println(e.getMessage());
            }
        }


    }

}
enum Color {GREEN, RED, BROWN}
enum Type {BUSH, GRASS, TREE}


