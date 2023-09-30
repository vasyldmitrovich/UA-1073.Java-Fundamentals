package com.softserve.edu03.pt.Task2;

public class Employee {
    private String name;
    private int rage;
    private int hours;
    static private int totalSum;

    public Employee() {
        this("N/A", 0, 0);

    }

    public Employee(String name) {
        this(name, 0, 0);
    }

    public Employee(String name, int rage, int hours) {
        this.name = name;
        this.rage = rage;
        this.hours = hours;
        totalSum += getTotalSum();
    }
    public int getSalary () {
        return rage * hours;
    }
    public double getBonus () {
        return (getSalary()/100) * 10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rage=" + rage +
                ", hours=" + hours +
                '}';
    }

    public void informations () {
        setTotalSum(getSalary());
        System.out.println(toString()  + "Salary is " + getSalary() + " bonus is " + getBonus());
    }

//setters getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
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
        totalSum += Employee.totalSum;
        Employee.totalSum = totalSum;

    }
}


