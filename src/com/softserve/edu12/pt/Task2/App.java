package com.softserve.edu12.pt.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = promptPlant();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
    private static Plant promptPlant() {
        while (true) {
            try {
                System.out.println("Input the plant type: ");
                String type = scanner.nextLine();
                System.out.println("Input tje plant color: ");
                String color = scanner.nextLine();
                System.out.println("Input the plant size: ");
                int size = Integer.parseInt(scanner.nextLine());
                var plant = new Plant(size, color, type);
                System.out.println("Plant has been successfully created: " + plant);
                return plant;
            } catch (NumberFormatException | TypeException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}


