package com.softserve.edu10.pt.task2;

import java.util.Calendar;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private Calendar date;

    public Employee(String name, String position, int salary, Calendar date) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.date = date;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + "'" + (position != null ? ", position='" + position + '\'' : "") +
                (salary != 0 ? ", salary='" + salary + '\'' : "") +
                (date != null ? ", date='" + date.getTime() + '\'' : "") +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Calendar getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
