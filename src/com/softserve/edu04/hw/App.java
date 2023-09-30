package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {
    public static Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        // Task 1
        Range range = new Range();
        Range.promptParameters(range);
        range.checkNumbers();

        // Task 2
        MaxMin maxMin = new MaxMin();
        MaxMin.promptParameters(maxMin);
        maxMin.checkMaxMin();

        // Task 3
        new HTTPErrorCheck();

        // Task 4
        Faculty faculty = new Faculty();
        Faculty.promptParameters(faculty);
        System.out.println(faculty);

        // Task 5
        Dog dog1 = new Dog("dog 1", Breed.BULL_TERRIER, 5);
        Dog dog2 = new Dog("dog 2", Breed.GOLDEN_RETRIEVER, 10);
        Dog dog3 = new Dog("dog 3", Breed.BOXER, 2);
        Dog[] dogs = new Dog[] {dog1, dog2, dog3};

        boolean hasUniqueNames = Dog.checkUniqueName(dog1, dog2, dog3);
        String uniqueMessage = hasUniqueNames ? "All the dogs have unique names" : "Some dogs have same name";
        System.out.println(uniqueMessage);

        Dog oldestDog = Dog.findOldestDog(dogs);
        oldestDog.printInfo();
    }
}
