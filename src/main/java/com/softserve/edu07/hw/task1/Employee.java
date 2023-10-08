package com.softserve.edu07.hw.task1;

public abstract class Employee implements Payment, Comparable<Employee> {
    private final String employeeId;
    private final String name;

    protected Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return -Double.compare(this.calculatePay(), o.calculatePay());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        else if(!(obj instanceof Employee)){
            return false;
        }
        double thisSalary = this.calculatePay();
        double otherSalary = ((Employee) obj).calculatePay();
        return thisSalary == otherSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name=" + name +
                ", average monthly wage='" + calculatePay() + '\'' +
                '}';
    }
}
