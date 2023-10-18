package com.softserve.edu05.hw;

import com.softserve.edu05.CommonTools;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
//        task1();
//        Task2.productNums();
//        task3();
//        Task4.guessNumber();
    }

    private static void task1(){//Nice
        task1_1();
        task1_2();
        task1_3();
    }

    private static void task1_1(){
        System.out.println("Task #1.1");
        while (true){
            Task1.daysInMonth();
            System.out.print("Would you like to continue? (y/n): ");
            String userInput = SCANNER.nextLine();

            if(userInput.equalsIgnoreCase("n")){
                System.out.println("Enter key was pressed. Exiting...");
                break;
            }
        }
        System.out.println();
    }

    private static void task1_2(){
        System.out.println("Task #1.2");

        int[] nums = new int[10];

        for(int i = 0; i < nums.length; ++i){
            nums[i] = CommonTools.readLineAndConvertToNumber(String.format("Enter number #%d: ", i+1), Integer.class);
        }

        int result = Task1.calculateResult(nums);

        System.out.printf("Execution result: %d%n", result);
        System.out.println();
    }

    private static void task1_3(){
        System.out.println("Task #1.3");

        int[] nums = new int[5];
        Random random = new Random();

        for(int i = 0; i < nums.length; ++i){
            nums[i] = random.nextInt(201) - 100;
        }

        Task1.getArrayInfo(nums);
        System.out.println();
    }

    private static void task3(){//Good
        Car[] cars = {
                new Car(TypeCar.SUV, 2015, 3.5),
                new Car(TypeCar.HATCHBACK, 2022, 2.0),
                new Car(TypeCar.SUV, 2010, 1.6),
                new Car(TypeCar.CROSSOVER, 2022, 2.5)
        };

        task3_1(cars);
        task3_2(cars);
    }

    private static void task3_1(Car[] cars){
        System.out.println("Task #3.1");

        int year = CommonTools.readLineAndConvertToNumber("Enter certain model year: ", Integer.class);
        Car[] result = Car.getCertainModelYear(cars, year);
        CommonTools.printArray(result, "Array of cars for the specified year:");
        System.out.println();
    }

    private static void task3_2(Car[] cars){
        System.out.println("Task #3.2");

        CommonTools.printArray(cars, "Array to be sorted:");
        CommonTools.sortArrayBubbleAscendingOrder(cars);
        CommonTools.printArray(cars, "Array after sorting:");
        System.out.println();
    }
}
