package com.softserve.edu12.pt.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.promtPlant();
        }
        for (var plant : plants){
            System.out.println(plant);
        }
    }
}
