package com.softserve.edu04.hw.Task1;

public class App {
    public static void main(String[] args) {
        Number firstNumber = new Number(3.2);
        Number secondNumber = new Number(5.1);
        Number thirdNumber = new Number(-5.1);

        if (-5 <= firstNumber.getNumber() && firstNumber.getNumber() <= 5) {
            System.out.println("Number " + firstNumber.getNumber() + " is beetween -5 and 5");
        } else {
            System.out.println("Number " + firstNumber.getNumber() + " isnt beetween -5 and 5");
        }

        if (-5 <= secondNumber.getNumber() && secondNumber.getNumber() <= 5) {
            System.out.println("Number " + secondNumber.getNumber() + " is beetween -5 and 5");
        } else {
            System.out.println("Number " + secondNumber.getNumber() + " isnt beetween -5 and 5");
        }

        if (-5 <= thirdNumber.getNumber() && thirdNumber.getNumber() <= 5) {
            System.out.println("Number " + thirdNumber.getNumber() + " is beetween -5 and 5");
        } else {
            System.out.println("Number " + thirdNumber.getNumber() + " isnt beetween -5 and 5");
        }
    }
}
