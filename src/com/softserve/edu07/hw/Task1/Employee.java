package com.softserve.edu07.hw.Task1;

abstract class Employee implements Payment {
    private String name;
    private String position;
    private String employeeId;

    public Employee(String name, String position, String employeeId) {
        this.name = name;
        this.position = position;
        this.employeeId = employeeId;
    }

    public void promptEmployee() {
        System.out.println("\nEmployee: " + name + ", Position: " + position +
                ", Employee Id: " + employeeId + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}