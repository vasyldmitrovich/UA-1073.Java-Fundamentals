package com.softserve.edu07.hw.Task2;

public class Test {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(12),
                new Boat(200),
                new Plane(150),
                new Helicopter(500,800),
                new Bus("Kiev-Lviv"),
                new Motorcycle(280),
                new Car("BMW X3")
        };
        for (var pas:passengers) {
            if (pas instanceof WaterVehicle){
                ((WaterVehicle)pas).isSailing();
            } else if (pas instanceof FlyingVehicle) {
                ((FlyingVehicle)pas).fly();
                ((FlyingVehicle)pas).land();
            } else if (pas instanceof GroundVehicle) {
                ((GroundVehicle)pas).drive();
            }
        }
    }
}
