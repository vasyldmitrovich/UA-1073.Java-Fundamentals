package com.softserve.edu04.hw.task5;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        createAndPrint();
    }

    private static void createAndPrint() {
        Dog firstDog = new Dog();
        firstDog.loadData();

        Dog secondDog = new Dog();
        secondDog.loadData();


        Dog thirdDog = new Dog();
        thirdDog.loadData();

        getOldestDog(firstDog, secondDog, thirdDog);
    }
    private static void getOldestDog(Dog firstDog, Dog secondDog, Dog thirdDog) {
        if ((firstDog.getAge() > secondDog.getAge()) && (firstDog.getAge() > thirdDog.getAge())) {
            System.out.println(firstDog.getName() + " of breed " + firstDog.getBreed() + " is the oldest. ");
        } else if ((secondDog.getAge() > firstDog.getAge()) && (secondDog.getAge() > thirdDog.getAge())) {
            System.out.println(secondDog.getName() + " of breed " + firstDog.getBreed() + " is the oldest");
        } else if ((thirdDog.getAge() > firstDog.getAge()) && (thirdDog.getAge() > secondDog.getAge())) {
            System.out.println(thirdDog.getName() + " of breed " + firstDog.getBreed() + " is the oldest");
        }
    }


}
