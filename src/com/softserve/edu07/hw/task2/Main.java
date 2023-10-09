package com.softserve.edu07.hw.task2;

import com.softserve.edu07.hw.task2.abstract_element.*;
import com.softserve.edu07.hw.task2.flying.Helicopter;
import com.softserve.edu07.hw.task2.flying.Plane;
import com.softserve.edu07.hw.task2.ground.Bus;
import com.softserve.edu07.hw.task2.ground.Car;
import com.softserve.edu07.hw.task2.ground.Motorcycle;
import com.softserve.edu07.hw.task2.water.Boat;
import com.softserve.edu07.hw.task2.water.Liner;

public class Main {//Nice all is good
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Boat(12),
                new Plane(545),
                new Car("Tesla"),
                new Car("Volvo"),
                new Liner(22),
                new Helicopter(1000, 5000),
                new Motorcycle(265),
                new Bus("Kyiv-Lviv")
        };

        printInfoVehicles(vehicles);
    }

    private static void printInfoVehicles(Vehicle[] vehicles){
        System.out.println("Information output:");
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof FlyingVehicle){
                printInfoFlying((FlyingVehicle) vehicle);
            }
            else if(vehicle instanceof GroundVehicle){
                printInfoGround((GroundVehicle) vehicle);
            }
            else if(vehicle instanceof WaterVehicle){
                printInfoWater((WaterVehicle) vehicle);
            }
        }
    }

    private static void printInfoFlying(FlyingVehicle flyingVehicle){
        System.out.println("Information about air transportation:");

        flyingVehicle.fly();
        flyingVehicle.land();

        System.out.println();
    }

    private static void printInfoGround(GroundVehicle groundVehicle){
        System.out.println("Information about land transportation:");

        groundVehicle.drive();

        System.out.println();
    }

    private static void printInfoWater(WaterVehicle waterVehicle){
        System.out.println("Information about surface transportation");

        waterVehicle.isSailing();

        System.out.println();
    }
}
