package com.softserve.edu04.hw.Task2;

public class App {
    public static void main(String[] args) {
        Task number1 = new Task(4);
        Task number2 = new Task(6);
        Task number3 = new Task(3);

        if (number1.getNumber() < number2.getNumber()){
            number1 = number2;
        }
        if (number1.getNumber() < number3.getNumber()){
            number1 = number3;
        }
        System.out.println("Max number: " + number1.getNumber());

        if (number1.getNumber() > number2.getNumber()){
            number1 = number2;
        }
        if (number1.getNumber() > number3.getNumber()){
            number1 = number3;
        }
        System.out.println("Min number: " + number1.getNumber());
    }
}
