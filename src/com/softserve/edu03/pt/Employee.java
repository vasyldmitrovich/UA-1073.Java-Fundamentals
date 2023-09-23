package com.softserve.edu03.pt;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee() {
    }

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

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public static String totalSalary () {
    return "Total salary of all workers with bonuses " + totalSum + " $.";
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = (int) (totalSum +  rate * hours * 1.1);
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    public int getBonuses() {
        return getSalary() / 10;
    }

    @Override
    public String toString() {
        return "Employee " + getName() +
                " has rate " + getRate() +
                " $ per hour. He worked " + getHours() +
                " hours and had salary " + getSalary() + " $ and " +
                getBonuses() + " $ as bonuses";
    }
}
