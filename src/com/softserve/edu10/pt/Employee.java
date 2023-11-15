package com.softserve.edu10.pt;

public class Employee {
    private static int lastId = 0;
    private int id;
    private String name;
    private String position;
    private int salary;
    private String dateOfBirth;

    public Employee (int id, String name, String position, int salary, String dateOfBirth) {
        this.id = id;
        lastId++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee (String name, String position, int salary, String dateOfBirth) {
        this.id = lastId + 1;
        lastId++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public boolean hasEqualNames (String name) {
        return name.equals(name);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String getDateOfBirth () {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


}
