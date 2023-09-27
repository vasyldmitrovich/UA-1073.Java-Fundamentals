package com.softserve.edu04.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Task1.checkNumberForRange();
//        Task2.searchMinAndMaxNum();
//        Task3.getInfoError();
//        task4();
        task5();
    }

    private static void task4(){
        Faculty faculty = new Faculty();
        Faculty facultySecond = new Faculty(5, Season.SPRING);

        System.out.printf("Old: %s\n", faculty);
        System.out.println(facultySecond);

        faculty.input();

        System.out.printf("New: %s\n", faculty);
    }

    private static void task5(){
        Dog[] dogs = {
                new Dog("Rex", Breed.SIBERIAN_HUSKY, 5),
                new Dog("Max", Breed.LABRADOR_RETRIEVER, 7),
                new Dog("Bella", Breed.BULLDOG, 3)
        };

        boolean areDogs = areTwoDogsWithSameName(dogs);

        System.out.printf("There are%s two dogs with the same names in the array.\n", areDogs
                                                                                    ? ""
                                                                                    : " no");

        Arrays.sort(dogs);

        System.out.printf("The oldest dog: %s.\n", dogs[dogs.length - 1]);
    }

    private static boolean areTwoDogsWithSameName(Dog[] dogs){
        for (int i = 0; i < dogs.length - 1; ++i){
            for(int j = i + 1; j < dogs.length; ++j){
                if(dogs[i].equalsName(dogs[j])){
                    return true;
                }
            }
        }

        return false;
    }
}
