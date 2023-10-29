package com.softserve.edu12.pt.task2;

import com.softserve.common_tools.CommonTools;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int SIZE = 2;
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();

        while (plants.size() < SIZE){
            try {
                Plant plant = createPlant();
                plants.add(plant);
                System.out.println("Plant added\n");
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Try again.\n");
            }
        }

        System.out.println("Information about the plants.");
        plants.forEach(System.out::println);
    }

    private static Plant createPlant(){
        System.out.println("Enter the plant information.");
        int sizePlant = CommonTools.readLineAndConvertToNumber("Enter the size: ", Integer.class);
        String colorPlant = CommonTools.readLine("Enter a color: ");
        String typePlant = CommonTools.readLine("Enter the type: ");

        return new Plant(sizePlant, colorPlant, typePlant);
    }
}
