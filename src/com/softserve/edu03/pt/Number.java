package com.softserve.edu03.pt;

import static com.softserve.edu03.pt.App.SCANNER;

public class Number {
    private int num1;
    private int num2;

    public int getTotal() {
        return num1 + num2;
    }

    public int getAverage() {
        return (num1 + num2) / 2;
    }

    public static void printInfo (Number task) {
        int avg = task.getAverage();
        int sum = task.getTotal();

        System.out.println("The sum of " + task.getNum1() + " and " + task.getNum2() + " is " + sum);
        System.out.println("The average of " + task.getNum1() + " and " + task.getNum2() + " is " + avg);
    }

    public static void setNumbers(Number task) {
        int num1 = Number.getNumber("Enter the first number: ");
        int num2 = Number.getNumber("Enter the second number: ");

        task.setNum1(num1);
        task.setNum2(num2);
    }

    public static int getNumber(String prompt) {
        System.out.println(prompt);
        int num= SCANNER.nextInt();
        SCANNER.nextLine();
        return num;
    }

    public int getNum1 () {
        return num1;
    }

    public void setNum1 (int num1) {
        this.num1 = num1;
    }

    public int getNum2 () {
        return num2;
    }

    public void setNum2 (int num2) {
        this.num2 = num2;
    }
}
