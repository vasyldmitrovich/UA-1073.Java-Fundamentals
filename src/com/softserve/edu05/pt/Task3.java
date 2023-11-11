package com.softserve.edu05.pt;
import java.util.Random;

public class Task3 {
        public static void main(String[] args) {

            int[] randomArray = generateRandomArray(10);


            int maxNumber = findMaxNumber(randomArray);
            System.out.println("The biggest number in the array: " + maxNumber);


            int sumOfPositives = calculateSumOfPositives(randomArray);
            int countOfNegatives = countNegatives(randomArray);
            System.out.println("Sum of positive numbers: " + sumOfPositives);
            System.out.println("Number of negative numbers: " + countOfNegatives);


            determineBalance(countOfNegatives, randomArray.length);
        }

        private static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }

            return array;
        }

        private static int findMaxNumber(int[] array) {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        private static int calculateSumOfPositives(int[] array) {
            int sum = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                }
            }
            return sum;
        }

        private static int countNegatives(int[] array) {
            int count = 0;
            for (int num : array) {
                if (num < 0) {
                    count++;
                }
            }
            return count;
        }

        private static void determineBalance(int countOfNegatives, int arrayLength) {
            if (countOfNegatives > arrayLength / 2) {
                System.out.println("There are more negative values in the array.");
            } else if (countOfNegatives < arrayLength / 2) {
                System.out.println("There are more positive values in the array.");
            } else {
                System.out.println("There are an equal number of positive and negative values in the array.");
            }
        }
    }

