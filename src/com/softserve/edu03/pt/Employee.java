package com.softserve.edu03.pt;

import static com.softserve.edu03.pt.App.SCANNER;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    private static int totalSum;

    public Employee() {
        this("N/A", 0, 0);
    }

    public Employee (String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public int getSalary() {
        return rate * hours;
    }

    public static void inputInfo(Employee employee) {
        System.out.println("Input employee name: ");
        String name = SCANNER.nextLine();
        employee.setName(name);

        System.out.println("Input employee rate");
        int rate = SCANNER.nextInt();
        SCANNER.nextLine();

        employee.setRate(rate);

        System.out.println("Input employee hours");
        int hours = SCANNER.nextInt();
        SCANNER.nextLine();

        employee.setHours(hours);

    }

    public double getBonuses() {
        int salary = getSalary();

        return 0.1 * salary;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRate () {
        return rate;
    }

    public void setRate (int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours () {
        return hours;
    }

    public void setHours (int hours) {
        totalSum -= getSalary();

        this.hours = hours;

        totalSum += getSalary();
    }

    public static int getTotalSum () {
        return totalSum;
    }

    public static void setTotalSum (int totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString () {
        return "Task2{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
