package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = {"один", "два", "три", "чотири", "п'ять"};
        Arrays.sort(stringArray);

        System.out.println("Сортований масив стрічок:");
            for (String item : stringArray) {
                System.out.println(item);
            }

            double[] numericArray = {1.0, 2.0, 3.0, 4.0, 5.0};
            double sum = 0;
            for (double num : numericArray) {
                sum += num;
            }

            double average = sum / numericArray.length;
            System.out.println("Середнє значення масиву чисел:" + average);

            System.out.print("Введіть значення для пошуку:");
            double searchValue = scanner.nextDouble();
            boolean containsValue = Arrays.stream(numericArray).anyMatch(num -> num == searchValue);

            if (containsValue) {
                System.out.println("Масив містить введене значення");
            } else {
                    System.out.println("Масив не містить введене значення");
                }
                scanner.close();

            }

    }


