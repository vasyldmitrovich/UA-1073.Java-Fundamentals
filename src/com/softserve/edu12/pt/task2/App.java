package com.softserve.edu12.pt.task2;

import java.sql.SQLOutput;
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

    public static Plant promptPlant() {

        int size = 0;
        String type = null;
        String color = null;
        while (true) {
            try {
                System.out.print("Enter a plant size: ");
                size = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter a plant type: ");
                type = scanner.nextLine();

                System.out.print("Enter a plant color: ");
                color = scanner.nextLine();
                return new Plant(size, color, type);
            } catch (NumberFormatException e) {
                System.out.println("Wrong number. Try again");
            } catch (ColorException | TypeException | IllegalArgumentException e) {
                System.out.println("Error while create plant: " + e.getMessage());
            }

        }
    }
}
