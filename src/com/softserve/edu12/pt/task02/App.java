package com.softserve.edu12.pt.task02;

import java.util.Scanner;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        Plant[] plants = new Plant[5];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = promptPlant();
        }
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }

    public static Plant promptPlant() {
        while (true) {
            try {
                System.out.print("Enter plant type: ");
                String type = SCANNER.nextLine();
                System.out.print("Enter plant color: ");
                String color = SCANNER.nextLine();
                System.out.print("Enter plant size: ");
                int size = Integer.parseInt(SCANNER.nextLine());
                Plant plant = new Plant(type, color, size);
                System.out.println("Successfully added!");
                return plant;
            } catch (NumberFormatException e) {
                System.out.println("size should be a number!");
            } catch (TypeException | ColorException | SizeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
