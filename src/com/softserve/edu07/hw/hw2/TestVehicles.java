package com.softserve.edu07.hw.hw2;

public class TestVehicles {

    public static void testVehicles() {
        int count = 1;

        Vehicle[] vehicles = {
                new Bus(),
                new Car(),
                new Boat(),
                new Plane(),
                new Motorcycle(),
                new Liner(),
                new Helicopter(),
        };

        for (Vehicle vehicle : vehicles) {
            ((Passengers) vehicle).setPassengers(count);
            count++;
        }
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " has " +
                    ((Passengers) vehicle).getPassengers() + " passengers.");
        }

    }

}
