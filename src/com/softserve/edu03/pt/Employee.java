package com.softserve.edu03.pt;

class Employee {//Good structure, nice

    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee() {
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRate() {
        return rate;
    }

    void setRate(int rate) {
        this.rate = rate;
    }

    int getHours() {
        return hours;
    }

    void setHours(int hours) {
        this.hours = hours;
    }

    static int getTotalSum() {
        return totalSum;
    }

    static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    static String totalSalary () {
    return "Total salary of all workers with bonuses " + totalSum + " $.";
    }

    Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = (int) (totalSum +  rate * hours * 1.1);
    }

    int getSalary() {
        return this.rate * this.hours;
    }

    int getBonuses() {
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
