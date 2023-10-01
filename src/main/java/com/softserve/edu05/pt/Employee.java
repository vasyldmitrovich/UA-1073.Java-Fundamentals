package com.softserve.edu05.pt;

import com.softserve.edu05.CommonTools;

import java.util.Scanner;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final int departmentNum;
    private final double salary;

    public Employee(String name, int departmentNum, double salary) {
        this.name = name;
        this.departmentNum = departmentNum;
        this.salary = salary;
    }

    public static Employee input(){
        String name = readName();
        int departmentNum = CommonTools.readLineAndConvertToNumber("Enter the department number: ", Integer.class);
        double salary = CommonTools.readLineAndConvertToNumber("Enter the salary: ", Double.class);

        return new Employee(name, departmentNum, salary);
    }

    public static Employee[] getInfoAboutDepartment(Employee[] array, int num){
        Employee[] buffer = new Employee[array.length];
        int bufferIndex = 0;

        for(Employee employee : array){
            if(employee.departmentNum == num){
                buffer[bufferIndex++] = employee;
            }
        }

        Employee[] result = new Employee[bufferIndex];
        System.arraycopy(buffer, 0, result, 0, bufferIndex);

        return result;
    }

    public static void sortArrayBubble(Employee[] array){
        CommonTools.sortArrayBubbleAscendingOrder(array);
        reverseArray(array);
    }

    private static void reverseArray(Employee[] array){
        for(int i = 0; i < array.length / 2; ++i){
            int endIndex = array.length - i - 1;
            Employee buffer = array[i];
            array[i] = array[endIndex];
            array[endIndex] = buffer;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNum=" + departmentNum +
                ", salary=" + salary +
                '}';
    }

    private static String readName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return scanner.nextLine();
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        return Double.compare(this.salary, anotherEmployee.salary);
    }
}
