package com.softserve.edu03.pt.task1;

public class Main {

    public static void main(String[] args){
        Calculation PressNumber1 = new Calculation();
        double number1 = Calculation.getNumber("First number");

        Calculation PressNumber2 = new Calculation();
        double number2 = Calculation.getNumber("Second number");

        Calculation calculation1 = new Calculation();
        double Summary = calculation1.Summary(number1, number2);
        System.out.println("Result: " + Summary);

        Calculation calculation = new Calculation();
        double Average  = calculation1.Average(number1, number2);
        System.out.println("Average: " + Average);

    }
}
