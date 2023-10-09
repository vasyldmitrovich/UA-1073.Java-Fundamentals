package com.softserve.edu06.hw;

import com.softserve.edu06.hw.hw1.*;

class App {

    static void hw1() {
        Bird[] myBirds = {
                new Eagle(),
                new Penguin(),
                new Swallow(),
                new Eagle(),
                new Kiwi(),
                new Penguin(),
                new FlyingBird(),
                new NonFlyingBird()
        };

        for (var bird : myBirds) {
            System.out.println(bird);
        }

        System.out.println("----------------------------------");

        for (var bird : myBirds) {
            System.out.println(bird.fly());
        }
    }

    public static void main(String[] args) {

// Hw 1 - Birds. For better structure, I put all classes into separate folder (package ))

        hw1();

// Hw 2 - Employee - Developer

        Employee[] employees = {
                new Employee("Jeff", 31, 2000.00),
                new Developer("Ted", 24, 8000.11, "CTO"),
                new Developer("Tedd", 56, 1700, "Trainee"),
                new Employee("Jessica", 21, 1500.5),
                new Developer("Alice", 43, 5000.01, "Java Developer")
        };
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
