package com.softserve.edu06.downloadfromsoftserve.practical;

public class LaptopComputer extends Computer {
    private static final String brand = "Laptop";

//    public void bootUp() {
//        System.out.println("Turning on laptop computer...");
//    }

    @Override
    public void turnOn() {
        System.out.println("Turning on laptop computer..." + brand);
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down computer..." + brand);
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
