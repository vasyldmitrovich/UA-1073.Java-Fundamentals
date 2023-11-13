package com.softserve.edu12.pt.task2;

import java.util.Scanner;

public class Task2Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Plant[] plants = new Plant[3];
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
                System.out.println("Input the type plant:");
                String type = scan.nextLine();

                System.out.println("Input the type color:");
                String color = scan.nextLine();

                System.out.println("Input the type size:");
                int size = Integer.parseInt(scan.nextLine());
                return new Plant(size, color, type);
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

