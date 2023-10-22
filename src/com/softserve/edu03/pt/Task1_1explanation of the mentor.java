package com.softserve.edu03.pt;

import java.util.Scanner;

class Task {//Name of class and name of file should be the same
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Task task = new Task();
        task.setNum1(getNumber("Enter the first number:"));
        task.setNum2(getNumber("Enter the second number:"));
        task.printSum();
        task.printAverage();
    }

    private void printAverage() {
        System.out.println("The average of " + num1 + " and " + num2 + " is " +
                getAverage());
    }

    private void printSum() {
        System.out.println("The sum of " + num1 + " and " + num2 + " is " +
                getTotal());
    }

    double num1, num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    double getTotal() {
        return num1 + num2;
    }

    double getAverage() {
        return (num1 + num2) / 2.0;
    }

    static double getNumber(String prompt) {
        System.out.println(prompt);
        double num = SCANNER.nextDouble();
        SCANNER.nextLine();
        return num;
    }
}
