package com.softserve.edu03.pt;

class Task2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 105, 12 );
        Employee employee2 = new Employee("Oksana");
        Employee employee3 = new Employee();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total sum = " + Employee.getTotalSum());

        employee2.setRate(172);
        employee2.setHours(42);

        System.out.println("Total sum = " + Employee.getTotalSum());

        employee2.setRate(156);

        System.out.println("Total sum = " + Employee.getTotalSum());

        System.out.println(employee1.getBonuses());
        System.out.println(employee2.getBonuses());
        System.out.println(employee3.getBonuses());
    }
}
