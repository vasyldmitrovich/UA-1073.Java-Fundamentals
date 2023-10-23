package com.softserve.edu06.hw;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Ім'я: Тарас, Вік: 32 роки, Посада: Middle Java-розробник, Зарплата: 32735.35");
    }
}
