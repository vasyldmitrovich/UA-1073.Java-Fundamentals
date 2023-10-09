package com.softserve.edu06.downloadfromsoftserve.practical;

//Task1
//uncomment code 
abstract class Computer {
    private static final String brand = "Generic";

    public abstract void turnOn();

    //    public void shutDown() {
//        System.out.println("Shutting down computer...");
//    }
    public void shutDown() {
        System.out.println("Shutting down computer..." + brand);
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}
//
//class DesktopComputer implements Computer {
//    public void turnOn() {
//        System.out.println("Turning on desktop computer...");
//    }
//}
//
//class LaptopComputer extends Computer {
//    public void bootUp() {
//        System.out.println("Turning on laptop computer...");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Computer desktop = new DesktopComputer();
//        Computer laptop = new LaptopComputer();
//        DesktopComputer.turnOn();
//        laptop.turnOn();
//        desktop.shutDown();
//        DesktopComputer.printBrand();
//        LaptopComputer.printBrand();
//        Computer.printBrand();
//    }
//}
