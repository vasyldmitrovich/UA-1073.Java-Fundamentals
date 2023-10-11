package com.softserve.edu05.pt.task1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task1Edu05Pt {
    public static void task1Edu05Pt() {

        Locale.setDefault(Locale.ROOT);

        //Task 1
        String[] dog = {"Shyny", "Lucas", "Herda", "Dekster", "Boni"};
        System.out.println("Task 1.1 ");
        System.out.println("Original array : " + Arrays.toString(dog));
        Arrays.sort(dog);
        System.out.println("Sorted array: " + Arrays.toString(dog));
        System.out.println(" ");
        System.out.println("Task 1.2 ");


        //Task 2
        double[] intNumber = {9, 10, 3.5, 5, 8.99};
        double suma = 0;
        for (double number : intNumber) {
            suma += number;
        }
        double numberAverage = suma / intNumber.length;
        System.out.println("Your average number is: " + numberAverage);
        System.out.println(" ");
        System.out.println("Task 1.3 ");


        // Task 3

        var scan = new Scanner(System.in);
        System.out.println("Enter the name dog to search for: ");

        String inputName = scan.nextLine();
        boolean isName = false;
        for (String name : dog) {
            if (name.equalsIgnoreCase(inputName)) {
                isName = true;
                break;
            }
        }
        if (isName) {
            System.out.println("There is a dog with this name " + inputName.toUpperCase() + " in the array");
        } else {
            System.out.println(inputName.toUpperCase() + " unknown name");
        }
    }

}
