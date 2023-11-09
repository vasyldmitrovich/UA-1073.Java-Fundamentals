package com.softserve.edu12.pt;

import java.util.Scanner;

class Rectangle {

    public static void runIt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets calculate the area of rectangle.");
        while (true) {
            try {
                System.out.println("Input length of the side 'a':");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Input length of the side 'b':");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("The area of rectangle - " + squareRectangle(a,b));
                break;
            } catch (NumberFormatException e) {
                System.out.println("There was an error: The sides should be numbers");
            }
            catch (IllegalArgumentException e) {
                System.out.println("There was an error: " + e.getMessage());
            }
        }
    }

    public static int squareRectangle(int a, int b){
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Sides should be positive");
        }
        return a*b;
    }
}
