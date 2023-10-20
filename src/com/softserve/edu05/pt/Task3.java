package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(numbers));


        //шукає максимальне число

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Найбільше число в масиві: " + max);


        //рахує суму додатних чисел та кількість від'ємних

        int sumOfPositives = 0;
        int countOfNegatives = 0;
        for (int number : numbers) {
            if (number > 0) {
                sumOfPositives += number;
            } else if (number < 0) {
                countOfNegatives++;
            }
        }
        System.out.println("Сума позитивних чисел: " + sumOfPositives);
        System.out.println("Кількість негативних чисел: " + countOfNegatives);


        //визначає яких чисел більше додатніх чи від'ємних або однакова кількість

        if (countOfNegatives > sumOfPositives) {
            System.out.println("У масиві є більше негативних чисел. ");
        } else if (countOfNegatives < sumOfPositives) {
            System.out.println("У масиві є більше позитивних чисел. ");
        } else {
            System.out.println("У масиві є однакова кількість позитивних і негативних чисел. ");
        }


    }
}
