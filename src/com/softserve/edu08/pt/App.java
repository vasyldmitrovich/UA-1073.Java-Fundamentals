package com.softserve.edu08.pt;

import javax.sound.midi.Soundbank;

public class App {//Good
    public static void main(String[] args) {
        Department department = new Department("Sales", "New York", "Elm street", 13);
        Department copyOfDepartment = department.clone();
        System.out.println("Original Department: " + department);
        System.out.println("Cloned Department: " + copyOfDepartment);
        System.out.println("Changing city in cloned Department ...");
        copyOfDepartment.setCity("New Jersey");
        System.out.println("Original Department: " + department);
        System.out.println("Cloned Department: " + copyOfDepartment);
    }
}
