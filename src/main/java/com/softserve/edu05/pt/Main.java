package com.softserve.edu05.pt;

import com.softserve.edu05.CommonTools;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
    }

    private static void task1(){
        String[] strings = {"Orange", "Banana", "Zebra", "Laptop", "Elephant", "Moon", "Carrot", "Table", "Giraffe", "Kangaroo"};
        Double[] numbers = {10.0, 45.12, 23.02, 3.141516, 12.0, 5.0, 13.25, 32.06, 6.0, 8.0};

        Double average = Task1.averageValueArray(numbers);
        CommonTools.sortArrayBubbleAscendingOrder(strings);

        Double search = CommonTools.readLineAndConvertToNumber("Enter the number to search for: ", Double.class);
        boolean isNumPresent = Task1.binarySearchNum(numbers, search);

        System.out.printf("Sorted array: %s%n", Arrays.toString(strings));
        System.out.printf("Average value: %.4f%n", average);
        System.out.printf("Is element %f present in the array?: %b%n", search, isNumPresent);
    }

    private static void task2(){
        while (true){
            int num = CommonTools.readLineAndConvertToNumber("Enter a number to check if it's prime (enter zero to exit): ", Integer.class);

            if(num == 0){
                break;
            }

            boolean isPrime = Task2.isPrime(num);

            System.out.printf("Answer: %s%n", isPrime
                    ? "Is a prime number"
                    : "Is not prime number");
        }
    }

    private static void task3(){
        Integer[] nums = new Integer[10];
        Random random = new Random();

        for(int i = 0; i < nums.length; ++i){
            nums[i] = random.nextInt(201) - 100;
        }

        System.out.printf("Array: %s%n", Arrays.toString(nums));

        int bigNum = Task3.searchMaxNum(nums);
        int sumPositive = Task3.sumPositiveNum(nums);
        int countNegativeNum = Task3.countNegativeNum(nums);
        String message = Task3.moreNegativeOrPositiveValues(nums);

        System.out.printf("Sorted array: %s%n", Arrays.toString(nums));
        System.out.printf("The biggest number in the array: %d%n", bigNum);
        System.out.printf("The sum of positive numbers: %d%n", sumPositive);
        System.out.printf("Count the number of negative numbers: %d%n", countNegativeNum);
        System.out.println(message);
    }

    private static void task4(){
//        Employee[] employees = new Employee[5];
//
//        for(int i = 0; i < employees.length; ++i){
//            employees[i] = Employee.input();
//        }

        Employee[] employees = {
                new Employee("Ilya", 3, 5050.0),
                new Employee("Ivan", 3, 12500.0),
                new Employee("Bohdan", 6, 4230.0),
                new Employee("Ivana", 4, 11111.0),
                new Employee("Petro", 3, 22050.0)
        };

        int departmentNum = CommonTools.readLineAndConvertToNumber("Enter the department number: ", Integer.class);
        Employee[] departmentInfo = Employee.getInfoAboutDepartment(employees, departmentNum);

        CommonTools.printArray(departmentInfo, String.format("There are %d people in this department.", departmentInfo.length));

        CommonTools.printArray(employees, "Array to be sorted:");
        Employee.sortArrayBubble(employees);
        CommonTools.printArray(employees, "Array after sorting:");
    }

}
