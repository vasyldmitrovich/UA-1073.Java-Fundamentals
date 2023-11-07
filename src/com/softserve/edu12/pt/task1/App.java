package com.softserve.edu12.pt.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.println("Input a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Input b: ");
                b = Integer.parseInt(scanner.nextLine());
                int area = squareRectangle(a, b);
                System.out.println("Area of the rectangle is: " + area);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sides should be numbres");
                continue;
            }catch (Exception e){
                System.out.println("There was an error: " + e.getMessage());
            }
        }
    }
    static int squareRectangle (int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("sides must be positive");
        }
        return a*b;
    }
}
