package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static double totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary(int rating, int hours) {
        int salary = 0;
        salary = rate * hours;

        return salary;
    }

    @Override
    public String toString() {
        String info = String.format("Name: %1$s, Rate: %2$s, Hours: %3$s", getName(), getRate(), getHours());
        return info;
    }

    public double getBonuses(int salary) {
        //double bonus = 0.0;
        double bonus = (salary * 0.1);
        return bonus;
    }

    public static double getTotalSum() {
        return totalSum;
    }


    public void totalSum(double bonus, int salary) {
        totalSum = bonus + salary;
    }
}
