package com.softserve.edu06.downloadfromsoftserve.practical;

public class DesktopComputer extends Computer {
    private static final String brand = "Desktop";

    //    public void turnOn() {
//        System.out.println("Turning on desktop computer...");
//    }
    public void turnOn() {
        System.out.println("Turning on desktop computer..." + brand);
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down computer..." + brand);
    }

    static void printBrand() {
        System.out.println("Computer brand: " + brand);
    }
}


class Main {
    public static void main(String[] args) {
        Computer desktop = new DesktopComputer();
        Computer laptop = new LaptopComputer();
//        DesktopComputer.turnOn();
        desktop.turnOn();
        laptop.turnOn();
        desktop.shutDown();
        DesktopComputer.printBrand();
        LaptopComputer.printBrand();
        Computer.printBrand();

        // I add this method
        laptop.turnOn();
    }

}
