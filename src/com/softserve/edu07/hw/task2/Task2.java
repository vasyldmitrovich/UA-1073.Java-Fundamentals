package com.softserve.edu07.hw.task2;

public class Task2 {
    public static void task2() {
        Vehicle[] vehicles = new Vehicle[]{
                new Liner(5, 4),
                new Boat(7, 7),
                new Helicopter(4, 7, 8),
                new Car(9, "BMW"),
        };

        for (Vehicle vehicle : vehicles) {//Good
            if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
                System.out.println("Count of passengers: " + ((FlyingVehicle) vehicle).getPassengers());
            }
            if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
                System.out.println("Count of passengers: " + ((GroundVehicle) vehicle).getPassengers());
            }
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
                System.out.println("Count of passengers: " + ((WaterVehicle) vehicle).getPassengers());
            }
        }

    }
}
