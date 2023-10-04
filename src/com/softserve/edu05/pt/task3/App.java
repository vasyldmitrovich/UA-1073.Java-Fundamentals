package com.softserve.edu05.pt.task3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] mas = new int [10];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
        }
        for (int outMas : mas){
            System.out.println(outMas);
        }
        Method method = new Method();

        method.maxMasNumber(mas);
        //метод повинен працювати правильно але є проблеми з сумою через максимальне значення яке може містити int
        method.sumPositivNums(mas);
        method.numerosityNegativeNums(mas);
        method.positiveVsNegative(mas);
    }
}
