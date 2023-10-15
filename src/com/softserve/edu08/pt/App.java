package com.softserve.edu08.pt;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Sales", "New York", "Elm street", 13);
        Department copyOfDepartment = (Department) department.clone();
        System.out.println("Original Department: " + department);
        System.out.println("Cloned Department: " + copyOfDepartment);
        System.out.println("Changing city in cloned Department ...");
        copyOfDepartment.setCity("New Jersey");
        System.out.println("Original Department: " + department);
        System.out.println("Cloned Department: " + copyOfDepartment);
    }
}
