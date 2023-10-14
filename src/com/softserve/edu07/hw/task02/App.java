package com.softserve.edu07.hw.task02;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[7];
        vehicles[0] = new Liner(100, 3);
        vehicles[1] = new Boat(8, 5);
        vehicles[2] = new Plane(160, 3000);
        vehicles[3] = new Helicopter(4, 5000, 3000);
        vehicles[4] = new Bus(42, "Amsterdam - Berlin");
        vehicles[5] = new Motorcycle(1, 320);
        vehicles[6] = new Car(8, "Hyndai Staria");
        testAllVehicles(vehicles);
    }

    private static void testAllVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Testing vehicle " + i + ": ");
            testVehicle(vehicles[i]);
        }
    }

    private static void testVehicle(Vehicle vehicle) {
        if (vehicle instanceof WaterVehicle) {
            ((WaterVehicle) vehicle).isSailing();
        } else if (vehicle instanceof FlyingVehicle) {
            ((FlyingVehicle) vehicle).fly();
            ((FlyingVehicle) vehicle).land();
        } else if (vehicle instanceof GroundVehicle) {
            ((GroundVehicle) vehicle).drive();
        } else {
            System.out.println("Unknown vehicle type!!!");
        }
    }
}
