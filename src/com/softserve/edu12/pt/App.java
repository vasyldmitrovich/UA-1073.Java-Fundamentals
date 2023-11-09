package com.softserve.edu12.pt;

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

// PT 1 - rectangle area
        Rectangle.runIt();


// PT 2 - plants
        Plant[] plants = new Plant[5];
        for (int i = 0; i <plants.length; i++) {
                    // here I use different methods for verification Color and Type
//            plants[i] = inputPlant();
                    // here I use single methods for verification Color and Type
            plants[i] = inputPlant1();
        }

        for (Plant plant: plants) {
            System.out.println(plant);
        }


    }



    static Plant inputPlant(){
        while (true) {
            try {
                System.out.println("Input the plant type");
                Type type = Plant.verifyType(sc.nextLine());
                System.out.println("Input the plant color");
                Color color = Plant.verifyColor(sc.nextLine());
                System.out.println("Input the plant size");
                int size = Integer.parseInt(sc.nextLine());
                Plant.verifySize(size, type);
                return new Plant(type, size, color);
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number. Lents try again.");
            } catch (PlantSizeException | TypeException | ColorException e) {
                System.out.println(e.getMessage() + ". Lets try again.");
            }

        }
    }

    static Plant inputPlant1(){
        while (true) {
            try {
                System.out.println("Input the plant type");
                String type = sc.nextLine();
                System.out.println("Input the plant color");
                String color = sc.nextLine();
                System.out.println("Input the plant size");
                Plant.verifyColorAndType(type, color);
                int size = Integer.parseInt(sc.nextLine());
                Plant.verifySize(size, Type.valueOf(type.toUpperCase()));
                return new Plant(Type.valueOf(type.toUpperCase()), size, Color.valueOf(color.toUpperCase()));
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number. Lets try again.");
            } catch (PlantSizeException | TypeException | ColorException e) {
                System.out.println(e.getMessage() + ". Lets try again.");
            }

        }
    }
}
