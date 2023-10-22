package com.softserve.edu12.pt.task2;

import java.util.Scanner;

public class Task2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        Plant[] plants = new Plant[5];

        for (int i = 0; i < plants.length; i++) {
            plants[i] = createPlant();
        }

        for (var plant : plants) {
            System.out.println(plant);
        }
    }

    public static Plant createPlant () {
        while (true) {
            try {
                System.out.println("Enter plant size");

                int size = SCANNER.nextInt();
                SCANNER.nextLine();

                System.out.println("Enter plant type");
                String type = SCANNER.nextLine();

                System.out.println("Enter plant color");
                String color = SCANNER.nextLine();

                return new Plant(size, color, type);
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            } catch (ColorException | TypeException | SizeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
