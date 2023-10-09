package com.softserve.edu03.pt.task1;

public class Main {

    public static void main(String[] args){//Nice
        double number1 = Calculation.getNumber("First number");

        double number2 = Calculation.getNumber("Second number");

        Calculation calculation1 = new Calculation();
        double Summary = calculation1.Summary(number1, number2);
        System.out.println("Result: " + Summary);

        double Average  = calculation1.Average(number1, number2);
        System.out.println("Average: " + Average);

    }
}
