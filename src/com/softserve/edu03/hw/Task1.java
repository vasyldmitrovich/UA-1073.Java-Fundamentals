package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public void execute() {
        var scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        var sideOne = scanner.nextInt();

        System.out.println("Input Side 2: ");
        var sideTwo = scanner.nextInt();

        System.out.println("Input Side 3: ");
        var sideThree = scanner.nextInt();

        var triangleArea = new Triangle(sideOne, sideTwo, sideThree).calculateArea();

        System.out.println("The area of triangle is: " + triangleArea);
    }
}
