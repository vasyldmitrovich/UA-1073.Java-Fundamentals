package com.softserve.edu07.pt.task02;

public class App {//Ok
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        persons[0] = new Student("Sarah");
        persons[1] = new Student("Boris");
        persons[2] = new Student("Daniel");
        persons[3] = new Student("Ann");
        persons[4] = new Student("John");
        persons[5] = new Student("Jill");
        persons[6] = new Teacher("Helen");
        persons[7] = new Teacher("Miranda");
        persons[8] = new Cleaner("Bob");
        persons[9] = new Cleaner("Amanda");
        for (int i = 0; i < persons.length; i++) {
            System.out.print("My name is " + persons[i].getName() + ". ");
            persons[i].print();
            if (persons[i] instanceof Staff) {
                System.out.println("My Salary is " + ((Staff) persons[i]).salary());
            }
        }
    }
}
