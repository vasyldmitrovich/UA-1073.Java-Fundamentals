package com.softserve.edu16.hw.task2;

import com.softserve.edu10.pt.CommonTools;

public class TestFile {
    private String name;
    private String position;
    private double salary;
    private String birthday;

    private TestFile(String name, String position, double salary, String birthday) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.birthday = birthday;
    }

    public static TestFile createEmployee(){
        String name = CommonTools.readLine("Enter your name: ");
        String position = CommonTools.readLine("Enter your title: ");
        double salary = CommonTools.readLineAndConvertToNumber("Enter your salary: ", Double.class);
        String birthday = CommonTools.readLine("Enter your date of birth: ");

        return new TestFile(name, position, salary, birthday);
    }

    public static TestFile updateData(TestFile update){
        System.out.println("Data update. To skip, leave a blank line or enter zero.");
        TestFile newEmployee = createEmployee();

        newEmployee.name = newEmployee.name.isEmpty() ? update.name : newEmployee.name;
        newEmployee.position = newEmployee.position.isEmpty() ? update.position : newEmployee.position;
        newEmployee.salary = newEmployee.salary == 0 ? update.salary : newEmployee.salary;
        newEmployee.birthday = newEmployee.birthday.isEmpty() ? update.birthday : newEmployee.birthday;

        return newEmployee;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestFile employee = (TestFile) o;

        if (Double.compare(salary, employee.salary) != 0) return false;
        if (!name.equals(employee.name)) return false;
        if (!position.equals(employee.position)) return false;
        return birthday.equals(employee.birthday);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + position.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + birthday.hashCode();
        return result;
    }
}
