package com.softserve.edu03.pt;


import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main() {
        Employee e1 = createEmployee();
        System.out.println(e1);
        Employee e2 = createEmployee();
        System.out.println(e2);
        Employee e3 = createEmployee();
        System.out.println(e3);

        System.out.println("Total Salary: " + Employee.totalSalary);
        System.out.println("Total Sum with bonuses: " + Employee.totalSum);
    }

    public static Employee createEmployee() {
        System.out.println("Input name of employee:");
        String name = scanner.nextLine();
        System.out.println("Input rate for '" + name + "' :");
        double rate = scanner.nextDouble();
        System.out.println("Input hours for '" + name + "' :");
        int hours = scanner.nextInt();
        scanner.nextLine();

        return new Employee(name, rate, hours);
    }

    public static class Employee {
        private String name;
        private double rate;
        private double hours;

        public static double totalSum;

        public static double totalSalary;

        public Employee() {
        }

        public Employee(String name, double rate, double hours) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;

            totalSum = totalSum + getSalary() + getBonuses();
            totalSalary = totalSalary + getSalary();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public double getHours() {
            return hours;
        }

        public void setHours(double hours) {
            this.hours = hours;
        }

        public double getSalary() {
            return rate * hours;
        }

        public double getBonuses() {
            return getSalary() * 0.1;
        }

        @Override
        public String toString() {
            return "Employee {" +
                    "name='" + name + '\'' +
                    ", rate=" + rate +
                    ", hours=" + hours +
                    '}';
        }

    }

}
